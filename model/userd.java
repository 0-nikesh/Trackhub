/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.ResultSetMetaData;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Vector;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
public class userd extends javax.swing.JFrame {

    Connection con=null;
    PreparedStatement pst=null; 
    ResultSet rs=null;
    public userd() {
        initComponents();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/trackhub","root","Sangam@123");
            pst=con.prepareStatement("select * from register  ORDER BY SN DESC LIMIT 1 ");
            rs=pst.executeQuery();
            ResultSetMetaData rsmd=rs.getMetaData();
            int n=rsmd.getColumnCount();
            DefaultTableModel dtm=(DefaultTableModel) maintable.getModel();
            dtm.setRowCount(0);
            while(rs.next()){
                Vector v=new Vector();
                for(int i=1;i<=n;i++){
                    
                        v.add(rs.getString("SN"));
                        v.add(rs.getString("USERNAME"));
                        v.add(rs.getString("EMAIL"));
                        v.add(rs.getString("NUMBER"));
                        v.add(rs.getString("PASSWORD"));
                
               }
            //System.out.print(v);
            dtm.addRow(v);
           }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(userd.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(userd.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
   
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainapanel = new javax.swing.JPanel();
        upass = new javax.swing.JTextField();
        pass = new javax.swing.JLabel();
        uname = new javax.swing.JTextField();
        us = new javax.swing.JLabel();
        uemail = new javax.swing.JTextField();
        em = new javax.swing.JLabel();
        ph = new javax.swing.JLabel();
        uphone = new javax.swing.JTextField();
        sm = new javax.swing.JScrollPane();
        maintable = new javax.swing.JTable();
        update = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        mainapanel.setBackground(new java.awt.Color(0, 102, 102));

        upass.setBackground(new java.awt.Color(195, 228, 232));

        pass.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        pass.setForeground(new java.awt.Color(255, 255, 255));
        pass.setText("Password");

        uname.setBackground(new java.awt.Color(195, 228, 232));

        us.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        us.setForeground(new java.awt.Color(255, 255, 255));
        us.setText("Username");

        uemail.setBackground(new java.awt.Color(195, 228, 232));

        em.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        em.setForeground(new java.awt.Color(255, 255, 255));
        em.setText("Email");

        ph.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
        ph.setForeground(new java.awt.Color(255, 255, 255));
        ph.setText("Phone no.");

        uphone.setBackground(new java.awt.Color(195, 228, 232));

        maintable.setBackground(new java.awt.Color(0, 102, 102));
        maintable.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 14)); // NOI18N
        maintable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "S.N", "Username", "Email", "Phone no.", "Password"
            }
        ));
        maintable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                maintableMouseClicked(evt);
            }
        });
        sm.setViewportView(maintable);

        update.setBackground(new java.awt.Color(0, 102, 102));
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("Update");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(0, 102, 102));
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("Close");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Details");

        javax.swing.GroupLayout mainapanelLayout = new javax.swing.GroupLayout(mainapanel);
        mainapanel.setLayout(mainapanelLayout);
        mainapanelLayout.setHorizontalGroup(
            mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainapanelLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addGroup(mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainapanelLayout.createSequentialGroup()
                        .addComponent(ph)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(mainapanelLayout.createSequentialGroup()
                        .addGroup(mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pass)
                            .addGroup(mainapanelLayout.createSequentialGroup()
                                .addComponent(update, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(509, Short.MAX_VALUE))
                    .addGroup(mainapanelLayout.createSequentialGroup()
                        .addGroup(mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(em, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(uemail, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(upass, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                                .addComponent(uphone)
                                .addComponent(us)
                                .addComponent(uname)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mainapanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(335, 335, 335))
        );
        mainapanelLayout.setVerticalGroup(
            mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mainapanelLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(4, 4, 4)
                .addComponent(us)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mainapanelLayout.createSequentialGroup()
                        .addComponent(uname, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(em)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(uemail, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sm, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(ph)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(uphone, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(pass)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upass, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(mainapanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(close, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(update, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mainapanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(mainapanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
     int i = maintable.getSelectedRow();
     TableModel model = maintable.getModel();
    if(i >=0)
     {
         model.setValueAt(uname.getText(), i, 1);
         model.setValueAt(uemail.getText(), i, 2);
         model.setValueAt(uphone.getText(), i, 3);
         model.setValueAt(upass.getText(), i, 4);
    }else{
             JOptionPane.showMessageDialog(null, "Error");
             
             
             }
     
        
    }//GEN-LAST:event_updateActionPerformed

    private void maintableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_maintableMouseClicked
      int rowNo = maintable.getSelectedRow();
    TableModel model = maintable.getModel();
    
    uname.setText(model.getValueAt(rowNo, 1).toString());
    uemail.setText((String)model.getValueAt(rowNo, 2));
    upass.setText((String)model.getValueAt(rowNo, 4));
    uphone.setText(model.getValueAt(rowNo, 3).toString());
    }//GEN-LAST:event_maintableMouseClicked

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
       dispose();        
    }//GEN-LAST:event_closeActionPerformed

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
            java.util.logging.Logger.getLogger(userd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(userd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(userd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(userd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new userd().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel em;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel mainapanel;
    private javax.swing.JTable maintable;
    private javax.swing.JLabel pass;
    private javax.swing.JLabel ph;
    private javax.swing.JScrollPane sm;
    private javax.swing.JTextField uemail;
    private javax.swing.JTextField uname;
    private javax.swing.JTextField upass;
    private javax.swing.JButton update;
    private javax.swing.JTextField uphone;
    private javax.swing.JLabel us;
    // End of variables declaration//GEN-END:variables
}
