/**E0212. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos).
 */

package ud2.ejercicioscondicionales;

import java.util.Scanner;

public class E0212 {
    public static void main(String[] args) {
        
        int dia, mes;
        boolean correcto;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce el dia del mes");
        dia = sc.nextInt();
        System.out.println("Introduce el mes");
        mes = sc.nextInt();
        System.out.println("Introduce el año");
        sc.close();

        switch (mes) {
            case 1,3,5,7,8,10,12:

                correcto = dia <= 31 && dia >=1;
                break;

            case 2:

                correcto = dia > 28 && dia >=1;
                break;

            case 4, 6, 9, 11:

                correcto = dia > 30 && dia >=1;
                break;
        
            default:
                
                correcto = false;
                break;
        }
        if (correcto) { System.out.println("La fecha es correcta");
            
        }else { System.out.println("La fecha es incorrecta"); }
        
    }
    
}
