
package com.javamaster.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DBConnectionConfig {
    
    public static Connection getConnection() {
        try{
            try{
                Class.forName("com.mysql.jdbc.Driver");
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(DBConnectionConfig.class.getName()).log(Level.SEVERE, null, ex);
            }
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/usuarios", "root","#SoyJacky1");
        } catch (SQLException ex) {
            Logger.getLogger(DBConnectionConfig.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
