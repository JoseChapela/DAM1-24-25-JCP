/**EP0217. Realiza el “juego de la suma”, que consiste en que aparezcan dos números
aleatorios (comprendidos entre 1 y 99) que el usuario tiene que suma */

package ud2.ejercicioschorra;

import java.util.Scanner;

public class EP0217 {
    public static void main(String[] args) {

        final int MIN = 1, MAX = 99;
        int num1, num2, resultado, respuesta;
        String frase;
        Scanner sc = new Scanner (System.in);
       
        do {
        num1 = (int) (Math.random() * ( MAX - MIN +1)) +MIN;
        num2 = (int) (Math.random() * ( MAX - MIN +1)) +MIN;

        System.out.println("Suma los números: "+num1+" y "+num2+"");
        respuesta = sc.nextInt();

        resultado = num1+num2;

        frase = resultado ==respuesta? "Has acertado" : "\nHas fallado.\nVuelve a intentarlo: \n";
    

        System.out.println(frase);

        } while (respuesta != resultado);
        sc.close();

        
    }
    
}
