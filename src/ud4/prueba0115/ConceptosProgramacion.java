/*
 * ConceptosProgramacion.java 
Los siguientes términos corresponden a conceptos que el alumnado de programación en 
Java debe conocer:  
 
"Algoritmo", 
"Lenguaje de programación", "Entorno de desarrollo", 
"Compilación", 
"Ejecución", 
"Código fuente", 
"Bytecode", 
"Código objeto" 
 
Realiza un programa que almacene los términos anteriores en un array de datos de tipo 
String y que muestre uno de ellos por pantalla elegido al azar.  
 
Para ello implementa una función que devuelva uno de los términos del array elegido al 
azar, con el siguiente prototipo: 
 
static String fraseAleatoria(String[] t) 
 */

package ud4.prueba0115;

import java.util.Random;

public class ConceptosProgramacion {
    public static void main(String[] args) {
        
        String rnd;

        String[] t = {"Algoritmo", "Lenguaje de programación", "Entorno de desarrollo", "Compilación", "Ejecución", "Código fuente", "Bytecode", "Código objeto" };
        rnd = fraseAleatoria (t);
        System.out.println(rnd);
    }

    static String fraseAleatoria (String[] t) {

        Random rnd = new Random();    

        return t[rnd.nextInt(t.length)];
    }
    
}
