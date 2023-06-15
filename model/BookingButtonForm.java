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
public class BookingButtonForm extends javax.swing.JFrame {

    /**
     * Creates new form BookingButtonForm
     */
    public BookingButtonForm() {
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

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        btnTrains = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblTrackHub = new javax.swing.JLabel();
        lblTrainss = new javax.swing.JLabel();
        lblBookingg = new javax.swing.JLabel();
        lblTickts = new javax.swing.JLabel();
        btnTrain = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnTickets = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        btnUser = new javax.swing.JButton();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        btnTrains.setBackground(new java.awt.Color(255, 255, 255));
        btnTrains.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/d.png"))); // NOI18N
        btnTrains.add(jLabel1);
        jLabel1.setBounds(350, 0, 1110, 1024);

        lblTrackHub.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/Frame.png"))); // NOI18N
        btnTrains.add(lblTrackHub);
        lblTrackHub.setBounds(40, 10, 260, 180);

        lblTrainss.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/trainLabel.png"))); // NOI18N
        btnTrains.add(lblTrainss);
        lblTrainss.setBounds(20, 410, 70, 70);

        lblBookingg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/tabler_brand-booking (1).png"))); // NOI18N
        btnTrains.add(lblBookingg);
        lblBookingg.setBounds(20, 550, 80, 80);

        lblTickts.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/dashicons_tickets-alt.png"))); // NOI18N
        btnTrains.add(lblTickts);
        lblTickts.setBounds(20, 680, 90, 80);

        btnTrain.setBackground(new java.awt.Color(42, 134, 251));
        btnTrain.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnTrain.setForeground(new java.awt.Color(5, 51, 111));
        btnTrain.setText("TRAINS");
        btnTrain.setBorder(null);
        btnTrain.setBorderPainted(false);
        btnTrain.setContentAreaFilled(false);
        btnTrain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnTrainMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnTrainMouseExited(evt);
            }
        });
        btnTrain.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrainActionPerformed(evt);
            }
        });
        btnTrains.add(btnTrain);
        btnTrain.setBounds(100, 420, 140, 50);

        btnBooking.setBackground(new java.awt.Color(118, 223, 115));
        btnBooking.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(5, 51, 111));
        btnBooking.setText("BOOKING");
        btnBooking.setBorder(null);
        btnBooking.setBorderPainted(false);
        btnTrains.add(btnBooking);
        btnBooking.setBounds(110, 560, 180, 60);

        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
        btnTickets.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnTickets.setForeground(new java.awt.Color(5, 51, 111));
        btnTickets.setText("TICKETS");
        btnTickets.setBorder(null);
        btnTickets.setBorderPainted(false);
        btnTickets.setContentAreaFilled(false);
        btnTickets.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
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
        btnTrains.add(btnTickets);
        btnTickets.setBounds(120, 700, 120, 50);

        btnExit.setBackground(new java.awt.Color(42, 134, 251));
        btnExit.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnExit.setForeground(new java.awt.Color(255, 255, 255));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/material-symbols_logout-rounded.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnTrains.add(btnExit);
        btnExit.setBounds(100, 840, 120, 90);

        btnUser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/c.png"))); // NOI18N
        btnUser.setBorder(null);
        btnUser.setBorderPainted(false);
        btnUser.setContentAreaFilled(false);
        btnUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUserActionPerformed(evt);
            }
        });
        btnTrains.add(btnUser);
        btnUser.setBounds(90, 220, 150, 110);

        getContentPane().add(btnTrains);
        btnTrains.setBounds(0, 0, 1440, 1024);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainActionPerformed
        // TODO add your handling code here:
        TrainButtonForm t=new TrainButtonForm();
        t.setVisible(true);
                
    }//GEN-LAST:event_btnTrainActionPerformed

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        // TODO add your handling code here:
        TicketButtonForm tb=new TicketButtonForm();
        tb.setVisible(true);
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnTrainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseEntered
        // TODO add your handling code here:
         btnTrain.setContentAreaFilled(true);
        btnTrain.setBackground(Color.green);
    }//GEN-LAST:event_btnTrainMouseEntered

    private void btnTrainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseExited
        // TODO add your handling code here:
                                         
        btnTrain.setBackground(new java.awt.Color(42, 134, 251));
        btnTrain.setContentAreaFilled(false);
    }//GEN-LAST:event_btnTrainMouseExited

    private void btnTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseEntered
        
        btnTickets.setBackground(Color.green);
         btnTickets.setContentAreaFilled(true);
       
    }//GEN-LAST:event_btnTicketsMouseEntered

    private void btnTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseExited
                                       
        btnTickets.setBackground(new java.awt.Color(42, 134, 251));
        btnTickets.setContentAreaFilled(false);
    }//GEN-LAST:event_btnTicketsMouseExited

    private void btnUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUserActionPerformed
        // TODO add your handling code here:
        dashboard db=new dashboard();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnUserActionPerformed

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
            java.util.logging.Logger.getLogger(BookingButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BookingButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BookingButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BookingButtonForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BookingButtonForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnTrain;
    private javax.swing.JPanel btnTrains;
    private javax.swing.JButton btnUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JLabel lblBookingg;
    private javax.swing.JLabel lblTickts;
    private javax.swing.JLabel lblTrackHub;
    private javax.swing.JLabel lblTrainss;
    // End of variables declaration//GEN-END:variables
}
