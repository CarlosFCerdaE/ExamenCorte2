/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formularios;

import dao.DEmpleado;

/**
 *
 * @author labc205
 */
public class Ejercicio3 extends javax.swing.JFrame {
    DEmpleado empleadoo = new DEmpleado();
    public int iterador = 0;

    /**
     * Creates new form Ejercicio3
     */
    public Ejercicio3() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtfNombres = new javax.swing.JTextField();
        jtfCodigo = new javax.swing.JTextField();
        jtfApellidos = new javax.swing.JTextField();
        jcbCargo = new javax.swing.JComboBox<>();
        jtfSalario = new javax.swing.JTextField();
        jbtnGuardar = new javax.swing.JButton();
        jbtnAnterior = new javax.swing.JButton();
        jbtnSiguiente = new javax.swing.JButton();
        jtfDisplay = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Ejercicio3");

        jLabel1.setText("Datos del empleado");

        jLabel2.setText("Código");

        jLabel3.setText("Nombres");

        jLabel4.setText("Apellidos");

        jLabel5.setText("Cargo");

        jLabel6.setText("Salario");

        jtfNombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombresActionPerformed(evt);
            }
        });

        jtfCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfCodigoActionPerformed(evt);
            }
        });

        jtfApellidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfApellidosActionPerformed(evt);
            }
        });

        jcbCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Gerente de RRHH", "Cajero", "Secretario", "Gerente de Sistemas" }));

        jtfSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfSalarioActionPerformed(evt);
            }
        });

        jbtnGuardar.setText("Guardar");
        jbtnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnGuardarActionPerformed(evt);
            }
        });

        jbtnAnterior.setText("<<");
        jbtnAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnAnteriorActionPerformed(evt);
            }
        });

        jbtnSiguiente.setText(">>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtfSalario, javax.swing.GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jtfApellidos)
                                .addComponent(jtfCodigo)
                                .addComponent(jtfNombres)
                                .addComponent(jcbCargo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(98, 98, 98)
                .addComponent(jbtnAnterior)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbtnGuardar)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jtfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jbtnSiguiente)))
                .addContainerGap(107, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtfNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtfApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jcbCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtfSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jbtnGuardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtnAnterior)
                    .addComponent(jbtnSiguiente)
                    .addComponent(jtfDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombresActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombresActionPerformed

    private void jtfCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCodigoActionPerformed

    private void jtfApellidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfApellidosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfApellidosActionPerformed

    private void jtfSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfSalarioActionPerformed

    private void jbtnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnGuardarActionPerformed
        // TODO add your handling code here:
        int code =Integer.parseInt(jtfCodigo.getText());
        String name =jtfNombres.getText();
        String lastname =jtfApellidos.getText();
        String role =(String) jcbCargo.getSelectedItem();
        double salary = Double.parseDouble(jtfSalario.getText());
        
        empleadoo.agregarEmpleado(code, name,lastname, role, salary);
        iterador = 0;
        jtfCodigo.setText("");
        jtfNombres.setText("");
        jtfApellidos.setText("");
        jtfDisplay.setText("");
        jcbCargo.setSelectedIndex(iterador);
        
        
    }//GEN-LAST:event_jbtnGuardarActionPerformed

    private void jbtnAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnAnteriorActionPerformed
        // TODO add your handling code here:
        iterador-=1;
        jtfCodigo.setText(String.valueOf(empleadoo.getListEmpleado().get(iterador).getCodigo()));
    }//GEN-LAST:event_jbtnAnteriorActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio3.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicio3().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JButton jbtnAnterior;
    private javax.swing.JButton jbtnGuardar;
    private javax.swing.JButton jbtnSiguiente;
    private javax.swing.JComboBox<String> jcbCargo;
    private javax.swing.JTextField jtfApellidos;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDisplay;
    private javax.swing.JTextField jtfNombres;
    private javax.swing.JTextField jtfSalario;
    // End of variables declaration//GEN-END:variables
}
