package ud3.ejerciciosclases;

import java.sql.Time;
import java.time.LocalTime;
import java.time.chrono.ChronoLocalDateTime;

public class PuntoGeografico {

    private String latitud;
    private String longitud;
    private String nombre;

    //CONSTRUCTORES

    PuntoGeografico(String nombre, String latitud, String longitud) {

        this.latitud = latitud;
        this.longitud = longitud;
        
    }

    public static void main(String[] args) {
        
        PuntoGeografico punto = new PuntoGeografico("Jose", "50'23'22'", "22'22'22'");


    }
    
}
