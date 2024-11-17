/**E0311. Pedir un número y calcular su factorial. Por ejemplo el factorial de 5 se denota 5! y
es igual a 5 x 4 x 3 x 2 x 1 = 120. */

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0311 {
    public static void main(String[] args) {

        int num, contador;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("FACTORIAL");
        System.out.println("Introduce número: ");
        num = sc.nextInt();
        sc.close();
        contador = num-1;

        //Debería haber sido con for

        while (contador > 0) {
            num*=contador;
            contador--;
        }

        System.out.println("Su factorial es: "+num);



    }
    
}
