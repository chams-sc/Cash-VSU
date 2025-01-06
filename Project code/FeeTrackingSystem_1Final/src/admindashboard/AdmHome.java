/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admindashboard;

import java.awt.Color;
import java.awt.Toolkit;

/**
 *
 * @author User
 */
public class AdmHome extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public AdmHome() {
        initComponents();      
        setTitle("Cash-VSU");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/MainIcon.png")));
    }
    
    private String adminPass;
    public AdmHome(String adminPass) {
        this.adminPass = adminPass;
        initComponents();      
        setTitle("Cash-VSU");
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("/icons/MainIcon.png")));        
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
        jPanel3 = new javax.swing.JPanel();
        lblAddFees = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblPending = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        lblStudentRecord = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        lblCTransaction = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        lblTranHistory = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        lblLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAddFees.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblAddFees.setForeground(new java.awt.Color(255, 255, 255));
        lblAddFees.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/plus.png"))); // NOI18N
        lblAddFees.setText("     Add Fees");
        lblAddFees.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblAddFeesMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblAddFeesMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblAddFeesMouseExited(evt);
            }
        });
        jPanel3.add(lblAddFees, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, -1, 210));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 40, 320, 210));

        jPanel4.setBackground(new java.awt.Color(0, 102, 102));
        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblPending.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblPending.setForeground(new java.awt.Color(255, 255, 255));
        lblPending.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/search-document.png"))); // NOI18N
        lblPending.setText("<html>Pending<br>Payments</html>");
        lblPending.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblPendingMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblPendingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblPendingMouseExited(evt);
            }
        });
        jPanel4.add(lblPending, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, -2, 290, 210));

        jPanel1.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 320, 210));

        jPanel5.setBackground(new java.awt.Color(0, 102, 102));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblStudentRecord.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblStudentRecord.setForeground(new java.awt.Color(255, 255, 255));
        lblStudentRecord.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/view all record.png"))); // NOI18N
        lblStudentRecord.setText("Student Records");
        lblStudentRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblStudentRecordMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblStudentRecordMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblStudentRecordMouseExited(evt);
            }
        });
        jPanel5.add(lblStudentRecord, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 300, 210));

        jPanel1.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 40, 320, 210));

        jPanel6.setBackground(new java.awt.Color(0, 102, 102));
        jPanel6.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Transaction");
        jPanel6.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        lblCTransaction.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblCTransaction.setForeground(new java.awt.Color(255, 255, 255));
        lblCTransaction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/edit.png"))); // NOI18N
        lblCTransaction.setText("     Confirm ");
        lblCTransaction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblCTransactionMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblCTransactionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblCTransactionMouseExited(evt);
            }
        });
        jPanel6.add(lblCTransaction, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 390, 210));

        jPanel1.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 410, 210));

        jPanel7.setBackground(new java.awt.Color(0, 102, 102));
        jPanel7.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("history");
        jPanel7.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 120, -1, -1));

        lblTranHistory.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblTranHistory.setForeground(new java.awt.Color(255, 255, 255));
        lblTranHistory.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/text-book-opened-from-top-view.png"))); // NOI18N
        lblTranHistory.setText("     Transaction");
        lblTranHistory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblTranHistoryMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblTranHistoryMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblTranHistoryMouseExited(evt);
            }
        });
        jPanel7.add(lblTranHistory, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 0, 380, 210));

        jPanel1.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 340, 400, 210));

        jPanel9.setBackground(new java.awt.Color(0, 102, 102));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jPanel9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblLogout.setFont(new java.awt.Font("Trebuchet MS", 0, 25)); // NOI18N
        lblLogout.setForeground(new java.awt.Color(255, 255, 255));
        lblLogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/logout.png"))); // NOI18N
        lblLogout.setText("Logout");
        lblLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblLogoutMouseExited(evt);
            }
        });
        jPanel9.add(lblLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, -60, -1, 210));

        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 590, 160, 90));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 170, 1630, 790));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/CvSU Logo_2.png"))); // NOI18N
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 10, 260, 160));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Republic of the Philippines");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 30, -1, -1));

        jLabel10.setFont(new java.awt.Font("Front Page Neue", 0, 36)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("CAVITE STATE UNIVERSITY");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 50, -1, -1));

        jLabel11.setFont(new java.awt.Font("Front Page Neue", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Don Severino de las Alas Campus");
        jPanel2.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 90, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Indang, Cavite");
        jPanel2.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1630, 180));

        setSize(new java.awt.Dimension(1282, 905));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void lblAddFeesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddFeesMouseClicked
        AdmAddFees addFees = new AdmAddFees(adminPass);
        addFees.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblAddFeesMouseClicked

    private void lblAddFeesMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddFeesMouseEntered

        Color clr = new Color(0,51,51);
        jPanel3.setBackground(clr);
    }//GEN-LAST:event_lblAddFeesMouseEntered

    private void lblAddFeesMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblAddFeesMouseExited
        Color clr = new Color(0,102,102);
        jPanel3.setBackground(clr);
    }//GEN-LAST:event_lblAddFeesMouseExited

    private void lblPendingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPendingMouseClicked
        AdmPendingReq Srchrcrd = new AdmPendingReq(adminPass);
        Srchrcrd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblPendingMouseClicked

    private void lblPendingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPendingMouseEntered
        Color clr = new Color(0,51,51);
        jPanel4.setBackground(clr);
    }//GEN-LAST:event_lblPendingMouseEntered

    private void lblPendingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblPendingMouseExited
        Color clr = new Color(0,102,102);
        jPanel4.setBackground(clr);
    }//GEN-LAST:event_lblPendingMouseExited

    private void lblStudentRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentRecordMouseClicked
        AdmStudRecord stdntrcd = new AdmStudRecord(adminPass);
        stdntrcd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblStudentRecordMouseClicked

    private void lblStudentRecordMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentRecordMouseEntered
        Color clr = new Color(0,51,51);
        jPanel5.setBackground(clr);
    }//GEN-LAST:event_lblStudentRecordMouseEntered

    private void lblStudentRecordMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblStudentRecordMouseExited
        Color clr = new Color(0,102,102);
        jPanel5.setBackground(clr);
    }//GEN-LAST:event_lblStudentRecordMouseExited

    private void lblCTransactionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCTransactionMouseClicked
        AdmConfirmTrans vwalrcd = new AdmConfirmTrans(adminPass);
        vwalrcd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblCTransactionMouseClicked

    private void lblCTransactionMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCTransactionMouseEntered
        Color clr = new Color(0,51,51);
        jPanel6.setBackground(clr);
    }//GEN-LAST:event_lblCTransactionMouseEntered

    private void lblCTransactionMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblCTransactionMouseExited
        Color clr = new Color(0,102,102);
        jPanel6.setBackground(clr);
    }//GEN-LAST:event_lblCTransactionMouseExited

    private void lblTranHistoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranHistoryMouseClicked
        AdmTranHistory trnscthstry = new AdmTranHistory(adminPass);
        trnscthstry.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblTranHistoryMouseClicked

    private void lblTranHistoryMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranHistoryMouseEntered
        Color clr = new Color(0,51,51);
        jPanel7.setBackground(clr);
    }//GEN-LAST:event_lblTranHistoryMouseEntered

    private void lblTranHistoryMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblTranHistoryMouseExited
        Color clr = new Color(0,102,102);
        jPanel7.setBackground(clr);
    }//GEN-LAST:event_lblTranHistoryMouseExited

    private void lblLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseClicked
        AdmLogin lgn = new AdmLogin();
        lgn.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblLogoutMouseClicked

    private void lblLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseEntered
        Color clr = new Color(0,51,51);
        jPanel9.setBackground(clr);
    }//GEN-LAST:event_lblLogoutMouseEntered

    private void lblLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLogoutMouseExited
        Color clr = new Color(0,102,102);
        jPanel9.setBackground(clr);
    }//GEN-LAST:event_lblLogoutMouseExited

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
            java.util.logging.Logger.getLogger(AdmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdmHome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdmHome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JLabel lblAddFees;
    private javax.swing.JLabel lblCTransaction;
    private javax.swing.JLabel lblLogout;
    private javax.swing.JLabel lblPending;
    private javax.swing.JLabel lblStudentRecord;
    private javax.swing.JLabel lblTranHistory;
    // End of variables declaration//GEN-END:variables
}
