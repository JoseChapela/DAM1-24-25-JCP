package ud5.practicas.Inmobiliaria;

abstract public class Inmueble {

    String direccion;
    int metrosCuadrados;
    int numHabitaciones;
    int numBanhos;
    int precioAlquiler;
    int precioVenta;

    //CONSTRUCTORES

    public Inmueble(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos) {
        this.direccion = direccion;
        this.metrosCuadrados = metrosCuadrados;
        this.numHabitaciones = numHabitaciones;
        this.numBanhos = numBanhos;
    }

    //MÉTODOS

    abstract String detalle();

    public void setPrecioAlquiler(int precioAlquiler) {
        this.precioAlquiler = precioAlquiler;
    }

    public void setPrecioVenta(int precioVenta) {
        this.precioVenta = precioVenta;
    }

    @Override
    public String toString() {
        
        return "Inmueble en " + direccion + " ( " + metrosCuadrados + " m2, " + numHabitaciones + " hab)";
    }    
}
