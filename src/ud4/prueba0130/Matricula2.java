package ud4.prueba0130;

public class Matricula2 {

    static char[] letrasMatricula = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z' };

    public static void main(String[] args) {
        
        System.out.println(esMatriculaValida("123"));
        System.out.println(esMatriculaValida("1234BBBB"));
        System.out.println(esMatriculaValida("12A4BBB"));
        System.out.println(esMatriculaValida("12.4BBB"));
        System.out.println(esMatriculaValida("1234BAB"));
        System.out.println(esMatriculaValida("1234BQB"));
        System.out.println(esMatriculaValida("1234BB."));
        System.out.println(esMatriculaValida("1234B5B"));
        System.out.println(esMatriculaValida("1234BúB"));
        System.out.println(esMatriculaValida("1234BÚB"));
        System.out.println(esMatriculaValida("1234BñB"));

        System.out.println(esMatriculaValida("1234BbB"));
        System.out.println(esMatriculaValida("1234BBB"));
        System.out.println(esMatriculaValida("9999BBZ"));
        System.out.println(esMatriculaValida("9999BBD"));
        System.out.println(esMatriculaValida("9999BBP"));
        System.out.println(esMatriculaValida("9999ZZZ"));

        System.out.println(siguienteMatricula("1234BbB"));
        System.out.println(siguienteMatricula("1234BBB"));
        System.out.println(siguienteMatricula("9999BBZ"));
        System.out.println(siguienteMatricula("9999BBD"));
        System.out.println(siguienteMatricula("9999BBP"));
        System.out.println(siguienteMatricula("9999ZZZ"));
    }

    private static boolean esMatriculaValida(String matricula) {

        if (matricula == null) return false;
        if (matricula.length() != 7) return false;
        if (!comprobarLetras(matricula.toUpperCase())) return false;
        if (!comprobarNumeros(matricula)) return false;
        return true;

    }

    private static String siguienteMatricula (String matricula) {

        matricula = incrementarDigitos (matricula);
        if (matricula.substring(0, 4).equals("0000")) matricula = incrementarLetras (matricula);

        return matricula;
    }

    private static String incrementarLetras (String matricula) {

        char[] letras = matricula.substring(4, 7).toCharArray();

        if (letras[2] != 'Z') letras[2] = letrasMatricula[letrasMatricula.toString().indexOf(letras[2] + 1)];

        else  if (letras[1] != 'Z') letras[1] = letrasMatricula[letrasMatricula.toString().indexOf(letras[1] + 1)];

        else  if (letras[0] != 'Z') letras[0] = letrasMatricula[letrasMatricula.toString().indexOf(letras[0] + 1)];

        String nuevaMatricula = "";

        for (int i = 0; i < letras.length; i++) nuevaMatricula += letras[i];

        return "0000" + nuevaMatricula;
    }

    private static String incrementarDigitos (String matricula) {


        int num = Integer.parseInt(matricula.substring(0, 4));
        num++;
        
        if (num == 10000)  return String.format("0000" + matricula.substring(4, 7));
        return String.format("%4d" + matricula.substring(4, 7), num);
    }

    private static boolean comprobarNumeros (String matricula) {

        for (int i = 0; i < 4; i++) {
            if (!Character.isDigit(matricula.charAt(i))) return false;
        }
        return true;
    }

    private static boolean comprobarLetras (String matricula) {

        boolean flag = true;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < letrasMatricula.length; j++) {
                if (matricula.substring(4).charAt(i) == letrasMatricula[j]) {
                    flag = true;
                    break;
                }
                flag = false;
            }
            if (!flag) break;
        }

        return flag;
    }
    
}
