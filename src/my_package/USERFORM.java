/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my_package;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author shree
 */
public class USERFORM extends javax.swing.JFrame {

    /**
     * Creates new form USERFORM
     */
    public USERFORM() {
         setUndecorated(true);
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
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        check = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        AN = new javax.swing.JLabel();
        FN = new javax.swing.JLabel();
        MN = new javax.swing.JLabel();
        LN = new javax.swing.JLabel();
        A = new javax.swing.JLabel();
        MN1 = new javax.swing.JLabel();
        FN1 = new javax.swing.JLabel();
        MON1 = new javax.swing.JLabel();
        ACN = new javax.swing.JLabel();
        PCN = new javax.swing.JLabel();
        Status = new javax.swing.JLabel();
        PP = new javax.swing.JLabel();
        doc = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        gender = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        dob = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        state = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        ms = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 153, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        jPanel1.setForeground(new java.awt.Color(0, 102, 255));

        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("APPLICATION FORM NO:");

        check.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153)));
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });

        jButton1.setText("CHECK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(255, 255, 255));
        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/my_package/delete-button.png"))); // NOI18N
        jButton7.setBorderPainted(false);
        jButton7.setContentAreaFilled(false);
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setMaximumSize(new java.awt.Dimension(0, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 153));
        jLabel2.setText("APPLICATION NUMBER:");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(54, 26, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 51, 153));
        jLabel3.setText("FIRST NAME:");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(83, 71, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 51, 153));
        jLabel4.setText("MIDDLE NAME:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(73, 97, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 51, 153));
        jLabel5.setText("LAST NAME:");
        jPanel3.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, 123, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 51, 153));
        jLabel6.setText("ADDRESS:");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(99, 263, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 51, 153));
        jLabel7.setText("MOBILE NUMBER:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 296, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 51, 153));
        jLabel8.setText("FATHER'S NAME:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(61, 353, -1, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 51, 153));
        jLabel9.setText("PAN CARD NUMBER:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 464, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 51, 153));
        jLabel10.setText("MOTHER'S NAME:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(57, 386, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 153));
        jLabel11.setText("ADHAR CARD NUMBER:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(28, 438, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 153));
        jLabel12.setText("STATUS:");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 497, -1, -1));

        AN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        AN.setForeground(new java.awt.Color(255, 0, 0));
        AN.setText("APPLICATION NUMBER");
        jPanel3.add(AN, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 26, -1, -1));

        FN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FN.setForeground(new java.awt.Color(0, 102, 204));
        FN.setText("FIRST NAME");
        jPanel3.add(FN, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 71, -1, -1));

        MN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MN.setForeground(new java.awt.Color(0, 102, 204));
        MN.setText("MIDDLE NAME");
        jPanel3.add(MN, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 97, -1, -1));

        LN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        LN.setForeground(new java.awt.Color(0, 102, 204));
        LN.setText("LAST NAME");
        jPanel3.add(LN, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 123, -1, -1));

        A.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        A.setForeground(new java.awt.Color(0, 102, 204));
        A.setText("ADDRESS");
        jPanel3.add(A, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 263, -1, -1));

        MN1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MN1.setForeground(new java.awt.Color(0, 102, 204));
        MN1.setText("MOBILE NUMBER");
        jPanel3.add(MN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 296, -1, -1));

        FN1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        FN1.setForeground(new java.awt.Color(0, 102, 204));
        FN1.setText("FATHER NAME");
        jPanel3.add(FN1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 353, -1, -1));

        MON1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        MON1.setForeground(new java.awt.Color(0, 102, 204));
        MON1.setText("MOTHER NAME");
        jPanel3.add(MON1, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 386, -1, -1));

        ACN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ACN.setForeground(new java.awt.Color(0, 102, 204));
        ACN.setText("ACN");
        jPanel3.add(ACN, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 438, -1, -1));

        PCN.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        PCN.setForeground(new java.awt.Color(0, 102, 204));
        PCN.setText("PCN");
        jPanel3.add(PCN, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 464, -1, -1));

        Status.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        Status.setForeground(new java.awt.Color(0, 102, 204));
        Status.setText("STATUS");
        jPanel3.add(Status, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 497, -1, -1));

        PP.setBackground(new java.awt.Color(255, 255, 255));
        PP.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        PP.setMaximumSize(new java.awt.Dimension(208, 212));
        PP.setMinimumSize(new java.awt.Dimension(208, 212));
        PP.setName(""); // NOI18N
        jPanel3.add(PP, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 10, 147, 154));

        doc.setBackground(new java.awt.Color(255, 255, 255));
        doc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        doc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 153), 2));
        doc.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel3.add(doc, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 10, 470, 569));

        jPanel4.setBackground(new java.awt.Color(179, 216, 252));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 204), 2));

        jButton4.setText("VOTER ID");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setText("ADHAR CARD");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton5.setText("ELECTRICITY BILL");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("CERTIFICATE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jPanel3.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 10, 160, 340));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 51, 153));
        jLabel13.setText("GENDER:");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(106, 156, -1, -1));

        gender.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        gender.setForeground(new java.awt.Color(0, 102, 204));
        gender.setText("GENDER");
        jPanel3.add(gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 156, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 51, 153));
        jLabel15.setText("DATE OF BIRTH:");
        jPanel3.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 179, -1, -1));

        dob.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dob.setForeground(new java.awt.Color(0, 102, 204));
        dob.setText("DATE OF BIRTH");
        jPanel3.add(dob, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 179, -1, -1));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 51, 153));
        jLabel17.setText("STATE:");
        jPanel3.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(113, 205, -1, -1));

        state.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        state.setForeground(new java.awt.Color(0, 102, 204));
        state.setText("STATE");
        jPanel3.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 205, -1, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 51, 153));
        jLabel19.setText("MARTIAL STATUS:");
        jPanel3.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 231, -1, -1));

        ms.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ms.setForeground(new java.awt.Color(0, 102, 204));
        ms.setText("MARTIAL STATUS");
        jPanel3.add(ms, new org.netbeans.lib.awtextra.AbsoluteConstraints(224, 231, -1, -1));
        jPanel3.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, 1182, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(check, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(22, 22, 22))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                .addGap(18, 18, 18)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    try{
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
    java.sql.PreparedStatement pst;
    pst = con.prepareStatement("select * from userform where ID=?");
    int id=Integer.parseInt(check.getText());
    pst.setInt(1,id);
    ResultSet rsl=pst.executeQuery();
    if(rsl.next())
    {
        AN.setText(rsl.getString("ID"));
        FN.setText(rsl.getString("FIRSTNAME"));
        MN.setText(rsl.getString("MIDDLENAME"));
        LN.setText(rsl.getString("LASTNAME"));
        A.setText(rsl.getString("ADDRESS"));
        MN1.setText(rsl.getString("MOBILENUMBER"));
        FN1.setText(rsl.getString("FATHERFN"));
        MON1.setText(rsl.getString("MOTHERFN"));
        ACN.setText(rsl.getString("ACN"));
        PCN.setText(rsl.getString("PCN"));
        Status.setText(rsl.getString("STATUS"));
        BufferedImage im = ImageIO.read(rsl.getBinaryStream("PHOTO"));
        PP.setIcon(new ImageIcon(im));
        gender.setText(rsl.getString("GENDER"));
        dob.setText(rsl.getString("DATE"));
        state.setText(rsl.getString("STATE"));
        ms.setText(rsl.getString("MARTIAL_STATUS"));
    }
    else
    {
     JOptionPane.showMessageDialog(this,"wrong ID!");
    }
    }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(null,e);
    }   catch (IOException ex) {
            Logger.getLogger(USERFORM.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
    try{
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
        java.sql.PreparedStatement ps;
    ps = con.prepareStatement("select * from userform where ID=?");
    int id;
    id = Integer.parseInt(check.getText());
    ps.setInt(1,id);
    ResultSet rs;
    rs = ps.executeQuery();
    if(rs.next())
    {
        BufferedImage ig;
        ig = ImageIO.read(rs.getBinaryStream("ADHARCARD"));
        Image img =ig.getScaledInstance(doc.getWidth(),doc.getHeight(),Image.SCALE_SMOOTH);
        doc.setIcon(new ImageIcon(ig));
    }
    else
    {
     JOptionPane.showMessageDialog(this,"NOT FOUND");
    }
    }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(null,e);
    }   catch (IOException ex) {  
            Logger.getLogger(USERFORM.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton3ActionPerformed

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_checkActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    try{
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
    java.sql.PreparedStatement ps;
    ps = con.prepareStatement("select * from userform where ID=?");
    int id;
    id = Integer.parseInt(check.getText());
    ps.setInt(1,id);
    ResultSet rs;
    rs = ps.executeQuery();
    if(rs.next())
    {
        BufferedImage ig;
        ig = ImageIO.read(rs.getBinaryStream("VOTERID"));
        doc.setIcon(new ImageIcon(ig));
    }
    else
    {
     JOptionPane.showMessageDialog(this,"NOT FOUND");
    }
    }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(null,e);
    }   catch (IOException ex) {  
        Logger.getLogger(USERFORM.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        try{
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
    java.sql.PreparedStatement ps;
    ps = con.prepareStatement("select * from userform where ID=?");
    int id;
    id = Integer.parseInt(check.getText());
    ps.setInt(1,id);
    ResultSet rs;
    rs = ps.executeQuery();
    if(rs.next())
    {
        BufferedImage ig;
        ig = ImageIO.read(rs.getBinaryStream("BILL"));
        doc.setIcon(new ImageIcon(ig));
    }
    else
    {
     JOptionPane.showMessageDialog(this,"NOT FOUND");
    }
    }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(null,e);
    }   catch (IOException ex) {  
        Logger.getLogger(USERFORM.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
          try{
    Class.forName("com.mysql.jdbc.Driver");
    java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/login","root","");
    java.sql.PreparedStatement ps;
    ps = con.prepareStatement("select * from userform where ID=?");
    int id;
    id = Integer.parseInt(check.getText());
    ps.setInt(1,id);
    ResultSet rs;
    rs = ps.executeQuery();
    if(rs.next())
    {
        BufferedImage ig;
        ig = ImageIO.read(rs.getBinaryStream("CERTIFICATE"));
        doc.setIcon(new ImageIcon(ig));
    }
    else
    {
     JOptionPane.showMessageDialog(this,"NOT FOUND");
    }
    }
    catch(ClassNotFoundException | SQLException e)
    {
       JOptionPane.showMessageDialog(null,e);
    }   catch (IOException ex) {  
        Logger.getLogger(USERFORM.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
       
        dispose();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton7ActionPerformed

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
            java.util.logging.Logger.getLogger(USERFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(USERFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(USERFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(USERFORM.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new USERFORM().setVisible(true);
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel A;
    private javax.swing.JLabel ACN;
    private javax.swing.JLabel AN;
    private javax.swing.JLabel FN;
    private javax.swing.JLabel FN1;
    private javax.swing.JLabel LN;
    private javax.swing.JLabel MN;
    private javax.swing.JLabel MN1;
    private javax.swing.JLabel MON1;
    private javax.swing.JLabel PCN;
    private javax.swing.JLabel PP;
    private javax.swing.JLabel Status;
    private javax.swing.JTextField check;
    private javax.swing.JLabel dob;
    private javax.swing.JLabel doc;
    private javax.swing.JLabel gender;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel ms;
    private javax.swing.JLabel state;
    // End of variables declaration//GEN-END:variables
byte[] photo =null;

}