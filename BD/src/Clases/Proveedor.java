/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hectortllo
 */
public class Proveedor {
    
    private Connection con = null;
    private conexion conexion;

    public Proveedor()
    {
        conexion = new conexion();
        con = conexion.getConection();
    }
    
    public boolean insertarProveedor(String nombre, String apellido,
        int direccion, String Descripcion, String telefono, String deuda)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarProveedor(?,?,?,?,?,?)}");
            procedimiento.setString(1, nombre);
            procedimiento.setString(2, apellido);
            procedimiento.setInt(3, direccion);
            procedimiento.setString(4, Descripcion);
            procedimiento.setString(5, telefono);
            procedimiento.setFloat(6, Float.parseFloat(deuda));
            procedimiento.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
    
        public boolean insertarDireccion(String direccion)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarDireccion(?)}");
            procedimiento.setString(1, direccion);
            procedimiento.execute();
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
    }
}
