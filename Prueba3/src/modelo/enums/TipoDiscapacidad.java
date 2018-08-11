/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.enums;

/**
 *
 * @author franzandresflores
 */
public enum TipoDiscapacidad {
    
    NINGUNA("NINGUNA"),
    AUDITIVA("AUDITIVA"),
    VISUAL("VISUAL"),
    INTELECTUAL("INTELECTUAL"),
    MOTRIZ("MOTRIZ"),
    VISCERAL("VISCERAL");
    
    String tipo;
    
    private TipoDiscapacidad(String tipo){
        this.tipo=tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
