/**EP0311_Decimal_Binario. Realiza un programa que convierta un número entero decimal
en su representación binaria. Hay que tener en cuenta que desconocemos cuántas cifras
tiene el número que introduce el usuario.
Por simplicidad, iremos mostrando el número binario con un digito por línea. */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class EP0313 {
    public static void main(String[] args) {
        int cifras, numero = 0, resto;
        String respuesta = "", digito;
        Scanner sc = new Scanner (System.in);

        System.out.println("Números bianrios");
        System.out.println("Cuantas cifras?");
        cifras = sc.nextInt();

        //Podía ser más sencillo

        for (int i = 1 ; i <= cifras ; i++) {
            System.out.println("Introduce "+i+" cifra");
            numero += sc.nextInt()*Math.pow(10, cifras-i);
           }
           sc.close();

        do {
            numero /= 2;
            resto = numero %2;

            digito = resto == 1 ? "1" : "0";

            respuesta = digito + respuesta;
            }
        while (numero/2 !=0);
        System.out.println(respuesta);
    }
    
}
