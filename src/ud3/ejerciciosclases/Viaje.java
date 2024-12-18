package ud3.ejerciciosclases;

import java.time.LocalDateTime;

public class Viaje {

    private User conductor;
    private LocalDateTime startTime;
    private PuntoGeografico startPoint;
    private int numPlazas;

    //CONSTRUCTOR

    Viaje (User conductor, LocalDateTime startTime, PuntoGeografico startPoint, int numPlazas) {

        this.conductor = conductor;
        this.startTime = startTime;
        this.startPoint = startPoint;
        this.numPlazas = numPlazas;

    }

    //MÉTODOS

    public void mostrar () {

        System.out.println("************************************");
        System.out.println("Conductor: " + conductor.getUsername());
        System.out.println("Comienzo: " + startTime);
        System.out.println("Punto de recogida:");
        startPoint.mostrar();
        System.out.println("Número de plazas: " + numPlazas);
        System.out.println("************************************");
    }

    public User getConductor() {
        return conductor;
    }

    public void setConductor(User conductor) {
        this.conductor = conductor;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public PuntoGeografico getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(PuntoGeografico startPoint) {
        this.startPoint = startPoint;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }
    
}
