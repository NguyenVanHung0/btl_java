/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.btl_java_n9.view.Panel_Student;

import com.mycompany.btl_java_n9.data_acess.AdminNhanPhanHoi_DTA;
import com.mycompany.btl_java_n9.data_acess.GiaoVienNhanPhanHoi_DTA;
import com.mycompany.btl_java_n9.entity.PhanHoi;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 0961011310
 */
public class XemPhanHoi extends javax.swing.JPanel {

    /**
     * Creates new form XemPhanHoi
     */
    DefaultTableModel model=new DefaultTableModel();
    public XemPhanHoi() {
        initComponents();
        model=(DefaultTableModel) txtTable.getModel();
        showDl();
    }
    private void showDl(){
        model.setColumnIdentifiers(new String[]{"Ngày gửi","Người nhận","Nội dung gửi"});
        List<PhanHoi> listPhAdmin= new AdminNhanPhanHoi_DTA().docfile();
        List<PhanHoi> listPhTeacher= new GiaoVienNhanPhanHoi_DTA().docfile();
        for (PhanHoi pAdminPhanHoi : listPhAdmin) {
            model.addRow(new String[]{pAdminPhanHoi.getNgayGui(),pAdminPhanHoi.getNguoiNhan(),pAdminPhanHoi.getNoiDung()});
        }
        for (PhanHoi pTeacherPhanHoi : listPhTeacher) {
            model.addRow(new String[]{pTeacherPhanHoi.getNgayGui(),pTeacherPhanHoi.getNguoiNhan(),pTeacherPhanHoi.getNoiDung()});
        }
       
        
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
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Phản hồi");

        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Ngày gửi", "Người nhận", "Nội dung gửi"
            }
        ));
        jScrollPane1.setViewportView(txtTable);
        if (txtTable.getColumnModel().getColumnCount() > 0) {
            txtTable.getColumnModel().getColumn(0).setMinWidth(100);
            txtTable.getColumnModel().getColumn(0).setPreferredWidth(100);
            txtTable.getColumnModel().getColumn(0).setMaxWidth(100);
            txtTable.getColumnModel().getColumn(1).setMinWidth(100);
            txtTable.getColumnModel().getColumn(1).setPreferredWidth(100);
            txtTable.getColumnModel().getColumn(1).setMaxWidth(100);
        }

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(145, 145, 145)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 396, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable txtTable;
    // End of variables declaration//GEN-END:variables
}
