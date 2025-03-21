package ud6.ejercicios;

import java.util.Arrays;

public class E1201_MetodosGenericos {
    static <U> int numeroDeNulos(U[] tabla) {
        int cont = 0;
        for (U e : tabla)
            if (e == null) 
                cont++;
        return cont;
    }

    public static <U> U[] add(U e, U[] t) {
        
        t = Arrays.copyOf(t, t.length+1);
        t[t.length - 1] = e;
        return t;
    }

    public static <U> boolean buscar(U e, U[] t) {
        for (int i = 0; i < t.length; i++) {
            if (t[i].equals(e)) return true;
        }
        return false;
    }

    public static <U> U[] concatenar(U[] t1, U[] t2) {
        t1 = Arrays.copyOf(t1, t1.length+t2.length);
        System.arraycopy(t2, 0, t1, t1.length - t2.length, t2.length);
        return t1;
    }

    public static <U, V> U[] concatenar2(U[] t1, V[] t2) {
        t1 = Arrays.copyOf(t1, t1.length+t2.length);
        System.arraycopy(t2, 0, t1, t1.length - t2.length, t2.length);
        return t1;
    }
}