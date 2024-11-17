/**E0301. Diseñar un programa que muestre, para cada número introducido por teclado, si
es par, si es positivo y su cuadrado. El proceso se repetirá hasta que el número
introducido sea 0.
 */

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0301 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        int num, cuadrado;
        boolean par, positivo;
        
        System.out.println("PAR? POSITIVO? CUADRADO?");
        System.out.println("Introduce un número");
        num = sc.nextInt();

         while (num!=0) {

            par = num%2==0;
            positivo = num >=0;
            cuadrado = num*num;

            if (par) {
                System.out.println("Es par");
                
            } else {
                System.out.println("Es impar");

            }

            if (positivo) {
                System.out.println("Es positivo");
                
            } else {
                System.out.println("Es negativo");

            }
            System.out.println("Su cuadrado es "+cuadrado);

            System.out.println("Introduce un número");
            num = sc.nextInt();

         };
         sc.close();

           
            
        


    }
    
}
