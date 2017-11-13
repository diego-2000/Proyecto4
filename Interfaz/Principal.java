/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Aceptado.NewJFrameAceptado;
import java.util.ArrayList;
import Classes.Candidato;
import TableModel.CandidatoTableModel;
import DBHelper.CandidatoDBHelper;
/**
 *
 * @author DEll
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Prototipo SAT");
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton_Candidato = new javax.swing.JButton();
        jButton_Asesor = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Bienvenido"));

        jButton_Candidato.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Candidato.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/color-line-icono-9826-128 (1).png"))); // NOI18N
        jButton_Candidato.setText("Candidato");
        jButton_Candidato.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CandidatoActionPerformed(evt);
            }
        });

        jButton_Asesor.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Asesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/usando-una-punta-de-icono-5088-128.png"))); // NOI18N
        jButton_Asesor.setText("Asesor");
        jButton_Asesor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AsesorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton_Candidato, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton_Asesor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton_Candidato)
                .addGap(18, 18, 18)
                .addComponent(jButton_Asesor)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 320, 340));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gato-de-la-suerte (1).png"))); // NOI18N
        jButton1.setText("Lista de Aceptados");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/seminari.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 500));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_CandidatoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CandidatoActionPerformed
    NewJFrameCandidato jf= new NewJFrameCandidato();
        jf.setVisible(true);
        this.setVisible(false);        // TODO add your handling code here:
    }//GEN-LAST:event_jButton_CandidatoActionPerformed

    private void jButton_AsesorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AsesorActionPerformed
       NewJFrameAsesor jf= new NewJFrameAsesor();
        jf.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_jButton_AsesorActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NewJFrameAceptado newJfAcep= new NewJFrameAceptado();
        newJfAcep.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Asesor;
    private javax.swing.JButton jButton_Candidato;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
