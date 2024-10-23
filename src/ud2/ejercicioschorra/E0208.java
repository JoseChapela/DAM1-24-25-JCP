/**E0208. Pedir los coeficientes de una ecuación de segundo grado (ax2 + bx + c = 0) y mostrar sus soluciones reales. 
Las soluciones de una ecuación de segundo grado son dos, según se utilice el signo + o - delante de la raíz cuadrada: 

Si el discriminante (el contenido de la raíz cuadrada) es negativo, el programa deberá indicar que no existen soluciones con números reale
 */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0208 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double a, b, c, solution1, solution2, intoraiz;

        System.out.println("SOLUCIONES DE UNA ECUACION DE SEGUNDO GRADO");
        System.out.println("Introduce el coeficiente a");
        a = sc.nextDouble();
        System.out.println("Introduce el coeficiente b");
        b = sc.nextDouble();
        System.out.println("Introduce el coeficiente c");
        c = sc.nextDouble();

        intoraiz = Math.sqrt(Math.pow(b, 2)*4*a*c) ;
        solution1= (-b+Math.sqrt(intoraiz))/(2*a);
        solution2= (-b-Math.sqrt(intoraiz))/(2*a);

        if (Math.pow(b, 2)*4*a*c < 0) {
            System.out.println("No tiene soluciones reales");
            
        } else {
            System.out.printf("Las soluciones son: \n x = %.2f \n x = %.2f", solution1, solution2);
            
        }
        


    }
    
}
