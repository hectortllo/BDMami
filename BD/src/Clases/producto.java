package Clases;

/**
 *
 * @author Héctor Tello, hectortllo@gmail.com
 */
public class producto {
        
    public producto()
    {
        this.nombre = "";
        this.cantidad = 0;
        this.precio = 0;
        this.costo = 0;
        this.descripcion = "";
        this.presentacion = "";
        this.Proveedor_id = 0;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getProveedor_id() {
        return Proveedor_id;
    }

    public void setProveedor_id(int Proveedor_id) {
        this.Proveedor_id = Proveedor_id;
    }
    
    private String nombre;
    private int cantidad;
    private float precio;
    private float costo;
    private String descripcion;
    private String presentacion;
    private int Proveedor_id;    
}
