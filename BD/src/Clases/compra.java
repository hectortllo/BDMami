package Clases;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Héctor Tello, hectortllo@gmail.com
 */
public class compra {
    private Connection con = null;
    private conexion conexion;

    public compra() 
    {
        conexion = new conexion();
        con = conexion.getConection();
    }
    
    //Función para insertar en la tabla compra
    public boolean insertarCompra(float total, float totalContado, float totalCredito)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{CALL InsertarCompra(?,?,?)}");
            procedimiento.setFloat(1, total);
            procedimiento.setFloat(2, totalCredito);
            procedimiento.setFloat(3, totalContado);
            return !procedimiento.execute() == true;
        } catch (SQLException ex) {
            Logger.getLogger(compra.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    //Función para insertar en la tabla productos
    public boolean insertarProductos(String nombre, int cantidad, float precio, float costo,
            String descripcion, String presentacion, int proveedorId, boolean tipoCompra, boolean finalizado){
        try {
            CallableStatement procedimiento = con.prepareCall("{CALL InsertarProducto(?,?,?,?,?,?,?,?,?)}");
            procedimiento.setString(1, nombre);
            procedimiento.setInt(2, cantidad);
            procedimiento.setFloat(3, precio);
            procedimiento.setFloat(4, costo);
            procedimiento.setString(5, descripcion);
            procedimiento.setString(6, presentacion);
            procedimiento.setInt(7, proveedorId);
            procedimiento.setBoolean(8, tipoCompra);
            procedimiento.setBoolean(9, finalizado);
            procedimiento.execute();
        } catch (SQLException ex) {
            Logger.getLogger(compra.class.getName()).log(Level.SEVERE, null, ex);
        }
        return true;
    }
}
