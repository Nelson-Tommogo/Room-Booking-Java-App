/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycafe;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import java.sql.*;
import project.*;
/**
 *
 * @author TOMMOGO
 */
public class CustomerIn extends javax.swing.JFrame {

    /**
     * Creates new form CustomerIn
     */
    public CustomerIn() {
        initComponents();
        txtcid.setEditable(false);
        SimpleDateFormat myFormat=new SimpleDateFormat("yyyy/MM/dd");
        Calendar cal=Calendar.getInstance();
        txtcid.setText(myFormat.format(cal.getTime()));
        
    }
    String Bed;
    String RoomType;
    String RoomNo;
    String Price;
    public void RoomDetails(){
        rncombo.removeAllItems();
        txtPrice.setText("");
        Bed=(String)bedcombo.getSelectedItem();
        RoomType=(String)rtcombo.getSelectedItem();
        try{
            ResultSet rs=select.getData("select *from Room where Bed='"+Bed+"' and RoomType='"+RoomType+"' and Status='Not Booked'");
            while(rs.next()){
                rncombo.addItem(rs.getString(1));
            }
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtmn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        comboG = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txte = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        IDPtxt = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Addtxt = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtcid = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        rtcombo = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        txtPrice = new javax.swing.JTextField();
        btnalc = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        bedcombo = new javax.swing.JComboBox<>();
        exitbtn = new javax.swing.JButton();
        rncombo = new javax.swing.JComboBox<>();
        jLabel15 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Customer Registration & Check IN.png"))); // NOI18N
        jLabel1.setText("Customer CheckIn");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, -1, -1));
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 122, 202, -1));

        jLabel3.setText("Mobile Number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 148, -1, -1));
        getContentPane().add(txtmn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 192, -1));

        jLabel4.setText("Nationality");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, -1, -1));
        getContentPane().add(txtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 262, 202, -1));

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 333, -1, -1));

        comboG.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", "Prefer Not to Say" }));
        getContentPane().add(comboG, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 358, 192, -1));

        jLabel6.setText("Email");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 396, -1, -1));
        getContentPane().add(txte, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 428, 192, -1));

        jLabel7.setText("ID Proof");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 90, -1, -1));
        getContentPane().add(IDPtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(306, 122, 190, -1));

        jLabel8.setText("Address");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 180, -1, -1));
        getContentPane().add(Addtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 190, -1));

        jLabel9.setText("Check In Date");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 340, -1, -1));
        getContentPane().add(txtcid, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 360, 180, -1));

        jLabel10.setText("Bed");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 100, -1, -1));

        jLabel11.setText("Room Type");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, -1, -1));
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 230, -1, -1));

        jLabel13.setText("Room Number");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 270, -1, -1));

        rtcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "Non-Ac", " " }));
        rtcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rtcomboActionPerformed(evt);
            }
        });
        getContentPane().add(rtcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 220, 140, -1));

        jLabel14.setText("Price");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 340, -1, -1));
        getContentPane().add(txtPrice, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 390, 140, -1));

        btnalc.setText("Allocate Room");
        btnalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnalcActionPerformed(evt);
            }
        });
        getContentPane().add(btnalc, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, -1, -1));

        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 510, -1, -1));

        bedcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single ", "Double", "Tripple", " " }));
        bedcombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bedcomboActionPerformed(evt);
            }
        });
        getContentPane().add(bedcombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 130, -1));

        exitbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close.png"))); // NOI18N
        exitbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitbtnActionPerformed(evt);
            }
        });
        getContentPane().add(exitbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 0, -1, -1));

        rncombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rncomboActionPerformed(evt);
            }
        });
        getContentPane().add(rncombo, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 300, 130, -1));

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin Home.png"))); // NOI18N
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -130, 780, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void exitbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitbtnActionPerformed
        // TODO add your handling code here
        setVisible(false);
    }//GEN-LAST:event_exitbtnActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new CustomerIn().setVisible(true);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void bedcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bedcomboActionPerformed
        // TODO add your handling code here:
        RoomDetails();
    }//GEN-LAST:event_bedcomboActionPerformed

    private void rtcomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rtcomboActionPerformed
        // TODO add your handling code here:
        RoomDetails();
    }//GEN-LAST:event_rtcomboActionPerformed

    private void rncomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rncomboActionPerformed
        // TODO add your handling code here:
        RoomNo=(String)rncombo.getSelectedItem();
        try{
            ResultSet rs=select.getData("select *from Room where RoomNo='"+RoomNo+"'");
            while (rs.next()){
                txtPrice.setText(rs.getString(4));
            }
        }catch(SQLException e){
            
        }
    }//GEN-LAST:event_rncomboActionPerformed

    private void btnalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnalcActionPerformed
        // TODO add your handling code here:
        int ID=1;
        String Name=txtname.getText();
        String MobileNumber=txtmn.getText();
        String Natonality=txtn.getText();
        String Gender=(String) comboG.getSelectedItem();
        String Email=txte.getText();
         String IDProof=IDPtxt.getText();
        String Address=Addtxt.getText();
         String CheckIn=txtcid.getText();
        String bed =(String) bedcombo.getSelectedItem();
        String Roomtype=(String) rtcombo.getSelectedItem();
        String RoomNumber=(String) rncombo.getSelectedItem();
        String price=txtPrice.getText();
        String Query="select max(ID) from Customer";
        try{
            ResultSet rs=select.getData(Query);
            while(rs.next()){
                ID=rs.getInt(1);
                if(!price.equals("")){
                    Query="update Room set Status='Booked' where RoomNO='"+RoomNo+"'";
                    InsertUpdatedelete.setData(Query, "");
                    Query="insert into customer(ID,Name,MobileNumber,Nationality,Gender,Email,IDProof,Address,CheckIn,RoomNo,Bed,Roomtype,PricePerDay)values("+ID+",'"+Name+"','"+MobileNumber+"','"+Natonality+"','"+Gender+"','"+Email+"','"+IDProof+"','"+Address+"','"+CheckIn+"','"+RoomNumber+"','"+Bed+"','"+RoomType+"','"+Price+"')";
                    InsertUpdatedelete.setData(Query, "Customer Check In Successfully");
                    setVisible(false);
                    new CustomerIn().setVisible(true);
                }
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_btnalcActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CustomerIn().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Addtxt;
    private javax.swing.JTextField IDPtxt;
    private javax.swing.JComboBox<String> bedcombo;
    private javax.swing.JButton btnalc;
    private javax.swing.JButton clearbtn;
    private javax.swing.JComboBox<String> comboG;
    private javax.swing.JButton exitbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<String> rncombo;
    private javax.swing.JComboBox<String> rtcombo;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtcid;
    private javax.swing.JTextField txte;
    private javax.swing.JTextField txtmn;
    private javax.swing.JTextField txtn;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
