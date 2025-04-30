//José Chapela Pastoriza

package ud6.jcpexamen.genericos;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;

public class UtilGenerico{
    
    static <T> List<T> repetidos (List<T> lista) {

        List<T> listaRepetidos = new ArrayList<>();
        for (T t: lista)
            if(!listaRepetidos.contains(t))
                if (lista.indexOf(t)!=lista.lastIndexOf(t))
                    listaRepetidos.add(t);

        return listaRepetidos;
    }

    static <T> Collection<T> filtrarMayores(Collection<T> coleccion, T elemento, Comparator<T> comparador) {


        List<T> aux = new ArrayList<>(coleccion);
        aux.sort(comparador);
        List<T> listaMayores = new ArrayList<>();
        aux.add(elemento);

        for (int i = aux.indexOf(elemento); i < aux.size(); i++)
            listaMayores.add(aux.get(i));
        listaMayores.remove(elemento);
        Collection<T> mayores = new ArrayList<>(listaMayores);
        return mayores;
    }

    public static void main(String[] args) {
        
        System.out.println("PRIMER MÉTODO");
        List<Integer> enteros = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            enteros.add((int)(Math.random()*10));
        List<Integer> repetidos = repetidos(enteros);
        System.out.println(enteros);
        System.out.println(repetidos);

        System.out.println("SEGUNDO MÉTODO");
        Collection<Integer> enteros2 = new ArrayList<>();
        for (int i = 0; i < 10; i++)
            enteros2.add((int)(Math.random()*10));
        Collection<Integer> repetidos2 = filtrarMayores(enteros2, 4, (n1, n2) -> n1 -n2);
        System.out.println(enteros);
        System.out.println(repetidos2);
    }
}
