package ud4.practicas.buscaminas;

import java.util.Scanner;

public class Buscaminas {

    static final int FILAS = 15;
    static final int COLUMNAS = 15;
    static final int NUM_MINAS = 10;
    static boolean[][] tableroMinas = new boolean[FILAS][COLUMNAS];
    static char[][] tableroJuego = new char[FILAS][COLUMNAS];
    static int numMarcas = 0;
    static boolean opcionSalir = false;
    static boolean minaDestapada = false;
    static boolean minasMarcadas = false;

    private static void iniciarTableroMinas() {

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tableroMinas[i][j] = false;
            }
        }

        for (int i = 0; i < NUM_MINAS; i++) {
            int fila, columna;
            do {
                fila = (int) (Math.random() * FILAS);
                columna = (int) (Math.random() * COLUMNAS);
            } while (tableroMinas[fila][columna]);
            tableroMinas[fila][columna] = true;
        }
    }

    private static void iniciarTableroJuego() {

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                tableroJuego[i][j] = '-';
            }
        }
    }

    private static void imprimirTableroJuego() {

        System.out.print("    ");

        for (int i = 0; i < COLUMNAS; i++) {
            if (i < 11) System.out.print("   " + i);
                else System.out.print("  " + i);
        }
        System.out.println();
        System.out.println();
        for (int i = 0; i < FILAS; i++) {
            if (i < 10) System.out.print(" " + i);
                else System.out.print("" + i);

            System.out.print("  ");
            for (int j = 0; j < COLUMNAS; j++) {
                if (j < 10)  System.out.print("   " + tableroJuego[i][j]);
                    else System.out.print("   " + tableroJuego[i][j]);
            }
            System.out.println();
            System.out.println();
        }
    }

    private static void imprimirMenu() {

        System.out.println("1. Destapar casilla");
        System.out.println("2. Marcar mina");
        System.out.println("3. Desmarcar mina");
        System.out.println("0. SALIR");
    }

    private static int leerOpcion() {

        Scanner sc = new Scanner(System.in);
        int num = 13;

        while (num < 0 || num > 3) {
            try {
                num = sc.nextInt();
                if (num < 0 || num > 3) {
                    System.out.println();
                    System.out.println("Número fuera de rango");
                    System.out.println();
                    return 13;
                }
            } catch (Exception e) {
                sc.next();
                System.out.println();
                System.out.println("Carácter no válido");
                System.out.println();
                return 13;
            }
        }
        return num;
    }

    private static int leerFila() {

        Scanner sc = new Scanner(System.in);
        int fila = -1;

        while (fila < 0 || fila > FILAS - 1) {
            try {
                System.out.println("INTRODUCE FILA:");
                fila = sc.nextInt();
                if (fila < 0 || fila > FILAS - 1) {
                    System.out.println();
                    System.out.println("Fila fuera de rango");
                    System.out.println();
                    fila = -1;
                }
            } catch (Exception e) {
                sc.next();
                System.out.println();
                System.out.println("Carácter no válido");
                System.out.println();
                fila = -1;
            }
        }
        return fila;
    }

    private static int leerColumna() {

        Scanner sc = new Scanner(System.in);
        int columna = -1;

        while (columna < 0 || columna > COLUMNAS - 1) {
            try {
                System.out.println("INTRODUCE COLUMNA");
                columna = sc.nextInt();
                if (columna < 0 || columna > FILAS - 1) {
                    System.out.println();
                    System.out.println("Fila fuera de rango");
                    System.out.println();
                    columna = -1;
                }
            } catch (Exception e) {
                sc.next();
                System.out.println();
                System.out.println("Carácter no válido");
                System.out.println();
                columna = -1;
            }
        }
        return columna;
    }

    private static void marcarCasilla(int fila, int columna) {

        if (tableroJuego[fila][columna] == '-')
            tableroJuego[fila][columna] = 'P';
    }

    private static void desmarcarCasilla(int fila, int columna) {

        if (tableroJuego[fila][columna] == 'P')
            tableroJuego[fila][columna] = '-';
    }

    private static void destaparCasilla(int fila, int columna) {

        if (tableroMinas[fila][columna]) {
            minaDestapada = true;
            tableroJuego[fila][columna] = 'X';
            return;
        }
        if (minaAlrededor(fila, columna)) {
            tableroJuego[fila][columna] = (char) (minasAlrededor(fila, columna) + '0');
            return;
        }
        tableroJuego[fila][columna] = ' ';

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if (tableroJuego[i + fila][j + columna] != ' ')
                        destaparCasilla(fila + i, columna + j);
                } catch (Exception e) {
                }
            }
        }

        for (int i = 0; i < FILAS; i++) {
            for (int j = 0; j < COLUMNAS; j++) {
                if (tableroJuego[i][j] != '-')
                    return;
            }
        }

        minasMarcadas = true;
        return;
    }

    private static boolean minaAlrededor(int fila, int columna) {

        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if (tableroMinas[fila + i][columna + j])
                        return true;
                } catch (Exception e) {
                }
            }
        }
        return false;
    }

    private static int minasAlrededor(int fila, int columna) {

        int numMinas = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    if (tableroMinas[fila + i][columna + j])
                        numMinas++;
                } catch (Exception e) {
                }
            }
        }
        return numMinas;
    }

    private static void imprimirFinJuego() {

        if (minasMarcadas)
            System.out.println("---YOU WIN---");
        if (minaDestapada || opcionSalir)
            System.out.println("---GAME OVER---");
        System.out.println();
        imprimirTableroJuego();
        System.out.println();
        System.out.println("GRACIAS POR JUGAR");
    }

    public static void main(String[] args) {

        int fila, columna;

        iniciarTableroMinas();
        iniciarTableroJuego();

        do {
            imprimirTableroJuego();

            imprimirMenu();
            int opcion = leerOpcion();
            switch (opcion) {
                case 0:
                    opcionSalir = true;
                    break;
                case 1:
                    fila = leerFila();
                    columna = leerColumna();
                    destaparCasilla(fila, columna);
                    break;
                case 2:
                    fila = leerFila();
                    columna = leerColumna();
                    marcarCasilla(fila, columna);
                    break;
                case 3:
                    fila = leerFila();
                    columna = leerColumna();
                    desmarcarCasilla(fila, columna);
                    break;
            }
        } while (!opcionSalir && !minaDestapada && !minasMarcadas);

        imprimirFinJuego();
    }

}
