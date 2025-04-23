package ud6.ejercicios.ep1237;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;

public class Jugador {

    String dni;
    String nombre;
    enum Posicion {portero, defensa, centrocampista, delantero};
    Posicion posicion;
    double estatura;



    public Jugador(String dni, String nombre, Posicion posicion, double estatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.posicion = posicion;
        this.estatura = estatura;
    }

    public static void main(String[] args) {
        
        Map<Integer, Jugador> plantilla = new HashMap<>();
        plantilla.put(10, new Jugador("1", "Jose", Posicion.centrocampista, 1.74));
    }
    
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {

        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        return plantilla.remove(dorsal);
    }
}
