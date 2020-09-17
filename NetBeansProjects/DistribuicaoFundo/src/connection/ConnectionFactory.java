/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcos
 */
public class ConnectionFactory {
    
    private final String DRIVER = "com.mysql.jdbc.Driver";
    private final String URL = "jdbc:mysql://localhost:3306/fundopartidario_db";
    private final String USER = "root";
    private final String PASS = "195928";
    
    
    public Connection getConnection(){
        try{
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL,USER, PASS);
            
        }catch(ClassNotFoundException | SQLException ex){
            throw new RuntimeException("Erro na conexão: ", ex);
        }
    }
    
    
    public static void closeConnection(Connection con){
       if(con != null){
           try {
               con.close();
           } catch (SQLException ex) {
               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
           }
    }
    }
    
    
     public static void closeConnection(Connection con, PreparedStatement stmt){
         
         closeConnection(con);
         
         if(stmt != null){
            try {
               stmt.close();
           } catch (SQLException ex) {
               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
         
     }
     
     public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
         
         closeConnection(con, stmt);
         
         if(rs != null){
            try {
               rs.close();
           } catch (SQLException ex) {
               Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
           }
         }
         
     }
     
     
    
}


        