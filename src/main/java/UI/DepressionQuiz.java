/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.JOptionPane;

/**
 *
 * @author Kyra Balliram
 */
public class DepressionQuiz extends javax.swing.JFrame {

    /**
     * Creates new form DepressionQuiz
     */
    public DepressionQuiz() {
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
        Lable10 = new javax.swing.JLabel();
        ExitB = new javax.swing.JButton();
        answerTxtArea = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        option1 = new javax.swing.JCheckBox();
        option2 = new javax.swing.JCheckBox();
        option3 = new javax.swing.JCheckBox();
        answerB = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel11.setBackground(new java.awt.Color(242, 217, 132));
        jPanel11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Lable10.setBackground(new java.awt.Color(0, 0, 0));
        Lable10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        Lable10.setForeground(new java.awt.Color(0, 0, 0));
        Lable10.setText("QUIZ");
        jPanel11.add(Lable10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 70, 30));

        ExitB.setText("Exit");
        ExitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBActionPerformed(evt);
            }
        });
        jPanel11.add(ExitB, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 10, 70, -1));

        answerTxtArea.setEditable(false);
        jPanel11.add(answerTxtArea, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 230, 30));

        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Answer:");
        jPanel11.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 240, 110, 20));

        jTextField2.setText("When does a depressive disorder appear?");
        jPanel11.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 230, 30));

        option1.setText("When you want some drama");
        jPanel11.add(option1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 350, 30));

        option2.setText("When you are not spending enough time outdoors or with friends");
        jPanel11.add(option2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        option3.setText("When you are not experiencing positive mood changes");
        jPanel11.add(option3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 350, 30));

        answerB.setText("answer");
        answerB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                answerBActionPerformed(evt);
            }
        });
        jPanel11.add(answerB, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

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
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_ExitBActionPerformed

    private void answerBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_answerBActionPerformed
        // TODO add your handling code here:
        //densive 
    
        if (option1.isSelected()) {
            answerTxtArea.setText("You are wrong, the correct answer was option 3");
        }
        if (option2.isSelected()) {
            answerTxtArea.setText("You are wrong, the correct answer was option 3");
        }
        if (option3.isSelected()) {
            answerTxtArea.setText("You are Correct!");
        }
    }//GEN-LAST:event_answerBActionPerformed

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
            java.util.logging.Logger.getLogger(DepressionQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DepressionQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DepressionQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DepressionQuiz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DepressionQuiz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ExitB;
    private javax.swing.JLabel Lable10;
    private javax.swing.JButton answerB;
    private javax.swing.JTextField answerTxtArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JCheckBox option1;
    private javax.swing.JCheckBox option2;
    private javax.swing.JCheckBox option3;
    // End of variables declaration//GEN-END:variables
}
