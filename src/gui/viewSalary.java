/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import database.data;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PrinterJob;
import java.sql.ResultSet;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableModel;
import java.awt.print.*;
import java.util.HashMap;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Theekshana
 */
public class viewSalary extends javax.swing.JPanel {

    static viewSalary r;

    public viewSalary() {
        initComponents();
        design();
        loadsalary();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        nic = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        no7 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        no6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        no8 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        no10 = new javax.swing.JTextField();
        no11 = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        no9 = new javax.swing.JTextField();
        no15 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        no13 = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        no12 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        no14 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setPreferredSize(new java.awt.Dimension(1875, 32));

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Salary Id", "Employe nic", "Name", "Basic Salary", "ETF", "EPF", "Date", "EPF 8%", "Nopay", "O.T 1.5", "Net Salary"
            }
        ));
        jTable2.setFocusable(false);
        jTable2.setRowHeight(25);
        jTable2.setShowVerticalLines(false);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 1493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 382, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel3);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 660, 380));

        jButton1.setBackground(new java.awt.Color(44, 102, 176));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 40, 190, 40));

        nic.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        nic.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        nic.setText(" ");
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicKeyReleased(evt);
            }
        });
        add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 40, 215, 40));

        jButton3.setBackground(new java.awt.Color(44, 102, 176));
        jButton3.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Print PaySheet");
        jButton3.setBorder(null);
        jButton3.setContentAreaFilled(false);
        jButton3.setOpaque(true);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 570, 170, 50));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel3.setText("Salary View ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 140, 41));

        jButton4.setBackground(new java.awt.Color(44, 102, 176));
        jButton4.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Delete");
        jButton4.setBorder(null);
        jButton4.setContentAreaFilled(false);
        jButton4.setOpaque(true);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 500, 140, 50));

        jButton5.setBackground(new java.awt.Color(44, 102, 176));
        jButton5.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("Print Report");
        jButton5.setBorder(null);
        jButton5.setContentAreaFilled(false);
        jButton5.setOpaque(true);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 500, 160, 50));

        jButton6.setBackground(new java.awt.Color(44, 102, 176));
        jButton6.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton6.setForeground(new java.awt.Color(255, 255, 255));
        jButton6.setText("Generate Salary");
        jButton6.setBorder(null);
        jButton6.setContentAreaFilled(false);
        jButton6.setOpaque(true);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 500, 170, 50));

        jButton7.setBackground(new java.awt.Color(44, 102, 176));
        jButton7.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        jButton7.setForeground(new java.awt.Color(255, 255, 255));
        jButton7.setText("Add");
        jButton7.setBorder(null);
        jButton7.setContentAreaFilled(false);
        jButton7.setOpaque(true);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, 130, 50));

        jPanel4.setBackground(new java.awt.Color(255, 255, 204));
        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)), "Payment Report", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Maiandra GD", 1, 18))); // NOI18N
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("KINETIX\n");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(195, 38, 182, -1));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Tel: 0112123456");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 182, -1));

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("Date");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 124, -1));

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Salary");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 151, -1));

        no7.setEditable(false);
        no7.setBackground(new java.awt.Color(255, 252, 188));
        no7.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no7.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no7.setText(" ");
        no7.setBorder(null);
        no7.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no7KeyReleased(evt);
            }
        });
        jPanel4.add(no7, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 180, 215, 30));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel15.setText("EMP NAME : ");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, 34));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel14.setText("EMP ID : ");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        no6.setEditable(false);
        no6.setBackground(new java.awt.Color(255, 252, 188));
        no6.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no6.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no6.setText(" ");
        no6.setBorder(null);
        no6.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no6KeyReleased(evt);
            }
        });
        jPanel4.add(no6, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 130, 215, 28));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel16.setText("Basic Salary : ");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, 30));

        no8.setEditable(false);
        no8.setBackground(new java.awt.Color(255, 252, 188));
        no8.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no8.setText(" ");
        no8.setBorder(null);
        no8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no8KeyReleased(evt);
            }
        });
        jPanel4.add(no8, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 215, 30));

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel17.setText("O.T");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 520, -1, 30));

        no10.setEditable(false);
        no10.setBackground(new java.awt.Color(255, 252, 188));
        no10.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no10.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no10.setText(" ");
        no10.setBorder(null);
        no10.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no10KeyReleased(evt);
            }
        });
        jPanel4.add(no10, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 420, 215, 30));

        no11.setEditable(false);
        no11.setBackground(new java.awt.Color(255, 252, 188));
        no11.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no11.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no11.setText(" ");
        no11.setBorder(null);
        no11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no11KeyReleased(evt);
            }
        });
        jPanel4.add(no11, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 360, 215, 30));

        jLabel19.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel19.setText("EPF : ");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, 30));

        jLabel18.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel18.setText("ETF");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, 30));

        no9.setEditable(false);
        no9.setBackground(new java.awt.Color(255, 252, 188));
        no9.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no9.setText(" ");
        no9.setBorder(null);
        no9.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no9KeyReleased(evt);
            }
        });
        jPanel4.add(no9, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 300, 215, 30));

        no15.setEditable(false);
        no15.setBackground(new java.awt.Color(255, 255, 204));
        no15.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        no15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        no15.setText(" ");
        no15.setBorder(null);
        no15.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no15KeyReleased(evt);
            }
        });
        jPanel4.add(no15, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 25, 58, 40));

        jLabel21.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel21.setText("Net Total : ");
        jPanel4.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 580, -1, 30));

        no13.setEditable(false);
        no13.setBackground(new java.awt.Color(255, 252, 188));
        no13.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        no13.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no13.setText("00.00");
        no13.setBorder(null);
        no13.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no13KeyReleased(evt);
            }
        });
        jPanel4.add(no13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 580, 215, 30));

        jLabel20.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel20.setText("EPF 8%");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, 30));

        no12.setEditable(false);
        no12.setBackground(new java.awt.Color(255, 252, 188));
        no12.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no12.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no12.setText(" ");
        no12.setBorder(null);
        no12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no12KeyReleased(evt);
            }
        });
        jPanel4.add(no12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 520, 215, 30));

        jLabel22.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        jLabel22.setText("N0Pay");
        jPanel4.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 470, -1, 30));

        no14.setEditable(false);
        no14.setBackground(new java.awt.Color(255, 252, 188));
        no14.setFont(new java.awt.Font("Maiandra GD", 0, 16)); // NOI18N
        no14.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        no14.setText(" ");
        no14.setBorder(null);
        no14.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                no14KeyReleased(evt);
            }
        });
        jPanel4.add(no14, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 215, 30));

        add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 540, 680));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/refresh_40px.png"))); // NOI18N
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
        });
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 580, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void nicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyReleased
        String text = nic.getText();
        try {
            ResultSet rs = database.data.search("SELECT * FROM salary WHERE `salaryId` LIKE '%" + text + "%'");
            TableModel tm = jTable2.getModel();
            DefaultTableModel dtm = (DefaultTableModel) tm;

            while (rs.next()) {
                Vector<String> vr = new Vector<>();
              vr.add(rs.getString("SalaryId"));
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("basicSalary"));
                vr.add(rs.getString("ETF"));
                vr.add(rs.getString("EPF"));
                vr.add(rs.getString("net_salary"));
                vr.add(rs.getString("date"));

               
                dtm.addRow(vr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
        
        
        
        
    }//GEN-LAST:event_nicKeyReleased

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        PrinterJob job = PrinterJob.getPrinterJob();
        job.setJobName("Pay Sheet");
        job.setPrintable(new Printable() {
            @Override
            public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {
                
                Graphics2D g2 = (Graphics2D)graphics;
                g2.translate(pageFormat.getImageableX(), pageFormat.getImageableY());
                g2.scale(0.24,0.24);
                jPanel4.paint(graphics);
                return  Printable.PAGE_EXISTS;
                
                
            }
        });
        
        boolean ok = job.printDialog();
        if(ok){
            try {
                job.print();
            } catch (Exception e) {
            }
        
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed

        TableModel tm = jTable2.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tm;
        int row = jTable2.getSelectedRow();
        if (row >= 0) {
            if (row > 1) {
                int u[] = jTable2.getSelectedRows();
                for (int i = 0; i < row; i++) {
                    data.iud("DELETE FROM salary WHERE `SalaryId` = '" + jTable2.getValueAt(row, 0).toString() + "'");
                    JOptionPane.showMessageDialog(this, "Salary Details Delete", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                    dtm.removeRow(u[0]);
                }

            } else {

                data.iud("DELETE FROM salary WHERE `SalaryId` = '" + jTable2.getValueAt(row, 0).toString() + "'");
                JOptionPane.showMessageDialog(this, "Salary Details Delete", "Deleted", JOptionPane.INFORMATION_MESSAGE);
                dtm.removeRow(jTable2.getSelectedRow());
            }

        } else {

            JOptionPane.showMessageDialog(this, "Please select Row....");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        String id1 = no6.getText();
        String name = no7.getText();
        String basic = no8.getText();
        String etf = no9.getText();
        String epf = no11.getText();
        String net = no13.getText();
        
        try {
            String path = "src//reports//salary.jasper"; 
            
            
            JREmptyDataSource emptydata = new JREmptyDataSource();
            HashMap<String, Object> map = new HashMap<>();
            map.put("Parameter1", id1);
            map.put("Parameter2", name);
            map.put("Parameter3", basic);
            map.put("Parameter4", etf);
            map.put("Parameter5", epf);
            map.put("Parameter6", net);
            
            JasperPrint print = JasperFillManager.fillReport(path, map, emptydata);
            JasperViewer.viewReport(print);
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        TableModel tm = jTable2.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tm;

        int row = jTable2.getSelectedRow();
        if (row >= 0) {
            if (row >= 0) {
                
                    String emnic = jTable2.getValueAt(row, 1).toString();
                    String emname = jTable2.getValueAt(row, 2).toString();
                    String embasic = jTable2.getValueAt(row, 3).toString();
                    String ETF = jTable2.getValueAt(row, 4).toString();
                    String EPF = jTable2.getValueAt(row, 5).toString();
                    String emep8 = jTable2.getValueAt(row, 7).toString();
                    String nopay = jTable2.getValueAt(row, 8).toString();
                    String ot = jTable2.getValueAt(row, 9).toString();
                    String net= jTable2.getValueAt(row, 10).toString();

                    no6.setText(emnic);
                    no7.setText(emname);
                    no8.setText(embasic);
                    no9.setText(ETF);
                    no11.setText(EPF);
                    no10.setText(emep8);
                    no14.setText(nopay);
                    no12.setText(ot);
                    no13.setText(net);
                

            } else {

                    String emnic = jTable2.getValueAt(row, 1).toString();
                    String emname = jTable2.getValueAt(row, 2).toString();
                    String embasic = jTable2.getValueAt(row, 3).toString();
                    String ETF = jTable2.getValueAt(row, 4).toString();
                    String EPF = jTable2.getValueAt(row, 5).toString();
                    String emep8 = jTable2.getValueAt(row, 7).toString();
                    String nopay = jTable2.getValueAt(row, 8).toString();
                    String ot = jTable2.getValueAt(row, 8).toString();
                    String net= jTable2.getValueAt(row, 8).toString();

                    no6.setText(emnic);
                    no7.setText(emname);
                    no8.setText(embasic);
                    no9.setText(ETF);
                    no11.setText(EPF);
                    no10.setText(emep8);
                    no14.setText(nopay);
                    no12.setText(ot);
                    no13.setText(net);
            }

        } else {

            JOptionPane.showMessageDialog(this, "Please select Row....");
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        AddSalary as = new AddSalary();
        as.setVisible(true);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void no7KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no7KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no7KeyReleased

    private void no6KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no6KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no6KeyReleased

    private void no8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no8KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no8KeyReleased

    private void no10KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no10KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no10KeyReleased

    private void no11KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no11KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no11KeyReleased

    private void no9KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no9KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no9KeyReleased

    private void no15KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no15KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no15KeyReleased

    private void no13KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no13KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no13KeyReleased

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        loadsalary();
    }//GEN-LAST:event_jLabel2MouseClicked

    private void no12KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no12KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no12KeyReleased

    private void no14KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_no14KeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_no14KeyReleased

    public static viewSalary viewsala() {
        if (r == null) {
            r = new viewSalary();
        }
        return r;
    }

//    public void design() {
//
//        Font font = new Font("Maiandra GD", Font.BOLD, 18);
//        JTableHeader header = jTable2.getTableHeader();
//        header.setFont(font);
//        header.setOpaque(false);
//        header.setBackground(new Color(32, 136, 203));
//        header.setForeground(new Color(255, 255, 255));
//
//    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nic;
    static javax.swing.JTextField no10;
    static javax.swing.JTextField no11;
    static javax.swing.JTextField no12;
    static javax.swing.JTextField no13;
    static javax.swing.JTextField no14;
    private javax.swing.JTextField no15;
    static javax.swing.JTextField no6;
    static javax.swing.JTextField no7;
    static javax.swing.JTextField no8;
    static javax.swing.JTextField no9;
    // End of variables declaration//GEN-END:variables

    public void loadsalary() {
        ResultSet rs = database.data.search("SELECT * FROM salary");
        TableModel tdm = jTable2.getModel();
        DefaultTableModel dtm = (DefaultTableModel) tdm;
        dtm.setRowCount(0);

        try {
            while (rs.next()) {
                Vector<String> vr = new Vector<>();
                vr.add(rs.getString("SalaryId"));
                vr.add(rs.getString("employee_nic"));
                vr.add(rs.getString("name"));
                vr.add(rs.getString("basicSalary"));
                vr.add(rs.getString("ETF"));
                vr.add(rs.getString("EPF"));
                vr.add(rs.getString("date"));
                vr.add(rs.getString("EPF 8%"));
                vr.add(rs.getString("nopay"));
                vr.add(rs.getString("O.T"));
                vr.add(rs.getString("net_salary"));

                dtm.addRow(vr);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void design() {

        Font font = new Font("Maiandra GD", Font.BOLD, 18);
        JTableHeader header = jTable2.getTableHeader();
        header.setFont(font);
        header.setOpaque(false);
        header.setBackground(new Color(9,0,82));
        header.setForeground(new Color(255,255,255));
        
    }
}