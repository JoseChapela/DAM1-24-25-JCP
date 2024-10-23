//*José Chapela Pastoriza */

package ud1.jcpexamen;

import java.util.Scanner;

public class EJ02 {
    public static void main(String[] args) {

        final double AREA, PERIMETRO, PERIMETROCIRCULO, PERIMETRORECTANGULO, AREACIRCULO, AREARECTANGULO;
        double largo, ancho, distancia, resto, vueltas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el largo de la figura en metros:");
        largo = sc.nextDouble();
        System.out.println("Introduce el ancho de la figura en metros:");
        ancho = sc.nextDouble();
        System.out.println("Introduce distancia a correr en metros:");
        distancia = sc.nextDouble();
        sc.close();

        // Area de la figura
        AREACIRCULO = Math.PI * Math.pow(ancho / 2, 2);
        AREARECTANGULO = ancho * (largo - ancho);
        AREA = AREACIRCULO + AREARECTANGULO;

        // Perimetro de la figura
        PERIMETROCIRCULO = 2 * Math.PI * (ancho / 2);
        PERIMETRORECTANGULO = (largo - ancho) * 2;
        PERIMETRO = PERIMETROCIRCULO + PERIMETRORECTANGULO;

        System.out.printf("El perímetro de la pista es %.2f metros \n", PERIMETRO);
        System.out.printf("El área de la pista es %.2f metros cuadrados \n", AREA);

        vueltas = distancia / PERIMETRO;
        resto = distancia % PERIMETRO;

        System.out.printf("Debes dar %.0f vueltas \n", vueltas);
        System.out.printf("Te faltaron %f metros", resto);

    }

}
