/**E0306. Escribir una aplicación para aprender a contar, que pedirá un número n y mostrará
todos los números del 1 al n. */

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0306 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int num;


        System.out.println("APRENDE A CONTAR!!!");
        System.out.println("Hasta que número quieres contar?");
        num = sc.nextInt();
        sc.close();

        for (int i = 1; i <= num ; i++) {

            System.out.print(i+"\t");
        }
        
    }
    
}
