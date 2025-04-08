package ud6.ejercicios;

import java.util.Collection;
import java.util.Scanner;
import java.util.TreeSet;

public class E1223 {

    public static void main(String[] args) {
        
        String nombre;
        Scanner sc = new Scanner(System.in);
        Collection<String> lista = new TreeSet<>();

        do{

            System.out.println("Introduce un nombre:");
            nombre = sc.nextLine();
            if(!nombre.equalsIgnoreCase("fin"))lista.add(nombre);
        }while(!nombre.equalsIgnoreCase("fin"));

        System.out.println(lista);
    }
    
}
