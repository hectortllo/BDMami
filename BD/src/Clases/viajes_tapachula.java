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

/**
 *
 * @author Héctor Tello, hectortllo@gmail.com
 */
public class viajes_tapachula {

    private Connection con = null;
    private conexion conexion;

    public viajes_tapachula() {
        conexion = new conexion();
        con = conexion.getConection();
    }
    
    public DefaultComboBoxModel getDireccion(DefaultComboBoxModel modelo) {
        try {
            String sql = "SELECT lugar FROM lugar_tapachula;";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                modelo.addElement(rs.getString("lugar"));
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(viajes_tapachula.class.getName()).log(Level.SEVERE, null, ex);
            return modelo;
        }
    }
    
    public boolean insertarLugar(String lugar)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarLugar(?)}");
            procedimiento.setString(1, lugar);
            return !procedimiento.execute() == true;
        } catch (SQLException ex) {
            Logger.getLogger(viajes_tapachula.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean insertarFechaViaje(String fecha)
    {
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarFechaViajeTapachula(?)}");
            procedimiento.setString(1, fecha);
            return !procedimiento.execute() == true;
        } catch (SQLException ex) {
            Logger.getLogger(viajes_tapachula.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
    
    public boolean insertarDetalleTapachula(int lugarId, String descripcion){
        try {
            CallableStatement procedimiento = con.prepareCall("{call InsertarViajeTapachula(?, ?)}");
            procedimiento.setInt(1, lugarId);
            procedimiento.setString(2, descripcion);
            return !procedimiento.execute() == true;
        } catch (SQLException ex) {
            Logger.getLogger(viajes_tapachula.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }
}
