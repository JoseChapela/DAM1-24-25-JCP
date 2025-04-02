package ud6.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class E1210 {

    public static void main(String[] args) {

        Random rd = new Random();

        List<Integer> lista = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            lista.add(rd.nextInt(0, 10));
        }

        Set<Integer> sinRepetidos = new TreeSet<>();
        for (int i = 0; i < lista.size(); i++) {
            sinRepetidos.add(lista.get(i));
        }

        Set<Integer> elementosRepetidos = new TreeSet<>();
        for (Integer numero : lista) {
            if (lista.indexOf(numero) != lista.lastIndexOf(numero)) {
                elementosRepetidos.add(numero);
            }
        }

        Set<Integer> elementosSinRepetir = new TreeSet<>();
        for (Integer numero : lista) {
            if (lista.indexOf(numero) == lista.lastIndexOf(numero)) {
                elementosSinRepetir.add(numero);
            }
        }

    }

}
