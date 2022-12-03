/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;
import javax.swing.*;
import database.ListFigure;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author dafin
 */
public class MenuFigure extends javax.swing.JFrame {
    ListFigure DaftarFigure;

    /**
     * Creates new form Menu
     */
    public MenuFigure() throws ClassNotFoundException, SQLException {
        DaftarFigure = new ListFigure();
        initComponents();
        this.showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbData = new javax.swing.JTable();
        addData = new javax.swing.JButton();
        delData = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tbData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Nama", "Ukuran", "Jenis"
            }
        ));
        jScrollPane1.setViewportView(tbData);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 130, 325, 157));

        addData.setText("Tambah");
        addData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addDataMouseClicked(evt);
            }
        });
        addData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDataActionPerformed(evt);
            }
        });
        getContentPane().add(addData, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, -1));

        delData.setText("Hapus");
        delData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                delDataMouseClicked(evt);
            }
        });
        delData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delDataActionPerformed(evt);
            }
        });
        getContentPane().add(delData, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, -1, -1));

        jButton1.setText("Ubah");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 69, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/02.jpg"))); // NOI18N
        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addDataActionPerformed

    private void delDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delDataActionPerformed
    
    }//GEN-LAST:event_delDataActionPerformed

    private void addDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addDataMouseClicked
        try {
            new Tambah().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuFigure.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuFigure.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_addDataMouseClicked

    private void delDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_delDataMouseClicked

        try {
            int id = Integer.parseInt(JOptionPane.showInputDialog("Masukan ID : "));
            DaftarFigure.deleteFigure(id);
            this.showData();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Hapus DIbatalkan");
//            Logger.getLogger(MenuBuku.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_delDataMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            new Update().setVisible(true);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MenuFigure.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(MenuFigure.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void showData() throws SQLException {
        tbData.setModel(new javax.swing.table.DefaultTableModel(
            DaftarFigure.showFigure(),
            new String [] {
                "ID", "Nama", "Ukuran", "Jenis"
            }
        ));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addData;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton delData;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbData;
    // End of variables declaration//GEN-END:variables
}
