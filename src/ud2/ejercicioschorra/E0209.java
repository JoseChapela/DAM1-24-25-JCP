/**E0209. Escribir una aplicación que indique cuántas cifras tiene un número entero introducido por teclado, que estará comprendido entre 0 y 99999.

Realiza una versión del programa anterior para que indique cuantes cifras tiene un número comprendido entre -99999 y 99999.
 */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0209 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        long num;
        int cifras = 0;
        boolean correcto=true;

        
        System.out.println("CUANTAS CIFRAS TIENE UN NÚMERO");
        System.out.println("Introduce un número entero entre -99999 y 99999");
        num = sc.nextLong();

        if (num<10 && num > -10) {
            cifras = 1;
            
        } else if (num < 100 && num > -100) {
            cifras = 2;
            
        } else if (num < 1000  && num > -1000) {
            cifras = 3;

        } else if (num < 10000  && num > -10000) {
            cifras = 4;

        } else if (num < 100000  && num > -100000) {
            cifras = 5;

        } else {
            correcto=false;
        }
        if (correcto=true) {
            System.out.printf("El número tiene %d cifras", cifras);
            
        } else {
            System.out.println("Valores no válidos");
        }
        
    }
    
}
