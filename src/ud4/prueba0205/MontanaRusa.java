package ud4.prueba0205;

public class MontanaRusa {
    public static void main(String[] args) {

        int[] alturas1 = {4, 10, 3, 2};
        int[] alturas2 = {10, 3, 2, 4};
        int[] alturas3 = {4, 10, 10, 3, 2};

        System.out.println(contarPicos(alturas1));
        System.out.println(contarPicos(alturas2));
        System.out.println(contarPicos(alturas3));
    }

    private static int contarPicos(int[] alturas) {

        int picos = 0;
        for (int i = 0; i < alturas.length; i++) {

            if (i == 0) {

                if (alturas[i] > alturas[alturas.length-1] && alturas[i] > alturas[i+1]) picos++;
            } else if (i == alturas.length - 1) {

                if (alturas[i] > alturas[0] && alturas[i-1] > alturas[i+1]) picos++;
            } else if (alturas[i] > alturas[i-1] && alturas[i] > alturas[i+1]) picos++;
        }

        return picos;
    }

}
