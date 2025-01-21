package ud3.ejerciciosclases;

import ud3.ejerciciosclases.Jugador.Position;

public class EP0717 {
    public static void main(String[] args) {

        Position centrocampista = Position.valueOf("CENTROCAMPISTA");
        Position delantero = Position.valueOf("DELANTERO");
        Jugador p1 = new Jugador("Michellangelo",centrocampista );
        System.out.println(p1.getPosition());

        p1.setPosition(delantero);

        System.out.println(p1.getPosition());

        Jugador p2 = new Jugador ("Rafael");
        System.out.println(p2.getNombre());

        String dni = "123456789A";
        String nombre = "Leo";
        double estatura = 1.8;


        Jugador p3 = new Jugador(dni, nombre, delantero, estatura);
        System.out.println("nombre: "+p3.getNombre());
        System.out.println("dni: "+p3.getDni());
        System.out.println("estatura: "+p3.getEstatura());
    }

}
