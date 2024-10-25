/**Año Bisiesto (Bisiesto.java). Haz un programa que pida por teclado un número de año y que
muestre un mensaje indicando si el año es bisiesto o no.
Investiga el agoritmo para calcular si un año es bisiesto o no.
“Año bisiesto es el divisible entre 4, salvo que sea año secular es decir divisible por 100, en cuyo
caso también ha de ser divisible entre 400.” */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class E0Bisiesto {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int anho;

        System.out.println("ES EL AÑO BISIESTO?");
        System.out.println("Introduce el año:");
        anho = sc.nextInt();
        sc.close();

        if (anho%400==0 || anho%4==0 && anho %100!=0){
            System.out.println("Es bisiesto");
            
        } else{
            System.out.println("No es bisiesto");
            
        }
        
    }
    
}
