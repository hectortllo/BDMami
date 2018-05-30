/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
public class usuario 
{
    
    private Connection con = null;
    private conexion conexion;

    public usuario() {
        conexion = new conexion();
        con = conexion.getConection();
    }
    
    public boolean crear_usuario(String name, String user, String pass)
    {
        try {
            String nombre = name;
            String usuario = user;
            String password = pass;
            
            String query = "INSERT INTO usuario(nombreusuario, password, nombre)"
                + "VALUES (?,?,?)";
            
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, usuario);
            pst.setString(2, password);
            pst.setString(3, nombre);
            int n = pst.executeUpdate();
            return n != 0;    
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //Función que verifica si ya existe algún usuario creado en la tabla 'usuario' de la BD
    public int verificarInicio()
    {
        int total = 0;
        try {
            String query = "SELECT COUNT(*) FROM usuario";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            while(rs.next())
            {
                total = rs.getInt(1);
            }
            JOptionPane.showMessageDialog(null, total);
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return total;
    }
}
