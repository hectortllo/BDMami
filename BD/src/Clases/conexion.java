/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import rojerusan.RSNotifyAnimated;

/**
 *
 * @author hector
 */
//Clase que hace la conexión con la bd
public class conexion 
{
    private String url = "jdbc:mysql://127.0.0.1:3306/bdd_mami?autoReconnect=true&useSSL=false";
    private String user = "root";
    private String password = "";
    
    public Connection getConection()
    {
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection(url, user, password);
        }catch(Exception e)
        {
            new rojerusan.RSNotifyAnimated("¡E R R O R!", "ERROR AL CONECTAR CON LA BASE DE DATOS",
                5, RSNotifyAnimated.PositionNotify.BottomRight, RSNotifyAnimated.AnimationNotify.BottomUp,
                RSNotifyAnimated.TypeNotify.ERROR).setVisible(true);
        }
        return con;
    }
}