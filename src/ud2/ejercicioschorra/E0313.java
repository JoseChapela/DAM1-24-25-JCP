/**E0313. Dadas 6 notas, escribir la cantidad de alumnos aprobados, condicionados (nota
igual a 4) y suspensos. */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0313 {
    public static void main(String[] args) {

        int nota, numAprobados = 0, numSuspensos = 0;
        Scanner sc = new Scanner(System.in);

        for (int alumno = 1; alumno <= 6; alumno++) {
            System.out.println("Introduce nota del " + alumno + " alumno:");
            nota = sc.nextInt();
            if (nota < 5) {
                numAprobados++;
            } else {
                numSuspensos++;
            }
        }

        sc.close();
        System.out.println("Han aprobado " + numAprobados);
        System.out.println("Han supendido " + numSuspensos);
    }
}
