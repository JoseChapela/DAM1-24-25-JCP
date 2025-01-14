/*
 * EP0520. La fusión de dos tablas ordenadas consiste en copiar todos sus elementos (de ambas tablas) en una tercera que deberá seguir ordenada. Podemos realizar una fusión ineficiente copiando los elementos de ambas tablas (sin tener en cuenta el orden) en la tabla final y ordenar esta. Existe una manera óptima de realizar la fusión en la que se elige en cada momento el primer elemento no copiado de alguna de las tablas y se añade a la tabla final, que seguirá ordenada sin necesidad de ordenación alguna. Busca información sobre el algoritmo de fusión e impleméntalo en Java.

public static int[] fusionOrdenada(int[] t1, int[] t2);

 */

package ud4.ejercicios;

public class Fusion {

    public static int[] fusionOrdenada (int[] t1, int[] t2) {

        int[] tz = new int[t1.length + t2.length];

        int i = 0, j = 0, k = 0;

        while (i < t1.length && j < t2.length) {

            if ( t1[i] <= t2[j]) {
                
                tz[k++] = t1[i++];
            } else {

                tz[k++] = t2[j++];
            }
        }

        while (i < t1.length) {
            tz[k++] = t1[i++];
        }


        while (j < t2.length) {
            tz[k++] = t2[j++];
        }

        return tz;
    }

    
}
