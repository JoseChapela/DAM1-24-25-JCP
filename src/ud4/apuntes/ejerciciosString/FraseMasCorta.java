/**
E0602. Introducir por teclado dos frases e indicar cuál de ellas es la más corta, es decir, la
que contiene menos caracteres.

 */

package ud4.apuntes.ejerciciosString;

import java.util.Scanner;

public class FraseMasCorta {
    public static void main(String[] args) {
        
        String frase1, frase2;
        Scanner sc = new Scanner(System.in);

        System.out.println("FRASE MÁS CORTA");
        System.out.println();
        System.out.println("Introduce primera frase");
        frase1 = sc.nextLine();
        System.out.println("Introduce segunda frase");
        frase2 = sc.nextLine();
        if (frase1.length() > frase2.length()) System.out.println("La frase más corta es la segunda");
            else if (frase1.length() == frase2.length()) System.out.println("Son iguales");
                else System.out.println("La frase más corta es la segunda");

        sc.close();
    }
    
}
