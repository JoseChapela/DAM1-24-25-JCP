package ud5.practicas.rol;

public class Item {

    private String nombre;
    private float peso;
    private int precio;
    
    //CONSTRUCTORES
    
    public Item(String nombre, float peso, int precio) {
        this.nombre = nombre;
        this.peso = peso;
        this.precio = precio;
    }

    //MÉTODODS

    public String getNombre() {
        return nombre;
    }
    public float getPeso() {
        return peso;
    }
    public int getPrecio() {
        return precio;
    }

    public boolean equals(Item item) {

        if (nombre != item.nombre) return false;
        if (peso != item.peso) return false;
        if (precio != item.precio) return false;
        return true;
    }
}
