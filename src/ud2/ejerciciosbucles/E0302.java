/**E0302. Implementar una aplicación para calcular datos estadísticos de las edades de los
alumnos de un centro educativo. Se introducirán datos hasta que uno de ellos sea
negativo, y se mostrará: la suma de todas las edades introducidas, la media, el número
de alumnos y cuántos son mayores de edad.
 */

package ud2.ejerciciosbucles;

import java.util.Scanner;

public class E0302 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int edad, edades, numAlumnos = 0, mayorEdad=0;
        double media = 0;

        System.out.println("MEDIA DE ALUMNOS");
        
        System.out.println("Introduce edad: ");
        edad = sc.nextInt();
        edades = edad;

        while (edad>=0) {

            numAlumnos++;
            System.out.println("Introduce edad: ");
            edad = sc.nextInt();
            edades += edad;
            if (edades >= 18) {

                mayorEdad++;
                
            }
            
         }
        sc.close();

        media = edades/numAlumnos;

        System.out.println("La suma de las edades: "+edades);
        System.out.printf("La media de edad es: %.2f \n", media);
        System.out.println("El número de alumnos es: "+numAlumnos);
        System.out.println("El número de alumnos mayores de edad es: "+mayorEdad);

        
    }
    
}
