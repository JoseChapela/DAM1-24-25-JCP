package ud6.ejercicios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class EP1219<T> {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce frase:");
        String frase = sc.nextLine();
        String[] palabras = frase.split(" ");
        List<String> lista = new ArrayList<>();
        for(int i = 0; i < palabras.length; i++){
            lista.add(palabras[i]);
        }
        List<String> listaConRepetidos = new ArrayList<>(); 
        for (String palabra : lista) {
            if (lista.indexOf(palabra) != lista.lastIndexOf(palabra)) {
                listaConRepetidos.add(palabra);
            }
        }

        List<String> listaSinRepetidos = new ArrayList<>(); 
        for (String palabra : lista) {
            if (lista.indexOf(palabra) == lista.lastIndexOf(palabra)) {
                listaSinRepetidos.add(palabra);
            }
        }

        Set<String> setConRepetidos = new TreeSet<>(listaConRepetidos);
        Set<String> setSinRepetidos = new TreeSet<>(listaSinRepetidos);

        System.out.println("LISTA PALABRAS REPETIDAS:");
        System.out.println(setConRepetidos);

        System.out.println("LISTA PALABRAS NO REPETIDAS:");
        System.out.println(setSinRepetidos);
    }
}
