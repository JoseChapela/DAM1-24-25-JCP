package ud4.apuntes;

import java.util.Scanner;

public class ClaseCharacter {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce un carácter");
        char caracter = sc.nextLine().charAt(0);

        System.out.println("Es un dígito? : " + Character.isDigit(caracter));
        System.out.println("Es una letra? : " + Character.isLetter(caracter));
        System.out.println("Es un dígito o una letra? : " + Character.isLetterOrDigit(caracter));
        System.out.println("Es mayúscula?: " + Character.isUpperCase(caracter));
        if(Character.isUpperCase(caracter)) System.out.println(" " + Character.toLowerCase(caracter));
        System.out.println("Es minúscula?: " + Character.isLowerCase(caracter));
        if(Character.isLowerCase(caracter)) System.out.println(" " + Character.toUpperCase(caracter));

        
    }
    
}
