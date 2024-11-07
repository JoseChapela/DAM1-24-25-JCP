package ud2;

public class Util {

    public static boolean esPar(int n) {

        return n % 2 == 0;
    }

    public static boolean esBisiesto(int anho) {

        return anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
    }

    public static int mayor (int n, int m) {

        return n < m ? m : n;
    }

    public static boolean esCasiCero (int n) {

        return n > -1 && n < 1;
    }

    public static String notaEnTexto (double nota) {
        
        String notaEnTexto = "";

        if (nota >=0 && nota < 5) {
            notaEnTexto = "insuficiente";
        } else if ( nota >= 5 && nota < 6){
            notaEnTexto = "Suficiente";
        } else if ( nota >= 6 && nota < 7){
            notaEnTexto = "Bien";
        } else if ( nota >= 7 && nota < 9){
            notaEnTexto = "Notable";
        } else if ( nota >= 9 && nota <= 10){
            notaEnTexto = "Sobresaliente";
        }

        return notaEnTexto;
    }

}
