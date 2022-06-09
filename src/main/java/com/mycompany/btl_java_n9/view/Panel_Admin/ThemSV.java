package com.mycompany.btl_java_n9.view.Panel_Admin;

import com.mycompany.btl_java_n9.controller.admin.ThemSV_con;
import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultFormatterFactory;
import javax.swing.text.MaskFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Administrator
 */
public class ThemSV extends javax.swing.JPanel {
    ArrayList<SinhVien_HoSo>list=new SinhVien_AdminDTA().docfile();
    /**
     * Creates new form ThemSV
     */
    public ThemSV() {
        initComponents();
        setMacDinh();
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
        hoten = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        diachi = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        khoa = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        lop = new javax.swing.JComboBox<>();
        ngaysinh = new javax.swing.JFormattedTextField();
        loi = new javax.swing.JLabel();

        setToolTipText("");
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_32/icons8-add-user-group-woman-man-32.png"))); // NOI18N
        jLabel1.setText("Them Sinh Vien");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-name-16.png"))); // NOI18N
        jLabel2.setText("Họ tên:");
        jLabel2.setToolTipText("");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, 80, -1));

        hoten.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                hotenMouseClicked(evt);
            }
        });
        add(hoten, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 190, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-forgot-password-16.png"))); // NOI18N
        jLabel3.setText("Pass:");
        jLabel3.setToolTipText("");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 140, 70, -1));

        pass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                passMouseClicked(evt);
            }
        });
        add(pass, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 190, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-info-popup-16 (1).png"))); // NOI18N
        jLabel4.setText("Ngay sinh:");
        jLabel4.setToolTipText("");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 100, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-adress-16.png"))); // NOI18N
        jLabel5.setText("Địa chỉ: ");
        jLabel5.setToolTipText("");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 90, -1, -1));

        diachi.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hà Giang", "Cao Bằng", "Bắc Kạn", "Lạng Sơn", "Tuyên Quang", "Thái Nguyên", "Phú Thọ", "Bắc Giang", "Quảng Ninh", "Lào Cai", "Yên Bái", "Điện Biên", "Hoà Bình", "Lai Châu", "Sơn La", "Bắc Ninh", "Hà Nam", "Hà Nội", "Hải Dương", "Hải Phòng", "Hưng Yên", "Nam Định", "Ninh Bình", "Thái Bình", "Vĩnh Phúc." }));
        diachi.setMaximumSize(new java.awt.Dimension(52, 32767));
        diachi.setMinimumSize(new java.awt.Dimension(52, 20));
        diachi.setPreferredSize(new java.awt.Dimension(52, 20));
        add(diachi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 90, 160, 25));

        jButton1.setBackground(new java.awt.Color(153, 153, 255));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-ok-16.png"))); // NOI18N
        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 100, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-close-16.png"))); // NOI18N
        jButton2.setText("Hủy");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-class-16 (1).png"))); // NOI18N
        jLabel6.setText("Khoa:");
        jLabel6.setToolTipText("");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 140, -1, -1));

        khoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT", "HTTT", "KHMT", "KTPM" }));
        khoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                khoaItemStateChanged(evt);
            }
        });
        add(khoa, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 140, 130, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-class-16.png"))); // NOI18N
        jLabel7.setText("Lớp:");
        jLabel7.setToolTipText("");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 190, -1, -1));

        lop.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CNTT1", "CNTT2" }));
        add(lop, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, 130, -1));

        ngaysinh.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ngaysinhMouseClicked(evt);
            }
        });
        ngaysinh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ngaysinhActionPerformed(evt);
            }
        });
        add(ngaysinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 190, -1));

        loi.setForeground(new java.awt.Color(255, 51, 51));
        add(loi, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 220, 190, 20));
    }// </editor-fold>//GEN-END:initComponents

    private void khoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_khoaItemStateChanged
       new ThemSV_con().setKhoa(khoa, lop);
    }//GEN-LAST:event_khoaItemStateChanged

    private void hotenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hotenMouseClicked
        hoten.selectAll();
    }//GEN-LAST:event_hotenMouseClicked

    private void passMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passMouseClicked
       pass.selectAll();
    }//GEN-LAST:event_passMouseClicked

    private void ngaysinhMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ngaysinhMouseClicked

    }//GEN-LAST:event_ngaysinhMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setMacDinh();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      if(new ThemSV_con().kiemtraText(hoten, pass, ngaysinh)){
          if(new ThemSV_con().ktngay(ngaysinh).equals("")){
            SinhVien_HoSo sv=new SinhVien_HoSo();
            String m=new ThemSV_con().tao_Masv();
            sv.setMasv(m);
            sv.setHoten(hoten.getText());
            sv.setPass(pass.getText());
            sv.setNgaysinh(ngaysinh.getText());
            sv.setDiachi((String) diachi.getSelectedItem());
            sv.setKhoa((String) khoa.getSelectedItem());
            sv.setLop((String) lop.getSelectedItem());
            list.add(sv);
            new SinhVien_AdminDTA().ghifile(list);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
            loi.setText(new ThemSV_con().ktngay(ngaysinh));
          }
          else{
               loi.setText(new ThemSV_con().ktngay(ngaysinh));
          }
      }
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ngaysinhActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ngaysinhActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ngaysinhActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> diachi;
    private javax.swing.JTextField hoten;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> khoa;
    private javax.swing.JLabel loi;
    private javax.swing.JComboBox<String> lop;
    private javax.swing.JFormattedTextField ngaysinh;
    private javax.swing.JTextField pass;
    // End of variables declaration//GEN-END:variables

    private void setMacDinh() {
        hoten.setText("");
        pass.setText("");
        try {
            MaskFormatter mf=new MaskFormatter("##/##/####");
            DefaultFormatterFactory dff=new DefaultFormatterFactory(mf);
            ngaysinh.setFormatterFactory(dff);
            ngaysinh.setText("01/01/2022");
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Loi: "+ex);
        }
    }
}