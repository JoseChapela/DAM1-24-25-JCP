/**E0214. Crear una aplicación que solicite al usuario una fecha (día, mes, año) y muestre la
fecha correspondiente al día siguiente. */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0214 {
    public static void main(String[] args) {
        int dia, mes, anho;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce día del mes");
        dia = sc.nextInt();
        System.out.println("Introduce mes");
        mes = sc.nextInt();
        System.out.println("Introduce año");
        anho = sc.nextInt();
        sc.close();

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:

                if (dia==31) {
                    mes++;
                    dia=1;
                    } else {
                    dia++;
                    }
                    if (mes==13) {
                        mes=1;
                        anho++;
                    }
                
                break;

            case 2: 
            
                if (dia==28) {
                    mes++;
                    dia=1;
                    } else {
                    dia++;
                    }
                    if (mes==13) {
                        mes=1;
                        anho++;
                    }

                break;
        
            default:
                if (dia==28) {
                    mes++;
                    dia=0;
                    } else {
                    dia++;
                    }
                if (mes==13) {
                    mes=0;
                    anho++;
                }
                
                    
                break;
        }
        System.out.printf("La fecha de mañana es %d del %d de %d", dia, mes, anho);
    }
    
}
