/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supergrocer;

/**
 *
 * @author HP
 */
public class SplashForm extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     * @param userid
     */
    public SplashForm() {
        initComponents();
        //jLabel1.setText("Welcome to SuperGrocer"+userid);
    }

   

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        MyProgressBar = new javax.swing.JProgressBar();
        Percentage = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 153));
        jLabel2.setText("SUPERGROCER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 190, -1, 60));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(329, 341, -1, -1));

        MyProgressBar.setBackground(new java.awt.Color(0, 0, 0));
        MyProgressBar.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(MyProgressBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 670, 990, 60));

        Percentage.setFont(new java.awt.Font("Arial Black", 1, 48)); // NOI18N
        Percentage.setForeground(new java.awt.Color(255, 51, 51));
        getContentPane().add(Percentage, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 210, 50));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 51, 51));
        jLabel5.setText("       One Stop");
        jLabel5.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 320, 280, 40));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setText("For all you needs...");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 360, 230, 30));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\OneDrive\\Documents\\NetBeansProjects\\SuperGrocer\\src\\supergrocer\\pic9.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 990, 730));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
      SplashForm Mysplash  = new SplashForm();
      Mysplash.setVisible(true);
      try{
          for(int i =0; i<=100; i++)
          {
              Thread.sleep(40);
              Mysplash.MyProgressBar.setValue(i);
              Mysplash.Percentage.setText(Integer.toString(i)+"%");
             
        
          }
      }catch(Exception e)
      {
          
      }
       new Login().setVisible(true);
       Mysplash.dispose();
      
      
       
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar MyProgressBar;
    private javax.swing.JLabel Percentage;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
