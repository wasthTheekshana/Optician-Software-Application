package gui;

//import Class.AllTextFieldDisable;
//import Class.TextOnlyValidation;
import Class.*;
import database.data;
import static gui.channeling.jTextField2;
import static gui.channeling.jTextField3;
import java.awt.Color;
import java.awt.event.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author Theekshana
 */
public class employeRegis extends javax.swing.JPanel {

    String Bankid;
    String gender;
    String type;
    static employeRegis r;
    private int option;
    String finger;

    public employeRegis() {
        initComponents();
        bank();
        typeuser();
        cFile();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        memNo = new javax.swing.JTextField();
        nic = new javax.swing.JTextField();
        fname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        cont = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel7 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        male = new javax.swing.JRadioButton();
        female = new javax.swing.JRadioButton();
        jLabel12 = new javax.swing.JLabel();
        memNo1 = new javax.swing.JTextField();
        ad1 = new javax.swing.JTextField();
        ad2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jDateChooser2 = new com.toedter.calendar.JDateChooser();
        jLabel16 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        basic = new javax.swing.JTextField();

        setBackground(new java.awt.Color(255, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(32, 46, 128));
        jLabel1.setFont(new java.awt.Font("Maiandra GD", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setText("Employee Details");
        jLabel1.setOpaque(true);
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1040, -1));

        jLabel2.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel2.setText("Gender : ");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 370, -1, 42));

