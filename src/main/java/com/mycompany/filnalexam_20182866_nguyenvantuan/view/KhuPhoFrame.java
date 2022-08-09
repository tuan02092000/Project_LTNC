package com.mycompany.filnalexam_20182866_nguyenvantuan.view;

import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.HoDanDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.KhuPhoDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.NguoiDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.HoDanModel;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.KhuPhoModel;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.NguoiModel;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Van Tuan
 */
public class KhuPhoFrame extends javax.swing.JFrame {

    private List<KhuPhoModel> listKhuPho;
    DefaultTableModel tableModel;
    int i = 1;
    
    public KhuPhoFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        listKhuPho = new KhuPhoDAO().findAll();
        tableModel = (DefaultTableModel) hienthiTable.getModel();

        hienThiTable();
    }
    
    public void hienThiTable() {
        for (KhuPhoModel kp : listKhuPho) {
            tableModel.addRow(new Object[]{
                i++, kp.getMaKhuPho(), kp.getTenKhuPho()
            });
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

        maKhuPholabel = new javax.swing.JLabel();
        maKhuPhoTextField = new javax.swing.JTextField();
        suaButton = new javax.swing.JButton();
        xoaButton = new javax.swing.JButton();
        xemButton = new javax.swing.JButton();
        lamMoiButton = new javax.swing.JButton();
        themButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        hienthiTable = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        navigateMenuBar = new javax.swing.JMenu();
        themKhuPhoMenu = new javax.swing.JMenuItem();
        suaKhuPhoMenu = new javax.swing.JMenuItem();
        xoaKhuPhoMenu = new javax.swing.JMenuItem();
        xemKhuPhoMenu = new javax.swing.JMenuItem();
        adminMenuBar = new javax.swing.JMenu();
        thongTinAdminMenu = new javax.swing.JMenuItem();
        exitMenuBar = new javax.swing.JMenu();
        exitMenu = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        maKhuPholabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        maKhuPholabel.setText("Nhập mã khu phố");

        suaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        suaButton.setText("Sửa");
        suaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaButtonActionPerformed(evt);
            }
        });

        xoaButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xoaButton.setText("Xóa");
        xoaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaButtonActionPerformed(evt);
            }
        });

        xemButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        xemButton.setText("Xem");
        xemButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xemButtonActionPerformed(evt);
            }
        });

        lamMoiButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lamMoiButton.setText("Làm mới");
        lamMoiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lamMoiButtonActionPerformed(evt);
            }
        });

        themButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        themButton.setText("Thêm");
        themButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themButtonActionPerformed(evt);
            }
        });

        hienthiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Mã khu phố", "Tên khu phố"
            }
        ));
        hienthiTable.setAutoscrolls(false);
        jScrollPane1.setViewportView(hienthiTable);

        navigateMenuBar.setText("Navigate");

        themKhuPhoMenu.setText("Thêm khu phố");
        themKhuPhoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themKhuPhoMenuActionPerformed(evt);
            }
        });
        navigateMenuBar.add(themKhuPhoMenu);

        suaKhuPhoMenu.setText("Sửa khu phố");
        suaKhuPhoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaKhuPhoMenuActionPerformed(evt);
            }
        });
        navigateMenuBar.add(suaKhuPhoMenu);

        xoaKhuPhoMenu.setText("Xóa khu phố");
        xoaKhuPhoMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaKhuPhoMenuActionPerformed(evt);
            }
        });
        navigateMenuBar.add(xoaKhuPhoMenu);

        xemKhuPhoMenu.setText("Xem khu phố");
        navigateMenuBar.add(xemKhuPhoMenu);

        jMenuBar1.add(navigateMenuBar);

        adminMenuBar.setText("Admin");

        thongTinAdminMenu.setText("Thông tin admin");
        thongTinAdminMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                thongTinAdminMenuActionPerformed(evt);
            }
        });
        adminMenuBar.add(thongTinAdminMenu);

        jMenuBar1.add(adminMenuBar);

        exitMenuBar.setText("Exit");

        exitMenu.setText("exit");
        exitMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuActionPerformed(evt);
            }
        });
        exitMenuBar.add(exitMenu);

        jMenuBar1.add(exitMenuBar);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(maKhuPholabel, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(maKhuPhoTextField)
                            .addComponent(themButton, javax.swing.GroupLayout.DEFAULT_SIZE, 164, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xemButton, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                            .addComponent(suaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xoaButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lamMoiButton, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maKhuPhoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                        .addComponent(maKhuPholabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(xoaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(suaButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(themButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(xemButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lamMoiButton, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void suaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaButtonActionPerformed
        KhuPhoDAO kpDAO = new KhuPhoDAO();
        String maKhuPho = maKhuPhoTextField.getText();
        KhuPhoModel khuPho = kpDAO.findByID(maKhuPho);
        if(khuPho != null) {
            SuaKhuPhoFrame frame = new SuaKhuPhoFrame();
            frame.maKhuPhoTextField.setText(maKhuPho);
            frame.tenKhuPhoTextField.setText(khuPho.getTenKhuPho());
            
            HoDanDAO hdDAO = new HoDanDAO();
            List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPho);
            frame.maHoDanTextField.setText(listHoDan.get(0).getMaHoDan());
            frame.soNhaTextField.setText(listHoDan.get(0).getSoNha());
                    
            NguoiDAO nguoiDAO = new NguoiDAO();
            List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(listHoDan.get(0).getMaHoDan());
            frame.maNguoiTextField.setText(listNguoi.get(0).getMaNguoi());
            frame.hoTenTextField.setText(listNguoi.get(0).getHoVaTen());
            frame.tuoiTextField.setText(Integer.toString(listNguoi.get(0).getTuoi()));
            frame.namSinhTextField.setText(Integer.toString(listNguoi.get(0).getNamSinh()));
            frame.ngheNghiepTextField.setText(listNguoi.get(0).getNgheNghiep());
            
            frame.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã khu phố hoặc mã khu phố không tồn tại");
        }
        
        
    }//GEN-LAST:event_suaButtonActionPerformed

    private void xoaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaButtonActionPerformed
        XoaKhuPhoFrame frame = new XoaKhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_xoaButtonActionPerformed

    private void themButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themButtonActionPerformed
        ThemKhuPhoFrame frame = new ThemKhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_themButtonActionPerformed
    
    
    private void xemButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xemButtonActionPerformed
        KhuPhoDAO kpDAO = new KhuPhoDAO();
        String maKhuPho = maKhuPhoTextField.getText();
        KhuPhoModel khuPho = kpDAO.findByID(maKhuPho);
        if(khuPho != null) {
            XemKhuPhoFrame frame = new XemKhuPhoFrame();
            frame.maKhuPhoTextField.setText(khuPho.getMaKhuPho());
            frame.tenKhuPhoTextField.setText(khuPho.getTenKhuPho());
                       
            HoDanDAO hdDAO = new HoDanDAO();
            List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPho);
            frame.maHoDanTextField.setText(listHoDan.get(0).getMaHoDan());
            frame.soNhaTextField.setText(listHoDan.get(0).getSoNha());
                             
            frame.show();
            dispose();
        } else {
            JOptionPane.showMessageDialog(rootPane, "Bạn chưa nhập mã khu phố hoặc mã không tồn tại");
        }
    }//GEN-LAST:event_xemButtonActionPerformed

    private void lamMoiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lamMoiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lamMoiButtonActionPerformed

    private void themKhuPhoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themKhuPhoMenuActionPerformed
        ThemKhuPhoFrame frame = new ThemKhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_themKhuPhoMenuActionPerformed

    private void suaKhuPhoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaKhuPhoMenuActionPerformed
        SuaKhuPhoFrame frame = new SuaKhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_suaKhuPhoMenuActionPerformed

    private void xoaKhuPhoMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaKhuPhoMenuActionPerformed
        XoaKhuPhoFrame  frame = new XoaKhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_xoaKhuPhoMenuActionPerformed

    private void exitMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuActionPerformed
        MainFrame frame = new MainFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_exitMenuActionPerformed

    private void thongTinAdminMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_thongTinAdminMenuActionPerformed
        ThongTinAdmin frame = new ThongTinAdmin();
        frame.show();
        dispose();
    }//GEN-LAST:event_thongTinAdminMenuActionPerformed

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
            java.util.logging.Logger.getLogger(KhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new KhuPhoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu adminMenuBar;
    private javax.swing.JMenuItem exitMenu;
    private javax.swing.JMenu exitMenuBar;
    private javax.swing.JTable hienthiTable;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton lamMoiButton;
    private javax.swing.JTextField maKhuPhoTextField;
    private javax.swing.JLabel maKhuPholabel;
    private javax.swing.JMenu navigateMenuBar;
    private javax.swing.JButton suaButton;
    private javax.swing.JMenuItem suaKhuPhoMenu;
    private javax.swing.JButton themButton;
    private javax.swing.JMenuItem themKhuPhoMenu;
    private javax.swing.JMenuItem thongTinAdminMenu;
    private javax.swing.JButton xemButton;
    private javax.swing.JMenuItem xemKhuPhoMenu;
    private javax.swing.JButton xoaButton;
    private javax.swing.JMenuItem xoaKhuPhoMenu;
    // End of variables declaration//GEN-END:variables
}
