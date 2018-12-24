/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
            return !procedimiento.execute() == true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean insertarDireccion(String direccion)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarDireccion(?)}");
            procedimiento.setString(1, direccion);
            return !procedimiento.execute() == true;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public DefaultComboBoxModel getProveedor(DefaultComboBoxModel modelo) {
        try {
            String sql = "SELECT nombre FROM proveedor;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                modelo.addElement(rs.getString("nombre"));
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return modelo;
        }
    }
    
    public DefaultTableModel buscarProveedores(String nombre, String direccion, JTable tabla) {
        try {
            String titulos[] = new String[7];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            String sql = "SELECT proveedor.id AS num, proveedor.nombre AS nombre, proveedor.apellido AS apellido, "
                    + "proveedor.descripcion AS descrip, " +
                    "direccion.direccion AS direccion, detalle_pago_compra.deuda_actual AS deuda, "
                    + "telefono.telefono AS telefono " +
                    "FROM proveedor INNER JOIN direccion ON direccion.id = proveedor.direccion_id "
                    + "INNER JOIN detalle_pago_compra " +
                    " ON detalle_pago_compra.proveedor_id = proveedor.id INNER JOIN telefono ON "
                    + " telefono.proveedor_id = proveedor.id WHERE direccion.direccion LIKE '%" + direccion + "%'"
                    + "AND proveedor.nombre LIKE '%" + nombre + "%'";
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[7];
            while (rs.next()) {
                registros[0] = rs.getString("num");
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("apellido");
                registros[3] = rs.getString("telefono");
                registros[4] = rs.getString("descrip");
                registros[5] = rs.getString("direccion");
                registros[6] = "Q." + rs.getString("deuda");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
