/**E0412. Diseñar una función recursiva que calcule el enésimo término de la serie de
Fibonacci. En esta serie el enésimo valor se calcula sumando los dos valores anteriores
de la serie, es decir:
fibonacci(n) = fibonacci(n-1) + fibonacci(n-2)
fibonacci(1) = 1
fibonacci(0) = 1 */

package ud2.ejerciciosrecursividad;

public class E0412 {
    public static void main(String[] args) {
        
        System.out.println("ENÉSIMO TÉRMINO DE LA SERIE FIBONACCI");

        System.out.println(fibonacci(3));
    }

    public static int fibonacci (int n){

        if (n>1) {
            
            return fibonacci2(n);
        } else {

            return 1;
        }
        

    }

    public static int fibonacci2 (int n){


        if (n>=2) {
            
        return n = fibonacci2(n-1) + fibonacci2 (n-2);

        } else {

            return n;
        }
    }


    
}
