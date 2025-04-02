/*
E1213. Implementar la clase Sorteo con parámetros genéricos. Deberá guardar un 
conjunto de valores distintos de tipo genérico, suministrados por consola y será capaz de 
generar una combinación premiada de un tamaño determinado. Deberán implementarse. 
como minimo, los métodos: 
●  boolean add (T elemento) que añadirá un elemento nuevo al conjunto de 
valores posibles en una apuesta. Si el elemento se añade, devuelve true y, en 
caso contrario, debido a que ya estaba presente, false. 
●  Set<T> premiados (int numPremiados)  que devolverá una combinación 
ganadora de numPremiados elementos distintos. 
 */

package ud6.ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Sorteo<T> {

    Set<T> valores = new HashSet<>();

    boolean add (T elemento) {

        return valores.add(elemento);
    }

    Set<T> premiados (int numPremiados) {

        List<T> ganador = new ArrayList<T>();
       ganador.addAll(valores);
       for (int i = 0; i < numPremiados; i++) {
       }
       //cogeria aleatroio y despues lo meteria en un set
        
        return ganador;
    }
}
