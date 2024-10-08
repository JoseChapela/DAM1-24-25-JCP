package ud1.ejercicios.ejercicios;

import java.util.Scanner;

public class EP0123b {
    public static void main(String[] args) {

        char unidad;
        String unidad2;
        double resultado;
        double cantidad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Para pasar de kg a libras o viceversa, introduce la unidad inicial: libras(p) o kilogramos(k):");
        unidad = sc.nextLine().charAt(0);
        System.out.println("Introduce cantidad en la unidad actual:");
        cantidad = sc.nextDouble();

        resultado = unidad=='p'? cantidad*453.592/1000 : cantidad*1000/453.592;
        unidad2 = unidad=='p'?"kg" :"pounds";

        System.out.println("el resultado es "+resultado+" "+unidad2);

        sc.close();
        
        
    }
    
}
