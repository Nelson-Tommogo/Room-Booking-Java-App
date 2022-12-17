/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mycafe;
import project.*;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author TOMMOGO
 */
public class ManageRoom extends javax.swing.JFrame {

    /**
     * Creates new form ManageRoom
     */
    public ManageRoom() {
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

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txttable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtrn = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtcombotype = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtprice = new javax.swing.JTextField();
        txtcombobed = new javax.swing.JComboBox<>();
        btnAddroom = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(50, 118));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/manage room.png"))); // NOI18N
        jLabel1.setText("Manage Room");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(31, 28, -1, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/close_1.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 10, -1, -1));

        txttable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Room Number", "Room Type", "Bed", "Price", "Status"
            }
        ));
        txttable.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                txttableComponentShown(evt);
            }
        });
        jScrollPane1.setViewportView(txttable);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 500, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Room Number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 100, -1, -1));

        txtrn.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtrn, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 240, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Room Type");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 210, -1, -1));

        txtcombotype.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        txtcombotype.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " AC", "Non-AC" }));
        getContentPane().add(txtcombotype, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 260, 210, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Bed");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 310, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, -1, -1));

        txtprice.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 200, -1));

        txtcombobed.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Single", "Double" }));
        getContentPane().add(txtcombobed, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 350, 200, -1));

        btnAddroom.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnAddroom.setForeground(new java.awt.Color(102, 0, 0));
        btnAddroom.setText("Add Room");
        btnAddroom.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddroomActionPerformed(evt);
            }
        });
        getContentPane().add(btnAddroom, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddroomActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddroomActionPerformed
        // TODO add your handling code here:
        String RoomNo=txtrn.getText();
        String RoomType=(String) txtcombotype.getSelectedItem();
        String Bed=(String) txtcombobed.getSelectedItem();
        String Price=txtprice.getText();
        String Query="insert into Room VALUES('"+RoomNo+"','"+RoomType+"','"+Bed+"','"+Price+"','Not Booked')";
        InsertUpdatedelete.setData(Query, "Successfully updated");
        setVisible(false);
        new ManageRoom().setVisible(true);
    }//GEN-LAST:event_btnAddroomActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        ResultSet rs=select.getData("Select *from Room");
        DefaultTableModel model=(DefaultTableModel)txttable.getModel();
        try
        {
             while (rs.next()){
                model.addRow(new Object[]{rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),});
                //rs.close();
            }
             rs.close();
        }
            catch(Exception e){
                    JOptionPane.showMessageDialog(null, e);
                    }
        
    }//GEN-LAST:event_formComponentShown

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
{
    //System.exit(0);
    
}
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txttableComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_txttableComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_txttableComponentShown

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
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageRoom.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageRoom().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddroom;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> txtcombobed;
    private javax.swing.JComboBox<String> txtcombotype;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtrn;
    private javax.swing.JTable txttable;
    // End of variables declaration//GEN-END:variables
}