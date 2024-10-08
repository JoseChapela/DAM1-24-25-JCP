package ud1.ejercicios.ejercicios;

import java.util.Scanner;

/*EP0122. Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.
 */

public class EP0122 {
    public static void main(String[] args) {

        float grados, faren;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introducir grados celsius");
        grados = sc.nextFloat();

        faren = grados*9/5+32;

        System.out.println("Son: "+faren+" Farenheit");

        sc.close();
        
    }
    
}
