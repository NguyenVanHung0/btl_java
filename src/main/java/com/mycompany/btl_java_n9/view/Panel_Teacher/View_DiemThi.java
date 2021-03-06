/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.btl_java_n9.view.Panel_Teacher;
import com.mycompany.btl_java_n9.controller.teacher.Teacher_Controller;
import com.mycompany.btl_java_n9.data_acess.SinhVien_TeacherDTA;
import com.mycompany.btl_java_n9.entity.QuanLyDiemThi;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author NguyenVanHung
 */
public class View_DiemThi extends javax.swing.JPanel {
    Teacher_Controller teachercontroller = new Teacher_Controller();
    SinhVien_TeacherDTA sinhvienteacherdta = new SinhVien_TeacherDTA();
    ArrayList<QuanLyDiemThi> list = new ArrayList<>();
    int k =0;
    /**
     * Creates new form NewJPanel
     */
    public View_DiemThi() {
        initComponents();
        teachercontroller.chuyenDuLieuDiemTP_DiemThi();
        showTable();
        selectionTable();
    }

     // Hàm hiển thị bảng
    void showTable(){
// Lấy danh sách sinh viên tưf file QuanLySV.dat
        list = sinhvienteacherdta.docFileQuanLyDiemThi();
        DefaultTableModel dtm = new DefaultTableModel();
        table.setModel(dtm);
// Thêm tiêu đề cho bảng
        dtm.addColumn("Mã SV");
        dtm.addColumn("Tên SV");
        dtm.addColumn("Điểm TP");
        dtm.addColumn("Điểm Thi");
        dtm.addColumn("Điểm TB");
        dtm.addColumn("Điểm Chữ");
// Nếu danh sách khác null thì thực hiện tiếp
        if(list != null){
// if else hiển thị 10 sinh viên một lần
            if(k<list.size()-10){
                for(int i=k; i< k+10; i++){
                    QuanLyDiemThi a = list.get(i);
                    dtm.addRow(new Object[]{a.getMaSV(), a.getTenSV(),a.getDiemTP(),a.getDiemThi() > 0 ? a.getDiemThi():null ,a.getDiemTB(), a.getDiemChu()});
                }
            }
            else{
                for(int i=k; i< list.size(); i++){
                    QuanLyDiemThi a = list.get(i);
                    dtm.addRow(new Object[]{a.getMaSV(), a.getTenSV(),a.getDiemTP(),a.getDiemThi() > 0 ? a.getDiemThi():null ,a.getDiemTB(), a.getDiemChu()});
                }
            }
        }
        else{
            JOptionPane.showMessageDialog(this, "Không có sinh viên nào trong danh sách");
        }
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
                    diemThiTextField.setText(String.valueOf(table.getValueAt(rows[0], 3)));
                }
            }
        });
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        maSVTextField = new javax.swing.JTextField();
        searchTextField = new javax.swing.JTextField();
        tenSVTextField = new javax.swing.JTextField();
        searchBtn = new javax.swing.JButton();
        diemThiTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        nhapBtn = new javax.swing.JButton();
        prevBtn = new javax.swing.JButton();
        nextBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(801, 434));

        maSVTextField.setEditable(false);

        tenSVTextField.setEditable(false);

        searchBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-search-16.png"))); // NOI18N
        searchBtn.setText("Tìm kiếm");
        searchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBtnActionPerformed(evt);
            }
        });

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã SV", "Tên SV", "Điểm TP", "Điểm Thi", "Điểm TB", "Điểm Chữ"
            }
        ));
        jScrollPane1.setViewportView(table);

        nhapBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-edit-16.png"))); // NOI18N
        nhapBtn.setText("Nhập");
        nhapBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nhapBtnActionPerformed(evt);
            }
        });

        prevBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-prev-16.png"))); // NOI18N
        prevBtn.setText("Quay lại");
        prevBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prevBtnActionPerformed(evt);
            }
        });

        nextBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/I_16/icons8-next-16.png"))); // NOI18N
        nextBtn.setText("Tiếp");
        nextBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Nhập mã sv xong click 'Tìm kiếm' hoặc click vào tên sinh viên trong bảng để nhập điểm");

        jLabel3.setText("Mã SV:");

        jLabel4.setText("Tên SV:");

        jLabel5.setText("Điểm Thi:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Quản lý điểm thi");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(searchBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(317, 317, 317)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(prevBtn)
                        .addGap(147, 147, 147)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(diemThiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nhapBtn)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(maSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(nextBtn)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(maSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prevBtn)
                    .addComponent(nextBtn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tenSVTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(diemThiTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nhapBtn)
                .addContainerGap(8, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void searchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBtnActionPerformed
        // TODO add your handling code here:
        // Lấy mã sv mà người dùng nhập vào và tìm trong danh sách diem thi do giáo viên quản lí
        String maSV = searchTextField.getText();
        list = sinhvienteacherdta.docFileQuanLyDiemThi();
        for(QuanLyDiemThi a : list){
            if(a.getMaSV().equals(maSV)){
                // Tìm thấy thì gán maSV, tenSV, diem thi vào các ô textField bên dưới
                maSVTextField.setText(a.getMaSV());
                tenSVTextField.setText(a.getTenSV());
                diemThiTextField.setText(String.valueOf(a.getDiemThi()));
            }
        }
        // Gán lại ô tìm kiếm bằng ""
        searchTextField.setText("");
    }//GEN-LAST:event_searchBtnActionPerformed

    private void nhapBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nhapBtnActionPerformed
        // TODO add your handling code here:
        //Lấy maSV, diem thi trong các ô textField
        String maSV = maSVTextField.getText();
        try{
            float diemThi = Float.parseFloat(diemThiTextField.getText());
            if(diemThi>10 || diemThi <0){
                JOptionPane.showMessageDialog(this, "Điểm phải nằm trong khoảng 0-10", "Warning", JOptionPane.WARNING_MESSAGE);
            }
            else{
                list = sinhvienteacherdta.docFileQuanLyDiemThi();
                // Tìm kiếm sinh viên trong file quản lí điểm của giáo viên
                for(QuanLyDiemThi a : list){
                    // Tìm thấy thì set lại diem1 và diem2 thành điểm mà giáo viên vừa nhập
                    if(a.getMaSV().equals(maSV)){
                        a.setDiemThi(diemThi);
                        a.setDiemTB(a.tinhDiemTB());
                        a.setDiemChu(a.tinhDiemChu());
                    }
                }
                // ghi lại file, gọi hàm showTable và gán lại giá trị các ô textFiled bằng ""
                sinhvienteacherdta.ghiFileQuanLyDiemThi(list);
                showTable();
                maSVTextField.setText("");
                tenSVTextField.setText("");
                diemThiTextField.setText("");
            }
        } catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Điểm phải là số", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_nhapBtnActionPerformed

    private void prevBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prevBtnActionPerformed
        // TODO add your handling code here:
        list = sinhvienteacherdta.docFileQuanLyDiemThi();
        while(k>0){
            k -= 10;
            showTable();
        }
    }//GEN-LAST:event_prevBtnActionPerformed

    private void nextBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBtnActionPerformed
        // TODO add your handling code here:
        while(k< list.size()-10){
            k += 10;
            showTable();
        }
    }//GEN-LAST:event_nextBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField diemThiTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField maSVTextField;
    private javax.swing.JButton nextBtn;
    private javax.swing.JButton nhapBtn;
    private javax.swing.JButton prevBtn;
    private javax.swing.JButton searchBtn;
    private javax.swing.JTextField searchTextField;
    private javax.swing.JTable table;
    private javax.swing.JTextField tenSVTextField;
    // End of variables declaration//GEN-END:variables
}
