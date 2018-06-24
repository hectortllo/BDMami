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

/**
 *
 * @author hector
 */
public class usuario 
{
    
    private Connection con = null;
    private conexion conexion;
    private String nombre;
    
    public String getUsuario() {
        return nombre;
    }

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
    
    //Función que verifica que el usuario y la contraseña ingresados sean correctos
    public boolean InicioSesion(String usuario, String password)
    {
        boolean encontrado = false;
        try {
            String query = "SELECT nombre, nombreusuario, password FROM usuario WHERE "
                    + "nombreusuario ='" + usuario + "'";
            PreparedStatement pst = con.prepareStatement(query);
            ResultSet rs = pst.executeQuery();
            String contrasenia = "";
            while(rs.next())
            {
                contrasenia = rs.getString("password");
                if(contrasenia.equals(password))
                {
                    nombre = rs.getString("nombre");
                    encontrado = true;
                }
                else
                    encontrado = false;
            }
        } catch (SQLException ex) {
            Logger.getLogger(usuario.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }
}
