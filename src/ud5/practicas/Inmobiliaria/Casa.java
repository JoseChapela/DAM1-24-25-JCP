package ud5.practicas.Inmobiliaria;

public class Casa extends Inmueble {

    int terreno;

    //CONSTRUCTORES

    public Casa(String direccion, int metrosCuadrados, int numHabitaciones, int numBanhos, int terreno) {

        super(direccion, metrosCuadrados, numHabitaciones, numBanhos);
        this.terreno = terreno;
    }

    //MÉTODOS

    String detalle() {

        String cad = "Casa en " + direccion + ".\n" +
        metrosCuadrados + " m2, " + numHabitaciones + " hab, " + numBanhos + " baños, con terreno de " + terreno + " m2.";

        if (precioAlquiler != 0) cad = cad + "\nPrecio de Alquiler: " + precioAlquiler + " euros";
        if (precioVenta != 0) cad = cad + "\nPrecio de Venta: " + precioVenta + " euros";

        return cad;
    }
    
}
