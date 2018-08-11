/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador.utilidades;

import controlador.servicio.ServicioPersona;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import modelo.Persona;
import org.apache.commons.lang.StringUtils;

/**
 *
 * @author franzandresflores
 */
public class Utilidades extends StringUtils{

    public static double promedioDiscapacidad(){  
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==true).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
   }
    
    public static double promedioPersona(){
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==false).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
   }
    
    public static double promedioDiscapacidadAuditiva(){
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==true &&
               x.getTipo().toString().equals("AUDITIVA")).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
    }
    
    public static double promedioDiscapacidadVisual(){
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==true && 
               x.getTipo().toString().equals("VISUAL")).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
    }
    
    public static double promedioDiscapacidadIntelectual(){
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==true && 
               x.getTipo().toString().equals("INTELECTUAL")).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
    }
    
    public static double promedioDiscapacidadMotriz(){
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==true && 
               x.getTipo().toString().equals("MOTRIZ")).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
    }
    
    public static double promedioDiscapacidadVisceral(){
       double promedio = (double)new ServicioPersona().listado().stream().filter(x->x.getTiene_discacidad()==true && 
               x.getTipo().toString().equals("VISCERAL")).toArray().length/
               new ServicioPersona().listado().size();
       return promedio*100;
    }
  
    
}
