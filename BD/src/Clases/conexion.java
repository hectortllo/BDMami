/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author hector
 */
//Clase que hace la conexión con la bd
public class conexion 
{
    private String url = "jdbc:mysql://localhost:3306/bdd_mami?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "";
    
    public Connection getConection()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
            JOptionPane.showMessageDialog(null, "Conexión exitosa");
        }catch(Exception e)
        {
            e.printStackTrace();
        }
        return con;
    }
}
