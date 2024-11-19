/** Escribe un programa que sume los números enteros desde 1 hasta n utilizando recursividad */

package ud2.ejerciciosrecursividad;

public class Suma {
    public static void main(String[] args) {

        int n = 3;

        System.out.println("SUMA DE NUMEROS ENTEROS");
        System.out.println(suma(n));;
        
    }
    
    public static int suma ( int n) {

        if (n == 1) return 1;

        return n += suma(n-1);
    }
}
