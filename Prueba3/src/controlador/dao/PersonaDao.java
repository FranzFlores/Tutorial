/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.dao;

import controlador.Conexion;
import modelo.Persona;

/**
 *
 * @author franzandresflores
 */
public class PersonaDao extends AdaptadorDAO{
        private Persona persona;

    public PersonaDao() {
        super(new Conexion(), Persona.class);
    }

    public Persona getPersona() { //Instancia al persona, porque no se puede crear en la vista
        if(persona == null)
            persona = new Persona();
        return persona;
    }

    public void fijarInstancia(Persona persona) { //Es un set
        this.persona = persona;
    }    
    
    public boolean guardar() { // Sobrecarga de metodos
        boolean band = false;
        try {
            
            if(persona.getId() != null) {
                
            } else {
                //guardar
                this.persona.setId(gererarID());
                this.guardar(persona);
            }
            band = true;
        } catch (Exception e) {
            System.out.println("No se pudo guardar " + e);
            e.printStackTrace();
        }
        return band;
    }
    

}
