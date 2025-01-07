/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.utilidades.Utilidades;

/**
 *
 * @author franzandresflores
 */
public class FrmEstadisiticas extends javax.swing.JDialog {

    /**
     * Creates new form FrmEstadisiticas
     */
    public FrmEstadisiticas(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        promedioDiscapacidad();
        promedioDiscapacidadAuditiva();
        promedioDiscapacidadIntelectual();
        promedioDiscapacidadMotriz();
        promedioDiscapacidadVisceral();
        promedioDiscapacidadVisual();
        promedioPersona();
    }
    
    private void promedioDiscapacidad(){
        txt_discapacidad.setText(
        Double.toString(Utilidades.promedioDiscapacidad()));
    }
    
    private void promedioPersona(){
        txt_personas.setText(
        Double.toString(Utilidades.promedioPersona()));
    }
    
    private void promedioDiscapacidadVisual(){
        txt_visual.setText(
        Double.toString(Utilidades.promedioDiscapacidadAuditiva()));
    }
    
    
    private void promedioDiscapacidadAuditiva(){
        txt_auditiva.setText(
        Double.toString(Utilidades.promedioDiscapacidadAuditiva()));
    }
    
    private void promedioDiscapacidadIntelectual(){
        txt_intelectual.setText(
        Double.toString(Utilidades.promedioDiscapacidadIntelectual()));
    }
    
    private void promedioDiscapacidadMotriz(){
        txt_motriz.setText(
        Double.toString(Utilidades.promedioDiscapacidadMotriz()));
    }
    
    private void promedioDiscapacidadVisceral(){
        txt_visceral.setText(
        Double.toString(Utilidades.promedioDiscapacidadVisceral()));
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_personas = new javax.swing.JTextField();
        txt_discapacidad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_visceral = new javax.swing.JTextField();
        txt_auditiva = new javax.swing.JTextField();
        txt_visual = new javax.swing.JTextField();
        txt_intelectual = new javax.swing.JTextField();
        txt_motriz = new javax.swing.JTextField();
        btn_salir = new javax.swing.JButton();
        btn_aceptar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ESTADISTICAS");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 390, 40);

        jLabel2.setText("Media de Personas sin Discapacidad");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 240, 40);

        jLabel3.setText("Media de Personas con Discapacidad");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 50, 240, 40);

        txt_personas.setEditable(false);
        getContentPane().add(txt_personas);
        txt_personas.setBounds(280, 100, 80, 30);

        txt_discapacidad.setEditable(false);
        getContentPane().add(txt_discapacidad);
        txt_discapacidad.setBounds(280, 60, 80, 30);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Personas con Discapacidad");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 130, 390, 40);

        jLabel5.setText("Discapacidad Visceral");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(60, 330, 150, 40);

        jLabel6.setText("Discapacidad Auditiva");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(60, 170, 150, 40);

        jLabel7.setText("Discapacidad Visual");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(60, 210, 150, 40);

        jLabel8.setText("Discapacidad Intelectual");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(60, 250, 160, 40);

        jLabel9.setText("Discapacidad Motriz");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(60, 290, 150, 40);

        txt_visceral.setEditable(false);
        getContentPane().add(txt_visceral);
        txt_visceral.setBounds(240, 340, 80, 30);

        txt_auditiva.setEditable(false);
        getContentPane().add(txt_auditiva);
        txt_auditiva.setBounds(240, 170, 80, 30);

        txt_visual.setEditable(false);
        getContentPane().add(txt_visual);
        txt_visual.setBounds(240, 210, 80, 30);

        txt_intelectual.setEditable(false);
        getContentPane().add(txt_intelectual);
        txt_intelectual.setBounds(240, 250, 80, 30);

        txt_motriz.setEditable(false);
        getContentPane().add(txt_motriz);
        txt_motriz.setBounds(240, 290, 80, 30);

        btn_salir.setText("SALIR");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir);
        btn_salir.setBounds(220, 390, 120, 50);

        btn_aceptar.setText("ACEPTAR");
        btn_aceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_aceptarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_aceptar);
        btn_aceptar.setBounds(40, 390, 120, 50);

        jLabel10.setText("%");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(320, 340, 30, 30);

        jLabel11.setText("%");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(360, 66, 20, 20);

        jLabel12.setText("%");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(360, 100, 20, 20);

        jLabel13.setText("%");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(320, 170, 30, 30);

        jLabel14.setText("%");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(320, 210, 30, 30);

        jLabel15.setText("%");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(320, 250, 30, 30);

        jLabel16.setText("%");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(320, 290, 30, 30);

        setSize(new java.awt.Dimension(412, 484));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_aceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_aceptarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_aceptarActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public  void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmEstadisiticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmEstadisiticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmEstadisiticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmEstadisiticas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FrmEstadisiticas dialog = new FrmEstadisiticas(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_aceptar;
    private javax.swing.JButton btn_salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txt_auditiva;
    private javax.swing.JTextField txt_discapacidad;
    private javax.swing.JTextField txt_intelectual;
    private javax.swing.JTextField txt_motriz;
    private javax.swing.JTextField txt_personas;
    private javax.swing.JTextField txt_visceral;
    private javax.swing.JTextField txt_visual;
    // End of variables declaration//GEN-END:variables
}
