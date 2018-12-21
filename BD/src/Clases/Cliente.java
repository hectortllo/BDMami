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
 * @author hector
 */
public class Cliente {
    private Connection con = null;
    private conexion conexion;

    public Cliente() 
    {
        conexion = new conexion();
        con = conexion.getConection();
    }
    
    public boolean insertarCliente(String nombre, String apellido,
        int direccion, String Descripcion, String telefono, String deuda)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarCliente(?,?,?,?,?,?)}");
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
    
    public DefaultComboBoxModel getDireccion(DefaultComboBoxModel modelo) {
        try {
            String sql = "SELECT direccion FROM direccion;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                modelo.addElement(rs.getString("direccion"));
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return modelo;
        }
    }
    
    public DefaultTableModel buscarClientes(String nombre, String direccion, JTable tabla) {

        try {
            String titulos[] = new String[7];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            String sql = "SELECT cliente.id AS num, cliente.nombre AS nombre, cliente.apellido AS apellido, "
                    + "telefono.telefono AS telefono, cliente.descripcion AS descrip, " +
                "direccion.direccion AS direccion, detalle_pago_venta.deuda_actual AS deuda FROM cliente " +
                "INNER JOIN direccion ON direccion.id = cliente.direccion_id INNER JOIN detalle_pago_venta ON " +
                "cliente.id = detalle_pago_venta.cliente_id INNER JOIN telefono ON telefono.cliente_id = cliente.id"
                    + " WHERE direccion.direccion LIKE '%" + direccion + "%' AND cliente.nombre LIKE '%" + nombre + 
                    "%';";
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
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
