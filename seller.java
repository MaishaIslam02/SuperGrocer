/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supergrocer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import net.proteanit.sql.DbUtils;
/**
 *
 * @author mY
 */
public class seller extends javax.swing.JFrame {

    /**
     * Creates new form seller
     */
    public seller() {
        initComponents();
        Selectseller();
    }

    Connection Con = null;
    Statement St = null;
    ResultSet Rs = null;
    public void Selectseller()
    {
        try
        {
        Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345");
        St = Con.createStatement();
        Rs = St.executeQuery("Select * from User1.SellerTBL");
        SellerTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(Exception e)
        {
         e.printStackTrace();   
        }
    }
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SellId = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        GenderCb = new javax.swing.JComboBox<>();
        DelBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        EdBtn = new javax.swing.JButton();
        ClBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SellerTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        SellPass = new javax.swing.JTextField();
        SellName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 200, 200));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 105, 105));
        jLabel2.setText("MANAGE SELLERS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 30, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setText("Seller ID");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 130, -1, -1));
        jPanel2.add(SellId, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 130, 168, 33));

        jLabel5.setBackground(new java.awt.Color(0, 200, 200));
        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setText("Name");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 200, 80, -1));

        jLabel6.setBackground(new java.awt.Color(0, 200, 200));
        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel6.setText("Password");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 130, -1, -1));

        jLabel8.setBackground(new java.awt.Color(0, 200, 200));
        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setText("Gender");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 200, -1, -1));

        GenderCb.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        GenderCb.setForeground(new java.awt.Color(255, 102, 102));
        GenderCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female", " " }));
        jPanel2.add(GenderCb, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 200, 168, 33));

        DelBtn.setBackground(new java.awt.Color(255, 51, 51));
        DelBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DelBtn.setText("Delete");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        jPanel2.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 85, 33));

        AddBtn.setBackground(new java.awt.Color(255, 102, 102));
        AddBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 85, 33));

        EdBtn.setBackground(new java.awt.Color(255, 51, 51));
        EdBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EdBtn.setText("Edit");
        EdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdBtnMouseClicked(evt);
            }
        });
        jPanel2.add(EdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 290, 85, 33));

        ClBtn.setBackground(new java.awt.Color(255, 51, 51));
        ClBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClBtn.setText("Clear");
        ClBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 290, 85, 33));

        SellerTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        SellerTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Password", "Gender"
            }
        ));
        SellerTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        SellerTable.setRowHeight(25);
        SellerTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SellerTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(SellerTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 819, 246));

        jLabel4.setBackground(new java.awt.Color(255, 255, 204));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("SELLERS LIST");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 360, -1, -1));
        jPanel2.add(SellPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 130, 168, 33));

        SellName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SellNameActionPerformed(evt);
            }
        });
        jPanel2.add(SellName, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 168, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\SuperGrocer\\src\\supergrocer\\pic10.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 670));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, -5, 990, 670));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SellNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SellNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SellNameActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(SellId.getText().isEmpty()|| SellName.getText().isEmpty() || SellPass.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!!");
        }
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345");
            PreparedStatement add = Con.prepareStatement("insert into SELLERTBL values(?,?,?,?)");
            add.setInt(1,Integer.valueOf(SellId.getText()));
            add.setString(2,(SellName.getText()));
            add.setString(3,(SellPass.getText())); 
            add.setString(4,GenderCb.getSelectedItem().toString());
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Seller Added Successfully!");
            Con.close();
            Selectseller();
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void SellerTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SellerTableMouseClicked
        DefaultTableModel model = (DefaultTableModel)SellerTable.getModel();
        int Myindex = SellerTable.getSelectedRow();
        SellId.setText(model.getValueAt(Myindex, 0).toString());
        SellName.setText(model.getValueAt(Myindex, 1).toString());
        SellPass.setText(model.getValueAt(Myindex, 2).toString());
        
    }//GEN-LAST:event_SellerTableMouseClicked

    private void ClBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClBtnMouseClicked
       SellId.setText("") ;
       SellName.setText("");
       SellPass.setText("");
    }//GEN-LAST:event_ClBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(SellId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the seller to be deleted");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345");
                String SId = SellId.getText();
                String Query = "Delete from User1.SELLERTBL WHERE SELLID="+SId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                Selectseller();
                JOptionPane.showMessageDialog(this, "Seller Successfully Deleted!");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void EdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdBtnMouseClicked
        if(SellId.getText().isEmpty()||SellName.getText().isEmpty()||SellPass.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else
        {
            try
            {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345"); 
                String Query ="Update User1.SELLERTBL set SELLNAME='"+SellName.getText()+"'"+",SELLPASS ='"+SellPass.getText()+"'"+",SELLGENDER='"+GenderCb.getSelectedItem().toString()+"'"+"where SELLID="+SellId.getText();
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                JOptionPane.showMessageDialog(this, "Seller Updated!!");
                Selectseller();
            }
            catch(SQLException e)
            {
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_EdBtnMouseClicked

    
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
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(seller.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new seller().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JButton ClBtn;
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton EdBtn;
    private javax.swing.JComboBox<String> GenderCb;
    private javax.swing.JTextField SellId;
    private javax.swing.JTextField SellName;
    private javax.swing.JTextField SellPass;
    private javax.swing.JTable SellerTable;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

    
   
}
