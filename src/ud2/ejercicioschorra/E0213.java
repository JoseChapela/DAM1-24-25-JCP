/**E0213. Escribir un programa que pida una hora de la siguiente forma: hora, minutos y
segundos. El programa debe mostrar qué hora será un segundo más tarde. Por ejemplo:
hora actual (10:41:59) => hora actual + 1 segundo (10:42:00)*/

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0213 {
    public static void main(String[] args) {
        int hora, min, sec;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce hora");
        hora = sc.nextInt();
        System.out.println("Introduce minutos");
        min = sc.nextInt();
        System.out.println("Introduce segundos");
        sec = sc.nextInt();
        sc.close();

        sec++;

       if (sec>59) {
        min++;
        sec=0;
            if (min>59) {
                hora++;
                min=0;
                    if (hora>23) {
                        hora=0;
                    }
             }
        
        } else {
            sec++;
        }
        System.out.printf("Un segundo más tarde serán las %d : %d : %d", hora, min, sec);
                
    
    }
}
