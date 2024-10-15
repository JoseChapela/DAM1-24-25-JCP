/* Desarrolla un programa en Java que convierta unidades de almacenamiento entre bytes,
 kilobytes (KB), megabytes (MB) y gigabytes (GB). Solicita al usuario la cantidad de datos y
 la unidad de origen y destino
 */

package ud1.exercicios.jcp20241010;

import java.util.Scanner;

public class EP0133 {
    public static void main(String[] args) {

        final double MIL24 = 1024;
        double cantidad, resultado;
        String uds1, uds2;
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce unidades de origen: bytes, kilobytes, megabytes o gigabytes");
        uds1 = sc.nextLine();
       
        System.out.println("Introduce cantidad");
        cantidad = sc.nextDouble();sc.nextLine();

        cantidad = uds1.equals("bytes")? cantidad : uds1.equals("kilobytes")? cantidad*MIL24 : uds1.equals("megabytes")? cantidad*Math.pow(MIL24, 2): uds1.equals("gigabytes")? cantidad*Math.pow(MIL24,3): 0;
         

        System.out.println("Introduce unidades de destino: bytes, kilobytes, megabytes o gigabytes");
        uds2 = sc.nextLine();

        resultado = uds2.equals("bytes")? cantidad : uds2.equals("kilobytes")? cantidad/MIL24 : uds2.equals("megabytes")? cantidad/Math.pow(MIL24, 2): uds2.equals("gigabytes")? cantidad/Math.pow(MIL24, 3): 0;

        System.out.printf("Son %.3f %s", resultado, uds2);
        sc.close();

        
    }
    
}
