package ud2.blah;

import java.util.Scanner;

public class IFANIDADOS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nota;

        System.out.println("Valórate del 1 al 10");
        nota = sc.nextInt();
        sc.close();

        if (nota < 1 || nota>10) {
            System.out.println("nota no válida");
            
        } else if (nota >=5) {
            System.out.println("Fresco");
            
            
        } else { System.out.println("Haber estudiado");
            
        }
    }
    
}
