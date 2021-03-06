/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jmb.frontend.comparetables.gui;

import java.awt.FileDialog;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author jose
 */
public class CompareTablesView extends javax.swing.JFrame {

    /**
     * Creates new form CompareTablesView
     */
    public CompareTablesView() {
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

        jSplitPane1 = new javax.swing.JSplitPane();
        jSplitPane2 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableLeft = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableRight = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldFilePathLeft = new javax.swing.JTextField();
        jTextFieldFilePathRight = new javax.swing.JTextField();
        jButtonExplorerFilesLeft = new javax.swing.JButton();
        jButtonExplorerFilesRight = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldSeparator = new javax.swing.JTextField();
        jButtonExecute = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(500);
        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jSplitPane2.setDividerLocation(500);

        jTableLeft.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTableLeft);

        jSplitPane2.setLeftComponent(jScrollPane1);

        jTableRight.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(jTableRight);

        jSplitPane2.setRightComponent(jScrollPane3);

        jSplitPane1.setTopComponent(jSplitPane2);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Cargar Archivo Izquierda:");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Cargar Archivo Derecha:");

        jTextFieldFilePathLeft.setEnabled(false);

        jTextFieldFilePathRight.setEnabled(false);

        jButtonExplorerFilesLeft.setText("...");
        jButtonExplorerFilesLeft.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplorerFilesLeftActionPerformed(evt);
            }
        });

        jButtonExplorerFilesRight.setText("...");
        jButtonExplorerFilesRight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExplorerFilesRightActionPerformed(evt);
            }
        });

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Separador:");

        jTextFieldSeparator.setText("²");

        jButtonExecute.setText("Ejecutar");
        jButtonExecute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExecuteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonExecute, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextFieldFilePathRight)
                            .addComponent(jTextFieldFilePathLeft))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonExplorerFilesLeft, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonExplorerFilesRight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jTextFieldSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(108, 805, Short.MAX_VALUE)))
                .addGap(10, 10, 10))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldFilePathLeft, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExplorerFilesLeft))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldFilePathRight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExplorerFilesRight)
                    .addComponent(jLabel2))
                .addGap(10, 10, 10)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextFieldSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(jButtonExecute)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jSplitPane1.setRightComponent(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSplitPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSplitPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 616, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExplorerFilesLeftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplorerFilesLeftActionPerformed
        FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
        fd.setVisible(true);
        String filename = fd.getDirectory() + fd.getFile();
        if (filename != null) jTextFieldFilePathLeft.setText(filename);
    }//GEN-LAST:event_jButtonExplorerFilesLeftActionPerformed

    private void jButtonExplorerFilesRightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExplorerFilesRightActionPerformed
        FileDialog fd = new FileDialog(this, "Choose a file", FileDialog.LOAD);
        fd.setVisible(true);
        String filename = fd.getDirectory() + fd.getFile();
        if (filename != null) jTextFieldFilePathRight.setText(filename);
    }//GEN-LAST:event_jButtonExplorerFilesRightActionPerformed

    private void jButtonExecuteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExecuteActionPerformed
        if (!jTextFieldFilePathLeft.getText().equals("") && !jTextFieldFilePathRight.getText().equals("") && !jTextFieldSeparator.getText().equals("")) {
            System.out.println("ejecutando...");
            
            jTableLeft.setModel(loadFileInTable(jTextFieldFilePathLeft.getText()));
            jTableRight.setModel(loadFileInTable(jTextFieldFilePathRight.getText()));
            
            //compareTables();
        }
    }//GEN-LAST:event_jButtonExecuteActionPerformed

    private DefaultTableModel loadFileInTable(String filePath) {
        DefaultTableModel tableModel = new DefaultTableModel();
        String[] columnNames;
        int cont = 1;
        
        try {
            BufferedReader bfw = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = bfw.readLine()) != null) {
                if (cont == 1) {
                    columnNames = line.split(jTextFieldSeparator.getText());
                    for (String columnName : columnNames) {
                        tableModel.addColumn(columnName);
                    }
                } else {
                    tableModel.addRow(line.split(jTextFieldSeparator.getText()));
                }
                cont++;
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(CompareTablesView.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(CompareTablesView.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return tableModel;
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CompareTablesView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CompareTablesView().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExecute;
    private javax.swing.JButton jButtonExplorerFilesLeft;
    private javax.swing.JButton jButtonExplorerFilesRight;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JSplitPane jSplitPane2;
    private javax.swing.JTable jTableLeft;
    private javax.swing.JTable jTableRight;
    private javax.swing.JTextField jTextFieldFilePathLeft;
    private javax.swing.JTextField jTextFieldFilePathRight;
    private javax.swing.JTextField jTextFieldSeparator;
    // End of variables declaration//GEN-END:variables
}
