import java.util.Arrays;
import java.util.Collections;

public class Casual {

    public static void letras (String frase) {

        char[] letras = frase.toCharArray();
        Arrays.sort(letras);
        char[] letrasInv = new char[letras.length];
        
        for (int i = 0; i < letras.length; i++) 
            letrasInv[i] = letras[letras.length -1 - i];
    }
    
}
