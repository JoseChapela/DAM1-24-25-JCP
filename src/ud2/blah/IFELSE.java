package ud2.blah;

import java.util.Scanner;

public class IFELSE {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Introduce el número entero que estoy pensando");
        numero = sc.nextInt();
        sc.close();

        if (numero == 8) {
            System.out.println("Has acertado");

        } else {
            System.out.println("No has acertado");

        }
    }

}
