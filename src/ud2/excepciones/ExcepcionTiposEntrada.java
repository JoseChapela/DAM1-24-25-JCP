package ud2.excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExcepcionTiposEntrada {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int num;
    
        try { num = sc.nextInt();}
        catch (InputMismatchException e) {
            System.out.println("ERROR: Valor no reconocido");
            System.out.println(e.toString());
        }
    }
    
  
}
