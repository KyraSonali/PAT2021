/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.UserManagement;
import javax.swing.JOptionPane;

/**
 *
 * @author Kyra Balliram
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    public static String accountusername;
    public static String accountpassword;

    public LogIn() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        CreateB = new javax.swing.JButton();
        LogB = new javax.swing.JButton();
        AccountPasswordField = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        AccountUsernameField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        UserTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 181, 204));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(129, 207, 224));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        CreateB.setBackground(new java.awt.Color(197, 239, 247));
        CreateB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        CreateB.setForeground(new java.awt.Color(0, 0, 0));
        CreateB.setText("Create an account");
        CreateB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        CreateB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CreateBMouseClicked(evt);
            }
        });
        jPanel1.add(CreateB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 71));

        LogB.setBackground(new java.awt.Color(197, 239, 247));
        LogB.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        LogB.setForeground(new java.awt.Color(0, 0, 0));
        LogB.setText("LOGIN");
        LogB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        LogB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LogBActionPerformed(evt);
            }
        });
        jPanel1.add(LogB, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 380, 470, 71));

        AccountPasswordField.setText("jPasswordField1");
        jPanel1.add(AccountPasswordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 190, 30));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Password");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 110, -1));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Account");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 110, -1));
        jPanel1.add(AccountUsernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 190, 30));

        UserTextArea.setColumns(20);
        UserTextArea.setRows(5);
        jScrollPane1.setViewportView(UserTextArea);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 120, 170, 230));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Current Accounts:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 140, 30));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 460, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CreateBMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CreateBMouseClicked
        // TODO add your handling code here:
        dispose();
        new CreateAccount().setVisible(true);
    }//GEN-LAST:event_CreateBMouseClicked

    private void LogBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LogBActionPerformed
        // TODO add your handling code here:
        accountusername = AccountUsernameField.getText();
        accountpassword = AccountPasswordField.getText();

        //Use the backend to manipulate the textfile data
        if (UserManagement.checkUser(accountusername, accountpassword)) {
            dispose();
            new Date().setVisible(true);
        } else {
            JOptionPane.showMessageDialog(this, "Wrong username or password");
        }

    }//GEN-LAST:event_LogBActionPerformed

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
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField AccountPasswordField;
    private javax.swing.JTextField AccountUsernameField;
    private javax.swing.JButton CreateB;
    private javax.swing.JButton LogB;
    private javax.swing.JTextArea UserTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
