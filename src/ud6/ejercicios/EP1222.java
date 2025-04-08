package ud6.ejercicios;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class EP1222<E> {
    public static void main(String[] args) {
        
        String nombre;
        Scanner sc = new Scanner(System.in);
        Collection<String> lista = new LinkedHashSet<>();

        do{

            System.out.println("Introduce un nombre:");
            nombre = sc.nextLine();
            if(!nombre.equalsIgnoreCase("fin"))lista.add(nombre);
        }while(!nombre.equalsIgnoreCase("fin"));

        System.out.println(lista);
    }
    
}
