/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

//import org.apache.commons.codec.digest.DigestUtils;

/**
 *
 * @author hector
 */
//un main de prueba, para testear la conexión
public class main 
{
    public static void main(String[] args) 
    {
        conexion con = new conexion();
        con.getConection();
        //System.out.println(DigestUtils.md5Hex("Admin"));
    }
    
}
