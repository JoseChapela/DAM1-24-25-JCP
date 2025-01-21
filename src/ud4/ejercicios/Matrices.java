package ud4.ejercicios;

import java.util.Arrays;

public class Matrices {

    /*Suma de Matrices Escribe un programa en Java que reciba dos matrices de enteros de tamaño m x n y calcule su suma. Imprime el resultado.
    */

    public static int[][] sumaMatrices (int[][] matriz1, int[][] matriz2) {

        if (matriz1 == null || matriz2 == null) 
            throw new IllegalArgumentException("Las matrices no pueden ser nulas");
        if (matriz1.length == 0 || matriz1[0].length == 0 || matriz2.length == 0 || matriz2[0].length == 0)
            throw new IllegalArgumentException("Las matrices no pueden estar vacías");
        if (matriz1.length != matriz2.length || matriz1[0].length != matriz2[0].length) 
            throw new IllegalArgumentException("Las matrices deben tener la misma dimension");

        int[][] suma = new int[matriz1.length][matriz1[0].length];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz1[i].length; j++) {
                suma[i][j] = matriz1[i][j] +  matriz2[i][j];
            }
        }
        return suma;
    }

    /*Multiplicación de Matrices Escribe un programa que reciba dos matrices de enteros de tamaño m x n y n x p respectivamente, y calcule su producto. Imprime la matriz resultante.
     */
    
     public static int[][] multiplicacionMatrices (int[][] matriz1, int[][] matriz2) {

        if (matriz1 == null || matriz2 == null) 
            throw new IllegalArgumentException("Las matrices no pueden ser nulas");
        if (matriz1.length == 0 || matriz1[0].length == 0 || matriz2.length == 0 || matriz2[0].length == 0)
            throw new IllegalArgumentException("Las matrices no pueden estar vacías");
        if (matriz1[0].length != matriz2.length) 
            throw new IllegalArgumentException("El número de columnas de la primera matriz debe ser igual al númoero de filas de la segunda");

        int[][] multiplicacion = new int[matriz1.length][matriz2[0].length];
        
        for (int i = 0; i < matriz1.length; i++) {
            for (int j = 0; j < matriz2[i].length; j++) {
                for (int k = 0; k < matriz1[i].length; k++) {
                    multiplicacion[i][j] += matriz1[i][k]*matriz2[k][j];       
                }
            }
        }
        return multiplicacion;
    }

    /*Transposición de una Matriz Escribe un programa que reciba una matriz de enteros de tamaño m x n y calcule su transposición, es decir, convierte las filas en columnas y viceversa. Imprime la matriz transpuesta.
    */

    public static int[][] transposicionMatriz (int[][] matriz) {

        if (matriz == null) 
            throw new IllegalArgumentException("Las matrices no pueden ser nulas");
        if (matriz.length == 0)
            throw new IllegalArgumentException("Las matrices no pueden estar vacías");

        int[][] transpuesta = new int[matriz[0].length][matriz.length];

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                transpuesta[j][i] = matriz[i][j]; 
            }
        }

        return transpuesta;
    }

}
