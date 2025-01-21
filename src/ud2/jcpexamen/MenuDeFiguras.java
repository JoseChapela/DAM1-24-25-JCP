/**José Chapela Pastoriza */

package ud2.jcpexamen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuDeFiguras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int op = 13;
        int contador = 0;

        do {

            if (contador > 0) {
                System.out.println();
                System.out.println("LLevas " + contador + " errores");
                System.out.println("El programa se cerrará si llegas a 3");
                System.out.println();
            }

            System.out.println();
            System.out.println("1. Triángulo");
            System.out.println("2. Rectángulo");
            System.out.println("0. SALIR");

            try {
                op = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("Opción inválida");
                System.out.println();
                System.out.println(e.toString());
                sc.nextLine();
                op = 13;
                contador++;
                continue;

            }

            if (op > 2 || op < 0) {
                System.out.println();
                System.out.println("Opción inválida");
                System.out.println();
                contador++;
            }

            switch (op) {
                case 1:
                    triangulo();
                    sc.nextLine();
                    contador = 0;
                    op = 13;

                    break;

                case 2:
                    rectangulo();
                    sc.nextLine();
                    contador = 0;
                    op = 13;

                    break;

                default:
                    ;

                    break;
            }

        } while (op != 0 && contador < 3);

        sc.close();

        System.out.println("HASTA PRONTO");

    }

    public static void triangulo() {

        Scanner sc = new Scanner(System.in);

        int num;
        String punto = "*";

        do {
            System.out.println("Introduce un número entre 2 y 20:");
            try {
                num = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                sc.nextLine();
                num = 69;
                continue;

            }

        } while (num < 2 || num > 20);

        for (int i = 0; i < num; num--) {
            for (int j = 0; j < num; j++) {
                System.out.print(punto);

            }
            System.out.println("");
        }

        sc.close();

    }

    public static void rectangulo() {

        Scanner sc = new Scanner(System.in);

        int num1, num2;
        String punto = "*";

        do {
            System.out.println("Introduce número de filas entre 2 y 20:");
            try {
                num1 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                sc.nextLine();
                num1 = 69;
                continue;

            }

        } while (num1 < 2 || num1 > 20);

        do {
            System.out.println("Introduce número de columnas entre 2 y 20:");
            try {
                num2 = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println(e.toString());
                sc.nextLine();
                num2 = 69;
                continue;

            }

        } while (num1 < 2 || num1 > 20);

        for (int i = 0; i < num1; i++) {
            for (int j = 0; j < num2; j++) {
                System.out.print(punto);

            }
            System.out.println("");
        }
        sc.close();

    }

}
