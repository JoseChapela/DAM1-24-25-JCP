package ud6.ejercicios.ep1237;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
        plantilla.put(11, new Jugador("2", "Vicente", Posicion.centrocampista, 1.72));
        plantilla.put(12, new Jugador("3", "Antonio", Posicion.delantero, 1.72));
        System.out.println("PLANTILLA");
        mostrar(plantilla);
        System.out.println("PLANTILLA POR POSICION");
        mostrar(plantilla, Posicion.centrocampista.toString());
    }

    @Override
    public String toString() {

        return nombre;
    }
    
    static void altaJugador(Map<Integer, Jugador> plantilla, Integer dorsal, Jugador jugador) {

        plantilla.put(dorsal, jugador);
    }

    static Jugador eliminarJugador(Map<Integer, Jugador> plantilla, Integer dorsal) {

        return plantilla.remove(dorsal);
    }

    static void mostrar(Map<Integer, Jugador> plantilla) {
        Set<Map.Entry<Integer, Jugador>> vistaPlantilla = plantilla.entrySet();
        for(Map.Entry<Integer, Jugador> e : vistaPlantilla) {
            System.out.println(e.getKey() + " - " + e.getValue());
        }
    }

    static void mostrar (Map<Integer, Jugador> plantilla, String posicion) {
        Set<Map.Entry<Integer, Jugador>> vistaPlantilla = plantilla.entrySet();
        for(Map.Entry<Integer, Jugador> e : vistaPlantilla) {
            if (e.getValue().posicion.toString().equals(posicion))
                System.out.println(e.getKey() + " - " + e.getValue());
        }
    }
}
