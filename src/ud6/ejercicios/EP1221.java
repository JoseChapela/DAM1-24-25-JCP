package ud6.ejercicios;

import java.util.Collection;
import java.util.Random;
import java.util.TreeSet;

public class EP1221<E> {
    public static void main(String[] args) {

        Random rnd = new Random();

        Collection<Integer> numeros = new TreeSet<>();
        while(numeros.size()<20) {
            numeros.add(rnd.nextInt(0, 101));
        }
        System.out.println(numeros);
    }
    
}
