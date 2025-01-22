package ud4.prueba0122;

import java.util.Arrays;

public class ArraysEstadistica {

    static int suma (int[] numeros) {

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return suma;
    }

    static int minimo (int[] numeros) {

        int minimo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < minimo) minimo= numeros[i];
        }
        return minimo;        
    }

    static int maximo (int[] numeros) {

        int maximo = numeros[0];

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > maximo) maximo= numeros[i];
        }
        return maximo;        
    }

    static double media(int[] numeros) {

        double media = (double)suma(numeros)/numeros.length;
        return media;
    }

    static double mediana(int[] numeros) {

        double mediana = 0;
        int[] aux = new int[numeros.length];
       
        for (int i = 0; i < numeros.length; i++) {
            aux[i] = numeros[i];
        }

        Arrays.sort(aux);

        if (aux.length%2 != 0) return mediana = aux[aux.length/2]; 
        
        return mediana = (aux[aux.length/2] + aux[(aux.length/2)-1])/2.0;
        
    }

    static int moda(int[] numeros) {

        int[] aux = new int[numeros.length];

        for (int i = 0; i < numeros.length; i++) {
            aux[i] = numeros[i];
        }

        Arrays.sort(aux);

        int maxRepeats = 0;
        int numActualRepeats = 0;
        int maxNum = 0;
        int numActual = aux[0]-1;

        for (int i = 0; i < numeros.length; i++) {
            if (aux[i] == numActual) numActualRepeats++;
                else {
                    if (maxRepeats < numActualRepeats ) {
                        maxNum = aux[i-1];
                        maxRepeats = numActualRepeats;
                    }
                    numActual = aux[i];
                    numActualRepeats = 1;
                }
                if (maxRepeats == numActualRepeats) maxNum = -1;
        }
        
        return maxNum;
    }

    public static void main(String[] args) {
        // Declaración de variables y constantes
        int[] numeros1 = {2, 4, 6, 7, 4, 7, 9, 2, 5, 6, 7};
        int[] numeros2 = {2, 4, 6, 7, 4, 9, 2, 5, 6, 7};
        // Proceso y salida
        imprimeEstadisticas(numeros1);
        imprimeEstadisticas(numeros2);
        }
        static void imprimeEstadisticas(int[] numeros) {
        System.out.println("ARRAY ORIGINAL: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------");
        System.out.println("Longitud: " + numeros.length);
        System.out.println("Suma: " + suma(numeros));
        System.out.println("Máximo: " + maximo(numeros));
        System.out.println("Mínimo: " + minimo(numeros));
        System.out.println("Media: " + media(numeros));
        System.out.println("Mediana: " + mediana(numeros));
        System.out.println("Moda: " + moda(numeros));
        Arrays.sort(numeros);
        System.out.println("ARRAY ORDENADO: " + Arrays.toString(numeros));
        System.out.println("---------------------------------------------\n\n");
        }
        
}
