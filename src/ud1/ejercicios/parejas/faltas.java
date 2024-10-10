/*Piloto: Jose
Copiloto: Daniel */

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class faltas {
    public static void main(String[] args) {
        
    final double HORASPROGRAM = 240, PAPER = 0.06, PEVA = 0.1;
    final String PROGRAM = "Programacion";
    double faltas, numSesiones, fAper, fEva;
    String respuesta;
    
    numSesiones= HORASPROGRAM*60/50;
    fAper = numSesiones*PAPER;
    fEva = numSesiones*PEVA;
    

    System.out.printf("El módulo de %s consta de %.0f sesiones\n %.0f faltas supone un apercibimiento\n %.0f faltas supone la pérdida de la evaluación continua\n", PROGRAM, numSesiones, fAper, fEva);

    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce el número de faltas de asistencia");
    faltas = sc.nextInt();
    sc.close();

    respuesta = faltas >= fEva ? "Has perdido la evaluación continua": faltas >= fAper ? "Recibes un apercibimiento":"Todo correcto";

    System.out.println(respuesta);
   

    }
    
}
