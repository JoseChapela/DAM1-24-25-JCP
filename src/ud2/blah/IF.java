package ud2.blah;

import java.util.Scanner;

public class IF {
    public static void main(String[] args) {

        String respuesta;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eres un robot?");
        respuesta = sc.nextLine();
        sc.close();

        if (respuesta.equals("no") || respuesta.equals("No")) {
            System.out.println("Te creo");

        }

    }

}
