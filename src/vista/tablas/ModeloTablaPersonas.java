/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tablas;

import controlador.utilidades.Utilidades;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import lombok.Getter;
import lombok.Setter;
import modelo.Persona;

/**
 *
 * @author franzandresflores
 */
public class ModeloTablaPersonas extends AbstractTableModel{
    @Getter
    @Setter

    private List<Persona> lista = new ArrayList<>();

    @Override
    public int getRowCount() {
        return lista.size();
    }

    @Override
    public int getColumnCount() {
        return 7;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) { //Es el nombre de la tabla
        Persona n = lista.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return n.getCedula();
            case 1:
                return n.getNombre();
            case 2:
                return n.getDireccion();
            case 3:
                return n.getCiudad();
            case 4:
                return n.getTelefono();
            case 5:
                return n.getPorcentaje();
            case 6: 
                return n.getTipo();
   
            default:
                return null;
        }
    }
    
    @Override
    public String getColumnName(int column){
        switch(column){
            case 0:
                return "Cedula";
            case 1:
                return "Nombre";
            case 2:
                return "Direccion";
            case 3:
                return "Ciudad";
            case 4:
                return "Telefono";
            case 5:
                return "Porcentaje";
            case 6: 
                return "Tipo Discapacidad";    
            default:
                return null;
        }
    }
}
