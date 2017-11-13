/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;
import Agregar.JFrame_AgregarAsesor;
import Classes.Asesor;
import DBHelper.AsesorDBHelper;
import TableModel.AsesorTableModel;
import java.util.ArrayList;
/**
 *
 * @author DEll
 */
public class NewJFrameAsesor extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrameAsesor
     */
    private ArrayList<Asesor> lista;
   // private Principal prin;
    private AsesorTableModel modelo ;
    private  AsesorDBHelper db;
    
    
    
    public NewJFrameAsesor() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Asesoria"); 
     //   prin=new Principal();
        
        Actualizar();
    }
    
    
    public void Actualizar(){
        db = new AsesorDBHelper();
        lista = db.GetAsesor();
        modelo = new AsesorTableModel(lista);
        jTable_Asesor.setModel(modelo);
    
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton_Regresar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_Asesor = new javax.swing.JTable();
        jButton_agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton_Regresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_Regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/regresar.png"))); // NOI18N
        jButton_Regresar.setText("Regresar");
        jButton_Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButton_Regresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 480, -1, -1));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Asesor", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14), new java.awt.Color(51, 51, 51))); // NOI18N
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable_Asesor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jTable_Asesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_AsesorMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_Asesor);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 763, 171));

        jButton_agregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton_agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icecat-icono-6321-128.png"))); // NOI18N
        jButton_agregar.setText("Agregar");
        jButton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_agregarActionPerformed(evt);
            }
        });
        jPanel1.add(jButton_agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/00-psicologia.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 820, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_AsesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_AsesorMouseClicked

        if (evt.getClickCount()==2)
        {

        }
    }//GEN-LAST:event_jTable_AsesorMouseClicked

    private void jButton_RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_RegresarActionPerformed
    Principal jf= new Principal();
        jf.setVisible(true);
        this.setVisible(false);           // TODO add your handling code here:
    }//GEN-LAST:event_jButton_RegresarActionPerformed

    private void jButton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_agregarActionPerformed
        // TODO add your handling code here:
        JFrame_AgregarAsesor agrease=new JFrame_AgregarAsesor();
        agrease.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton_agregarActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrameAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrameAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrameAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrameAsesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrameAsesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Regresar;
    private javax.swing.JButton jButton_agregar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_Asesor;
    // End of variables declaration//GEN-END:variables
}