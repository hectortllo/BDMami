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
    
    public DefaultTableModel buscarViajeTapachula(String anio, String mes, JTable tabla) {
        try {
            String titulos[] = new String[3];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            /*
                consultaLike1 -> anio en todos los años y mes en todos los meses
                consultaLike2 -> anio en todos los años y mes en !todos los meses
                consultaIgual1 -> anio en !todos los años y mes en todos los meses
                consultaIgual2 -> anio en !todos los años y mes en !todos los meses
            */
            String consultaLike1 = " MONTH(fecha) LIKE '%" + "" + "%' AND YEAR(fecha) LIKE '%" + "" + "%'";
            String consultaLike2 = " MONTH(fecha) = " + mes + " AND YEAR(fecha) LIKE '%" + "" + "%'";
            String consultaIgual1 = " MONTH(fecha) LIKE '%" + "" + "%' AND YEAR(fecha) = " + anio;
            String consultaIgual2 = " MONTH(fecha) = " + mes + " AND YEAR(fecha) = " + anio;
            String sql = "";
            if(mes.equals("Todos los meses") && anio.equals("Todos los años")){
                sql = "SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, "
                        + " COUNT(detalle_tapachula.lugar_tapachula_id)" +
                        " AS lugares FROM viajes_tapachula INNER JOIN detalle_tapachula " +
                        " ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id WHERE "
                        +consultaLike1+ " GROUP BY viajes_tapachula.id;";
            } else if(anio.equals("Todos los años") && !mes.equals("Todos los meses")){
                sql = "SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, "
                        + " COUNT(detalle_tapachula.lugar_tapachula_id)" +
                        " AS lugares FROM viajes_tapachula INNER JOIN detalle_tapachula " +
                        " ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id WHERE "
                        +consultaLike2+ " GROUP BY viajes_tapachula.id;";
            }
            else if(!anio.equals("Todos los años") && mes.equals("Todos los meses")) {
                sql = "SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, "
                        + " COUNT(detalle_tapachula.lugar_tapachula_id)" +
                        " AS lugares FROM viajes_tapachula INNER JOIN detalle_tapachula " +
                        " ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id WHERE "
                        +consultaIgual1+ " GROUP BY viajes_tapachula.id;";
            } else {
                sql = "SELECT viajes_tapachula.id AS num, viajes_tapachula.fecha AS fecha, "
                        + " COUNT(detalle_tapachula.lugar_tapachula_id)" +
                        " AS lugares FROM viajes_tapachula INNER JOIN detalle_tapachula " +
                        " ON viajes_tapachula.id = detalle_tapachula.viajes_tapachula_id WHERE "
                        +consultaIgual2+ " GROUP BY viajes_tapachula.id;";
            }            
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[3];
            while (rs.next()) {
                registros[0] = rs.getString("num");
                registros[1] = rs.getString("fecha");
                registros[2] = rs.getString("lugares");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(viajes_tapachula.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    //SELECT YEAR(viajes_tapachula.fecha) AS afecha FROM viajes_tapachula GROUP BY afecha;
    public DefaultComboBoxModel getAnio(DefaultComboBoxModel modelo) {
        try {
            String sql = "SELECT YEAR(viajes_tapachula.fecha) FROM viajes_tapachula "
                    + " GROUP BY YEAR(viajes_tapachula.fecha);";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                modelo.addElement(rs.getString("YEAR(viajes_tapachula.fecha)"));
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(viajes_tapachula.class.getName()).log(Level.SEVERE, null, ex);
            return modelo;
        }
    }
}
