/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.utilidades;

import controlador.utilidades.Utilidades;
import java.awt.Color;
import java.awt.Toolkit;
import javafx.scene.control.Alert;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.text.JTextComponent;
import modelo.enums.TipoDiscapacidad;

/**
 *
 * @author franzandresflores
 */
public class UtilidadesComponente {
    
    public static void cargarcomboTipo(JComboBox cbx) {
        cbx.removeAllItems();//Quita todos los items por defecto
        for (TipoDiscapacidad tipo : TipoDiscapacidad.values()) {
            cbx.addItem(tipo);
        }
    }
    
     public static boolean mostrarError(JComponent componente, String mensaje, char tipo) {
        boolean band = true;
        switch (tipo) {
            case 'r':
                if (componente instanceof JTextComponent) {
                    JTextComponent txt = (JTextComponent) componente;
                    if (Utilidades.isEmpty(txt.getText())) {
                        componente.setBackground(Color.red);
                        componente.setToolTipText(mensaje);
                    } else {
                        componente.setBackground(Color.white);
                        componente.setToolTipText(null);
                        band = false;
                    }
                }
                ;
        }
        return band;
    }

    public static void mensajeError(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.ERROR_MESSAGE);
    }

    public static void mensajeOk(String titulo, String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje, titulo, JOptionPane.INFORMATION_MESSAGE);
    }

    public static boolean validarCampoNumericos(JTextArea campo) {
        if (((campo.getText().charAt(0) < '0') || campo.getText().charAt(0) > '9')) {
            Toolkit.getDefaultToolkit().beep();
            return false;
        } else {
            validarCampo(campo);
            return true;
        }
    }

    public static void validarCampo(JTextArea campo) {
        String mensajeError = "";

        if (campo.getText() == null || campo.getText().trim().length() == 0) {
            mensajeError += "¡Campo requerido!\n";
        }

        if (mensajeError.length() == 0) {
            //return true;
        } else {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Campos no válidos");
            alert.setHeaderText(null);
            alert.setContentText("Por favor, revise los siguiente campos: \n" + mensajeError);
            alert.showAndWait();
            //return false;
        }
    }
}
