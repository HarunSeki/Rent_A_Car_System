package newpackage;

import java.sql.*;

public class ConnectionDao {
    private static Connection con;
    
    public static Connection getConnection() {        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/rent_a_car?useUnicode=true&useLegacyDatetimeCode=false&serverTimezone=Turkey","root","");
        
        }catch(Exception e){
            e.printStackTrace();
        }
        return con;
    }   
}