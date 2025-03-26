//Jose Chapela Pastoriza

package ud5.jcpexamen;

public class Servicios {

    String nombre;
    int numPuerto;
    enum Protocolo {TCP, UDP};
    Protocolo protocolo;

    public Servicios(String nombre, int numPuerto, String protocolo) {
        this.nombre = nombre;
        this.numPuerto = numPuerto;
        this.protocolo = Protocolo.valueOf(protocolo.toUpperCase());
    }

    public String toString() {

        return String.format("* " + nombre + " (" + numPuerto + "/" + protocolo + ")\n");
    }
}
