/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import DTO.NhanVien;
import BUS.NhanVienBUS;
import BUS.QuyenBUS;
import DTO.Quyen;
import BUS.TaiKhoanBUS;
import DTO.TaiKhoan;
import util.ReadWriteFile.WorkWithFile;

import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Objects;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class LoginForm extends javax.swing.JFrame {

    public LoginForm() {
        initComponents();
        this.setTitle("Đăng nhập");
        ImageIcon logo = new ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon/main_logo.png")));
        setIconImage(logo.getImage());

        this.setLocationRelativeTo(null);

        // add event Enter
        KeyAdapter ka = new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent ke) {
                if (ke.getKeyCode() == KeyEvent.VK_ENTER) {
                    btnDangNhap.doClick();
                }
            }
        };
        txTenDangNhap.addKeyListener(ka);
        txMatKhau.addKeyListener(ka);

        // add auto select text on focus
        // https://stackoverflow.com/questions/7361291/select-all-on-focus-in-lots-of-jtextfield
        FocusListener fl = new FocusListener() {
            @Override
            public void focusGained(FocusEvent fe) {
                if (fe.getSource() instanceof JTextField) {
                    JTextField tx = (JTextField) fe.getSource();
                    tx.select(0, tx.getText().length());

                } else if (fe.getSource() instanceof JPasswordField) {
                    JPasswordField tx = (JPasswordField) fe.getSource();
                    tx.select(0, tx.getText().length());
                }

            }

            @Override
            public void focusLost(FocusEvent fe) {
                if (fe.getSource() instanceof JTextField) {
                    JTextField tx = (JTextField) fe.getSource();
                    tx.select(0, 0);

                } else if (fe.getSource() instanceof JPasswordField) {
                    JPasswordField tx = (JPasswordField) fe.getSource();
                    tx.select(0, 0);
                }
            }
        };
        txTenDangNhap.addFocusListener(fl);
        txMatKhau.addFocusListener(fl);

        // auto focus to tenDangNhap
        txTenDangNhap.requestFocus();

        // check lần đăng nhập cũ
        String text = new WorkWithFile(saveFileName).read();
        if (!text.equals("")) {
            try {
                txTenDangNhap.setText(text.split(" ")[0]);
                txMatKhau.setText(text.split(" ")[1]);
                rbNhoMatKhau.setSelected(true);

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Lỗi Giữ đăng nhập");
            }
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JScrollBar jScrollBar1 = new javax.swing.JScrollBar();
        javax.swing.JPanel plForm = new javax.swing.JPanel();
        javax.swing.JPanel plDangNhap = new javax.swing.JPanel();
        btnDangNhap = new javax.swing.JButton();
        javax.swing.JPanel plInput = new javax.swing.JPanel();
        rbNhoMatKhau = new javax.swing.JRadioButton();
        txTenDangNhap = new javax.swing.JTextField();
        javax.swing.JLabel lbImgPass = new javax.swing.JLabel();
        javax.swing.JLabel lbImgUser = new javax.swing.JLabel();
        txMatKhau = new javax.swing.JPasswordField();
        javax.swing.JPanel plHeader = new javax.swing.JPanel();
        javax.swing.JLabel lbHeader = new javax.swing.JLabel();
        javax.swing.JLabel lbAva = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        Color background = new java.awt.Color(220, 218, 214);
        Color foreground=new Color(22, 165, 18);
        plForm.setBackground(background);

        btnDangNhap.setBackground(background);
        btnDangNhap.setFont(new java.awt.Font("SansSerif", Font.BOLD, 20)); // NOI18N
        btnDangNhap.setForeground(foreground);
        btnDangNhap.setText("Xác nhận");
        btnDangNhap.addActionListener(this::btnDangNhapActionPerformed);

        javax.swing.GroupLayout plDangNhapLayout = new javax.swing.GroupLayout(plDangNhap);
        plDangNhap.setLayout(plDangNhapLayout);
        plDangNhapLayout.setHorizontalGroup(
                plDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plDangNhapLayout.setVerticalGroup(
                plDangNhapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        rbNhoMatKhau.setFont(new java.awt.Font("Dialog", Font.PLAIN, 14)); // NOI18N
        rbNhoMatKhau.setText("Giữ đăng nhập");
        rbNhoMatKhau.addActionListener(this::rbNhoMatKhauActionPerformed);

        txTenDangNhap.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        lbImgPass.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon/login_password.png")))); // NOI18N

        lbImgUser.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon/login_users.png")))); // NOI18N

        txMatKhau.setFont(new java.awt.Font("Segoe UI", Font.PLAIN, 18)); // NOI18N

        javax.swing.GroupLayout plInputLayout = new javax.swing.GroupLayout(plInput);
        plInput.setLayout(plInputLayout);
        plInputLayout.setHorizontalGroup(
                plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plInputLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbImgPass)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(plInputLayout.createSequentialGroup()
                                                .addComponent(rbNhoMatKhau)
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addComponent(txMatKhau))
                                .addContainerGap())
                        .addGroup(plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(plInputLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addComponent(lbImgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txTenDangNhap)
                                        .addContainerGap()))
        );
        plInputLayout.setVerticalGroup(
                plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plInputLayout.createSequentialGroup()
                                .addContainerGap(70, Short.MAX_VALUE)
                                .addGroup(plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lbImgPass, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txMatKhau, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(14, 14, 14)
                                .addComponent(rbNhoMatKhau)
                                .addContainerGap())
                        .addGroup(plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(plInputLayout.createSequentialGroup()
                                        .addContainerGap()
                                        .addGroup(plInputLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(txTenDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(lbImgUser, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addContainerGap(109, Short.MAX_VALUE)))
        );

        plHeader.setBackground(background);

        lbHeader.setFont(new java.awt.Font("Segoe UI", Font.BOLD, 24)); // NOI18N
        lbHeader.setForeground(foreground);
        lbHeader.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbHeader.setText("ĐĂNG NHẬP");

        javax.swing.GroupLayout plHeaderLayout = new javax.swing.GroupLayout(plHeader);
        plHeader.setLayout(plHeaderLayout);
        plHeaderLayout.setHorizontalGroup(
                plHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 347, Short.MAX_VALUE)
                                .addContainerGap())
        );
        plHeaderLayout.setVerticalGroup(
                plHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(plHeaderLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(lbHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                                .addContainerGap())
        );

        lbAva.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbAva.setIcon(new javax.swing.ImageIcon(Objects.requireNonNull(getClass().getResource("/images/icon/login_employees.png")))); // NOI18
        javax.swing.GroupLayout plFormLayout = new javax.swing.GroupLayout(plForm);
        plForm.setLayout(plFormLayout);
        plFormLayout.setHorizontalGroup(
                plFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plDangNhap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(plInput, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbAva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        plFormLayout.setVerticalGroup(
                plFormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, plFormLayout.createSequentialGroup()
                                .addComponent(plHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbAva)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(plInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(plDangNhap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plForm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(plForm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        String tentk = txTenDangNhap.getText();
        String mk = txMatKhau.getText();
        TaiKhoanBUS qltk = new TaiKhoanBUS();
        TaiKhoan tk = qltk.getTaiKhoan(tentk);

        if (tk != null) {
            // check xem nhân viên của tài khoản này có bị khóa (Ẩn) hay không
            NhanVien nv = new NhanVienBUS().getNhanVien(tk.getMaNV());
            if (nv.getTrangThai() == 1) {
                JOptionPane.showMessageDialog(this, "Tài khoản này đã bị khóa, do chủ nhân tài khoản này đã bị ẨN khỏi hệ thống!");
                return;
            }

            // check password
            if (tk.getPassword().equals(mk)) {
                taiKhoanLogin = tk;
                nhanVienLogin = nv;
                quyenLogin = new QuyenBUS().getQuyen(taiKhoanLogin.getMaQuyen());

                // Đăng nhập thành công
                if (rbNhoMatKhau.isSelected()) {
                    // nếu giữ đăng nhập thì lưu tài khoản đăng nhập vào file
                    new WorkWithFile(saveFileName).write(taiKhoanLogin.getUsername() + " " + taiKhoanLogin.getPassword());
                } else {
                    // nếu không thì xóa mọi dữ liệu trong file
                    new WorkWithFile(saveFileName).write("");
                }

                new MainForm().setVisible(true);
                this.dispose();

            } else {
                JOptionPane.showMessageDialog(this, "Sai mật khẩu!");
                txMatKhau.requestFocus();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Sai tên đăng nhập!");
            txTenDangNhap.requestFocus();
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed

    private void rbNhoMatKhauActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNhoMatKhauActionPerformed

    }//GEN-LAST:event_rbNhoMatKhauActionPerformed

    public static String saveFileName = "temp";
    public static Quyen quyenLogin;
    public static NhanVien nhanVienLogin;
    public static TaiKhoan taiKhoanLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JRadioButton rbNhoMatKhau;
    private javax.swing.JPasswordField txMatKhau;
    private javax.swing.JTextField txTenDangNhap;
    // End of variables declaration//GEN-END:variables
}
