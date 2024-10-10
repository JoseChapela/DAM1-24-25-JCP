/*Piloto: Daniel
Copiloto: Jose */

package ud1.ejercicios.parejas;

import java.util.Scanner;

public class receta {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double numPers;
        double manzanas, mlAgua, gAzucar, canela, pielNar, zLimon;
        
        System.out.println("Compota de manzana.");
        System.out.println("https://www.recetasderechupete.com/compota-de-manzana-casera/12509/");
        System.out.println("Receta para 1 persona.\n Ingredientes:\n 1kg y medio de manzanas\n 330mL de agua");
        System.out.println(" 120 gramos de azucar\n 1 rama de canelan la piel de una naranja\n 1 cucharadita de zumo de limon\n");
        System.out.println("Para cuantas personas quieres realizar esta receta?");
        
        numPers = sc.nextInt();
        sc.close();

        manzanas = 1.5*numPers;
        mlAgua = 330*numPers;
        gAzucar = 120*numPers;
        canela = numPers;
        pielNar = numPers;
        zLimon = numPers;

        System.out.printf("Receta para %.0f persona(s).\n Ingredientes:\n %.1f kg(s) de manzanas\n %.0f mL de agua\n", numPers, manzanas, mlAgua);
        System.out.printf(" %.0f gramos de azucar\n %.0f rama(s) de canela \n la piel de %.0f naranja(s)\n %.0f cucharadita(s) de zumo de limon" ,gAzucar, canela, pielNar, zLimon);
                }
}
