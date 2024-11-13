package ud2.blah;

import java.util.Scanner;

public class MetodoVoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String cadena;
        char letra;
       
        System.out.print("Introduce cadena de texto: ");
        cadena = sc.nextLine();
        System.out.println("Introduce letra para cuadro;");
        letra = sc.nextLine().charAt(0);
      
        cajaTexto(cadena, letra); // llamada al método

        sc.close();
    }

    // método que muestra un String rodeado por un borde
    public static void cajaTexto(String str, char letra) {
        int n = str.length(); // longitud del String
        
        imprimirLinea(n, letra);
        System.out.println(letra+" " + str + " "+letra); // cadena con un borde en cada lado
        imprimirLinea(n, letra);
    }

    public static void imprimirLinea(int n, char letra) {
        for (int i = 1; i <= n + 4; i++) { // borde de arriba
            System.out.print(letra);
        }
        System.out.println();
    }

        
}