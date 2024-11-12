/**EP0320. Escribe un programa que solicite al usuario las distintas cantidades de dinero de
las que dispone. Por ejemplo: la cantidad de dinero que tiene en el banco, en una hucha, en
un cajón y en los bolsillos. La aplicación mostrará la suma total de dinero de la que dispone
el usuario.
La manera de especificar que no se desea introducir más cantidades es mediante el cero. */

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class EP0320 {
    public static void main(String[] args) {
        
        System.out.println("CANTIDAD DE DINERO DISPONIBLE");
        menu();
    }
    
    public static void menu () {

        Scanner sc = new Scanner (System.in);
        int respuesta = 13;

        while (respuesta < 0 || respuesta > 5) {
        System.out.println("INTRODUCE NUMERO CORRESPONCIENTE PARA AGREGAR \n");
        System.out.println("Dinero en el banco (1)");
        System.out.println("Dinero en la hucha (2)");
        System.out.println("Dinero en el Cajón (3)");
        System.out.println("Dinero en los bolsillos (4)");
        System.out.println("Sumar cantidades (5)");
        System.out.println("SALIR (0)");

        respuesta = sc.nextInt();
        }



    }
}
