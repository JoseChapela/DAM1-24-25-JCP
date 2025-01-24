package ud4.prueba0124;

import java.util.Arrays;
import java.util.Scanner;

public class AbadiasPirenaicas {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        double[] altura = new double[0];
        double entrada = 0;
        
        System.out.println("Introduce la altura de las montañas de la cordillera (de Oeste a Este)");
        System.out.println("Introduce un número negativo para terminar");

        while (entrada >= 0) {

            entrada = sc.nextDouble();
            if (entrada >= 0) {
                altura = Arrays.copyOf(altura, altura.length + 1);
                altura[altura.length-1] = entrada;
                System.out.println("Introduce la siguiente");
            }           
        }

        int[] numMontana = {altura.length};
        double max;
        max = altura[altura.length - 1];
        int contadorMontanas = 1;

        for (int i = altura.length-2; i > -1; i-- ) {

            if (altura[i] > max) {

                max = altura[i];
                numMontana = Arrays.copyOf(numMontana, numMontana.length + 1);
                numMontana[numMontana.length - 1] = i + 1;
                contadorMontanas++;
            } 

        }

        Arrays.sort(numMontana);

        System.out.println("Montañas en las que se puede construir abadías : " + Arrays.toString(numMontana));
        System.out.println("Número de montañas en las que se puede construir? " + contadorMontanas);
    }
    
}
