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

public class Login extends javax.swing.JFrame {

   DashboardAdmin dashboardAdmin = new DashboardAdmin();
   Dashboard dashboard = new Dashboard(); 
   static String loginNameArray[] = new String[10];
   static String passwordArray[] = new String[10];
   
    public Login() {
        initComponents();
    }

   private Register register;
   public Login(Register register) {
      this.register = register;  
   }
    
   public void loginNameArrayLoader() {
      loginNameArray[0] = "admin";
      passwordArray[0] = "admin123";
   }
    
   public void setLoginNameArray(String loginName) {
      
      for(int i = 0; i < loginNameArray.length; ++i) {
         if(loginNameArray[i] == null) {
            loginNameArray[i] = loginName;
            break;
         }
      }
    }
    
   public String[] getLoginNameArray() {
      return loginNameArray.clone();
   }
    
   public void setPasswordArray(String password) {
      
      for(int i = 0; i < loginNameArray.length; ++i) {
         if(passwordArray[i] == null) {
            passwordArray[i] = password;
            break;
         }
      }
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        lName = new javax.swing.JTextField();
        lPassword = new javax.swing.JTextField();
        loginButton = new javax.swing.JButton();
        registerButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lName.setFont(loginButton.getFont());
        lName.setBorder(null);
        lName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNameActionPerformed(evt);
            }
        });
        getContentPane().add(lName, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 280, 350, 20));

        lPassword.setFont(loginButton.getFont());
        lPassword.setBorder(null);
        lPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(lPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 360, 350, 30));

        loginButton.setFont(new java.awt.Font("Century Gothic", 0, 16)); // NOI18N
        loginButton.setForeground(new java.awt.Color(255, 255, 255));
        loginButton.setText("Login");
        loginButton.setBorderPainted(false);
        loginButton.setContentAreaFilled(false);
        loginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginButtonActionPerformed(evt);
            }
        });
        getContentPane().add(loginButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 430, 90, 20));

        registerButton.setFont(loginButton.getFont());
        registerButton.setText("Create Account?");
        registerButton.setBorderPainted(false);
        registerButton.setContentAreaFilled(false);
        registerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registerButtonActionPerformed(evt);
            }
        });
        getContentPane().add(registerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 500, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Login.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1200, 670));

        pack();
    }// </editor-fold>                        

    private void lNameActionPerformed(java.awt.event.ActionEvent evt) {                                      
        // TODO add your handling code here:
    }                                     

    private void lPasswordActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         

    private void loginButtonActionPerformed(java.awt.event.ActionEvent evt) {                                            
      String tempLoginName = lName.getText().trim();
      String tempPassword = lPassword.getText().trim();
      boolean nameFound = false;
      boolean passwordCorrect = false;
      int nameIndex = 0; 
      String login = lName.getText();
      String password = lPassword.getText();

      for (int i = 0; i < loginNameArray.length; ++i) {
         if (loginNameArray[i] != null) {
            if (loginNameArray[i].equals(tempLoginName)) {
               nameFound = true;
               nameIndex = i;
               break;
            }
         }
      }
           
      if (nameFound && passwordArray[nameIndex].equals(tempPassword)) {
            passwordCorrect = true;
       }
        
      if (login.isEmpty() && password.isEmpty()) {
            JOptionPane.showMessageDialog(null,
            "Username and Password are missing!",
            "Error",
            JOptionPane.ERROR_MESSAGE);
      } else if (login.isEmpty()) {
            JOptionPane.showMessageDialog(null,
            "Username is missing!",  
            "Error",
            JOptionPane.ERROR_MESSAGE);
      } else if (password.isEmpty()) {
            JOptionPane.showMessageDialog(null,
            "Password is missing!",
            "Error",
            JOptionPane.ERROR_MESSAGE);
      } else if (nameFound && !passwordCorrect) {
            System.out.println("Your password is incorrect!");
            JOptionPane.showMessageDialog(null,
            "Your password is incorrect!",
            "Error",
            JOptionPane.INFORMATION_MESSAGE);
      } else if (!nameFound) {
            JOptionPane.showMessageDialog(null,
            "There is no login name with that name in our website!",
            "Error",
             JOptionPane.ERROR_MESSAGE);
      } else if (nameFound && passwordCorrect) {
            JOptionPane.showMessageDialog(null,
            "Login successful! Welcome " + tempLoginName + "!",
            "Success",
            JOptionPane.INFORMATION_MESSAGE);
                           
            dispose();
            if(nameIndex == 0) {
               dashboardAdmin.main(new String[0]);
            } else {
               dashboard.main(new String[0]);
            }

      }
    }                                           

    private void registerButtonActionPerformed(java.awt.event.ActionEvent evt) {                                               
    dispose();  // Close the current login window
    Register registerWindow = new Register();  // Create a new Register window
    registerWindow.setVisible(true);  // Show the Register window
    }                                              

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
   java.awt.EventQueue.invokeLater(new Runnable() {
       public void run() {
           new Login().setVisible(true);  // Directly display login window
       }
   });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField lName;
    private javax.swing.JTextField lPassword;
    private javax.swing.JButton loginButton;
    private javax.swing.JButton registerButton;
    // End of variables declaration                   
}
