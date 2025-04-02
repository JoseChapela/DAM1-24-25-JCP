package ud6.ejercicios;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class E1212 {

     static <E> Set<E> union(Set<E> conjunto1, Set<E> conjunto2) {

        Set<E> setEnComun = new HashSet<>(conjunto1);
        setEnComun.addAll(conjunto2);
        return setEnComun;
     }

     static <E> Set<E> interseccion(Set<E> conjunto1, Set<E> conjunto2){
        Set<E> setInterseccion = new HashSet<>(conjunto1);
        setInterseccion.retainAll(conjunto2);

        return setInterseccion;
    }

    static <E> Set<E> except(Set<E> conjunto1, Set<E> conjunto2) {
        Set<E> setFinal = new LinkedHashSet<>(conjunto1);
        setFinal.removeAll(conjunto2);
        return setFinal;
    }
    
}
