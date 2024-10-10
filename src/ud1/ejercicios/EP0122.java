package ud1.ejercicios.ejercicios;

import java.util.Locale;
import java.util.Scanner;

/*EP0122. Convertir una temperatura introducida por teclado en grados Farenheit a grados Celsius o centígrados, mostrando el resultado por pantalla.
 */

public class EP0122 {
    public static void main(String[] args) {

        double grados, faren;

        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Introducir grados celsius");
        faren = sc.nextDouble();

        grados = 5/9.0*(faren - 32);

        System.out.printf("Son: %.2f grados",grados);

        sc.close();
        
    }
    
}
