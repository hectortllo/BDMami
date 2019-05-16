package Clases;

/**
 *
 * @author Héctor Tello, hectortllo@gmail.com
 */
public class ALTapachula {

    public ALTapachula() {
        this.idLugar = 0;
        this.Descripcion = "";
        this.posicion = 0;
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

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    public String getNombreLugar() {
        return nombreLugar;
    }

    public void setNombreLugar(String nombreLugar) {
        this.nombreLugar = nombreLugar;
    }
    
    private int idLugar;
    private String Descripcion;
    private int posicion;
    private String nombreLugar;
}
