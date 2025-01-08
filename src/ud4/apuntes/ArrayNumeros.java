package ud4.apuntes;

import java.util.Scanner;

public class ArrayNumeros {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("Introduce un número: ");

        //Lee n números y los guarda en el array
        int n = sc.nextInt();
        int [] numeros = new int [n];

        /*System.out.println("Escribe " + n + " número enteros");
        for (int i=0; i < n ; i++) {
            numeros[i] = sc.nextInt();
        }
        sc.close();
        */

        leerNumeros(numeros);

        //Procesar datos
        int sumaPos = 0, contPos = 0, sumaNeg = 0, contNeg = 0, contCeros = 0;
        for (int i = 0; i < n; i++) {
            if (numeros[i] > 0) {
                contPos++;
                sumaPos += numeros[i];
            } else if (numeros [i] < 0) {
                contNeg++;
                sumaNeg += numeros[i];
            } else {
                contCeros++;
            }
        }
        System.out.println("Media de numeros positivos: " + sumaPos / contPos);
        System.out.println("Media de numeros negativos: " + sumaNeg / contNeg);
        System.out.println("Número de ceros: " + contCeros);
    }

    private static void leerNumeros (int[] t) {
        Scanner sc = new Scanner (System.in);
        for (int i = 0; i < t.length; i++) {
            t[i] = sc.nextInt();
        }
        sc.close();
    }

    /*Escribe una función que cuente las veces que aparece un valor clave en una tabla de enteros.
    static int contar(int t[], int clave) */

    private static int contar (int t[], int clave) {
        int contador = 0;
        for (int i = 0; i < t.length ; i++) 
            if (t[i] == clave) contador++;
        return contador;
    }

    /*Escribe una función que devuelve la lista de posiciones de una tabla en las que se encuentra un valor clave.
    static int[] buscarVarios(int t[], int clave)*/

    private static int[] buscarVarios (int t[], int clave) {
        int[] a = new int[t.length]; 
        int n= 0;
        for (int i = 0; i < t.length ; i++) 
            if (t[i] == clave) {
                a[n] = i;
                n++;
            }
        return a;
    }
    
}
