/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import controlador.Conexion;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author franzandresflores
 */
public class AdaptadorDAO <T>implements InterfazDAO<T>{
    private Conexion conexion;
    private Class clazz;
    private String path_file;

    public AdaptadorDAO(Conexion conexion, Class clazz) {
        this.conexion = conexion;
        this.clazz = clazz;
        this.path_file = conexion.obtenerPath() + File.separatorChar + clazz.getSimpleName() + ".json";
        crearArhivo();
    }

    private void crearArhivo() {
        File archivo = new File(path_file);
        try {
            FileWriter archivoClase = new FileWriter(archivo, true);
            archivoClase.close();
        } catch (Exception e) {
            System.out.println("Error no se pudo crear el archivo " + e);
        }
    }

    @Override
    public List<T> listar() {
        List<T> lista = new ArrayList<>();
        try {
            this.conexion.getConexion().alias(clazz.getSimpleName(), clazz); //Pone el nombre de la clase a los objetos creados de ella 
            Object obj = this.conexion.getConexion().fromXML(new FileReader(path_file)); //Convertir el texto escrito en objeto
            List aux = (List) obj; //Guardar en lista para poder iterar
            lista = (List<T>) aux.get(0);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Error al listar datos " + e);
        }
        return lista;
    }


    public void guardar(T obj) throws Exception {
        List<T> lista = listar();
        lista.add(obj);
        this.conexion
                .getConexion()
                .alias(clazz.getSimpleName(),clazz);
        this.conexion.getConexion().toXML(lista, new FileOutputStream(path_file)); //Enviar al repositorio
    }
    
    public void modificar (T obj){
        int pos = -1;
        try {
            Field identificador = obtenerIdField();
            Object value2 = identificador.get(obj);
            for (Iterator<T> it = listar().iterator(); 
                it.hasNext();){
                T t = it.next();
                Object value = identificador.get(t);
                Long idValor = (Long)value;
                Long idValorA = (Long)value2;
                pos++;
                if (idValor.intValue() == idValorA.intValue()) {
                    break;
                }
            }
            
            List<T> listado = listar();
            listado.remove(pos);
            listado.add(pos, obj);
            this.conexion
                .getConexion()
                .alias(clazz.getSimpleName(),clazz);
            this.conexion.getConexion().toXML(listado, new FileOutputStream(path_file)); //Enviar al repositorio
        } catch (Exception e) {
        }
    }
    

    @Override
    public Long gererarID() {
        Long id = new Long(listar().size() + 1);
        return id;
    }

    @Override
    public T obtener(Long id) {
        T obj = null;
        try {
            Field identificador = obtenerIdField();
            for (Iterator<T> it = listar().iterator(); 
                it.hasNext();) {
                T t = it.next();
                Object value = identificador.get(t);
                Long idValor = (Long) value;
                if (idValor.intValue() == id.intValue()) {
                    obj = t;
                    break;
                }
            }
        } catch (Exception e) {
            System.out.println("No se encuentar el identificador id " + e);
        }
        return obj;
    }

    private Field obtenerIdField() {
        Field aux = null;
        Field[] flieds = clazz.getDeclaredFields(); //Todos los atributos de la clase
        try {
            for (Field f : flieds) {
                f.setAccessible(true);
                if (f.getType().getSimpleName().equalsIgnoreCase("Long")
                        && f.getName().contains("id")) {
                    aux = f;
                    break;
                }
            }
            if (aux == null) { //Cuando los atribuitos estan en la super clase
                flieds = clazz.getSuperclass().getDeclaredFields();
                for (Field f : flieds) {
                    f.setAccessible(true);
                    if (f.getType().getSimpleName().equalsIgnoreCase("Long") && f.getName().contains("id")) {
                        aux = f;
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
        return aux;
    }
}
