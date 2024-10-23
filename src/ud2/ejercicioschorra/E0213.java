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

        System.out.printf("Para las %d : %d : %d \n", hora, min, sec);

        switch(sec) {

            
            case 59 -> {sec = 0;
                        min++;
                        if (min==60) {
                            min=0;
                            hora++;
                            if (hora>24) {
                                hora = min = sec = 0;
                                
                            }
                        }
                }
            default -> sec++;
        }
        System.out.printf("1 segundo más tarde serán las %d : %d : %d \n", hora, min, sec);
        
        
    }
    
}
