//*José Chapela Pastoriza */

package ud1.jcpexamen;

import java.util.Scanner;

public class EJ01 {
    public static void main(String[] args) {

        double precio, dinero, resto, dinerofalta;
        String respuesta;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce precio del artículo: ");
        precio = sc.nextDouble();

        System.out.println("Introduce primera cantidad: ");
        dinero = sc.nextDouble();
        System.out.println("Introduce segunda cantidad: ");
        dinero += sc.nextDouble();
        System.out.println("Introduce tercera cantidad: ");
        dinero += sc.nextDouble();

        sc.close();

        resto = dinero - precio;
        dinerofalta = precio - dinero;

        respuesta = precio > dinero ? String.format("Insuficiente. Se necesitan %.2f euros más", dinerofalta)
                : String.format("Le sobrarán %.2f euros", resto);

        System.out.println(respuesta);

    }

}
