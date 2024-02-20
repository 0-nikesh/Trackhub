/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package app;
import java.awt.Dimension;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

//This class represents the login window which helpsto log in to their registered accounts.
public class Login extends javax.swing.JFrame {
    //variables to store followerId and followedId.
  private static int followerId;
    private static int followedId;
   
    //this created new login form
    public Login() {
        initComponents(); 
        //setMinimumSize sets the min size of the window.
setMinimumSize(new Dimension(1100, 600));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        phoneNumber = new javax.swing.JLabel();
        NumberField = new javax.swing.JTextField();
        pwLabel = new javax.swing.JLabel();
        pwField = new javax.swing.JPasswordField();
        LoginButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(153, 204, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Login to your account");

        phoneNumber.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        phoneNumber.setText("Phone Number");

        NumberField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumberFieldActionPerformed(evt);
            }
        });

        pwLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        pwLabel.setText("Password");

        pwField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pwFieldActionPerformed(evt);
            }
        });

        LoginButton.setBackground(new java.awt.Color(51, 51, 255));
        LoginButton.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        LoginButton.setForeground(new java.awt.Color(255, 255, 255));
        LoginButton.setText("Login");
        LoginButton.setBorder(null);
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(phoneNumber)
                    .addComponent(pwLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NumberField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pwField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(phoneNumber)
                    .addComponent(NumberField, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(54, 54, 54)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pwField, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pwLabel))
                .addGap(50, 50, 50)
                .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(82, 82, 82))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 130, 490, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    //when login button is clicked then this loginbuttonactionperformed  is called.
    //It validates the entered credentials which was done in register  and if it is correct then it opens the dashboard.
    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
       //Retrieve the entered phone number and password.
        String enteredPhoneNumber = NumberField.getText();
        String enteredPassword = new String(pwField.getPassword());

        
        //checking if the credentials are valid.
        boolean isValidCredentials = checkCredentials(enteredPhoneNumber, enteredPassword);

        if (isValidCredentials) {
            // Retrieve user details.
            String[] userDetails = retrieveUserDetails(enteredPhoneNumber);

            // If user details are retrieved successfully
            if (userDetails != null) {
                
//                String firstName = userDetails[0];
//                String lastName = userDetails[1];

                // Close the login window
                this.dispose();
                
                int userId = getUserId(enteredPhoneNumber); // Retrieve userId and open the dashboard
                TiktokForm tiktok=new TiktokForm(userId);
               tiktok.setVisible(true);
            } else {
                JOptionPane.showMessageDialog(this, "Error retrieving user details", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(this, "Invalid phone number or password!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    
    }//GEN-LAST:event_LoginButtonActionPerformed
private boolean checkCredentials(String mobileNumber, String newPassword) {
    boolean isValidCredentials = false;

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "12345");
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT firstName, lastName FROM registerdsa WHERE mobileNumber = ? AND newPassword = ?");
    ) {
        preparedStatement.setString(1, mobileNumber);
        preparedStatement.setString(2, newPassword);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                isValidCredentials = true;
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return isValidCredentials;
}

//this method help to retrieve first name and last name of user  according to mobileNumber set in databse.

     private String[] retrieveUserDetails(String mobileNumber) {
        String[] userDetails = new String[2];

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "12345");
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT firstName, lastName FROM registerdsa WHERE mobileNumber = ?");
        ) {
            preparedStatement.setString(1, mobileNumber);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    userDetails[0] = resultSet.getString("firstName");
                    userDetails[1] = resultSet.getString("lastName");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return userDetails;
    }
     //as mobile number is unique according to mobile number user_id is gettting
     private int getUserId(String mobileNumber) {
    int userId = 0;

    try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub", "root", "12345");
         PreparedStatement preparedStatement = connection.prepareStatement("SELECT user_id FROM registerdsa WHERE mobileNumber = ?");
    ) {
        preparedStatement.setString(1, mobileNumber);

        try (ResultSet resultSet = preparedStatement.executeQuery()) {
            if (resultSet.next()) {
                userId = resultSet.getInt("user_id");
            }
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return userId;
}


    private void NumberFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumberFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumberFieldActionPerformed

    private void pwFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pwFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_pwFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton LoginButton;
    private javax.swing.JTextField NumberField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JPasswordField pwField;
    private javax.swing.JLabel pwLabel;
    // End of variables declaration//GEN-END:variables

   
}