        jLabel3.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel3.setText("NIC : ");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 41));

        jLabel4.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel4.setText("First Name : ");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, -1, 41));

        jLabel5.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel5.setText("Last Name : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, -1, 42));

        jLabel6.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel6.setText("Contact No : ");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, 40));

        memNo.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        memNo.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        memNo.setText(" ");
        memNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memNoActionPerformed(evt);
            }
        });
        memNo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                memNoKeyTyped(evt);
            }
        });
        add(memNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 180, 40));

        nic.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        nic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        nic.setText(" ");
        nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nicActionPerformed(evt);
            }
        });
        nic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nicKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nicKeyTyped(evt);
            }
        });
        add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 90, 180, 40));

        fname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        fname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        fname.setText(" ");
        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });
        fname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnameKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fnameKeyTyped(evt);
            }
        });
        add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 160, 180, 40));

        lname.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        lname.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        lname.setText(" ");
        lname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnameActionPerformed(evt);
            }
        });
        lname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lnameKeyReleased(evt);
            }
        });
        add(lname, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 230, 180, 40));

        cont.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        cont.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        cont.setText(" ");
        cont.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contKeyTyped(evt);
            }
        });
        add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 430, 180, 40));

        jTextField8.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField8.setText(" ");
        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });
        jTextField8.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField8KeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField8KeyTyped(evt);
            }
        });
        add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 180, 40));

        jLabel10.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel10.setText("BOD : ");
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, -1, 42));

        jLabel13.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel13.setText("Join Date : ");
        add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 90, -1, 30));

        jButton1.setBackground(new java.awt.Color(44, 102, 176));
        jButton1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Save");
        jButton1.setBorder(null);
        jButton1.setContentAreaFilled(false);
        jButton1.setOpaque(true);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 540, 190, 50));

        jButton2.setBackground(new java.awt.Color(44, 102, 176));
        jButton2.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Cancel");
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.setOpaque(true);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 540, 190, 50));

        jComboBox3.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 370, 180, 40));

        jLabel11.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel11.setText("Basic Salary : ");
        add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 300, -1, 30));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 180, 40));

        jLabel7.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel7.setText("Address 1");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 570, -1, 40));

        jTextField9.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jTextField9.setText(" ");
        add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 230, 180, 40));

        jButton5.setFont(new java.awt.Font("Maiandra GD", 0, 24)); // NOI18N
        jButton5.setText("Scan ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 230, 90, 40));

        jLabel9.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel9.setText("Email : ");
        add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, 30));

        buttonGroup1.add(male);
        male.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        male.setText("Male");
        male.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleActionPerformed(evt);
            }
        });
        add(male, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 370, -1, -1));

        buttonGroup1.add(female);
        female.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        female.setText("Female");
        add(female, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 370, -1, -1));

        jLabel12.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel12.setText("Finger Id: ");
        add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, 40));

        memNo1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        memNo1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        memNo1.setText(" ");
        memNo1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memNo1ActionPerformed(evt);
            }
        });
        memNo1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                memNo1KeyTyped(evt);
            }
        });
        add(memNo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 500, 180, 40));

        ad1.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        ad1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ad1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad1ActionPerformed(evt);
            }
        });
        add(ad1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 570, 180, 40));

        ad2.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        ad2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        ad2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ad2ActionPerformed(evt);
            }
        });
        add(ad2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 640, 180, 40));

        jLabel14.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel14.setText("Address 2");
        add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, -1, 40));

        jLabel15.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel15.setText("User type : ");
        add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 160, -1, 30));
        add(jDateChooser2, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 90, 180, 30));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel16.setText("Bank : ");
        add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 370, -1, 30));

        jComboBox4.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 160, 180, 40));

        jLabel17.setFont(new java.awt.Font("Maiandra GD", 0, 20)); // NOI18N
        jLabel17.setText("Account No : ");
        add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 430, -1, 42));

        basic.setFont(new java.awt.Font("Maiandra GD", 0, 18)); // NOI18N
        basic.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        add(basic, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 300, 170, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        String niid = nic.getText();
        String name1 = fname.getText();
        String name2 = lname.getText();
        String accnt = cont.getText();
        String contact = memNo.getText();
        String email = jTextField8.getText();
        String finger1 = jTextField9.getText();
        String leaves = "21";
        String Add1 = ad1.getText();
        String Add2 = ad2.getText();
        String basicsala = basic.getText();

        Date date1 = jDateChooser1.getDate();
        Date date2 = jDateChooser2.getDate();
        SimpleDateFormat sdmt = new SimpleDateFormat("yyyy-MM-dd");
        String smd1 = sdmt.format(date1);
        String smd2 = sdmt.format(date2);
        try {
            ResultSet rs = data.search("SELECT `bankId` FROM bank WHERE `name` = '" + jComboBox3.getSelectedItem().toString() + "'");
            if (rs.next()) {
                Bankid = rs.getString("bankId");
                ResultSet rs1 = data.search("SELECT `UserTypeId` FROM `user type` WHERE `uType` = '" + jComboBox4.getSelectedItem().toString() + "'");

                if (rs1.next()) {

                    type = rs1.getString("UserTypeId");

                    if (male.isSelected()) {
                        gender = "Male";
                    } else if (female.isSelected()) {
                        gender = "Female";

                    }
                    data.iud("INSERT INTO employee(`nic`,`efname`,`lname`,`dob`,`gender`,`email`,`mobile`,`address_1`,`address_2`, `date_hired`, `user type_UserTypeId`, `fingerId`, `basic_salary` ,`accountNo`,`bank_bankId`,`leaving`)"
                            + "VALUES('" + niid + "','" + name1 + "','" + name2 + "','" + smd1 + "', '" + gender + "' ,'" + email + "','" + contact + "','" + Add1 + "', '" + Add2 + "' , '" + smd2 + "', '" + type + "' , '" + finger1 + "', '" + basicsala + "', '" + accnt + "','" + Bankid + "', '" + leaves + "')");

                    data.iud("INSERT INTO `user`(`name`,`password`,`email`,`user type_UserTypeId`)VALUES('"+name1+"','"+niid+"','"+email+"','"+type+"')");
                    JOptionPane.showMessageDialog(this, "Employee Add Success", "Success", JOptionPane.INFORMATION_MESSAGE);
                    JOptionPane.showMessageDialog(this, "Employee user name:  " +name1+ "psword " +niid ,"Success", JOptionPane.INFORMATION_MESSAGE);

                    String textToAppend = "Happy !!";

                    BufferedWriter writer = new BufferedWriter(
                            new FileWriter("D://Optician//Fingerprint//fingerprint.txt", true) //Set true for append mode
                    );

                    writer.newLine();   //Add new line
                    writer.write(finger1);
                    writer.close();
                }

            }
        } catch (Exception e) {
            System.out.println(e);
        }
        nic.setText(null);
        fname.setText(null);
        lname.setText(null);
        memNo.setText(null);
        cont.setText(null);
        jTextField8.setText(null);
        jTextField9.setText(null);
       ad1.setText(null);
       ad2.setText(null);
       basic.setText(null);

    }//GEN-LAST:event_jButton1ActionPerformed

    private void fnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyReleased

    }//GEN-LAST:event_fnameKeyReleased

    private void lnameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lnameKeyReleased

    }//GEN-LAST:event_lnameKeyReleased

    private void nicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyReleased
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
    }//GEN-LAST:event_nicKeyReleased

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        if (fname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter The Name", "Inform", JOptionPane.INFORMATION_MESSAGE);
        } else {
            lname.grabFocus();

        }
    }//GEN-LAST:event_fnameActionPerformed

    private void contKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contKeyTyped

        Email.checkLength(evt, cont.getText(), 20);
    }//GEN-LAST:event_contKeyTyped

    private void nicKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nicKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        Email.checkLength(evt, nic.getText(), 9);
    }//GEN-LAST:event_nicKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int i = JOptionPane.showConfirmDialog(this, "Do You Want To Cancel?", "Inform", JOptionPane.YES_NO_OPTION);
        if (i == JOptionPane.YES_OPTION) {
//            AllTextFieldDisable.setNull(nic, fname, lname, cont, memNo, cont, jTextField8);

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed

        String fin = FingerPrint.read("D:/Fingerprint/finger.txt");
        jTextField9.setText(fin);
        try {
            ResultSet rs = data.search("SELECT `fingerId` FROM `employee` WHERE `fingerId` = '" + fin + "'");

            if (rs.next()) {
                String finid = rs.getString("fingerId");
                System.out.println(finid);
                if (finid == fin) {
                    JOptionPane.showMessageDialog(this, "This Id Already Taken", "Inform", JOptionPane.INFORMATION_MESSAGE);

                } else {
                    jTextField9.setText(fin);

                }

            } else {
                System.out.println("not working");

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField8KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyReleased

        String pattern = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(jTextField8.getText());
        if (!match.matches()) {
            jTextField8.setForeground(Color.red);

        } else {

            jTextField8.setForeground(Color.black);

        }
    }//GEN-LAST:event_jTextField8KeyReleased

    private void memNoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memNoKeyTyped
        char c = evt.getKeyChar();
        if (!Character.isDigit(c) || (c == KeyEvent.VK_BACK_SPACE) || (c == KeyEvent.VK_DELETE)) {
            evt.consume();
        }
        Email.checkLength(evt, memNo.getText(), 13);
    }//GEN-LAST:event_memNoKeyTyped

    private void contKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contKeyReleased

    }//GEN-LAST:event_contKeyReleased

    private void fnameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnameKeyTyped

    }//GEN-LAST:event_fnameKeyTyped

    private void jTextField8KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField8KeyTyped

    }//GEN-LAST:event_jTextField8KeyTyped

    private void nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nicActionPerformed
        if (nic.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter The NIC", "Inform", JOptionPane.INFORMATION_MESSAGE);
        } else {
            fname.grabFocus();

        }
    }//GEN-LAST:event_nicActionPerformed

    private void lnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnameActionPerformed
        if (lname.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter The Name", "Inform", JOptionPane.INFORMATION_MESSAGE);
        } else {
            jTextField8.grabFocus();
        }
    }//GEN-LAST:event_lnameActionPerformed

    private void memNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memNoActionPerformed
        if (memNo.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please Enter The Name", "Inform", JOptionPane.INFORMATION_MESSAGE);
        } else {
            ad1.grabFocus();
        }
    }//GEN-LAST:event_memNoActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        String pattern = "^[a-zA-Z0-9]{0,30}[@][a-zA-Z0-9]{0,10}[.][a-zA-Z]{0,5}$";
        Pattern patt = Pattern.compile(pattern);
        Matcher match = patt.matcher(jTextField8.getText());
        if (!match.matches()) {
            JOptionPane.showMessageDialog(this, "Please Enter The Email", "Inform", JOptionPane.INFORMATION_MESSAGE);
        } else {
            memNo.grabFocus();
        }
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void maleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleActionPerformed

    private void memNo1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memNo1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_memNo1ActionPerformed

    private void memNo1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_memNo1KeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_memNo1KeyTyped

    private void ad1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad1ActionPerformed
        if(ad1.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Enter The Name", "Inform", JOptionPane.INFORMATION_MESSAGE);
        }else{
        ad2.grabFocus();
        
        }
    }//GEN-LAST:event_ad1ActionPerformed

    private void ad2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ad2ActionPerformed
         if(jTextField2.getText().isEmpty()){
        JOptionPane.showMessageDialog(this, "Please Enter The Name", "Inform", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_ad2ActionPerformed
    public static employeRegis empwin() {
        if (r == null) {
            r = new employeRegis();
        }
        return r;
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ad1;
    private javax.swing.JTextField ad2;
    private javax.swing.JTextField basic;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JTextField cont;
    private javax.swing.JRadioButton female;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private com.toedter.calendar.JDateChooser jDateChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField lname;
    private javax.swing.JRadioButton male;
    private javax.swing.JTextField memNo;
    private javax.swing.JTextField memNo1;
    private javax.swing.JTextField nic;
    // End of variables declaration//GEN-END:variables

    public void bank() {

        ResultSet rs = database.data.search("SELECT `name` FROM bank");
        Vector<String> vr = new Vector<>();

        try {
            while (rs.next()) {
                vr.add(rs.getString("name"));

                DefaultComboBoxModel dcm = new DefaultComboBoxModel(vr);
                jComboBox3.setModel(dcm);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void typeuser() {
        ResultSet rs = data.search("SELECT * FROM `user type`");
        Vector<String> vr  = new Vector<>();
        
        try {
            while (rs.next()) {                
                vr.add(rs.getString("uType"));
                DefaultComboBoxModel cdm = new DefaultComboBoxModel(vr);
                jComboBox4.setModel(cdm);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void cFile() {

        FileCeate.CreateFile("C:/ProgramData/Optician");
        FileCeate.CreateFile("C:/ProgramData/Optician/Employee");
        FileCeate.CreateFile("C:/ProgramData/Optician/Security/Access");

    }

    public void finfile() throws IOException {

//    	File dir = new File("C:/ProgramData/Optician/Fingerprint");      
//     	dir.mkdir();
//
//     	File tf=new File(dir,"fingerprint.txt");
//     	tf.createNewFile();
        BufferedWriter writer = new BufferedWriter(
                new FileWriter("D:/samplefile.txt", true) //Set true for append mode
        );

    }

}
