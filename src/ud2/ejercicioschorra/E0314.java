/**E0314. Diseñar una aplicación que muestre las tablas de multiplicar del 1 al 10. */

package ud2.ejercicioschorra;

public class E0314 {
    public static void main(String[] args) {

        System.out.println("TABLAS DE MULTIPLICAR");
        for (int i = 1 ; i <= 10 ; i++ ) {
            for (int j = 1 ; j <= 10 ; j++) {
            System.out.printf("%10s \t *", i*j);
            }
            System.out.println("");
            System.out.println("");
        }
        
    }
    
}
