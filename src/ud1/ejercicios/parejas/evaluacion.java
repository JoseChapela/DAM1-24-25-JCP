/*
 * Piloto: Daniel
 * Copiloto: Jose
 */
package ud1.ejercicios.parejas;

import java.util.Scanner;

public class evaluacion {
    public static void main(String[] args) {
        double p1 ,p2 ,p3 , p4, p5, p6, res, suma;
        Scanner sc = new Scanner(System.in);

        System.out.println("El programa funciona? (0 = No / 1 = Mas o menos / 2 = Si)");
        res = sc.nextDouble();
        p1 = res < 1? 0 : res==1? 2 : 4; 
        System.out.println("Funciona y es eficiente? (0 = mal / 1 = regular / 2 = bien)");
        res = sc.nextDouble();
        p2 = res < 1? 0 : res==1? 0.5 : 1; 
        System.out.println("Usa estructuras y tipos de datos adecuados? (0 = nunca / 1 = a veces / 2 = siempre)");
        res = sc.nextDouble();
        p3 = res < 1? 0 : res==1? 0.5 : 1; 
        System.out.println("Usa identificadores adecuados? (0 = nunca / 1 = a veces / 2 = siempre)");
        res = sc.nextDouble();
        p4 = res < 1? 0 : res==1? 0.75 : 1.5; 
        System.out.println("Es legible? (0 = Poco / 1 = regular / 2 = mucho)");
        res = sc.nextDouble();
        p5 = res < 1? 0 : res==1? 0.75 : 1.5; 
        System.out.println("presenta la informacion completa al usuario? (0 = mal / 1 = regular / 2 = bien)");
        res = sc.nextDouble();
        p6 = res < 1? 0 : res==1? 0.5 : 1; 
        sc.close();
        suma = p1 + p2 + p3 + p4 + p5 + p6;
        System.out.printf("La nota final es de %.2f puntos.",suma);

    }



}
