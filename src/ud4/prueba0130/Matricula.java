package ud4.prueba0130;

public class Matricula {

    public static void main(String[] args) {
        
        System.out.println(esMatriculaValida("1234bzb"));
    }

    /*
     * Devuelve true si el String que se le pasa como parámetro es una matrícula válida o false en caso contrario. La
función no distinguirá entre mayúsculas y minúsculas.
     */

    private static boolean esMatriculaValida(String matricula) {

        char[] caracteres = matricula.toCharArray();

        if (caracteres.length != 7 ) return false;

        for (int i = 0; i < 4; i++) {

            if (!Character.isDigit(caracteres[i])) return false;
        }

        for (int i = 4; i < 7; i++) {

            if (!Character.isLetter(caracteres[i])) return false;
        }

        return true;
    }

    /*
     * Devuelve el valor de la matrícula siguiente a la que se le pasa como parámetro.

     */
    //private static String siguienteMatricula(String matricula) {

    

    //private static String incrementarLetras (String matricula) 


    

    private static String incrementarDigitos (String matricula) {

        char[] caracteres = matricula.toCharArray();
        
        if (caracteres[3] != '9') {

            caracteres[3] += '1';
        } else if (caracteres[2] != '9') {

            caracteres[2] += '1';
            caracteres[3] = '0';
            } else if (caracteres[1] != '9') {

                caracteres[1] += '1';
                caracteres[2] = '0';
                caracteres[3] = '0';
                } else if (caracteres[0] != '9') {

                    caracteres[0] += '1';
                    caracteres[1] = '0';
                    caracteres[2] = '0';
                    caracteres[3] = '0';
                } else {

                    caracteres[0] = '0';
                    caracteres[1] = '0';
                    caracteres[2] = '0';
                    caracteres[3] = '0';
                    matricula = caracteres.toString();
                    //incrementarLetras(matricula);
                }
        return caracteres.toString();
    }
    
}
