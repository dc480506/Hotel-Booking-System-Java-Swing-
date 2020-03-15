/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.dev;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author dev
 */
public class ChangePass extends javax.swing.JFrame {

    private String username;

    /**
     * Creates new form ChangePass
     */
    public ChangePass() {
        initComponents();
        setVisible(true);
        err.setVisible(false);
        pm.setVisible(false);
        confirmpass.setVisible(false);
        confirmpass_text.setVisible(false);
        newpass.setVisible(false);
        newpass_text.setVisible(false);
        cp.setVisible(false);
    }
    public ChangePass(String username){
        this();
        this.username=username;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        pass_text = new javax.swing.JPasswordField();
        newpass_text = new javax.swing.JPasswordField();
        confirmpass_text = new javax.swing.JPasswordField();
        newpass = new javax.swing.JLabel();
        confirmpass = new javax.swing.JLabel();
        err = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();
        pm = new javax.swing.JLabel();
        cp = new javax.swing.JButton();
        goback = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Current Password: ");

        pass_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pass_textActionPerformed(evt);
            }
        });

        newpass_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newpass_textActionPerformed(evt);
            }
        });

        confirmpass_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmpass_textActionPerformed(evt);
            }
        });

        newpass.setText("New Password: ");

        confirmpass.setText("Confirm Password:");

        err.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        err.setForeground(new java.awt.Color(204, 0, 0));
        err.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        err.setText("*Invalid Credentials!! ");

        confirm.setText("Confirm");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        pm.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        pm.setForeground(new java.awt.Color(204, 0, 0));
        pm.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pm.setText("*Password fields do not match");

        cp.setText("Change Password");
        cp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cpActionPerformed(evt);
            }
        });

        goback.setText("Go Back");
        goback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gobackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(125, 125, 125)
                        .addComponent(err))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(pm, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(newpass)
                            .addComponent(confirmpass))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(goback))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(confirmpass_text, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                                            .addComponent(newpass_text)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(pass_text, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(confirm))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(cp)))
                .addContainerGap(22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(goback)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(pass_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirm))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(err)
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpass_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newpass))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(confirmpass)
                    .addComponent(confirmpass_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(cp)
                .addGap(53, 53, 53))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pass_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pass_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pass_textActionPerformed

    private void confirmpass_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmpass_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmpass_textActionPerformed

    private void newpass_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newpass_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newpass_textActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking","root","dev12345");
            String pass=pass_text.getText();
            PreparedStatement stmt=con.prepareStatement("SELECT username,password FROM login_details WHERE username='"+username+"' AND password='"+pass+"'");
            ResultSet rs=stmt.executeQuery();
            if(rs.absolute(1)){
               err.setVisible(false);
               pass_text.setEditable(false);
        confirmpass.setVisible(true);
        confirmpass_text.setVisible(true);
        newpass.setVisible(true);
        newpass_text.setVisible(true);
        cp.setVisible(true);
            }
            else
                err.setVisible(true);
        }catch(Exception e){
            javax.swing.JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1);
        }
        
    }//GEN-LAST:event_confirmActionPerformed

    private void cpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cpActionPerformed
        // TODO add your handling code here:
        if(newpass_text.getText().equals(confirmpass_text.getText())){
             try{
             String np=newpass_text.getText();
            Class.forName("com.mysql.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hotel_booking","root","dev12345");
            String pass=pass_text.getText();
            PreparedStatement stmt=con.prepareStatement("UPDATE login_details SET password='"+np+"' WHERE username='"+username+"'");
             stmt.executeUpdate();
             javax.swing.JOptionPane.showMessageDialog(null,"Your password has been successfully changed!!! You need to login again","Password Change",1);
             new LoginPage();
             dispose();
             }catch(Exception e){
                 javax.swing.JOptionPane.showMessageDialog(null,e.getMessage(),"Error",1); 
             }
        }else{
            pm.setVisible(true);
        }
    }//GEN-LAST:event_cpActionPerformed

    private void gobackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gobackActionPerformed
        // TODO add your handling code here:
        new UserOptions(username);
        dispose();
    }//GEN-LAST:event_gobackActionPerformed

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
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChangePass.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChangePass().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirm;
    private javax.swing.JLabel confirmpass;
    private javax.swing.JPasswordField confirmpass_text;
    private javax.swing.JButton cp;
    private javax.swing.JLabel err;
    private javax.swing.JButton goback;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel newpass;
    private javax.swing.JPasswordField newpass_text;
    private javax.swing.JPasswordField pass_text;
    private javax.swing.JLabel pm;
    // End of variables declaration//GEN-END:variables
}