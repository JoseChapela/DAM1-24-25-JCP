/*Piloto: Jose
Copiloto: Daniel */

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class campos {
    public static void main(String[] args) {
        
        double ha, cf, cb, ct, pr;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("Introduce las hectáreas: ");
        ha = sc.nextDouble();
        sc.close();
        ha = ha*10000;

        cf = ha/7350;
        cb = ha/420;
        ct = ha/260.7569;
        pr = ha/1250000;

        System.out.printf("Las medidas en campos son: \n %.2f campos de futbol \n %.2f campos de baloncesto \n %.2f campos de tenis \n %.2f parques del retiro",cf ,cb, ct, pr);

        
    }
    
}
