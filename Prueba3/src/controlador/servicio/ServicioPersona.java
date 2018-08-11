/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.servicio;

import controlador.dao.PersonaDao;
import java.util.List;
import modelo.Persona;

/**
 *
 * @author franzandresflores
 */
public class ServicioPersona {
    
    private PersonaDao obj;

    public ServicioPersona() {
        this.obj = new PersonaDao();
    }
    
    public boolean guardar() {
        return this.obj.guardar();
    }
    
    public Persona obtenerPersona() {
        return obj.getPersona();
    }
    
    public Persona obtenerPersona(Long id) {
        return (Persona) obj.obtener(id);
    }
    
    public List<Persona> listado() {
        return obj.listar();
    }
    
//    public  List<Persona> lista(){
//        this.obj = new PersonaDao();
//        return obj.listado();
//    }
    
}
