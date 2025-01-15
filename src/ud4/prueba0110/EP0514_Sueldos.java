package ud4.prueba0110;

import java.util.Arrays;
import java.util.Scanner;

public class EP0514_Sueldos {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        double[] t = new double [100];
        int num = 0;
        double in;

        do{

            System.out.println("Introduce tu sueldo: ");
            in = sc.nextDouble();

            if (in > 0) t[num] = in;
            num++;
            

        }while(in > 0);

        Arrays.sort(t);
        
        for (int i = t.length-1; i >= 0; i--) System.out.println(t[i] + ", ");

            double maximo = t[0];
    
            for(int i = 1; i < t.length; i++)
                if (t[i] > maximo)
                    maximo = t[i];
        
        System.out.println("MÁXIMO = " + maximo);

        double minimo = t[0];
    
            for(int i = 1; i < t.length; i++)
                if (t[i] < minimo)
                    maximo = t[i];

        System.out.println("MÍNIMO = " + minimo);

        sc.close();

        
    }
    
}
