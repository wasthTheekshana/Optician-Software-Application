/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import Class.Log;
import Class.Loger;
import database.data;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Theekshana
 */
public class ViewMonthlyattendce extends javax.swing.JFrame {

    long oi ;
    public ViewMonthlyattendce() {
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
        jButton1 = new javax.swing.JButton();
        nic = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 204));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(44, 102, 176));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("View");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 20, 190, 40));

        nic.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        nic.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nic.setText(" ");
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicKeyReleased(evt);
            }
        });
        jPanel1.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 20, 215, 40));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel3.setText("Monthly Attendence Report");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 41));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Employee NIC", "Date", "In Time", "Out Time"
            }
        ));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 773, 370));
        jPanel1.add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 179, 30));
        jPanel1.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 130, 179, 31));

        jButton2.setBackground(new java.awt.Color(44, 102, 176));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Search");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 230, 190, 40));

        jLabel2.setText("ot");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 500, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setBackground(new java.awt.Color(225, 218, 224));
        jTextField4.setFont(new java.awt.Font("Maiandra GD", 0, 14)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jPanel1.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 134, 39));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1269, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 616, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 616, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String Nic = nic.getText();
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        try {
            ResultSet rs = data.search("SELECT * FROM `attendence` WHERE  employee_nic = '" + Nic + "'");
            int i = 0 ;

            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("date"));
                vr.add(rs.getString("inTime"));
                vr.add(rs.getString("outTime"));
                dtm.addRow(vr);
                i++;
                //                if (Nic.equals(rs.getString("employee_nic"))) {
                    //                    load(Nic);
                    //                } else {
                    //                    JOptionPane.showMessageDialog(this, "Please Enter Valid Employee", "Inform", JOptionPane.INFORMATION_MESSAGE);
                    //                    nic.setText(null);
                    //
                    //                }
            }
            jTextField4.setText(String.valueOf(i));

        } catch (Exception e) {
            nic.setText("");
            Loger.log.info(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyReleased
//        String id = nic.getText();
//        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
//        dtm.setRowCount(0);
//        try {
//            ResultSet rs = data.search("SELECT * FROM `attendence` WHERE `employee_nic` LIKE '%"+id+"%'");
//            while (rs.next()) {
//                Vector<String> vr = new Vector<>();
//                vr.add(rs.getString("employee_nic"));
//                vr.add(rs.getString("date"));
//                vr.add(rs.getString("inTime"));
//                vr.add(rs.getString("outTime"));
//                dtm.addRow(vr);
//            }
//        } catch (Exception e) {
//            System.out.println(e);
//        }
    }//GEN-LAST:event_nicKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);

            Date date = jDateChooser1.getDate();
            Date date1 = jDateChooser2.getDate();
            SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd");
            String sd1 = sd.format(date);
            String sd2 = sd.format(date1);
            int i = 0;
            ResultSet rs = data.search("SELECT * FROM `attendence` WHERE `date` BETWEEN '" + sd1 + "' AND '" + sd2 + "'");
            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("date"));
                vr.add(rs.getString("inTime"));
                vr.add(rs.getString("outTime"));
                dtm.addRow(vr);

                i++;
            }
            jTextField4.setText(String.valueOf(i));
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        int row = jTable1.getSelectedRow();
        String time1 = jTable1.getValueAt(row, 2).toString();
        String time2 = jTable1.getValueAt(row, 3).toString();
        long i =0;
        SimpleDateFormat format = new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = format.parse(time1);            
            Date date1 = format.parse(time2);
            long diffrent = date1.getTime() - date.getTime();
            long total = diffrent / 3600000; 
             oi = total - 8;
            for (int j = 0; j <= i; j++) { 
//             oi++;
                
                System.out.println(oi++);
            }
            i++;
                
//                jLabel2.setText(String.valueOf(ot));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Enter The Date", "Inform", JOptionPane.INFORMATION_MESSAGE);
            Log.warning(e);
            System.out.println(e);
        }
        

    }//GEN-LAST:event_jTable1MouseClicked

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewMonthlyattendce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMonthlyattendce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMonthlyattendce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMonthlyattendce.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMonthlyattendce().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField nic;
    // End of variables declaration//GEN-END:variables
}