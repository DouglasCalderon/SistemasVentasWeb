/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author DOUGLAS
 */
public class Conexion {
    
    Connection con=null;
    String url="jdbc:mysql://localhost:3306/bd_ventas";
    String user="root";
    String password="";
    
    
    public Connection Conexion(){
        
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con=DriverManager.getConnection(url, user, password);
            
            
        } catch(Exception e){
            System.out.println("Error al conectar: "+e.getMessage());
        }
      return con;   
    }
   
}
