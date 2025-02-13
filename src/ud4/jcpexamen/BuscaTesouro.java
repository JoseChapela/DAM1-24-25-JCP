//José Chapela Pastoriza

/* Más sencillo solo comparando filas con columnas hasta que coincidan */

package ud4.jcpexamen;

import java.util.Random;
import java.util.Scanner;

public class BuscaTesouro {
    public static void main(String[] args) {
        
        System.out.println("BÚSQUEDA DEL TESORO");
        System.out.println();
        System.out.println("(La primera fila y columna empieza en 0. RECUÉRDALO)");
        System.out.println();
        System.out.println("El mapa deber ser de por lo menos 10 casillas, si no PERDERÁS");
        System.out.println();
        
        int filas = -1, columnas = -1;
        int tesoroFila, tesoroColumna;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);

        while (filas <= 0) {
            try {
                System.out.println("Introduce el número de filas del tablero");
                filas = sc.nextInt();
                if (filas <= 0) {
                    System.out.println();
                    System.out.println("Fila mayor que 0");
                    System.out.println();
                    filas = -1;
                }
            } catch (Exception e) {
                sc.next();
                System.out.println();
                System.out.println("Carácter no válido");
                System.out.println();
                filas = -1;
            }
        }

        while (columnas <= 0) {
            try {
                System.out.println("Introduce el número de columnas del tablero");
                columnas = sc.nextInt();
                if (columnas <= 0) {
                    System.out.println();
                    System.out.println("Columna mayor que 0");
                    System.out.println();
                    columnas = -1;
                }
            } catch (Exception e) {
                sc.next();
                System.out.println();
                System.out.println("Carácter no válido");
                System.out.println();
                columnas = -1;
            }
        }


        int intentos = (int)(filas*columnas*0.1);

        boolean[][] tablero = new boolean[filas][columnas];
        Random rnd = new Random();
        filas = rnd.nextInt(filas);
        columnas = rnd.nextInt(columnas);
        tablero[filas][columnas] = true;

        tesoroFila = filas;
        tesoroColumna = columnas;

        filas = -1;
        columnas = -1;

        while (flag && intentos != 0) {

            while (filas < 0) {
                try {
                    System.out.println("Introduce el fila donde está el tesoro");
                    filas = sc.nextInt();
                    System.out.println();
                    if (filas < 0 || filas > tablero.length - 1) {
                        System.out.println("Fila inválida");
                        System.out.println();
                        filas = -1;
                    }
                } catch (Exception e) {
                    sc.next();
                    System.out.println("Carácter no válido");
                    System.out.println();
                    filas = -1;
                }
            }
    
            while (columnas < 0 || columnas > tablero[columnas].length - 1) {
                try {
                    System.out.println("Introduce el columna donde está el tesoro");
                    columnas = sc.nextInt();
                    System.out.println();
                    if (columnas < 0) {
                        System.out.println("Fila inválida");
                        System.out.println();
                        columnas = -1;
                    }
                } catch (Exception e) {
                    sc.next();
                    System.out.println("Carácter no válido");
                    System.out.println();
                    columnas = -1;
                }
            }

            intentos--;


                if (filas > tesoroFila){
                    if (columnas > tesoroColumna) System.out.println("Más al Noroeste");
                        else if (columnas < tesoroColumna) System.out.println("Más al Noreste");
                        else System.out.println("Más al Norte");
                } else  if (filas < tesoroFila) {
                        if (columnas > tesoroColumna) System.out.println("Más al Suroeste");
                            else if (columnas < tesoroColumna) System.out.println("Más al Sureste");
                            else System.out.println("Más al Sur");
                } else  if (filas == tesoroFila) {
                        if (columnas > tesoroColumna) System.out.println("Más al Oeste");
                            else if (columnas < tesoroColumna) System.out.println("Más al Este");
                            else {
                                System.out.println();
                                System.out.println("Has acertado!!!");
                                System.out.println();
                                flag = false;
                            }
        
                        }

        if (flag) {

            System.out.println();
            System.out.println("Te quedan " + intentos + " intentos");
            System.out.println();
        } 
        filas = -1;
        columnas = -1;
        }

    System.out.println();
    System.out.println("GAME OVER");
    sc.close();
    }

}
