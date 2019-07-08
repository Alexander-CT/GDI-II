
package Servicios;

import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import CapaMetodos.ProductoMetodo;
import CapaInstanciaDatos.ProductoI;
import ConexionJB.Conexion;
import java.sql.SQLException;

public class ServicioProducto {
    
     private Connection abrir(){
        
        Connection con=null;
        /**
         * instanciar la clase conexion
         */
        Conexion obj=new Conexion();
        con=obj.abrirOracle();
        return con;
    }
    private void cerrar(Connection con){
        try {
            con.close();
        } catch (SQLException ex) {
            Logger.getLogger(ServiciosG.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
public boolean agregarProducto(ProductoI datas){
    boolean resp=false;
    //abrir conexion
    Connection con=abrir();
    
    
    ProductoMetodo xd; 
         xd = new ProductoMetodo();
        try {
            resp=xd.agregarProductos(datas, con);
            
        } 
        catch (SQLException ex) {
            Logger.getLogger(ServicioProducto.class.getName()).log(Level.SEVERE, null, ex);
    
        }finally{
            cerrar(con);
        }
    
    
    return resp;
    
    
}    


  public ProductoI buscarClientesPorCodigo1(String cod){
       
       ProductoI pro=null;
       
       Connection con=abrir();
       
       ProductoMetodo ppdao= new  ProductoMetodo();
       
       try{
          pro = ppdao.buscarProductoPorCodigo(cod, con);
       }
       catch(SQLException ex)
       {
           Logger.getLogger(ServicioEmpleado.class.getName()).log(Level.SEVERE,null,ex);
       }
       finally{
           cerrar(con);
       }
       return pro;
   }    



}
