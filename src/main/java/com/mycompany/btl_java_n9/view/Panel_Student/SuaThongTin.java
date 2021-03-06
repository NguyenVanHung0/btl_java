/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.btl_java_n9.view.Panel_Student;

import com.mycompany.btl_java_n9.controller.student.StudentController;
import com.mycompany.btl_java_n9.data_acess.SinhVien_AdminDTA;
import com.mycompany.btl_java_n9.entity.BangDiem;
import com.mycompany.btl_java_n9.entity.QuanLySV;
import com.mycompany.btl_java_n9.entity.SinhVien_HoSo;
import com.mycompany.btl_java_n9.view.View_Admin;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;


/**
 *
 * @author 0961011310
 */
public class SuaThongTin extends javax.swing.JPanel {

    /**
     * Creates new form XemDiem
     */
    StudentController sc=new StudentController();
    public QuanLySV ql=sc.getBangDiem();
    public SinhVien_HoSo sv=sc.getSinhVien();
    public List<SinhVien_HoSo> listsv=new SinhVien_AdminDTA().docfile();
    public SuaThongTin() {
        initComponents();
        showDl();
    }
    //Hiển thị thông tin sinh viên
    private void showDl(){
        txtMaSv.setText(ql.getMaSV());
        txtTenSv.setText(ql.getTenSV());
        txtNgaySinh.setText(sv.getNgaysinh()+"");
        txtDiaChi.setText(sv.getDiachi()+"");
      
    }
    public void clearErr(){
        errNgaySinh.setText(" ");
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
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtMaSv = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtTenSv = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtNgaySinh = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        errNgaySinh = new javax.swing.JLabel();
        txtDiaChi = new javax.swing.JTextField();

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(0, 1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_32/icons8-edit-profile-32.png"))); // NOI18N
        jLabel1.setText("Sửa thông tin");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setText("Mã sinh viên:");

        jLabel4.setText("Tên sinh viên:");

        jLabel6.setText("Ngày sinh:");

        jLabel8.setText("Địa chỉ:");

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-edit-16.png"))); // NOI18N
        jButton1.setText("Sửa");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        errNgaySinh.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jSeparator1)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addComponent(jLabel8)
                                .addComponent(jLabel6))
                            .addGap(142, 142, 142)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtMaSv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                    .addComponent(txtTenSv, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.Alignment.LEADING))
                                .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(42, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMaSv))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTenSv))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 8, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(errNgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(txtDiaChi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(95, 95, 95)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents
    
    //Sủa thông tin sinh viên và cập nhật lại thông tin
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try{
            
            int indexSv=-1;
            String checkDate = txtNgaySinh.getText();
            Pattern pattern = Pattern.compile("^\\d{1,2}[-|/]\\d{1,2}[-|/]\\d{4}$");
            Matcher matcher = pattern.matcher(checkDate);
            boolean check=true;
          
        if(!matcher.matches()){
            errNgaySinh.setText("Ngày sinh không đúng định dạng");
            System.out.println("check");
            check=false;
        }else{
              String[] dateArr=checkDate.split("/");
            int day=Integer.parseInt(dateArr[0]);
            int month=Integer.parseInt(dateArr[1]);
            int year=Integer.parseInt(dateArr[2]);
            LocalDate date=null;
            try{
                date=LocalDate.parse(checkDate, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                System.out.println(date);
                 if(date.isLeapYear()){
                     if(date.getDayOfMonth()!=day){
                        errNgaySinh.setText("Năm nhuận tháng 2 chỉ có 29 ngày");
                        check=false;
                     }
                 }else{
                     if(date.getDayOfMonth()!=day){
                        errNgaySinh.setText("Năm không nhuận tháng 2 chỉ có 28 ngày");
                        check=false;
                    }
                 }
           // System.out.println("check"+check);
           
            }catch(Exception e){
                
              
                System.out.println(day +" "+month+" "+year);
                 if(day>12){
                 errNgaySinh.setText("Tháng không được vượt quá 12 ");
                  check=false;
                  System.out.println("check"+check);
                } 
                if(month>31){
                     errNgaySinh.setText("Ngày không được vượt quá 31 ");
                      check=false;
                } 
                if(year>2050){
                    errNgaySinh.setText("Năm trong khoảng [2000-2050]");
                     check=false;
                }
               
            }
        }
        
        if(check){
            int checkOption=JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa không?","Xác nhận",JOptionPane.YES_NO_OPTION);
            System.out.println(checkOption);
            for(int i=0;i<listsv.size();i++){
                if(sv.getMasv().equals(listsv.get(i).getMasv())){
                    indexSv=i;
                    listsv.remove(i);
                    break;
                }
            }
            SinhVien_HoSo sv1=new SinhVien_HoSo();
            sv1=sv;
            sv1.setDiachi(txtDiaChi.getText());
            sv1.setNgaysinh(txtNgaySinh.getText());
            
            listsv.add(indexSv,sv1);
            new SinhVien_AdminDTA().ghifile((ArrayList<SinhVien_HoSo>)listsv);
            if(indexSv!=-1){
                JOptionPane.showConfirmDialog(null, "Bạn đã sửa thông tin thành công?","Thành công",JOptionPane.DEFAULT_OPTION);
                clearErr();
            }
        }
        }
        
    catch(Exception e){
             JOptionPane.showConfirmDialog(null, "Lỗi trong quá trình sửa?","Báo lỗi",JOptionPane.DEFAULT_OPTION);
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel errNgaySinh;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtDiaChi;
    private javax.swing.JLabel txtMaSv;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JLabel txtTenSv;
    // End of variables declaration//GEN-END:variables
}
