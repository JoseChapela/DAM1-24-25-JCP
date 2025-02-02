package casual;

import java.util.Arrays;

public class Pruebas {
    public static void main(String[] args) {
        
        int[] t = {2, 4, 6};
        int[] a;

        a = Arrays.copyOf(t, t.length);

        System.out.println(Arrays.toString(a));
    }
    
}
