/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Karel
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import java.util.logging.*;

public class Register extends javax.swing.JFrame {

    public static final int PASSWORD_LENGTH = 8;
    public Login login;
    
    public Register() {
        initComponents();
        login = new Login();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        signUpButton = new javax.swing.JButton();
        confirmPassword = new javax.swing.JTextField();
        rName = new javax.swing.JTextField();
        rLoginName = new javax.swing.JTextField();
        rPassword = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        signUpButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        signUpButton.setForeground(new java.awt.Color(255, 255, 255));
        signUpButton.setText("Create");
        signUpButton.setBorderPainted(false);
        signUpButton.setContentAreaFilled(false);
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        getContentPane().add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 460, 100, 30));

        confirmPassword.setBorder(null);
        getContentPane().add(confirmPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 410, 270, 20));

        rName.setBorder(null);
        rName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rNameActionPerformed(evt);
            }
        });
        getContentPane().add(rName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 270, 30));

        rLoginName.setBorder(null);
        getContentPane().add(rLoginName, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 270, 30));

        rPassword.setBorder(null);
        getContentPane().add(rPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 270, 20));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Register.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        pack();
    }// </editor-fold>                        

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
        // TODO add your handling code here:
        // add code here   
        //storage.setLoginNameArray("world");
        //String loginName[] = new String[2];
        //System.out.println(Arrays.toString(loginName = storage.getLoginNameArray()));
        
        if (rName.getText().isEmpty() || rLoginName.getText().isEmpty() || rPassword.getText().isEmpty() || confirmPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please fill in all fields.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
         } else if (!rPassword.getText().equals(confirmPassword.getText())) {
           JOptionPane.showMessageDialog(this, "Passwords do not match.", "Error", JOptionPane.ERROR_MESSAGE);
           return;
         } else {
            if (is_Valid_Password(rPassword.getText())) {
            
               int numCount = 0;
               int charCount = 0;
               for (int i = 0; i < rPassword.getText().length(); i++) {

                  char ch = rPassword.getText().charAt(i);
                  if (is_Numeric(ch)) {
                     numCount++;
                  }
                  else if (is_Letter(ch)) {
                     charCount++;
                  }
               }
               
               if(charCount == 0 || numCount == 0) {
                  JOptionPane.showMessageDialog(this, "Password is not alphanumeric!", "Error", JOptionPane.ERROR_MESSAGE);
               } else {
               
                  System.out.println("Password is valid: " + rPassword.getText());
                  dispose();
                  login.loginNameArrayLoader();
                  login.setLoginNameArray(rLoginName.getText().trim());
                  login.setPasswordArray(rPassword.getText().trim());
                  login.main(new String[0]);
               }

            } else {
               if(rPassword.getText().length() > PASSWORD_LENGTH) {
                  System.out.println("Password is longer than 8 characters!");
                  JOptionPane.showMessageDialog(this, "Password is longer than 8 characters!", "Error", JOptionPane.ERROR_MESSAGE);
               } else {
                  System.out.println("Not a valid password: " + rPassword.getText());
                  JOptionPane.showMessageDialog(this, "Not a valid password! (Must be alphanumeric! Limit is 8!)", "Error", JOptionPane.ERROR_MESSAGE);
               }
            }
            
            //System.out.println(Arrays.toString(login.getLoginNameArray()));
         }
    }                                            

    private void rNameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Login login = new Login();
                                 
        try {
            for (UIManager.LookAndFeelInfo info :UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            Logger.getLogger(Register.class.getName()).log(Level.SEVERE, null, ex);
        }
 
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Register().setVisible(true);
            }
        });
    }
    
    public static boolean is_Valid_Password(String password) {

        if (password.length() > PASSWORD_LENGTH) {
         System.out.println("Long");
        }
        
        if (password.length() > PASSWORD_LENGTH) {
         return false;
        }
        
        int passCount = 0;
        int numCount = 0;
        int charCount = 0;
        for (int i = 0; i < password.length(); i++) {

            char ch = password.charAt(i);
            //yawa slayer
            //if (is_Numeric(ch)) numCount++;
            //else if (is_Letter(ch)) charCount++;
            //else return false;
            if (is_Numeric(ch)) {
               passCount++; numCount++;
            }
            else if (is_Letter(ch)) {
               passCount++; charCount++;
            }
            else return false;
        }
        //return (charCount >= 2 && numCount >= 2);
        return (passCount >= 8);
    }
    
    public static boolean is_Letter(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch >= 'A' && ch <= 'Z');
    }
    public static boolean is_Numeric(char ch) {

        return (ch >= '0' && ch <= '9');
    }
         



    // Variables declaration - do not modify                     
    private javax.swing.JTextField confirmPassword;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField rLoginName;
    private javax.swing.JTextField rName;
    private javax.swing.JTextField rPassword;
    private javax.swing.JButton signUpButton;
    // End of variables declaration                   
}