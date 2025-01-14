/*
 * EP0517. Implementa la función: int[] suma(int t[], int numElementos), que crea y devuelve una tabla con las sumas de los numElementos elementos consecutivos de t. Veamos un ejemplo, sea t= [10, 1, 5, 8, 9, 2]. Si los elementos de t se agrupan de 3 en 3, se harán las sumas:

10 + 1 + 5. Igual a 16.
1 + 5 + 8. Igual a 14.
5 + 8 + 9. Igual a 22. 
8 + 9 + 2. Igual a 19.

Por lo tanto, la función devolverá una tabla con los resultados: [16, 14, 22, 19].

 */

package ud4.ejercicios;

import java.util.Arrays;

public class SumaElementos {
    public static void main(String[] args) {
        
        int[] t = {10, 1, 5, 8, 9, 2};
        int[] resultado = suma( t, 3);
        System.out.println(Arrays.toString(resultado));
    }

    public static int[] suma(int t[], int numElementos) {

        int i = 0, j = 0;
        int[] tz = Arrays.copyOf(t, t.length - numElementos + 1);

        while (i < tz.length) {

            int suma = 0;
            int contador = 0;

            while ( j < numElementos) {

                suma += t[j++];
                contador++;
            }

            j -= contador-1;
            numElementos++;
            tz[i++] = suma;
        }

        return tz;
    }

}
