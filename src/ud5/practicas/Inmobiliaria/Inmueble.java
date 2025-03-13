package ud5.practicas.Inmobiliaria;

import java.util.Arrays;

abstract public class Inmueble implements Comparable {

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
    
    static void mostrarInmuebles(Inmueble[] t) {

        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i]);
        }
    }

    @Override
    public int compareTo( Object o) {

        return direccion.compareTo(((Inmueble)o).direccion);
    }

    static void sortMetrosDesc(Inmueble[] t) {

        Arrays.sort(t, new ComparadorTamanho().reversed());
    }

    static void sortHabMetrosDesc(Inmueble[] t) {

        Arrays.sort(t, new ComparadorHab());
    }

    static void sortPrecioAlquilerAsc(Inmueble[] t) {

        Arrays.sort(t, new ComparadorPrecio());
    }

    static void sortPrecioVentaAsc(Inmueble[] t) {

        Arrays.sort(t, new ComparadorPrecioVenta());
    }
    
}
