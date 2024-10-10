package ud1.ejercicios;

import java.util.Scanner;

/**Un economista te ha encargado un programa para realizar cálculos con el IVA. La
aplicación debe solicitar la base imponible y el IVA que se debe aplicar. Muestra en pantalla
el importe correspondiente al IVA y al total.
 */
public class EP0111 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        float base, iva;
        float res,resFinal;
       

        System.out.println("Introduce base imponible");
    
        base= sc.nextFloat();

        System.out.println("Introduce el IVA a aplicar");
        iva= sc.nextFloat();

    resFinal = (iva*base)/100;
        res = base+resFinal;

        System.out.println("El IVA es: "+resFinal);
        System.out.println("El importe total es: "+res);

        sc.close();
    }
    
}
