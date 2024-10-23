/**E0207. Pedir tres números y mostrarlos ordenados de mayor a menor.
 */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0207 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num1, num2, num3, mayor, menor, medio;
        
        
        System.out.println("3 NÚMEROS ORDENADOS");
        System.out.println("Introduce número 1");
        num1 = sc.nextInt();
        System.out.println("Introduce número 2");
        num2 = sc.nextInt();
        System.out.println("Introduce número 3");
        num3 = sc.nextInt();
        sc.close();
        
        if (num1 > num2) {
            if (num2 > num3) {
                mayor = num1;
                menor = num3;
                medio = num2;
                
            } else { if ( num1 > num3) {
                mayor = num1;
                menor = num2;
                medio = num3;
                } else {
                    mayor = num3;
                    menor = num2;
                    medio = num1;

                }
                
            }
    
        } else {
            if (num1 > num3) {
                mayor = num2;
                menor = num3;
                medio = num1;
                
            } else { if ( num2 > num3) {
                mayor = num2;
                menor = num1;
                medio = num3;
                } else {
                    mayor = num3;
                    menor = num1;
                    medio = num2;

                }

            }
        }

        System.out.printf("El orden es: %d %d %d", menor, medio, mayor);
    }
    
}
