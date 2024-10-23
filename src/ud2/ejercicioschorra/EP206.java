/** Pedir tres números y mostrarlos ordenados de mayor a menor. */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class EP206 {
     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        double num1, num2, num3, mayor, menor, medio;

        System.out.println("ORDENADOR DE NÚMEROS:");
        System.out.println("Introduce el primer número");
        num1 = sc.nextDouble();
        System.out.println("Introduce el segundo número");
        num2 = sc.nextDouble();
        System.out.println("Introduce el tercer número");
        num3 = sc.nextDouble();
        sc.close();

        if( num1 != num2 && num)

        if (num1 > num2 && num1 > num3) {
            mayor = num1;
            
        } else if (num2 > num1 && num2 > num3) {
            mayor = num2;
            
        }else {
            mayor = num3;

        }
        if (num1 < num2 && num1 < num3) {
            menor = num1;
            
        } else if (num2 < num1 && num2 < num3) {
            menor = num2;
            
        }else {
            menor = num3;

        }
        if (num1 > menor && num1 < mayor ) {
            medio = num1;
            
        } else if (num2 > menor && num2 < mayor) {
            medio = num2;
            
        } else {
            medio = num3;
        }

        
    
         
            
    }
    
}
