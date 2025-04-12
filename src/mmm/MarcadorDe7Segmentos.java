package mmm;

import java.util.Arrays;
import java.util.Scanner;

public class MarcadorDe7Segmentos {

    
    public static void main(String[] args) {
        
        //DECLARACION INICIAL
        int num;
        int[] entrada = new int[0];
        Scanner sc = new Scanner(System.in);

        //ENTRADA
        do {
            num = sc.nextInt();
            if(num>=0) {
                insertarNum(entrada, num);
            }    
        } while (num >= 0);

        //DECLARACION POSTERIOR
        boolean[][] numeros = {
            {true,true,true,true,true,true,false},
            {true,true,false,true,true,false,true},
            {true,true,true,true,false,false,true},
            {false,true,true,false,false,true,true},
            {true,false,true,true,false,true,true},
            {true,false,true,true,true,true,true},
            {true,true,true,false,false,false,false},
            {true,true,true,true,true,true,true},
            {true,true,true,true,false,true,true}
        };
        boolean[][] marcador = new boolean[entrada.length][7];

        sc.close();
    }

    static void insertarNum(int[] t, int num) {

        t = Arrays.copyOf(t, t.length+1);
        t[t.length-1]=num;
    }
}