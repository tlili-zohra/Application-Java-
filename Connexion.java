package Application1;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;



public class Connexion {
    
    String driver = "com.mysql.jdbc.Driver";
    String url = "jdbc:mysql://localhost:3306/projetjava";
    String username = "root";
    String password = "";
    Connection conn;
    
    PreparedStatement st;
    ResultSet rs;
    
    public Connexion(){
        
        try {    
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(Connexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
        
    }
    
    public Connection getconnexion(){
        return conn;
    }






    

}

