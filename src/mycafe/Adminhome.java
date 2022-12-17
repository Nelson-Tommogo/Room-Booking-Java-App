/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycafe;

import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import project.*;
import project.select;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author TOMMOGO
 */
public class Adminhome extends javax.swing.JFrame {

    /**
     * Creates new form Admin home
     */
    public Adminhome() {
        initComponents();
        ResultSet rs= null;
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
        btnlogout = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtsbnoem = new javax.swing.JTextField();
        searchbtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 0, 0));
        jLabel1.setText("Welcome Admin");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        btnlogout.setForeground(new java.awt.Color(177, 18, 18));
        btnlogout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        btnlogout.setText("Log Out");
        btnlogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlogoutActionPerformed(evt);
            }
        });
        getContentPane().add(btnlogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, -1, -1));

        btnExit.setForeground(new java.awt.Color(177, 18, 18));
        btnExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/exit.png"))); // NOI18N
        btnExit.setText("Ezxit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        getContentPane().add(btnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 0, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Search by Name or Email");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(55, 119, -1, -1));
        getContentPane().add(txtsbnoem, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 228, -1));

        searchbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        searchbtn.setForeground(new java.awt.Color(177, 18, 18));
        searchbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        searchbtn.setText("Search");
        searchbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbtnActionPerformed(evt);
            }
        });
        getContentPane().add(searchbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 110, -1, -1));

        clearbtn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearbtn.setForeground(new java.awt.Color(177, 18, 18));
        clearbtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/clear.png"))); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });
        getContentPane().add(clearbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 110, -1, -1));

        txtTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Email", "Security Questiom", "Address", "Status"
            }
        ));
        txtTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(txtTable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 810, 400));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/admin Home.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -120, 940, 680));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        int y=JOptionPane.showConfirmDialog(null,"Confirm you want to exit!!?","Thank you",JOptionPane.YES_NO_OPTION);
if(y==0)
{
    System.exit(0);
    
}
    }//GEN-LAST:event_btnExitActionPerformed

    private void btnlogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlogoutActionPerformed
        // TODO add your handling code here:
        int y=JOptionPane.showConfirmDialog(null,"Confirm You want to Log out!!!!?","Thank you",JOptionPane.YES_NO_OPTION);
if(y==0)
{
    setVisible(false);
    new Login().setVisible(true);
    
}
    }//GEN-LAST:event_btnlogoutActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new Adminhome().setVisible(true);
    }//GEN-LAST:event_clearbtnActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs=select.getData("select *from users");
        DefaultTableModel model=(DefaultTableModel)txtTable.getModel();
        model.setRowCount(0);
        try{
            while (rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7),});
                //rs.close();
            }
            rs.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void searchbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbtnActionPerformed
        // TODO add your handling code here:
        String NameorEmail=txtsbnoem.getText();
         ResultSet rs=select.getData("select *from users where Name like '%"+NameorEmail+"%' or Email like '%"+NameorEmail+"%'");
        DefaultTableModel model=(DefaultTableModel)txtTable.getModel();
        model.setRowCount(0);
        try{
            while (rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(4),rs.getString(6),rs.getString(7),});
                
            }
            rs.close();
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_searchbtnActionPerformed

    private void txtTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTableMouseClicked
        // TODO add your handling code here:
        int index=txtTable.getSelectedRow();
        TableModel model=txtTable.getModel();
        String Email=model.getValueAt(index,1).toString();
        String Status=model.getValueAt(index,4).toString();
         if(Status.equals("true")){
             Status="false";
                  try{
                 int a=JOptionPane.showConfirmDialog(null, "Do you want to the Status of"+Email+"","Select",JOptionPane.YES_NO_OPTION);
                 if(a==0){
                     InsertUpdatedelete.setData("update users set Status='"+Status+"' where Email='"+Email+"'", "Status Changed Successfully");
                     setVisible(false);
                     new Adminhome().setVisible(true);
                 }
             }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e );
            }}
         else{
             Status="true";
             try{
                 int a=JOptionPane.showConfirmDialog(null, "Do you want to the Status of"+Email+"","Select",JOptionPane.YES_NO_OPTION);
                 if(a==0){
                     InsertUpdatedelete.setData("update users set Status='"+Status+"' where Email='"+Email+"'", "Status Changed Successfully");
                     setVisible(false);
                     new Adminhome().setVisible(true);
                 }
             }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e );
            }
         }
    }//GEN-LAST:event_txtTableMouseClicked

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
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adminhome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Adminhome().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnlogout;
    private javax.swing.JButton clearbtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton searchbtn;
    private javax.swing.JTable txtTable;
    private javax.swing.JTextField txtsbnoem;
    // End of variables declaration//GEN-END:variables
}
