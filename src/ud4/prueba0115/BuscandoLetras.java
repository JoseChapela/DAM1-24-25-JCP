/*
 * BuscandoLetras.java 
La siguiente función (método de la clase String) permite convertir un String en un array de 
caracteres (elementos de tipo char): 
 
public char[] toCharArray() 
 
Ejemplo de uso:  
 
String cadena = "Hola Mundo"; 
char[] tablaChar = cadena.toCharArray(); 
 
Crea una función que reciba una cadena de caracteres y una letra como parámetros de 
entrada y que devuelva un array con las posiciones en que aparece dicha letra en la 
cadena. La numeración de posiciones comenzará en el 0, y si no se encuentra la letra la 
función devolverá un array vacío. Utiliza el siguiente prototipo: 
 
static int[] buscarLetra(String cadena, char letra) 
 
Amplía el programa “Conceptos de programación” para solicitar repetidamente una letra por 
teclado al usuario e indicar si existe o no en el término elegido al azar, cuantas veces 
aparece y en que posiciones.  
La clase Scanner de Java no dispone de un método nextChar() para leer caracteres. En su 
lugar, para leer una letra de teclado puedes usar el método next() de la clase Scanner para 
leer un String y acceder al carácter de la primera posición de la siguiente forma: 
 
char letra = sc.next().charAt(0); 
 
El bucle de entrada de letras terminará al introducir una letra que no se encuentre. 
 
 */

package ud4.prueba0115;

import java.util.Arrays;

public class BuscandoLetras {

    static int[] buscarLetra(String cadena, char letra) {

        char[] tablaChar = cadena.toCharArray();
        int[] t = new int[0];

        int contar = 0;

        for (int i = 0; i < tablaChar.length; i++)
            if (tablaChar[i] == letra) {
                t = Arrays.copyOf(t, t.length +1);
                t[contar] = i;
                contar++;
            }
                
        return t;
    }
    
}
