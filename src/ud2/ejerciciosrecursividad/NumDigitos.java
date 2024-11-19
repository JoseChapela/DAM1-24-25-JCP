/**Escribe un programa que cuente la cantidad de dígitos en un número entero utilizando recursividad */

package ud2.ejerciciosrecursividad;

public class NumDigitos {
    public static void main(String[] args) {

        int n = 12345;

        System.out.println("NUMERO DE DIGITOS DE UN NÚMERO ENTERO");
        System.out.println(NumDigitos(n));
        
    }

    public static int NumDigitos (int n) {

        int m = 1;

        if (n/10 == 0) return 1;

        return m += NumDigitos (n/10);
    }
    
}
