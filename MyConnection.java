/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package supergrocer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MyConnection {
    public static Connection connectdb(){
        Connection con = null;
        try{
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Login ","User1","12345");
            return con; 
        } catch (SQLException ex) {
            Logger.getLogger(MyConnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }
            
            
    
}
