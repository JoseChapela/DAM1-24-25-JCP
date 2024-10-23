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
        dia++;

        switch (mes) {
            case 1, 3, 5, 7, 8, 10, 12:
                if (dia>31) {
                    mes++;
                    dia=1;
                    if (mes>12) {
                        anho++;
                        mes=1;
                    }
                }
                break;
            
            case 2:
                if (dia>28) {
                    mes++;
                    dia=1;
                    if (mes>12) {
                        anho++;
                        mes=1;
                    }
                }
                break;
        
            default:
                if (dia>30) {
                    mes++;
                    dia=1;
                    if (mes>12) {
                        anho++;
                        mes=1;
                    }
                }
                break;
        }
        System.out.printf("El día de mañana será %d de %d del año %d", dia, mes, anho);
    }
    
}
