/**E0209. Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, que estará comprendido entre 0 y 99999.

Realiza una versión del programa anterior para que indique cuantes cifras tiene un número comprendido entre -99999 y 99999.
 */

package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class E0209 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        long num;
        int cifras = 0;
        boolean correcto = false;
       

        
        System.out.println("CUANTAS CIFRAS TIENE UN NÚMERO");
        System.out.println("Introduce un número entero entre -99999 y 99999");
        num = sc.nextLong();
        sc.close();

        if (num<10 && num > -10) {
            cifras = 1;
            correcto = true;
            
        } else if (num < 100 && num > -100) {
            cifras = 2;
            correcto = true;
            
        } else if (num < 1000  && num > -1000) {
            cifras = 3;
            correcto = true;

        } else if (num < 10000  && num > -10000) {
            cifras = 4;
            correcto = true;

        } else if (num < 100000  && num > -100000) {
            cifras = 5;
            correcto = true;

        } else {
            System.out.println("Valores no válidos");
        }
        if (correcto) {
            System.out.printf("El número tiene %d cifras", cifras);
            
        }
        
    }
    
}
