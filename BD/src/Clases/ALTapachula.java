/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Héctor Tello, hectortllo@gmail.com
 */
public class ALTapachula {

    public ALTapachula() {
        this.idLugar = 0;
        this.Descripcion = "";
    }

    public int getLugar() {
        return idLugar;
    }

    public void setLugar(int Lugar) {
        this.idLugar = Lugar;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }  
    
    private int idLugar;
    private String Descripcion;
}
