/**E0212. Pedir el día, mes y año de una fecha e indicar si la fecha es correcta. Hay que
tener en cuenta que existen meses con 28, 30 y 31 días (no se considerarán los años
bisiestos).
 */

package ud2.ejercicioschorra;

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

        dia++;

        switch (mes) {
            case 1,3,5,7,8,10,12:

                correcto = dia > 31;
                break;

            case 2:

                correcto = dia > 28;
                break;
        
            default:
                
                correcto = dia > 30;
                break;
        }
        if (correcto=true) { System.out.println("La fecha es correcta");
            
        }else { System.out.println("La fecha es incorrecta"); }
        
    }
    
}
