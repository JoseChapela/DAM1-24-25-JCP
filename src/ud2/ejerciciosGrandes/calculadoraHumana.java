package ud2.ejerciciosgrandes;

import java.util.Scanner;

public class CalculadoraHumana {
   
    static final int OPERANDO_MAX = 20, RESULTADO_MAX = 200;
    
    public static void main(String[] args) {
    
        final int NUM_OPERACIONES = 7;

        int num1, num2, resultado, respuesta, aciertos = 0, fallos = 0;
        char signo;

        Scanner sc = new Scanner(System.in);

        System.out.println("CALCULADORA HUMANA");

        num1 = numeroRandom(OPERANDO_MAX);

        for (int i = 0; i < NUM_OPERACIONES ; i++) {
            
            do {
                
                num2 = numeroRandom(OPERANDO_MAX);
                signo = signoAleatorio();
                resultado = operation(num1, num2, signo);
            } while (resultado > RESULTADO_MAX || resultado < 0);

            System.out.println("******************************");
            System.out.println(num1 + "" + signo + "" + num2 + " ?");
            System.out.println("******************************");
            System.out.println();
            respuesta = sc.nextInt();

            num1 = num2;

            if (respuesta == resultado) {

                aciertos++;
                System.out.println("HAS ACERTADO");
                System.out.println("Llevas acertados "+aciertos);

            } else {

                fallos++;
                System.out.println("HAS FALLADO");
                System.out.println("Llevas fallados "+fallos);

            }

        }
        sc.close();

    }

    public static int numeroRandom(int limiteMax) {

        return (int) (Math.random() * (limiteMax - 1) + 1);

    }

    private static char signoAleatorio() {

        int num = (int) (Math.random() * 3);
        char signo = num == 0 ? '+' : num == 1 ? '-' : num == 2 ? '*' : '/';
        return signo;
    }

    public static int operation(int num1, int num2, char signo) {

        switch (signo) {
            case '+':

                return num1 + num2;

            case '-':

                return num1 - num2;

            case '*':

                return num1 * num2;

            case '/':

                if (num2 == 0 || num2 > num1 || num1%num2 != 0 ) {
                    return -1;

                } else {
                    return num1 / num2;
                }

            default:

                return 0;
        }
    }

}
