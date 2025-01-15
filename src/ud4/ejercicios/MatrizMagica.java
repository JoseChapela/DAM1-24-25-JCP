/*
 * EP0518. Escribe un programa que solicite los elementos de una matriz de tamaño 4 x 4. La 
aplicación debe decidir si la matriz introducida corresponde a una matriz mágica, que es aquella 
donde la suma de los elementos de cualquier fila o de cualquier columna valen lo mismo.
 */

package ud4.ejercicios;

import java.util.Scanner;

public class MatrizMagica {
    public static void main(String[] args) {
        
        int NUM_ELEMENTOS = 4;

        int[] t = new int[NUM_ELEMENTOS*NUM_ELEMENTOS];
        int k = 0, sumaRows = 0, sumaCols= 0, referencia = 0;
        boolean esMagico = true;

        Scanner sc = new Scanner (System.in);

        for (int i = 0; i < NUM_ELEMENTOS; i++) {

            for (int j = 0; j < NUM_ELEMENTOS; j++) {

                System.out.println("Introduce el elemento: " + (i+1) + (j+1));
                t[k++] = sc.nextInt();
            }
        }

        k = 0;
        
        for ( int i = 0; i < NUM_ELEMENTOS; i++) {

            referencia += t[i];
        }

        for (int j = 0; j < t.length; j += NUM_ELEMENTOS) {

            for (int i = 0; i < NUM_ELEMENTOS; i++) {

                sumaRows += t[i+j];
            } 
            if (sumaRows != referencia) {

                esMagico = false;
                break;
            }          
        }

        if (esMagico = true) {

            for (int i = 0; i < NUM_ELEMENTOS; i++) {

                for (int j = 0; j < t.length; j += NUM_ELEMENTOS) {
    
                    sumaCols += t[i+j];
                } 
                if (sumaCols != referencia) {

                    esMagico = false;
                    break;
                }         
                        
            }
        }

        if (esMagico) {

            System.out.println("Es mágico");
        } else {

            System.out.println("No es magico");
        }

    }
    
}
