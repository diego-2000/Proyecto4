/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Coneccion;
import java.sql.*;
import javax.sql.*;


/**
 *
 * @author Clases
 */
public class DBConexion {
    String url;
    static String user = "system";
    static String pass = "oracle";
    
    static Connection conn = null;
    
    public DBConexion()
    {
        this(user, pass);
    }
    public  DBConexion(String user, String pass)
    {
       
        url = "jdbc:oracle:thin:@localhost:1521:XE";
        
        if (conn == null)
        {
                try
                {
                    Class.forName("oracle.jdbc.OracleDriver");
                    DBConexion.user = user;
                    DBConexion.pass = pass;
                    conn = DriverManager.getConnection(url, user, pass);
                }
                catch(SQLException e)
                {
                    System.out.println("ERROR: " + e.getMessage());
                }
                catch(Exception e)
                {
                    System.out.println("ERROR: " + e.getMessage());
                }
            
        }   
        else
        {
            try
            {
            
                conn.close();
                DBConexion.user = user;
                DBConexion.pass = pass;
                conn = DriverManager.getConnection(url, user, pass);
            }
            catch(SQLException e)
            {
                System.out.println("ERROR: " + e.getMessage());
            }
            
        }
        
    }
    
    public Statement getStatement()
    {
        try 
        {
        if (!conn.isClosed())
            return conn.createStatement();
        else
            return null;
        }
        catch(SQLException e)
        {
                System.out.println("ERROR: " + e.getMessage());
        }
        return null;
    }
    static String getUser()
    {
        return user;
    }
    
    static String getURL()
    {
        return user;
    }
    
    public Connection getConexion()
    {
        return conn;
    }
    
    public void  closeConexion()
    {
        try {
            if (conn != null && !conn.isClosed())
                conn.close();
        }
        catch(SQLException e)
        {
            System.out.println("ERROR: "+e.getMessage());
        }
    }
    
}
