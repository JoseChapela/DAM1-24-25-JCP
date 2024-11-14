package ud2.ejerciciosGrandes;

public class calculadoraHumana {

    static final int NUM_MAX = 100;
    public static void main(String[] args) {

        final int NUM_OPERACIONES = 8;

        int num1, num2;
        
        System.out.println("CALCULADORA HUMANA");

        for (int i = 0 ; i < NUM_OPERACIONES -1 ; i++ ) {

            num1 = numeroRandom(NUM_MAX);
            num2 = numeroRandom(NUM_MAX);
            
        }     

    }

    public static int numeroRandom(int limiteMax){

        return (int)Math.random()*(limiteMax - 1) + 1;

    }

    private static char signoAleatorio () {

        int num = (int) Math.random()*3;
        char signo = num == 0? '+' : num == 1? '-' : num == 2? '*' : '/';
        return signo;    
    }

    public static int operation (int num1, int num2, char signo){

        switch (signo) {
            case '+':

                return num1 + num2;

            case '-':

                return num1 - num2;

            case '*':

                return num1 * num2;

            case '/':
                while (num2 == 0 || num2 > num1) {
                    
                    num2 = numeroRandom(NUM_MAX);
                }
                return num1 / num2;
        
            default:

                return 0;
        }
    }
    
}
