/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package model;

import java.awt.Color;

/**
 *
 * @author USER
 */
public class TrainButtonForm extends javax.swing.JFrame {

    /**
     * Creates new form TrainButtonForm
     */
    public TrainButtonForm() {
        initComponents();
        setSize(1440,1025);
        this.setLocationRelativeTo(null);
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
        jLabel1 = new javax.swing.JLabel();
        lblTrackHub = new javax.swing.JLabel();
        lblTrains = new javax.swing.JLabel();
        lblBooking = new javax.swing.JLabel();
        lblTickets = new javax.swing.JLabel();
        btnTrain = new javax.swing.JButton();
        btnCustomer = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/d.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(320, 0, 1110, 1024);

        lblTrackHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/Frame.png"))); // NOI18N
        jPanel1.add(lblTrackHub);
        lblTrackHub.setBounds(30, 20, 260, 150);

        lblTrains.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/material-symbols_train-rounded.png"))); // NOI18N
        jPanel1.add(lblTrains);
        lblTrains.setBounds(20, 420, 80, 80);

        lblBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/tabler_brand-booking (1).png"))); // NOI18N
        jPanel1.add(lblBooking);
        lblBooking.setBounds(20, 550, 80, 80);

        lblTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/dashicons_tickets-alt.png"))); // NOI18N
        jPanel1.add(lblTickets);
        lblTickets.setBounds(20, 700, 80, 70);

        btnTrain.setBackground(new java.awt.Color(118, 223, 115));
        btnTrain.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnTrain.setForeground(new java.awt.Color(5, 51, 111));
        btnTrain.setText("TRAINS");
        btnTrain.setBorder(null);
        btnTrain.setBorderPainted(false);
        jPanel1.add(btnTrain);
        btnTrain.setBounds(110, 440, 120, 50);

        btnCustomer.setBackground(new java.awt.Color(42, 134, 251));
        btnCustomer.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnCustomer.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/c.png"))); // NOI18N
        btnCustomer.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        btnCustomer.setBorderPainted(false);
        btnCustomer.setContentAreaFilled(false);
        btnCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCustomerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCustomerMouseExited(evt);
            }
        });
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });
        jPanel1.add(btnCustomer);
        btnCustomer.setBounds(40, 230, 210, 110);

        btnBooking.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(5, 51, 111));
        btnBooking.setText("BOOKING");
        btnBooking.setBorder(null);
        btnBooking.setBorderPainted(false);
        btnBooking.setContentAreaFilled(false);
        btnBooking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBookingMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBookingMouseExited(evt);
            }
        });
        btnBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookingActionPerformed(evt);
            }
        });
        jPanel1.add(btnBooking);
        btnBooking.setBounds(110, 570, 130, 50);

        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
        btnTickets.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(5, 51, 111));
        btnTickets.setText("TICKETS");
        btnTickets.setBorder(null);
        btnTickets.setBorderPainted(false);
        btnTickets.setContentAreaFilled(false);
        btnTickets.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTicketsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTicketsMouseExited(evt);
            }
        });
        btnTickets.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTicketsActionPerformed(evt);
            }
        });
        jPanel1.add(btnTickets);
        btnTickets.setBounds(110, 710, 120, 50);

        btnExit.setBackground(new java.awt.Color(42, 134, 251));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/material-symbols_logout-rounded.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(90, 850, 110, 90);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
       BookingButtonForm b=new BookingButtonForm();
       b.setVisible(true);
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
         btnBooking.setContentAreaFilled(true);
        btnBooking.setBackground(Color.green);
   
    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited
                                      
        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setContentAreaFilled(false);
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        // TODO add your handling code here:
        TicketButtonForm t=new TicketButtonForm();
        t.setVisible(true);
        this.dispose();
                
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        dashboard db=new dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnCustomerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseExited

   
    }//GEN-LAST:event_btnCustomerMouseExited

    private void btnCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCustomerMouseEntered
       
    }//GEN-LAST:event_btnCustomerMouseEntered

    private void btnTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseEntered
        // TODO add your handling code here:
         btnTickets.setContentAreaFilled(true);
        btnTickets.setBackground(Color.green);
   
    }//GEN-LAST:event_btnTicketsMouseEntered

    private void btnTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseExited

        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
        btnTickets.setContentAreaFilled(false);
    }//GEN-LAST:event_btnTicketsMouseExited

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
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TrainButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TrainButtonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnTrain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblTrackHub;
    private javax.swing.JLabel lblTrains;
    // End of variables declaration//GEN-END:variables
}
