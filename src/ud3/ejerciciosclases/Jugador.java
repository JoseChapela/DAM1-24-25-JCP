/**EP0717. Jugador. Queremos gestionar la plantilla de un equipo de fútbol. Para ello vamos a crear la clase Jugador. De cada jugador se guarda el DNI, el nombre, la posición en el campo - para simplificar, los jugadores pueden ser porteros, defensas, centrocampistas y delanteros - y su estatura. Define la clase Jugador y un enumerado para la posición en el campo. Implementa un método para mostrar la ficha de un jugador y constructores variados que permitan crear: 
jugadores sólo con nombre.
jugadores con nombre y posición
jugadores con todos los datos.

Crea getters que permitan recuperar los atributos de los jugadores. Crea un método que permita cambiar a un jugador de posición.

Crea un pequeño programa principal con ejemplos de uso de la clase Jugador.

 */

package ud3.ejerciciosclases;

public class Jugador {

    private String dni;
    private String nombre;
    enum Position {PORTERO, DEFENSA, CENTROCAMPISTA, DELANTERO}
    private Position position;
    private double estatura;

    //CONSTRUCTORES

    Jugador(String dni, String nombre, Position position, double estatura) {

        this.dni = dni;
        this.nombre = nombre;
        this.position = position;
        this.estatura = estatura;
    }

    Jugador (String nombre) {

        this.nombre = nombre;
    }

    Jugador (String nombre, Position position) {

        this.position = position;
    }

    //MÉTODOS
    
    public void setPosition( Position position) {

        this.position = position;
    }

    public String getDni() {
        return dni;
    }

    public String getNombre() {
        return nombre;
    }

    public Position getPosition() {
        return position;
    }

    public double getEstatura() {
        return estatura;
    }
}