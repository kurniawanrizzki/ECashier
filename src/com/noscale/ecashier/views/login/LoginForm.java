/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noscale.ecashier.views.login;

import java.awt.Color;

/**
 *
 * @author rizkikurniawan
 */
public class LoginForm extends javax.swing.JFrame {

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
        overlayPanel.setBackground(new Color(0,0,0,200));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        usernameSeparator = new javax.swing.JSeparator();
        passwordSeparator = new javax.swing.JSeparator();
        passwordField = new javax.swing.JPasswordField();
        closeTxt = new javax.swing.JLabel();
        loginButton = new javax.swing.JButton();
        passwordTxt = new javax.swing.JLabel();
        usernameTxt = new javax.swing.JLabel();
        overlayPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(32, 33, 35));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 10)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 52, 54));
        jLabel1.setText("Please call administrator if you forgot password");
        jPanel3.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, -1, -1));

        usernameField.setBackground(new java.awt.Color(32, 33, 35));
        usernameField.setForeground(new java.awt.Color(57, 113, 177));
        usernameField.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        usernameField.setCaretColor(new java.awt.Color(255, 255, 255));
        usernameField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                usernameFieldFocusGained(evt);
            }
        });
        jPanel3.add(usernameField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 270, 20));

        usernameSeparator.setBackground(new java.awt.Color(57, 113, 177));
        jPanel3.add(usernameSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 270, 10));
        jPanel3.add(passwordSeparator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 270, 10));

        passwordField.setBackground(new java.awt.Color(32, 33, 35));
        passwordField.setForeground(new java.awt.Color(57, 113, 177));
        passwordField.setBorder(null);
        passwordField.setCaretColor(new java.awt.Color(255, 255, 255));
        passwordField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                passwordFieldFocusGained(evt);
            }
        });
        jPanel3.add(passwordField, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 270, 20));

        closeTxt.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        closeTxt.setForeground(new java.awt.Color(57, 113, 177));
        closeTxt.setText("X");
        closeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closeTxtMouseClicked(evt);
            }
        });
        jPanel3.add(closeTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        loginButton.setBackground(new java.awt.Color(126, 87, 194));
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                loginButtonFocusGained(evt);
            }
        });
        jPanel3.add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 270, 30));

        passwordTxt.setBackground(new java.awt.Color(255, 255, 255));
        passwordTxt.setForeground(new java.awt.Color(51, 52, 54));
        passwordTxt.setText("Password");
        jPanel3.add(passwordTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, -1, -1));

        usernameTxt.setForeground(new java.awt.Color(57, 113, 177));
        usernameTxt.setText("Username");
        jPanel3.add(usernameTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 0, 333, 420));

        overlayPanel.setBackground(new java.awt.Color(0, 0, 0));
        overlayPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(overlayPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 340, 420));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/noscale/ecashier/assets/rsz_store.jpg"))); // NOI18N
        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void passwordFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_passwordFieldFocusGained
        // TODO add your handling code here:
        passwordSeparator.setBackground(new Color(57,113,177));
        passwordTxt.setForeground(new Color(57,113,177));
        usernameField.setForeground(new Color(57,113,177));
        
        usernameSeparator.setBackground(new Color(255,255,255));
        usernameTxt.setForeground(new Color(51,52,54));
        usernameField.setForeground(new Color(51,52,54));

    }//GEN-LAST:event_passwordFieldFocusGained

    private void usernameFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_usernameFieldFocusGained
        // TODO add your handling code here:
        usernameSeparator.setBackground(new Color(57,113,177));
        usernameTxt.setForeground(new Color(57,113,177));
        usernameField.setForeground(new Color(57,113,177));
        
        passwordSeparator.setBackground(new Color(255,255,255));
        passwordTxt.setForeground(new Color(51,52,54));
        passwordField.setForeground(new Color(51,52,54));
        
    }//GEN-LAST:event_usernameFieldFocusGained

    private void closeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closeTxtMouseClicked
        // TODO add your handling code here:
        setVisible(false);
        dispose();
    }//GEN-LAST:event_closeTxtMouseClicked

    private void loginButtonFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_loginButtonFocusGained
        // TODO add your handling code here:
        passwordSeparator.setBackground(new Color(255,255,255));
        passwordTxt.setForeground(new Color(51,52,54));
        passwordField.setForeground(new Color(51,52,54));
        
        usernameSeparator.setBackground(new Color(255,255,255));
        usernameTxt.setForeground(new Color(51,52,54));
        usernameField.setForeground(new Color(51,52,54));
        
    }//GEN-LAST:event_loginButtonFocusGained

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
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel closeTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton loginButton;
    private javax.swing.JPanel overlayPanel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JSeparator passwordSeparator;
    private javax.swing.JLabel passwordTxt;
    private javax.swing.JTextField usernameField;
    private javax.swing.JSeparator usernameSeparator;
    private javax.swing.JLabel usernameTxt;
    // End of variables declaration//GEN-END:variables
}
