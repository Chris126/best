/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package best;
import java.lang.reflect.Constructor; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.ResultSet; 
import java.sql.SQLException; 
import java.sql.Statement; 
import javax.swing.JFrame;
/**
 *
 * @author Kalosh
 */
public class BEST {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       public Dashboard() throws SQLException { 
       initComponents(); 
       lbl_userString.setText("WELCOME, " + User.username.toUpperCase()); 
       try { 
       connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/frontdeskapplication", "chris", "password"); 
       Statement statement = connection.createStatement(); 
       ResultSet results = statement.executeQuery("select * from normalusers"); 
       while (results.next()) { 
       System.out.println("id : " + results.getString(1)); 
       System.out.println("fname : " + results.getString(2)); 
       System.out.println("lname : " + results.getString(3)); 
       System.out.println("lname : " + results.getString(4)); 
       System.out.println("lname : " + results.getString(5)); 
       System.out.println("lname : " + results.getString(6)); 

       }
       }
       
       System.out.println("Try block success"); 


 
      } catch (SQLException ex) { 


 
            System.out.println(ex.getMessage()); 


 
        } 


 
    } 


 
 


 
    /** 
 
@@ -44,13 +67,10 @@ private void initComponents() {


 
 


 
        jTable1.setModel(new javax.swing.table.DefaultTableModel( 


 
            new Object [][] { 


 
                {null, null, null, null}, 


 
                {null, null, null, null}, 


 
                {null, null, null, null}, 


 
                {null, null, null, null} 


 
 


 
            }, 


 
            new String [] { 


 
                "Title 1", "Title 2", "Title 3", "Title 4" 


 
                "Name", "Gender", "Telephone", "Date of Birth", "Age" 


 
            } 


 
        )); 


 
        jScrollPane1.setViewportView(jTable1);
    }
    
}
