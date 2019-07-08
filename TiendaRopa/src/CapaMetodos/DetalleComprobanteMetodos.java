
package CapaMetodos;

import CapaInstanciaDatos.DetalleComprobanteI;
import java.sql.Connection;
import java.sql.SQLException;

import java.sql.PreparedStatement;


public class DetalleComprobanteMetodos {
    
         public boolean agregarDetalleComprobante(DetalleComprobanteI datas, Connection con) throws SQLException {
                  
        boolean resp=false;
        
        String query="insert into system.detalle_comprobante values(?,?,?,?)";
        
        PreparedStatement ps=con.prepareStatement(query);
       
        
        ps.setString(1,datas.getCod_comprobante());
        ps.setString(2, datas.getCod_pro());
         ps.setDouble(3, datas.getPrecio());
         ps.setInt(4, datas.getCant());
         
          int x=ps.executeUpdate();
          if(x>0)
              resp=true;
         
         
        return resp;
    }

}
