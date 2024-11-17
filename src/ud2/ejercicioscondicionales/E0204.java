/** Implementar un programa que pida por teclado un número decimal e indique si es un
número casi-cero que son aquellos, positivos o negativos, que se acercan a 0 por menos de 1
unidad, aunque curiosamente el 0 no se considera un número casi-cero. Ejemplos de números */

package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class E0204 {
    public static void main(String[] args) {
        
        double numero;

        Scanner sc = new Scanner(System.in);

        System.out.println("CASI CERO");
        System.out.println("Introduce número:");
        numero = sc.nextDouble();
        sc.close();

        if (numero==0 || numero>=1 || numero <=-1) {
            System.out.println("No es un número casi cero");
            
        } else {
            System.out.println("Es un número casi cero");

        }

    }
    
}
