/*
 * Realiza a túa propia adaptación do Wordle para xogar en consola coas seguintes
especificacións adicionais:
1. O programa disporá dun array/colección de palabras.
2. Opcional: Ao arrancar, o programa buscará na carpeta do programa/proxecto un
ficheiro de nome “palabras.json” coa colección inicial de palabras. Se non existe tal
ficheiro, o programa iniciará a colección cunha única palabra, por exemplo “XOGAR”
(ou “JUGAR”).
3. En cada execución o programa proporá unha palabra oculta de 5 letras e o xogador
terá 6 intentos para adiviñala.
4. Tras cada intento o programa amosará as letras que está na palabra oculta e na
posición correcta, as que está pero en posición incorrecta e as que non están.
5. Adicionalmente, se a palabra utilizada polo xogador non está na colección de
palabras do programa ofrecerase a posibilidade de engadila á colección para xogar
no futuro.
6. O xogo remata cando o xogador acerta a palabra ou agota os 6 intentos, amosando
unha mensaxe apropiada.
7. Opcional: Antes de rematar a execución do programa gardarase en disco a
colección actual de palabras no ficheiro “palabras.json” sobreescribíndoo se é
necesario.
8. Para almacenar as palabras define unha clase Palabra que teña os seguintes
atributos e métodos:
a. a palabra en sí como un String.
b. o número de veces que a palabra apareceu no xogo como palabra oculta.
c. o número de veces que se acertou a palabra como palabra oculta.
d. o número de veces que a utilizou un xogador para tentar adiviñar a palabra
oculta.
e. estatisticas(): amosa a palabra e os números anteriores.
f. toString(): amosa a palabra.
Constructores, setters e getters axeitados.

 */

package ud4.practicas.wordle;

import java.util.Scanner;

public class Wordle {
    public static void main(String[] args) {

        //DECLARACION DE VARIABLES

        final int NUM_INTENTOS = 6;
        final int NUM_LETRAS = 5;
        int contador = 0;
        String palabraOculta = "coche";
        String entrada = "";

        Scanner sc = new Scanner(System.in);

        Palabra libreria
        
        //BIENVENIDA
        System.out.println("****************");
        System.out.println("_____WORDLE_____");
        System.out.println("");
        
        //MOSTRAR CASILLAS
        showcase();

        //PANTALLA DE JUEGO

        while (contador < NUM_INTENTOS && !entrada.equals(palabraOculta)) {

            System.out.println("Intento " + (contador+1) + "/" + NUM_INTENTOS + ": ");
            entrada = sc.nextLine();
            contador++;
        }

        if (entrada.equals(palabraOculta)) {

            System.out.println("HAS ACERTADO");
        } else {

            System.out.println("HAS PERDIDO");
        }
        
    }

    private static void showcase() {


    }
    
}
