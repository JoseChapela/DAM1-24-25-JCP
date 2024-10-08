package ud1.ejercicios;

import java.util.Scanner;

/*Crea un programa que pida la base y la altura de un triángulo y muestre su área.
Área Triángulo = (base * altura) / 2*/

public class EP0112 {
    public static void main(String[] args) {
        float base, altura, resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la base del triángulo");
        base = sc.nextFloat();
        System.out.println("Introduce la altura del triángulo");
        altura = sc.nextFloat();

        resultado = (base*altura)/2;

        System.out.println("El área del triángulo es: "+resultado);

        sc.close();
    }
    
}
