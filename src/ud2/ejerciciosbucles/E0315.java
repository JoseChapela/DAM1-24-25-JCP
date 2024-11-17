/**E0315. Pedir por consola un número n y dibujar un triángulo rectángulo de n elementos
de lado, utilizando para ello asteriscos (*). Por ejemplo, para n = 4:
* * * *
* * *
* *
* 
*/

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0315 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int num;
        String punto;

        System.out.println("TRIANGULO RECTÁNGULO");
        System.out.println("Introduce el número de asteriscos del lado");
        num = sc.nextInt();
        sc.close();
        punto = "* ";

        for (int i = 0 ; i < num ; num--) {
            for (int j = 0; j < num ; j++) {
                System.out.print(punto);
                
            }
            System.out.println("");
        }

    }
    
}
