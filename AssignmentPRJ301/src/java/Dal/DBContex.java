/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Dal;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class DBContex {
    protected Connection connection;
    public DBContex() {
        try {
            String user = "Se1616";
            String password = "1234567";
            String url = "jdbc:sqlserver://DESKTOP-ANK1EEJ\\SQLEXPRESS:1433;databaseName=AssignmentPRJ";
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            connection = DriverManager.getConnection(url, user, password);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(DBContex.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(DBContex.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
