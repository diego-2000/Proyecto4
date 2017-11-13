/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBHelper;

import Classes.Candidato;
import Coneccion.DBConexion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author DEll
 */
public class CandidatoDBHelper {
      
   private DBConexion conn;
    
    public CandidatoDBHelper()
    {
        conn = new DBConexion();
  
    }
    
       
     public int TamaCandidatoRegistro()
    {
        int i=0;
        Statement sent = conn.getStatement();
        String strSQL = "SELECT * FROM CANDIDATO";
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

    
    
    
    public CandidatoDBHelper(String user, String passw)
    {
        conn = new DBConexion(user, passw);
    }

    public boolean BorrarCandidato(String  nombreCandidato)
    {
        Statement sent = conn.getStatement();
        if (sent == null) return false;
        
        String strSQL = "DELETE FROM CANDIDATO WHERE NOMBRE='"+nombreCandidato.toUpperCase()+"'";
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
    
    public ArrayList<Candidato> GetCandidato()
    {
        ArrayList<Candidato> lista = new ArrayList<Candidato>();
        
         Statement sent = conn.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT * FROM CANDIDATO";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            while (rs.next())
            {   
                String foto=rs.getString("FOTO");
                String boleta=rs.getString("BOLETA");
                int idCandidato=rs.getInt("IDCANDIDATO");
                int teléfonoCelular=rs.getInt("TELEFONOCELULAR");
                String carrera=rs.getString("CARRERA");
                String generación=rs.getString("GENERACION");
                String temaDeTesis=rs.getString("TEMADETESIS");
                String directorDeTesis=rs.getString("DIRECTORDETESIS");
                String trabaja=rs.getString("TRABAJO");
                String lugarDeTrabajo=rs.getString("LUGARDETRABAJO");
                String horarioDeTrabajo=rs.getString("HORARIODETRABAJO");
                String admitido=rs.getString("ADMITIDO");
                String nombre=rs.getString("NOMBRE");
                String appePat=rs.getString("APELLPATERNO");
                String appmater=rs.getString("APELLMATERNO");
                String correoElectrónico=rs.getString("CORREOELECTRONICO");
                
                Candidato can = new Candidato(foto,boleta,idCandidato,teléfonoCelular,carrera,generación,temaDeTesis,directorDeTesis,trabaja,lugarDeTrabajo,horarioDeTrabajo,admitido,nombre,appePat,appmater,correoElectrónico); 
     
                lista.add(can);
               
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
    
      
    
     public boolean AgregarCandidato(Candidato candi)
    {
         Statement sent = conn.getStatement();
        if (sent == null)
            return false;
        
        String strSQL = "INSERT INTO CANDIDATO VALUES(";
        strSQL = strSQL +candi.getIdCandidato()+ ",";
        strSQL = strSQL +candi.getIdAsesor()+ ",'";
        strSQL = strSQL +candi.getNombre()+ "','";
        strSQL = strSQL +candi.getAppPaterno()+ "','";
        strSQL = strSQL +candi.getAppMaterno()+ "','";
        strSQL = strSQL +candi.getFoto()+ "','";
        strSQL = strSQL +candi.getBoleta()+ "','";
        strSQL = strSQL +candi.getCorreoElectrónico()+ "',";
        strSQL = strSQL +candi.getTeléfonoCelular()+ ",'";
        strSQL = strSQL +candi.getCarrera()+ "','";
        strSQL = strSQL +candi.getGeneración()+ "','";
        strSQL = strSQL +candi.getTemaDeTesis()+ "','";
        strSQL = strSQL +candi.getDirectorDeTesis()+ "','";
        strSQL = strSQL +candi.getTrabaja()+ "','";
        strSQL = strSQL +candi.getLugarDeTrabajo()+ "','";
        strSQL = strSQL +candi.getHorarioDeTrabajo()+ "','";
        strSQL = strSQL +candi.getAdmitido()+ "')";

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

     public ArrayList<Candidato> GetCandidatoAceptado()
    {
        ArrayList<Candidato> lista = new ArrayList<Candidato>();
        
         Statement sent = conn.getStatement();
        if (sent == null)
            return lista;
        
        String strSQL = "SELECT * FROM CANDIDATO WHERE ADMITIDO='SI'";
        try
        {
            ResultSet rs = sent.executeQuery(strSQL);
            while (rs.next())
            {   
                String foto=rs.getString("FOTO");
                String boleta=rs.getString("BOLETA");
                int idCandidato=rs.getInt("IDCANDIDATO");
                int teléfonoCelular=rs.getInt("TELEFONOCELULAR");
                String carrera=rs.getString("CARRERA");
                String generación=rs.getString("GENERACION");
                String temaDeTesis=rs.getString("TEMADETESIS");
                String directorDeTesis=rs.getString("DIRECTORDETESIS");
                String trabaja=rs.getString("TRABAJO");
                String lugarDeTrabajo=rs.getString("LUGARDETRABAJO");
                String horarioDeTrabajo=rs.getString("HORARIODETRABAJO");
                String admitido=rs.getString("ADMITIDO");
                String nombre=rs.getString("NOMBRE");
                String appePat=rs.getString("APELLPATERNO");
                String appmater=rs.getString("APELLMATERNO");
                String correoElectrónico=rs.getString("CORREOELECTRONICO");
                
                Candidato can = new Candidato(foto,boleta,idCandidato,teléfonoCelular,carrera,generación,temaDeTesis,directorDeTesis,trabaja,lugarDeTrabajo,horarioDeTrabajo,admitido,nombre,appePat,appmater,correoElectrónico); 
     
                lista.add(can);
               
            }
                        
        }
        catch(SQLException e)
        {
                System.out.println("Error: " + e.getMessage());
        }
        
        return lista;
    }
    
     
      public boolean ActualizarCandidato()
    {
        int i=0;
        int num = 0;
        Statement sent = conn.getStatement();
        if (sent == null)
            return false; 
        try
        {
            while(i<25){
            String strSQL = "UPDATE CANDIDATO SET ADMITIDO ='SI' WHERE IDCANDIDATO="+i;
            num = sent.executeUpdate(strSQL);
            i++;
            }  
        }
        catch(SQLException e)
        {
                System.out.println("Error:---> " + e.getMessage());
        }
        return num == 1;
    }
    }
    
    
     
     
    
