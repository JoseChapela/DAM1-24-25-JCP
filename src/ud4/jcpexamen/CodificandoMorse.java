//José Chapela Pastoriza

/* 
TAREA EXTRA PLANTEAMIENTO
La extra se implementariía devolviendo los strings de los puntos como cadena (incluyendo el case [espacio] como puntos, y concatenando todo en una variable String;
Los puntos entre letras se incluirían checkeando si el siguiente caracter de la frase es un letra y se concatenarían los puntos correspondientes;
concatenas los Strings y lo imprimes)
*/

package ud4.jcpexamen;

public class CodificandoMorse {

    public static void main(String[] args) {
        
        System.out.println(numPuntosMorse("YA NACIO"));
    }

    private static int numPuntosMorse(String frase) {

        int suma = 0;
        frase = frase.toUpperCase();
        String letrasValidas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!?";


        char[] letras = frase.toCharArray();
        for (int i = 0; i < frase.length(); i++) {
            if (letrasValidas.indexOf(frase.charAt(i)) >= 0 ) {

                suma += convertirMorse(frase.charAt(i));
                if ( i > 0 && Character.isLetter(frase.charAt(i-1))) suma+= 3;
            }
            if (frase.charAt(i) == ' ') suma += 5;
            
        }
        return suma;
    }

    private static int convertirMorse(char letra) {

        switch (letra) {
            case 'A':   return 5;
                

            case 'B': return 9;
                

            case 'C': return 11;
                

            case 'D': return 7;
                

            case 'E': return 1;
                

            case 'F': return 9;
                

            case 'G': return 9;
                

            case 'H': return 4;
                

            case 'I': return 3;
                

            case 'J': return 13;
                

            case 'K': return 9;
                

            case 'L': return 9;
                

            case 'M': return 7;
                

            case 'N': return 5;
                

            case 'O': return 11;
                

            case 'P': return 11;
                

            case 'Q': return 13;
                

            case 'R': return 7;
                

            case 'S': return 5;
                

            case 'T': return 3;
                

            case 'U': return 7;
                

            case 'V': return 9;
                

            case 'W': return 9;
                

            case 'X': return 11;
                

            case 'Y': return 13;
                

            case 'Z': return 11;
                
            
            case '?': return 15;


            case '!': return 19;


        
            default: return 0;
        }
    }

}
