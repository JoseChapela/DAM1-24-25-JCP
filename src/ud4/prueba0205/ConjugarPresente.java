package ud4.prueba0205;

import java.util.Scanner;

public class ConjugarPresente {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String entrada = " ";
        String[] pronombres = {"Yo", "Tú", "Él/Ella", "Nosotros", "Vosotros", "Ellos/Ellas"};

        System.out.println("CONSTRUCTOR DE CONJUGACIONES");

        while (!entrada.equalsIgnoreCase("fin")) {

            System.out.println("INTRODUCE UN VERBO EN INFINITIVO");
            entrada = sc.nextLine();
            System.out.println("(Para salir introduce 'fin')");

            String[] conjugado = conjugarPresente(entrada); 

            System.out.println();

            if (!entrada.substring(entrada.length()-2, entrada.length()).matches("([aei]r)$")) {

                entrada = " ";
                System.out.println();
                System.out.println("Verbo inválido");
                System.out.println();
                continue;
            }
          
            for (int i = 0; i < 6; i++) {
                System.out.print(pronombres[i]);
                System.out.print("\t\t\t\t");
                System.out.println(conjugado[i]);
    
            }

            System.out.println();

        }
        sc.close();
    }

    //PRESENTE      Despúes sería añadir en cada conjugacion otros tiempos verbales y que devuelva el que corresponda

    private static String[] conjugarPresente(String verbo) {

        if (!verbo.substring(verbo.length()-2, verbo.length()).matches("([aei]r)$")) return null;

        String raiz = verbo.substring(0, verbo.length()-2);
        String[] verboConjugado = new String[6];
        String[] conjugacion1 = {"o", "as", "a", "amos", "áis", "an"};
        String[] conjugacion2 = {"o", "es", "e", "emos", "éis", "en"};
        String[] conjugacion3 = {"o", "es", "e", "imos", "ís", "en"};

        if (verbo.charAt(verbo.length()-2) == 'a') {
            for (int i = 0; i < 6; i++) {

                verboConjugado[i] = raiz + conjugacion1[i];
            }
        }

        if (verbo.charAt(verbo.length()-2) == 'e') {
            for (int i = 0; i < 6; i++) {

                verboConjugado[i] = raiz + conjugacion2[i];
            }
        }

        if (verbo.charAt(verbo.length()-2) == 'i') {
            for (int i = 0; i < 6; i++) {

                verboConjugado[i] = raiz + conjugacion3[i];
            }
        }

        return verboConjugado;
    }
    
}
