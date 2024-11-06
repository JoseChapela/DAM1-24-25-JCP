package ud2;

import java.util.Scanner;

public class Util {

    static boolean esPar(int n) {

        return n % 2 == 0;
    }

    static boolean esBisiesto(int anho) {

        return anho % 400 == 0 || anho % 4 == 0 && anho % 100 != 0;
    }

    static int mayor (int n, int m) {

        return n < m ? m : n;
    }

    static boolean esCasiCero (int n) {

        return n > -1 && n < 1;
    }

}
