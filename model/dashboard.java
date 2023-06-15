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
public class dashboard extends javax.swing.JFrame {

    /**
     * Creates new form dashboard
     */
    public dashboard() {
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
        dashrectangleimg = new javax.swing.JLabel();
        trackhubLabel = new javax.swing.JLabel();
        btnTrain = new javax.swing.JButton();
        lblBooking = new javax.swing.JLabel();
        lblTickets = new javax.swing.JLabel();
        btnTickets = new javax.swing.JButton();
        btnBooking = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        lblTrain = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(1440, 1024));
        jPanel1.setLayout(null);

        dashrectangleimg.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        dashrectangleimg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/d.png"))); // NOI18N
        dashrectangleimg.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel1.add(dashrectangleimg);
        dashrectangleimg.setBounds(350, 0, 1110, 1024);

        trackhubLabel.setBackground(new java.awt.Color(255, 51, 51));
        trackhubLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/Frame.png"))); // NOI18N
        jPanel1.add(trackhubLabel);
        trackhubLabel.setBounds(50, 20, 260, 160);

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
        jPanel1.add(btnTrain);
        btnTrain.setBounds(100, 420, 160, 60);

        lblBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/tabler_brand-booking (1).png"))); // NOI18N
        jPanel1.add(lblBooking);
        lblBooking.setBounds(30, 560, 80, 80);

        lblTickets.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/dashicons_tickets-alt.png"))); // NOI18N
        jPanel1.add(lblTickets);
        lblTickets.setBounds(30, 680, 90, 120);

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
        btnTickets.setBounds(120, 710, 140, 60);

        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setFont(new java.awt.Font("Arial", 1, 25)); // NOI18N
        btnBooking.setForeground(new java.awt.Color(5, 51, 111));
        btnBooking.setText("BOOKING");
        btnBooking.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(42, 134, 251)));
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
        btnBooking.setBounds(110, 570, 150, 60);

        btnExit.setBackground(new java.awt.Color(42, 134, 251));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/exit.png"))); // NOI18N
        btnExit.setBorder(null);
        btnExit.setBorderPainted(false);
        btnExit.setContentAreaFilled(false);
        btnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnExitMouseEntered(evt);
            }
        });
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        jPanel1.add(btnExit);
        btnExit.setBounds(80, 840, 160, 90);

        lblTrain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/trainLabel.png"))); // NOI18N
        jPanel1.add(lblTrain);
        lblTrain.setBounds(30, 410, 100, 80);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/c.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(80, 230, 160, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1440, 1024);

        setSize(new java.awt.Dimension(1454, 1031));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnTicketsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTicketsActionPerformed
        // TODO add your handling code here:
        TicketButtonForm ob=new TicketButtonForm();
        ob.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnTicketsActionPerformed

    private void btnBookingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookingActionPerformed
        // TODO add your handling code here:
        BookingButtonForm b=new BookingButtonForm();
        b.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnBookingActionPerformed

    private void btnTrainMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseEntered
        // TODO add your handling code here:
        
        btnTrain.setBackground(Color.green);
        btnTrain.setContentAreaFilled(true);
    }//GEN-LAST:event_btnTrainMouseEntered

    private void btnTrainMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTrainMouseExited
        // TODO add your handling code here:
        btnTrain.setBackground(new java.awt.Color(42, 134, 251));
        btnTrain.setContentAreaFilled(false);
        
    }//GEN-LAST:event_btnTrainMouseExited

    private void btnBookingMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseEntered
        // TODO add your handling code here:
       btnBooking.setBackground(Color.green);
       btnBooking.setContentAreaFilled(true);
    }//GEN-LAST:event_btnBookingMouseEntered

    private void btnBookingMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBookingMouseExited
        // TODO add your handling code here:
        
        btnBooking.setBackground(new java.awt.Color(42, 134, 251));
        btnBooking.setContentAreaFilled(false);
    }//GEN-LAST:event_btnBookingMouseExited

    private void btnTicketsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseEntered
        btnTickets.setBackground(Color.green);
        btnTickets.setContentAreaFilled(true);
    }//GEN-LAST:event_btnTicketsMouseEntered

    private void btnTicketsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTicketsMouseExited
    btnTickets.setBackground(new java.awt.Color(42, 134, 251));
    btnTickets.setContentAreaFilled(false);
    }//GEN-LAST:event_btnTicketsMouseExited

    private void btnTrainActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrainActionPerformed
        // TODO add your handling code here:
        TrainButtonForm t=new TrainButtonForm();
        t.setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_btnTrainActionPerformed

    private void btnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseClicked
        // TODO add your handling code here:
        this.dispose();
        
        
    }//GEN-LAST:event_btnExitMouseClicked

    private void btnExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExitMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExitMouseEntered

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnExitActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBooking;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnTickets;
    private javax.swing.JButton btnTrain;
    private javax.swing.JLabel dashrectangleimg;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblBooking;
    private javax.swing.JLabel lblTickets;
    private javax.swing.JLabel lblTrain;
    private javax.swing.JLabel trackhubLabel;
    // End of variables declaration//GEN-END:variables
}
