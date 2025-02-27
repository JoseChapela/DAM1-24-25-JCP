package ud5.practicas.Inmobiliaria;

public class Piso extends Inmueble {

    int numPiso;

    //CONSTRUCORES

    public Piso(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos, int numPiso) {
        
        super(direccion, metrosCuadrados, numHabitaciones, numBanhos);
        this.numPiso = numPiso;
    } 

    //MÉTODODS
    
    String detalle() {

        String cad = "Piso en " + direccion + ".\n" +
        metrosCuadrados + " m2, " + numHabitaciones + " hab, " + numBanhos + " baños, " + numPiso + "ª planta.";

        if (precioAlquiler != 0) cad = cad + "\nPrecio de Alquiler: " + precioAlquiler + " euros";
        if (precioVenta != 0) cad = cad + "\nPrecio de Venta: " + precioVenta + " euros";

        return cad;
    }
}
