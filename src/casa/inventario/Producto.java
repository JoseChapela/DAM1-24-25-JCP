package casa.inventario;

import java.io.Serializable;
import java.util.Objects;

public class Producto implements Serializable{

    private int codigo;
    private String nombre;
    private int cantidad;
    private double precio;
    
    public Producto(int codigo, String nombre, int cantidad, double precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Producto p = (Producto) obj;
        if (this.codigo==p.codigo)
            return true;
        return false;
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigo);
    }

    @Override
    public String toString() {
        return codigo+" - "+nombre+" ("+cantidad+")";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    
}
