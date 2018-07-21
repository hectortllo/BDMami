package Clases;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;

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
            if(deuda.length() == 0)
            {
                //Si el campo deuda está vacío significa que el cliente compró al contado
                CallableStatement procedimiento = con.prepareCall("{call InsertarClienteNuevo(?,?,?,?,?)}");
                procedimiento.setString(1, nombre);
                procedimiento.setString(2, apellido);
                procedimiento.setInt(3, direccion);
                procedimiento.setString(4, Descripcion);
                procedimiento.setString(5, telefono);
                procedimiento.execute();
            }
            else
            {
                //Si el campo deuda no está vacío significa que el cliente compró al crédito
                CallableStatement procedimiento = con.prepareCall("{call InsertarCliente(?,?,?,?,?,?)}");
                procedimiento.setString(1, nombre);
                procedimiento.setString(2, apellido);
                procedimiento.setInt(3, direccion);
                procedimiento.setString(4, Descripcion);
                procedimiento.setString(5, telefono);
                procedimiento.setFloat(6, Float.parseFloat(deuda));
                procedimiento.execute();
            }
        } catch (SQLException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        return true;
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
    
}
