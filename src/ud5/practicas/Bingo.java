package ud5.practicas;

import java.util.Scanner;

public class Bingo {
    
    static final int MAX_NUM = 99;
    static Jugador[] jugadores;

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("\n  BINGO");
        System.out.println("=============");

        System.out.println("\nNúmero de jugadores");
        int numJugadores =sc.nextInt();
        jugadores = new Jugador[numJugadores];

        for (int i = 0; i < numJugadores; i++) {

            System.out.println("\nIntroduce los datos de los jugadores:");
            System.out.println("Jugador " + i+1 + "/" + numJugadores);
            System.out.println("Nombre:");
            String nombre = sc.nextLine();
            System.out.println("Número de cartones:");
            int numCartones = sc.nextInt();

            jugadores[i] = new Jugador (nombre, numCartones);
        }


    }
}

class Jugador {

    String nombre;
    Carton[] cartones;

    public Jugador(String nombre, int numCartones) {
        this.nombre = nombre;
        this.numCartones = numCartones;
    }
}

class Carton {

    static final int MAX_FILAS = 3;
    static final int MAX_COLS = 9;

    int[][] numeros;

    
}
