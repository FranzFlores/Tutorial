/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import lombok.*;
import modelo.enums.TipoDiscapacidad;
/**
 *
 * @author franzandresflores
 */
@Setter
@Getter
public class Persona {
    
    private Long id;
    private String nombre;
    private String cedula;
    private String direccion;
    private String ciudad;
    private String telefono;
    
    private Boolean tiene_discacidad;
    private String porcentaje;
    private TipoDiscapacidad tipo;
}
