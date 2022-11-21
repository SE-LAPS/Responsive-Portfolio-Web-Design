
package mypackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;


public class contact {
    
    
    Statement st;
        
        void addcontact(String dname,String demail,String dmassage ) {
         connectToDb();
         String sql = "insert into contact(name,email,massage) VALUES ('"+dname+"','"+demail+"','"+dmassage+"')";
         
         try{
             st.executeUpdate(sql);
         } catch (SQLException ex){
             
              java.util.logging.Logger.getLogger(contact.class.getName()).log(Level.SEVERE, null, ex);
         }
     }
    
         private void connectToDb() {
        String url ="jdbc:mysql://localhost:3306/portfolio";
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection(url,"root","");
            st = con.createStatement();
         
        } catch (ClassNotFoundException|SQLException  ex) {
            
        }
}
}
