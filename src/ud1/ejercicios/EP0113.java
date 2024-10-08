package ud1.ejercicios;

import java.util.Scanner;
import java.lang.Math;

/*Dado el siguiente polinomio de segundo grado:
y = ax2 + bx + c
crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
correspondiente de y.
*/

public class EP0113 {
    public static void main(String[] args) {
        
        double a, b, c, x, y;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Valor a");
        a = sc.nextDouble();
        System.out.println("Valor b");
        b = sc.nextDouble();
        System.out.println("Valor c");
        c = sc.nextDouble();
        System.out.println("Valor x");
        x = sc.nextDouble();

        y = Math.(a*x);
        
        
        
    }
    
}
