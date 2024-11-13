package ud2.ejerciciosGrandes;

public class calculadoraHumana {
    public static void main(String[] args) {

        final int NUM_MAX = 100;

        int num;
        
        System.out.println("CALCULADORA HUMANA");
        numeroRandom(NUM_MAX);

        

    }

    public static int numeroRandom(int limiteMax){

        return (int)Math.random()*(limiteMax - 1) + 1;

    }

    public static int operation (int num1, int num2){

        int numOp = (int)Math.random()*3;

        switch (numOp) {
            case 0:

                return num1 + num2;

            case 1:

                return num1 - num2;

            case 2:

                return num1 * num2;

            case 3:
                while (num2 == 0 || num2 > num1) {
                    
                    num2 = numeroRandom();
                }
                return num1 / num2;
        
            default:

                return 0;
        }
    }
    
}
