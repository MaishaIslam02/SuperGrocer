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
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author mY
 */
public final class Category extends javax.swing.JFrame {

    /**
     * Creates new form Category
     */
    public Category() {
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
        Rs = St.executeQuery("Select * from User1.CATEGORYTABLE");
        CatTable.setModel(DbUtils.resultSetToTableModel(Rs));
        }
        catch(SQLException e)
        {
         e.printStackTrace();   
        }
    }
    
    
    
    
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLable22 = new javax.swing.JLabel();
        CatId = new javax.swing.JTextField();
        jLable23 = new javax.swing.JLabel();
        DelBtn = new javax.swing.JButton();
        AddBtn = new javax.swing.JButton();
        EdBtn = new javax.swing.JButton();
        ClrrBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        CatTable = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        CatDesc = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        CatName = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 200, 200));
        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 51));
        jLabel2.setText("CATEGORIES");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 30, -1, -1));

        jLable22.setBackground(new java.awt.Color(0, 200, 200));
        jLable22.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLable22.setForeground(new java.awt.Color(51, 51, 51));
        jLable22.setText("CatID");
        jPanel2.add(jLable22, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 100, -1, -1));
        jPanel2.add(CatId, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 100, 168, 33));

        jLable23.setBackground(new java.awt.Color(0, 200, 200));
        jLable23.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLable23.setForeground(new java.awt.Color(51, 51, 51));
        jLable23.setText("Description");
        jPanel2.add(jLable23, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 100, -1, -1));

        DelBtn.setBackground(new java.awt.Color(255, 51, 51));
        DelBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        DelBtn.setText("Delete");
        DelBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DelBtnMouseClicked(evt);
            }
        });
        jPanel2.add(DelBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 260, 85, 33));

        AddBtn.setBackground(new java.awt.Color(255, 51, 51));
        AddBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AddBtn.setText("Add");
        AddBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AddBtnMouseClicked(evt);
            }
        });
        AddBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddBtnActionPerformed(evt);
            }
        });
        jPanel2.add(AddBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 85, 33));

        EdBtn.setBackground(new java.awt.Color(255, 51, 51));
        EdBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        EdBtn.setText("Edit");
        EdBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                EdBtnMouseClicked(evt);
            }
        });
        jPanel2.add(EdBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 85, 33));

        ClrrBtn.setBackground(new java.awt.Color(255, 51, 51));
        ClrrBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        ClrrBtn.setText("Clear");
        ClrrBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ClrrBtnMouseClicked(evt);
            }
        });
        jPanel2.add(ClrrBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 260, 85, 33));

        CatTable.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        CatTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Name", "Description"
            }
        ));
        CatTable.setIntercellSpacing(new java.awt.Dimension(0, 0));
        CatTable.setRowHeight(25);
        CatTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CatTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(CatTable);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 440, 819, 130));

        jLabel4.setBackground(new java.awt.Color(0, 200, 200));
        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 51, 51));
        jLabel4.setText("CATEGORY LIST");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 380, -1, -1));
        jPanel2.add(CatDesc, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 100, 168, 33));

        jLabel24.setBackground(new java.awt.Color(0, 200, 200));
        jLabel24.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("Name");
        jPanel2.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, -1, -1));
        jPanel2.add(CatName, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 190, 168, 33));

        jButton1.setBackground(new java.awt.Color(255, 51, 51));
        jButton1.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jButton1.setText("Next");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 600, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\SuperGrocer\\src\\supergrocer\\pic10.jpg")); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 726, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         seller s = new seller();
         s.show();
         dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void AddBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddBtnActionPerformed
        
    }//GEN-LAST:event_AddBtnActionPerformed

    private void AddBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddBtnMouseClicked
        if(CatId.getText().isEmpty()|| CatName.getText().isEmpty() || CatDesc.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Missing Information!!");
        }
        try{
            Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345");
            PreparedStatement add = Con.prepareStatement("insert into CATEGORYTABLE values(?,?,?)");
            add.setInt(1,Integer.valueOf(CatId.getText()));
            add.setString(2,(CatName.getText()));
            add.setString(3,(CatDesc.getText())); 
   
            int row = add.executeUpdate();
            JOptionPane.showMessageDialog(this, "Category Added Successfully!");
            Con.close();
            Selectseller();
        }catch(Exception e){
            e.printStackTrace();
            
        }
    }//GEN-LAST:event_AddBtnMouseClicked

    private void CatTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CatTableMouseClicked
        
    }//GEN-LAST:event_CatTableMouseClicked

    private void ClrrBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ClrrBtnMouseClicked
        CatId.setText("");
        CatName.setText("");
        CatDesc.setText("");
    }//GEN-LAST:event_ClrrBtnMouseClicked

    private void DelBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DelBtnMouseClicked
        if(CatId.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Enter the category to be deleted");
        }
        else
        {
            try{
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345");
                String CId = CatId.getText();
                String Query = "Delete from User1.CATEGORYTABLE WHERE CATID="+CId;
                Statement Add = Con.createStatement();
                Add.executeUpdate(Query);
                Selectseller();
                JOptionPane.showMessageDialog(this, "Category Successfully Deleted!");
                
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }//GEN-LAST:event_DelBtnMouseClicked

    private void EdBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_EdBtnMouseClicked
             if(CatId.getText().isEmpty()||CatName.getText().isEmpty()||CatDesc.getText().isEmpty())
        {
         JOptionPane.showMessageDialog(this,"Missing Information");
        }
        else
        {
            try
            {
                Con = DriverManager.getConnection("jdbc:derby://localhost:1527/SuperMarketdb","User1", "12345"); 
                String Query ="Update User1.CATEGORYTABLE set CATNAME='"+CatName.getText()+"'"+",CATDESC ='"+CatDesc.getText()+"'"+"where SELLID="+CatId.getText();
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
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Category.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Category().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AddBtn;
    private javax.swing.JTextField CatDesc;
    private javax.swing.JTextField CatId;
    private javax.swing.JTextField CatName;
    private javax.swing.JTable CatTable;
    private javax.swing.JButton ClrrBtn;
    private javax.swing.JButton DelBtn;
    private javax.swing.JButton EdBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLable22;
    private javax.swing.JLabel jLable23;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

  
}
