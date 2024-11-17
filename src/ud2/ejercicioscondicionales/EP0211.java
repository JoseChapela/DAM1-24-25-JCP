/**EP0211. Escribe una aplicación que solicite al usuario un número comprendido entre 0 y
9999. La aplicación tendrá que indicar si el número introducido es capicúa. */

package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class EP0211 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int num;
        boolean capicua = false;
        
        System.out.println("ES CAPICÚA?");
        System.out.println("Introduce un número comprendido entre 0 y 9999");
        num = sc.nextInt();
        sc.close();

        if ( num < 100000 && num >= 0 ) {
            capicua = false;
            
        } else if ( num < 1000 ) {
            
            if ( num % 111 == 0 ) {
                capicua = true;
            
            } else {
            
                capicua = false;
            
            }
            
        } else if ( num < 100 ) {
            
            if ( num % 11 == 0 ) {
                
                capicua = true;
                
            } else {

                capicua = false;
            }
        } else if ( num < 10 ) {

            capicua = false;
            
        } else {

            System.out.println("Número inválido");
        }

        if (capicua) {

            System.out.println("Es capicúa");
            
        } else if (!capicua) {

            System.out.println("No es capicúa");
            
        }
        

        

        
    }
    
}
