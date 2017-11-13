/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBHelper;

import Classes.Asesor;
import Coneccion.DBConexion;

import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class AsesorDBHelper {
    private DBConexion conn;
    
    public AsesorDBHelper()
    {
        conn = new DBConexion();
    }
    
    public AsesorDBHelper(String user, String passw)
    {
        conn = new DBConexion(user, passw);
    }

    public boolean BorrarAsesor(String  nombreAsesor)
    {
        Statement sent = conn.getStatement();
        if (sent == null) return false;
        
        String strSQL = "DELETE FROM ASESOR WHERE NOMBRE='"+nombreAsesor.toUpperCase()+"'";
        int num = 0;

        try
        {
            num = sent.executeUpdate(strSQL);
        }
        catch(SQLException e)
        {
                System.out.println("Error: " + e.getMessage());
        }
         return num == 1;
    }
    
    public ArrayList<Asesor> GetAsesor()
    {
        ArrayList<Asesor> lista = new ArrayList<Asesor>();
        
         Statement sent = conn.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT * FROM ASESOR";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            while (rs.next())
            {   
                int idAsesor=rs.getInt("IDASESOR");
                String cubiculo=rs.getString("CUBICULO");
                String horarioDeAsesorías=rs.getString("HORARIODEASESORIA");
                String nombre=rs.getString("NOMBRE");
                String appePat=rs.getString("APELLPATERNO");
                String appmater=rs.getString("APELLMATERNO");
                String correoElectrónico=rs.getString("CORREOELECTRONICO");
                
                Asesor ase =new Asesor(idAsesor,cubiculo, horarioDeAsesorías,nombre,appePat,appmater,correoElectrónico);

                lista.add(ase);
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
  
    public boolean AgregarAsesor(Asesor ase)
    {
         Statement sent = conn.getStatement();
        if (sent == null)
            return false;
        
        String strSQL = "INSERT INTO ASESOR VALUES(";
        strSQL = strSQL +ase.getIdAsesor()+ ",'";
        strSQL = strSQL +ase.getNombre()+ "','";
        strSQL = strSQL +ase.getAppPaterno()+ "','";
        strSQL = strSQL +ase.getAppMaterno()+ "','";
        strSQL = strSQL +ase.getCubículo()+ "','";
        strSQL = strSQL +ase.getCorreoElectrónico()+ "','";
        strSQL = strSQL +ase.getHorarioDeAsesorías()+ "')";

        int num = 0;
        try
        {
            num = sent.executeUpdate(strSQL);
        }
        catch(SQLException e)
        {
                System.out.println("Error: " + e.getMessage());
        }
        return num == 1;  
    }

     public int TamañoRegistroAsesor()
    {
        int i=0;
        Statement sent = conn.getStatement();
        String strSQL = "SELECT * FROM ASESOR";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            while (rs.next())
                i++;            
        }
        catch(SQLException e){
            System.out.println("Error: " + e.getMessage());
        }
        return i;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
