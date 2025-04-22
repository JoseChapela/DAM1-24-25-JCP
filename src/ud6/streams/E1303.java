package ud6.streams;

import java.util.Arrays;
import java.util.Comparator;

public class E1303 {

    static <T> T max(T[] tabla, Comparator<T> comp){

        Arrays.sort(tabla, comp);

        return tabla[tabla.length-1];
    }

    public static void main(String[] args) {
        
        Cliente[] clientes = {new Cliente("Juan", 13), new Cliente("Maria", 10)};
        Comparator<Cliente> compEdad = (c1, c2) -> c1.edad-c2.edad;
        System.out.println(max(clientes, compEdad).nombre);
    }
    
}
