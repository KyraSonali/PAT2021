/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Backend.MoodManagement;

/**
 *
 * @author Kyra Balliram
 */
public class happyScreen extends javax.swing.JFrame {

    public static String currentTxt;

    /**
     * Creates new form HappyM
     */
    public happyScreen() {
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

        jPanel1 = new javax.swing.JPanel();
        HappyTxt = new javax.swing.JLabel();
        outputTxt = new javax.swing.JTextField();
        OutputTxt = new javax.swing.JLabel();
        AdmiredCh = new javax.swing.JCheckBox();
        blessedCh = new javax.swing.JCheckBox();
        excitedCh = new javax.swing.JCheckBox();
        satisfiedCh = new javax.swing.JCheckBox();
        loveCh = new javax.swing.JCheckBox();
        TriumCh = new javax.swing.JCheckBox();
        joyCh = new javax.swing.JCheckBox();
        lovedCh = new javax.swing.JCheckBox();
        AddB = new javax.swing.JButton();
        Exit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(190, 144, 212));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        HappyTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        HappyTxt.setText("HAPPY:");
        jPanel1.add(HappyTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 135, 28));
        jPanel1.add(outputTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 50, 160, 200));

        OutputTxt.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        OutputTxt.setText("Output:");
        jPanel1.add(OutputTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 20, 60, 20));

        AdmiredCh.setText("admired");
        jPanel1.add(AdmiredCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 110, 30));

        blessedCh.setText("blessed");
        jPanel1.add(blessedCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 110, 30));

        excitedCh.setText("excited");
        jPanel1.add(excitedCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 180, 110, 30));

        satisfiedCh.setText("satisfied");
        jPanel1.add(satisfiedCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 110, 30));

        loveCh.setText("in love");
        jPanel1.add(loveCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 30));

        TriumCh.setText("triumphatic");
        jPanel1.add(TriumCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 110, 30));

        joyCh.setText("joy");
        jPanel1.add(joyCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 100, 110, 30));

        lovedCh.setText("loved");
        jPanel1.add(lovedCh, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 140, 110, 30));

        AddB.setText("Add");
        AddB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBActionPerformed(evt);
            }
        });
        jPanel1.add(AddB, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 230, 80, -1));

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jPanel1.add(Exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 284, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBActionPerformed
        // TODO add your handling code here:
        if (loveCh.isSelected()) {
            MoodManagement.addEmotion("in Love");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Love,");
        }
        if (joyCh.isSelected()) {
            MoodManagement.addEmotion("Joy");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Joy,");
        }
        if (satisfiedCh.isSelected()) {
            MoodManagement.addEmotion("Satisfied");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Satisfied,");
        }
        if (lovedCh.isSelected()) {
            MoodManagement.addEmotion("Loved");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Loved,");
        }
        if (excitedCh.isSelected()) {
            MoodManagement.addEmotion("Excited");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Excited,");
        }

        if (TriumCh.isSelected()) {
            MoodManagement.addEmotion("Triumphatic");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Triumphatic,");
        }

        if (AdmiredCh.isSelected()) {
            MoodManagement.addEmotion("Admired");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Admired,");
        }

        if (blessedCh.isSelected()) {
            MoodManagement.addEmotion("Blessed");
            currentTxt = outputTxt.getText();
            outputTxt.setText(currentTxt + " Blessed,");
        }
    }//GEN-LAST:event_AddBActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        // TODO add your handling code here:
        dispose();
        new HomeScreen().setVisible(true);
    }//GEN-LAST:event_ExitActionPerformed

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
            java.util.logging.Logger.getLogger(happyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(happyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(happyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(happyScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new happyScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddB;
    private javax.swing.JCheckBox AdmiredCh;
    private javax.swing.JButton Exit;
    private javax.swing.JLabel HappyTxt;
    private javax.swing.JLabel OutputTxt;
    private javax.swing.JCheckBox TriumCh;
    private javax.swing.JCheckBox blessedCh;
    private javax.swing.JCheckBox excitedCh;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox joyCh;
    private javax.swing.JCheckBox loveCh;
    private javax.swing.JCheckBox lovedCh;
    private javax.swing.JTextField outputTxt;
    private javax.swing.JCheckBox satisfiedCh;
    // End of variables declaration//GEN-END:variables
}
