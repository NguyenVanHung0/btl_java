/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.btl_java_n9.view.Panel_Teacher;
import com.mycompany.btl_java_n9.controller.teacher.Teacher_Controller;
import com.mycompany.btl_java_n9.data_acess.SinhVien_TeacherDTA;
import com.mycompany.btl_java_n9.entity.QuanLySV;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author NguyenVanHung
 */
public class View_DiemTP extends javax.swing.JPanel {
    Teacher_Controller teachercontroller = new Teacher_Controller();
    SinhVien_TeacherDTA sinhvienteacherdta = new SinhVien_TeacherDTA();
    ArrayList<QuanLySV> list = new ArrayList<>();
    int k =0;
    /**
     * Creates new form NewJPanel
     */
    public View_DiemTP() {
        initComponents();
// Gọi hàm chuyển dữ liệu
        teachercontroller.chuyenDuLieuSV_DiemTP();
// Gọi hàm hiển thị bảng
        showTable();
// Gọi hàm click vào tên sinh viên trong bảng
        selectionTable();
    }

    // Hàm click vào tên sinh viên trong bảng
    void selectionTable(){
// Tạo danh sách lựa chọn của người dùng tên bảng và thiết lập chỉ chọn 1.
        ListSelectionModel listselectionmodel = table.getSelectionModel();
        listselectionmodel.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
// Thêm hàm lắng nghe sự kiện lựa chọn trên bảng
        listselectionmodel.addListSelectionListener(new ListSelectionListener() {
// Thêm hàm thay đổi giá trị lựa chọn
            @Override
            public void valueChanged(ListSelectionEvent e) {
// Lấy danh sách các cột và các hàng lựa chọn
                int[] rows = table.getSelectedRows();
                int[] colums = table.getSelectedColumns();
// Nếu có hàng được lựa chọn thì chạy tiếp
                if(colums.length > 0 && rows.length >0){
// Gán các giá trị từ bảng vào các ô TexField bên dưới
                    maSVTextField.setText(String.valueOf(table.getValueAt(rows[0], 0)));
                    tenSVTextField.setText(String.valueOf(table.getValueAt(rows[0], 1)));
                    diem1TextField.setText(String.valueOf(table.getValueAt(rows[0], 2)));
                    diem2TextField.setText(String.valueOf(table.getValueAt(rows[0], 3)));
                    soTietNghiTextField.setText(String.valueOf(table.getValueAt(rows[0], 4)));
                }
            }
        });
    }
    
// Hàm hiển thị bảng
    void showTable(){
// Lấy danh sách sinh viên tưf file QuanLySV.dat
        list = sinhvienteacherdta.docFileQuanLySV();
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
// Thêm tiêu đề cho bảng
        dtm.addColumn("Mã SV");
        dtm.addColumn("Tên SV");
        dtm.addColumn("Điểm 1");
        dtm.addColumn("Điểm 2");
        dtm.addColumn("Số tiết nghỉ");
        dtm.addColumn("Trạng Thái");
// Nếu danh sách khác null thì thực hiện tiếp
        if(list != null){
// if else hiển thị 10 sinh viên một lần
            if(k<list.size()-10){
                for(int i=k; i< k+10; i++){
                    QuanLySV a = list.get(i);
                    dtm.addRow(new Object[]{a.getMaSV(), a.getTenSV(),a.getDiem1() > 0 ? a.getDiem1():null ,a.getDiem2() > 0 ? a.getDiem2():null ,a.getSoTietNghi(), ((a.getDiem1() + a.getDiem2())/2 >= 4 && a.getSoTietNghi() < 10 )? "Đạt": "Không đạt"});
                }
            }
            else{
                for(int i=k; i< list.size(); i++){
                    QuanLySV a = list.get(i);
                    dtm.addRow(new Object[]{a.getMaSV(), a.getTenSV(),a.getDiem1() > 0 ? a.getDiem1():null ,a.getDiem2() > 0 ? a.getDiem2():null ,a.getSoTietNghi(), ((a.getDiem1() + a.getDiem2())/2 >= 4 && a.getSoTietNghi() < 10 )? "Đạt": "Không đạt"});
                }
            }
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

        diem2TextField = new javax.swing.JTextField();
        tenSVLabel = new javax.swing.JLabel();
        searchBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        entryBtn = new javax.swing.JButton();
        diem1Label = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        soTietNghiTextField = new javax.swing.JTextField();
        diem2Label = new javax.swing.JLabel();
        prevBtn = new javax.swing.JButton();
        maSVTextField = new javax.swing.JTextField();
        nextBtn = new javax.swing.JButton();
        tenSVTextField = new javax.swing.JTextField();
        maSVLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        diem1TextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        tenSVLabel.setText("Tên SV");

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-search-16.png"))); // NOI18N
        searchBtn.setText("Tìm kiếm");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        jLabel3.setText("Số tiết nghỉ");

        entryBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-edit-16.png"))); // NOI18N
        entryBtn.setText("Nhập");
        entryBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entryBtnActionPerformed(evt);
            }
        });

        diem1Label.setText("Điểm 1");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Tên SV", "Điểm 1", "Điểm 2", "So Tiet Nghi", "Trạng Thái"
            }
        ));
        jScrollPane1.setViewportView(table);

        soTietNghiTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                soTietNghiTextFieldActionPerformed(evt);
            }
        });

        diem2Label.setText("Điểm 2");

        prevBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-prev-16.png"))); // NOI18N
        prevBtn.setText("Quay Lại");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        maSVTextField.setEditable(false);

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-next-16.png"))); // NOI18N
        nextBtn.setText("Tiếp");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        tenSVTextField.setEditable(false);

        maSVLabel.setText("Mã SV");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản Lý Điểm Thành Phần");

        searchTextField.setToolTipText("");

        jLabel2.setText("Nhập mã sv xong click 'Tìm kiếm' hoặc click vào tên sinh viên trong bảng để nhập điểm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(prevBtn)
                        .addGap(58, 58, 58)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maSVLabel)
                            .addComponent(tenSVLabel)
                            .addComponent(jLabel3))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tenSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(maSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(diem1Label)
                                    .addComponent(diem2Label))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diem1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(nextBtn))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(diem2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(soTietNghiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 795, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(191, 191, 191)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(289, 289, 289))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(searchBtn)
                        .addGap(272, 272, 272))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(entryBtn)
                        .addGap(370, 370, 370))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nextBtn)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(prevBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(maSVLabel)
                                    .addComponent(maSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(diem1Label)
                                    .addComponent(diem1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tenSVLabel)
                            .addComponent(tenSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(diem2Label)
                            .addComponent(diem2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(soTietNghiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(entryBtn)
                .addGap(42, 42, 42))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        // Lấy mã sv mà người dùng nhập vào và tìm trong danh sách sinh viên do giáo viên quản lí
        String maSV = searchTextField.getText();
        list = sinhvienteacherdta.docFileQuanLySV();
        for(QuanLySV a : list){
            if(a.getMaSV().equals(maSV)){
                // Tìm thấy thì gán maSV, tenSV, diem1 và diem2 vào các ô textField bên dưới
                maSVTextField.setText(a.getMaSV());
                tenSVTextField.setText(a.getTenSV());
                diem1TextField.setText(String.valueOf(a.getDiem1()));
                diem2TextField.setText(String.valueOf(a.getDiem2()));
                soTietNghiTextField.setText(String.valueOf(a.getSoTietNghi()));
            }
        }
        // Gán lại ô tìm kiếm bằng ""
        searchTextField.setText("");
    }//GEN-LAST:event_searchBtnActionPerformed

    private void entryBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entryBtnActionPerformed
        // TODO add your handling code here:
        //Lấy maSV, diem1, diem2 trong các ô textField
        String maSV = maSVTextField.getText();
        try{
            float diem1 = Float.parseFloat(diem1TextField.getText());
            float diem2 = Float.parseFloat(diem2TextField.getText());
            int soTietNghi = Integer.parseInt(soTietNghiTextField.getText());
            if(diem1>10 || diem1 < 0 || diem2>10 || diem2 <0){
                JOptionPane.showMessageDialog(this, "Điểm phải là số nằm trong khoảng từ 0-10", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                list = sinhvienteacherdta.docFileQuanLySV();
                // Tìm kiếm sinh viên trong file quản lí điểm của giáo viên
                for(QuanLySV a : list){
                    // Tìm thấy thì set lại diem1 và diem2 thành điểm mà giáo viên vừa nhập
                    if(a.getMaSV().equals(maSV)){
                        a.setDiem1(diem1);
                        a.setDiem2(diem2);
                        a.setSoTietNghi(soTietNghi);
                        a.setTrangThai(((diem1 + diem2)/2 >= 4 && soTietNghi < 10));
                    }
                }
                // ghi lại file, gọi hàm showTable và gán lại giá trị các ô textFiled bằng ""
                sinhvienteacherdta.ghiFileQuanLySV(list);
                showTable();
                maSVTextField.setText("");
                tenSVTextField.setText("");
                diem1TextField.setText("");
                diem2TextField.setText("");
                soTietNghiTextField.setText("");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Điểm và số tiết nghỉ phải là số", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_entryBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here:
        // Giảm k xuống 10 đơn vị
        list = sinhvienteacherdta.docFileQuanLySV();
        while(k>0){
            k -= 10;
            showTable();
        }
    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        // Tăng k lên 10 đơn vị
        list = sinhvienteacherdta.docFileQuanLySV();
        while(k< list.size()-10){
            k += 10;
            showTable();
        }
    }//GEN-LAST:event_nextBtnActionPerformed

    private void soTietNghiTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_soTietNghiTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_soTietNghiTextFieldActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel diem1Label;
    private javax.swing.JTextField diem1TextField;
    private javax.swing.JLabel diem2Label;
    private javax.swing.JTextField diem2TextField;
    private javax.swing.JButton entryBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel maSVLabel;
    private javax.swing.JTextField maSVTextField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTextField soTietNghiTextField;
    private javax.swing.JTable table;
    private javax.swing.JLabel tenSVLabel;
    private javax.swing.JTextField tenSVTextField;
    // End of variables declaration//GEN-END:variables
}
