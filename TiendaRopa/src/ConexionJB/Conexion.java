/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ConexionJB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author josue
 */
public class Conexion {
    
    
            public ResultSet rs=null;
            public Statement ts=null ;
            public Connection con=null;
            
            
            
    public Connection abrirOracle(){
        

    try{
        
   DriverManager.registerDriver(new oracle.jdbc.OracleDriver());
   con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","system");
   ts=con.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_UPDATABLE);
   System.out.println("La conexion se realizon con exito");
        
        
    }catch(Exception e){
        System.out.println("error de conexion: "+e.toString());
    }
      return con;
    }
 
}
