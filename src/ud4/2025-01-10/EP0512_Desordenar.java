package ud4.2025-01-10;

import java.util.Random;

public class EP0512_Desordenar {
    
    static void desordenar (int t[]) {

        for (int i = 0; i < t.length; i++) {

            int num;
            int aux;

            Random rnd = new Random ();
            num = rnd.nextInt(0, t.length);
            aux = t[i];
            t[i] = t[num];
            t[num] = aux;
        }
        
    }

    public static void main(String[] args) {
        
        int[] t1 = {1, 2, 3, 4, 5 };
        
        desordenar(t1);

    }
    
}
