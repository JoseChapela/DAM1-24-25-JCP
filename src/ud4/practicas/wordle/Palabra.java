/*
 * 
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

public class Palabra {

    private String palabra;
    private int vecesOculta = 0;
    private int vecesAcertada = 0;
    private int vecesIntroducida = 0;

    //CONSTRUCTORES

    Palabra(String palabra){

        this.palabra = palabra;
    }

    //MÉTODOS

    public void estadísticas() {

        System.out.println("Palabra: " + palabra);
        System.out.println("Número de veces que la palabra ha aparecido como oculta: " + vecesOculta);
        System.out.println("Número de veces que la palabra ha sido acertada: " + vecesAcertada);
        System.out.println("Número de veces que la palabra ha sido introducida: " + vecesIntroducida);
    }

    public String toString() {

        return palabra;
    }
}
