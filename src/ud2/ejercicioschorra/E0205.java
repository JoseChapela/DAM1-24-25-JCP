/** Pedir dos números y mostrarlos ordenados de forma decreciente. */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0205 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2;

        System.out.println("ORDENADOR DE NÚMEROS:");
        System.out.println("Introduce el primer número");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        num2 = sc.nextDouble();
        sc.close();

        if (num1 == num2) {
            System.out.println("Los números tienen el mismo valor");
            
        } else {
            System.out.println(Math.max(num1, num2)+" > "+Math.min(num1, num2));


        }
            
            
        
    }
    
}
