/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author Kyra Balliram
 */
public class DepressionCourse2 extends javax.swing.JFrame {

    /**
     * Creates new form DepressionCourse2
     */
    public DepressionCourse2() {
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

        jPanel11 = new javax.swing.JPanel();
        jScrollPane11 = new javax.swing.JScrollPane();
        InfoTxtArea11 = new javax.swing.JTextArea();
        Lable10 = new javax.swing.JLabel();
        Continue10 = new javax.swing.JButton();
        ExitB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(242, 217, 132));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        InfoTxtArea11.setEditable(false);
        InfoTxtArea11.setColumns(20);
        InfoTxtArea11.setRows(5);
        InfoTxtArea11.setText("In a normlly functioning mind, there is always a healthy \ncompetition between emptional states.\nSomething that makes you feel sad for a time, then \nanother emotion comes to the forefront, and your sadness\nis replaced by joy,or fear or anger. Then you feel sad again\n- and after a while, the sadness is replaced by another \nemotion. Your mood changes in response to your circumstances\nBut if for some reason the adaptive mechanisms of your mind\nare not wokring properly, your brain can go into a self-sustaining\ncycle of sadness. This ay the feeling of melchancholy will not\nbe replaced, and your mind will fall into a state of of depressive\ndisorder.");
        jScrollPane11.setViewportView(InfoTxtArea11);

        jPanel11.add(jScrollPane11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 380, 240));

        Lable10.setBackground(new java.awt.Color(0, 0, 0));
        Lable10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lable10.setForeground(new java.awt.Color(0, 0, 0));
        Lable10.setText("Is it wrong to be sad?");
        jPanel11.add(Lable10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 320, 30));

        Continue10.setText("Continue");
        Continue10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Continue10ActionPerformed(evt);
            }
        });
        jPanel11.add(Continue10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 310, 126, -1));

        ExitB.setText("Exit");
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });
        jPanel11.add(ExitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 343, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Continue10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Continue10ActionPerformed
        // TODO add your handling code here:
        dispose();
        new DepressionQuiz().setVisible(true);
    }//GEN-LAST:event_Continue10ActionPerformed

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_ExitBActionPerformed

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
            java.util.logging.Logger.getLogger(DepressionCourse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepressionCourse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepressionCourse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepressionCourse2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepressionCourse2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Continue;
    private javax.swing.JButton Continue1;
    private javax.swing.JButton Continue10;
    private javax.swing.JButton Continue2;
    private javax.swing.JButton Continue3;
    private javax.swing.JButton Continue4;
    private javax.swing.JButton Continue5;
    private javax.swing.JButton Continue6;
    private javax.swing.JButton Continue7;
    private javax.swing.JButton Continue8;
    private javax.swing.JButton Continue9;
    private javax.swing.JButton ExitB;
    private javax.swing.JTextArea InfoTxtArea1;
    private javax.swing.JTextArea InfoTxtArea10;
    private javax.swing.JTextArea InfoTxtArea11;
    private javax.swing.JTextArea InfoTxtArea2;
    private javax.swing.JTextArea InfoTxtArea3;
    private javax.swing.JTextArea InfoTxtArea4;
    private javax.swing.JTextArea InfoTxtArea5;
    private javax.swing.JTextArea InfoTxtArea6;
    private javax.swing.JTextArea InfoTxtArea7;
    private javax.swing.JTextArea InfoTxtArea8;
    private javax.swing.JTextArea InfoTxtArea9;
    private javax.swing.JLabel Lable;
    private javax.swing.JLabel Lable1;
    private javax.swing.JLabel Lable10;
    private javax.swing.JLabel Lable2;
    private javax.swing.JLabel Lable3;
    private javax.swing.JLabel Lable4;
    private javax.swing.JLabel Lable5;
    private javax.swing.JLabel Lable6;
    private javax.swing.JLabel Lable7;
    private javax.swing.JLabel Lable8;
    private javax.swing.JLabel Lable9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane10;
    private javax.swing.JScrollPane jScrollPane11;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JScrollPane jScrollPane9;
    // End of variables declaration//GEN-END:variables
}
