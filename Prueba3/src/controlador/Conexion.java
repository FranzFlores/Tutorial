/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.json.JettisonMappedXmlDriver;
import java.io.File;

/**
 *
 * @author franzandresflores
 */
public class Conexion {
    
    private XStream conexion;
    
    private void abrirConexion(){
        if (conexion==null) {
            this.conexion = new XStream(new JettisonMappedXmlDriver()); //Leer y escribir datos en formato JSON
        }
    }
    
    public XStream getConexion() {
        abrirConexion();
        return conexion;
    }
    
    private void crearDirectorio(String path) { 
        File manejador = new File(path);
        if (!manejador.exists()) {
            manejador.mkdir();
        }
    }
    
    public String obtenerPath() {
        String path = System.getProperty("user.dir")+File.separatorChar+"data";
        this.crearDirectorio(path);
        return path;
    }
}
