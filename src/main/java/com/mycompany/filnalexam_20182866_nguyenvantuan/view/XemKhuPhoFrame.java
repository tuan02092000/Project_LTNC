package com.mycompany.filnalexam_20182866_nguyenvantuan.view;

import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.HoDanDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.controller.Implement.NguoiDAO;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.HoDanModel;
import com.mycompany.filnalexam_20182866_nguyenvantuan.model.NguoiModel;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nguyen Van Tuan
 */
public class XemKhuPhoFrame extends javax.swing.JFrame {
    DefaultTableModel tableModel;
    int indexHoDan = 0;
    /**
     * Creates new form XemKhuPhoFrame
     */
    public XemKhuPhoFrame() {
        initComponents();
    }
    
    public void showTable(List<NguoiModel> listNguoi) {
        tableModel.setRowCount(0);
        int i = 0;
        for (NguoiModel nguoi : listNguoi) {
            tableModel.addRow(new Object[]{
                ++i, nguoi.getHoVaTen(), Integer.toString(nguoi.getTuoi()), Integer.toString(nguoi.getNamSinh()), nguoi.getNgheNghiep()
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

        tenKhuPhoLabel = new javax.swing.JLabel();
        tenKhuPhoTextField = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        hoDanLabel = new javax.swing.JLabel();
        soNhaTextField = new javax.swing.JTextField();
        hoDanTruocButton = new javax.swing.JButton();
        hoDanSauButton = new javax.swing.JButton();
        soNhaLabel = new javax.swing.JLabel();
        maHoDanTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        nguoiTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        maKhuPhoTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tenKhuPhoLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        tenKhuPhoLabel.setText("Tên khu phố");

        tenKhuPhoTextField.setEnabled(false);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));

        hoDanLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        hoDanLabel.setText("Mã hộ dân");

        soNhaTextField.setEnabled(false);

        hoDanTruocButton.setText("Hộ dân trước");
        hoDanTruocButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoDanTruocButtonActionPerformed(evt);
            }
        });

        hoDanSauButton.setText("Hộ dân sau");
        hoDanSauButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hoDanSauButtonActionPerformed(evt);
            }
        });

        soNhaLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        soNhaLabel.setText("Số nhà");

        maHoDanTextField.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(soNhaLabel)
                    .addComponent(hoDanLabel))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(hoDanTruocButton)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                            .addComponent(hoDanSauButton, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(soNhaTextField))
                    .addComponent(maHoDanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoDanLabel)
                    .addComponent(maHoDanTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(soNhaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soNhaLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(hoDanTruocButton)
                    .addComponent(hoDanSauButton))
                .addContainerGap())
        );

        nguoiTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "STT", "Họ tên", "Tuổi", "Năm sinh", "Nghề nghiệp"
            }
        ));
        jScrollPane1.setViewportView(nguoiTable);
        if (nguoiTable.getColumnModel().getColumnCount() > 0) {
            nguoiTable.getColumnModel().getColumn(0).setMaxWidth(60);
            nguoiTable.getColumnModel().getColumn(2).setMaxWidth(60);
            nguoiTable.getColumnModel().getColumn(3).setMaxWidth(70);
        }

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Mã khu phố");

        maKhuPhoTextField.setEnabled(false);

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setText("back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                .addContainerGap(66, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tenKhuPhoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tenKhuPhoTextField)
                    .addComponent(maKhuPhoTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 249, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(maKhuPhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tenKhuPhoLabel)
                    .addComponent(tenKhuPhoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 324, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void hoDanTruocButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoDanTruocButtonActionPerformed
        HoDanDAO hdDAO = new HoDanDAO();
        List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPhoTextField.getText());
        
        indexHoDan--;
        int soLuongHoDan = listHoDan.size();
        if(indexHoDan < 0) {
            indexHoDan = soLuongHoDan - 1;
        }
        
        maHoDanTextField.setText(listHoDan.get(indexHoDan).getMaHoDan());
        soNhaTextField.setText(listHoDan.get(indexHoDan).getSoNha());
        
        NguoiDAO nguoiDAO = new NguoiDAO();
        List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
        
        tableModel = (DefaultTableModel) nguoiTable.getModel();
        showTable(listNguoi);
    }//GEN-LAST:event_hoDanTruocButtonActionPerformed

    private void hoDanSauButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hoDanSauButtonActionPerformed
        HoDanDAO hdDAO = new HoDanDAO();
        List<HoDanModel> listHoDan = hdDAO.findByMaKhuPho(maKhuPhoTextField.getText());
        
        indexHoDan++;
        int soLuongHoDan = listHoDan.size();
        if(indexHoDan > soLuongHoDan - 1) {
            indexHoDan = 0;
        }
        
        maHoDanTextField.setText(listHoDan.get(indexHoDan).getMaHoDan());
        soNhaTextField.setText(listHoDan.get(indexHoDan).getSoNha());
        
        NguoiDAO nguoiDAO = new NguoiDAO();
        List<NguoiModel> listNguoi = nguoiDAO.findByMaHoDan(maHoDanTextField.getText());
        
        tableModel = (DefaultTableModel) nguoiTable.getModel();
        showTable(listNguoi);       
    }//GEN-LAST:event_hoDanSauButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        KhuPhoFrame frame = new KhuPhoFrame();
        frame.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(XemKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XemKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XemKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XemKhuPhoFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XemKhuPhoFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel hoDanLabel;
    private javax.swing.JButton hoDanSauButton;
    private javax.swing.JButton hoDanTruocButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    protected javax.swing.JTextField maHoDanTextField;
    protected javax.swing.JTextField maKhuPhoTextField;
    private javax.swing.JTable nguoiTable;
    private javax.swing.JLabel soNhaLabel;
    protected javax.swing.JTextField soNhaTextField;
    private javax.swing.JLabel tenKhuPhoLabel;
    protected javax.swing.JTextField tenKhuPhoTextField;
    // End of variables declaration//GEN-END:variables
}
