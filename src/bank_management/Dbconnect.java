package bank_management;

import java.sql.*;
import javax.swing.JOptionPane;

public class Dbconnect {
    static String url = "jdbc:mysql://localhost:3306/bank_system"; 
    static String user = "root";
    static String password = "root"; 

    public static Connection dbconnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            Connection conn = DriverManager.getConnection(url, user, password);
            return conn;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return null;
    }
}

