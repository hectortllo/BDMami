package Clases;

import com.mysql.jdbc.Connection;
import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

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
    
    //Función para mostrar datos en la tabla tblCompras que está en la clase gráfica Negocio.java
    public DefaultTableModel buscarVerCompras(String anio, String mes, JTable tabla) {
        try {
            String titulos[] = new String[7];
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
                sql = "SELECT compra.id AS num, DATE_FORMAT(compra.fecha,'%d/%m/%Y') AS fecha, "
                        + "compra.monto AS total, compra.monto_contado AS totalCont, " +
                    " compra.monto_credito AS totalCred, COUNT(detalle_compra.productos_id) AS productos, " +
                    "COUNT(DISTINCT proveedor_id) AS proveedores " +
                    " FROM compra INNER JOIN detalle_compra ON " +
                    " detalle_compra.compra_id = compra.id WHERE " + consultaLike1 + " GROUP BY compra.id;";
            } else if(anio.equals("Todos los años") && !mes.equals("Todos los meses")){
                sql = "SELECT compra.id AS num, DATE_FORMAT(compra.fecha,'%d/%m/%Y') AS fecha, "
                        + "compra.monto AS total, compra.monto_contado AS totalCont, " +
                    " compra.monto_credito AS totalCred, COUNT(detalle_compra.productos_id) AS productos, " +
                    "COUNT(DISTINCT proveedor_id) AS proveedores " +
                    " FROM compra INNER JOIN detalle_compra ON " +
                    " detalle_compra.compra_id = compra.id WHERE " + consultaLike2 + " GROUP BY compra.id;";
            }
            else if(!anio.equals("Todos los años") && mes.equals("Todos los meses")) {
                sql = "SELECT compra.id AS num, DATE_FORMAT(compra.fecha,'%d/%m/%Y') AS fecha, "
                        + "compra.monto AS total, compra.monto_contado AS totalCont, " +
                    " compra.monto_credito AS totalCred, COUNT(detalle_compra.productos_id) AS productos, " +
                    "COUNT(DISTINCT proveedor_id) AS proveedores " +
                    " FROM compra INNER JOIN detalle_compra ON " +
                    " detalle_compra.compra_id = compra.id WHERE " + consultaIgual1 + " GROUP BY compra.id;";
            } else {
                sql = "SELECT compra.id AS num, DATE_FORMAT(compra.fecha,'%d/%m/%Y') AS fecha, "
                        + "compra.monto AS total, compra.monto_contado AS totalCont, " +
                    " compra.monto_credito AS totalCred, COUNT(detalle_compra.productos_id) AS productos, " +
                    "COUNT(DISTINCT proveedor_id) AS proveedores " +
                    " FROM compra INNER JOIN detalle_compra ON " +
                    " detalle_compra.compra_id = compra.id WHERE " + consultaIgual2 + " GROUP BY compra.id;";
            }            
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[7];
            while (rs.next()) {
                registros[0] = rs.getString("num");
                registros[1] = rs.getString("fecha");
                registros[2] = rs.getString("total");
                registros[3] = rs.getString("totalCont");
                registros[4] = rs.getString("totalCred");
                registros[5] = rs.getString("productos");
                registros[6] = rs.getString("proveedores");
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(compra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public DefaultTableModel DetalleCompras(int compra_id, JTable tabla) {
        try {
            System.out.println("entro a detalleCompras");
            String titulos[] = new String[10];
            for (byte i = 0; i < titulos.length; i++) {
                titulos[i] = tabla.getColumnName(i);
            }
            int contador = 0;
            String sql = "SELECT productos.nombre AS nombre, productos.descripcion AS descp, "
                    + "productos.precio_compra AS precio, " +
                " productos.cantidad AS cantidad, productos.presentacion AS pres, "
                    + "productos.precio_venta AS costo, " +
                " productos.tipo_compra AS tipo, productos.finalizado AS fin, proveedor.nombre AS nombrep, " +
                " proveedor.apellido AS apellido FROM productos INNER JOIN detalle_compra ON " +
                " productos.id = detalle_compra.productos_id INNER JOIN proveedor " +
                " ON proveedor.id = detalle_compra.proveedor_id "
                    + "WHERE detalle_compra.compra_id = " + compra_id + ";";
            
            DefaultTableModel modelo = new DefaultTableModel(null, titulos);
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String registros[] = new String[10];
            String nombreCompleto = "";
            boolean tipo, finalizado = false;
            while (rs.next()) {
                contador++;
                registros[0] = String.valueOf(contador);
                registros[1] = rs.getString("nombre");
                registros[2] = rs.getString("descp");
                registros[3] = rs.getString("precio");
                registros[4] = rs.getString("cantidad");
                registros[5] = rs.getString("pres");
                registros[6] = rs.getString("costo");
                tipo = rs.getBoolean("tipo");
                if(tipo == false)
                    registros[7] = "Crédito";
                else
                    registros[7] = "Contado";
                finalizado = rs.getBoolean("fin");
                if(!finalizado)
                    registros[8] = "No pagado";
                else
                    registros[8] = "Pagado";
                nombreCompleto = rs.getString("nombrep") + " " + rs.getString("apellido");
                registros[9] = nombreCompleto;
                modelo.addRow(registros);
            }
            return modelo;
        } catch (SQLException ex) {
            Logger.getLogger(compra.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
