package ud1.ejercicios;

import java.util.Scanner;

/*EP0116. Solicita al usuario tres distancias:
La primera, medida en milímetros.
La segunda, medida en centímetros.
La última, medida en metros.

Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en
centimetros).
 */

public class EP0116 {
    public static void main(String[] args) {

        float mm, cm, m, resultado;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce mm");
        mm = sc.nextFloat();
        System.out.println("Introduce cm");
        cm = sc.nextFloat();
        System.out.println("Introduce m");
        m = sc.nextFloat();

        resultado = mm/10+m*100+cm;

        System.out.println("La suma de las tres longitudes en cm es: "+ resultado +" cm");

        sc.close();


        
        
    }
    
}
