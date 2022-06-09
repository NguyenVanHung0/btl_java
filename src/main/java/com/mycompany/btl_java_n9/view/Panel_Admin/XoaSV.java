package com.mycompany.btl_java_n9.view.Panel_Admin;

import com.mycompany.btl_java_n9.controller.admin.ThemSV_con;
import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class XoaSV extends javax.swing.JPanel {
    ArrayList<SinhVien_HoSo>list=new SinhVien_AdminDTA().docfile();
    /**
     * Creates new form XoaSV
     */
    public XoaSV() {
        initComponents();
        new ThemSV_con().dodulieu(bang);
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
        nhapma = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        bang = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_32/icons8-remove-32 (1).png"))); // NOI18N
        jLabel1.setText("Xoa Sinh Vien");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 10, -1, -1));

        nhapma.setForeground(new java.awt.Color(153, 153, 153));
        nhapma.setText(" Nhập mã sinh viên");
        nhapma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nhapmaMouseClicked(evt);
            }
        });
        add(nhapma, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 60, 250, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-search-16.png"))); // NOI18N
        jButton1.setText("Tìm kiếm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, -1, -1));

        bang.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5", "Title 6", "Title 7"
            }
        ));
        jScrollPane1.setViewportView(bang);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, 560, 180));

        jButton2.setBackground(new java.awt.Color(153, 153, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-trash-can-16.png"))); // NOI18N
        jButton2.setText("Xóa");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 320, 160, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nhapmaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nhapmaMouseClicked
        nhapma.setText("");
        nhapma.setForeground(Color.red);
    }//GEN-LAST:event_nhapmaMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        new ThemSV_con().timkiem(nhapma, bang);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(new ThemSV_con().dieukiensua(bang)){
            int chon=JOptionPane.showConfirmDialog(this, "Ban co chăc chan muon xoa ?");
            if(chon==JOptionPane.YES_NO_OPTION){
                int stt=list.size();
                int[]ch=bang.getSelectedRows();
                for (int i : ch) {
                    list.remove(stt-i-1);
                    //i=i+1;
                }
                
                new SinhVien_AdminDTA().ghifile(list);
                JOptionPane.showMessageDialog(this,"Xoa thanh cong!");
                bang.removeAll();
                new ThemSV_con().dodulieu(bang);
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Ban chua chon sinh vien nao!");
        }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable bang;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField nhapma;
    // End of variables declaration//GEN-END:variables
}