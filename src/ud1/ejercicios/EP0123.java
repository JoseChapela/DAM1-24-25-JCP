package ud1.ejercicios;

import java.util.Scanner;

/*EP0123_ConversionMasa. Escribe un programa que convierta unidades de masa entre kilogramos y libras o viceversa. 
El programa solicitará al usuario la cantidad de masa y la unidad de medida origen (kilogramos o libras).
1 kilogramo = 1000 gramos
1 libra = 453.592 gramos
El programa deberá manejar las conversiones automáticamente y mostrar el resultado al usuario. 
Utiliza el operador ternario para evaluar la unidad de medida introducida por el usuario. El programa mostrará por pantalla el resultado con la unidad de medida adecuada.
 */

public class EP0123 {
    public static void main(String[] args) {
        char unidad;
        double resultado;
        double cantidad;

        Scanner sc = new Scanner(System.in);

        System.out.println("Para pasar de kg a libras o viceversa, introduce la unidad inicial: libras(p) o kilogramos(k):");
        unidad = sc.nextLine().charAt(0);
        System.out.println("Introduce cantidad en la unidad actual:");
        cantidad = sc.nextDouble();

        if(unidad=='k'){

            resultado = cantidad*1000/453.592;
            System.out.println("Son: "+resultado+" libras");            

        }
        else{if(unidad=='p'){
            
            resultado = cantidad*453.592/1000;
            System.out.println("Son: "+resultado+" kilogramos");            


        }

        else{
            System.out.println("Unidad no incluida");


        }
      }

    
        sc.close();


        
        

        
    }
    
}
