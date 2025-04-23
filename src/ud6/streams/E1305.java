package ud6.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class E1305 {

    public static void main(String[] args) {
        
        List<Integer> enteros= new ArrayList<>();
        for (int i = 0; i < 10; i++) 
            enteros.add(Integer.valueOf((int)(Math.random()*10)));
        
        System.out.println(enteros);
        List<Double> raices = transformar(enteros, c -> Math.sqrt(c));
        System.out.println(enteros);
        System.out.println(raices);
    }

    static <T, V> List<V> transformar(List<T> t, Function<T, V> f) {

        List<V> lista = new ArrayList<>();
        for (T e: t) lista.add(f.apply(e));
        return lista;
    }
    
}
