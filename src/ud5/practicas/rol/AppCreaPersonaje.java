package ud5.practicas.rol;

import java.util.Scanner;

public class AppCreaPersonaje {
    public static void main(String[] args) {
        
        crearPersonaje();
    }

    static void crearPersonaje () {

        Scanner sc = new Scanner (System.in);
        String nombre;
        String raza;
        int fuerza;
        int agilidad;
        int constitucion;

        Personaje p;

        System.out.println();
        System.out.println("CREA TU PROPIO PERSONAJE DE ROL");

        System.out.println();
        System.out.println("(En cuanto decidas no seguir manualmente, se pondrán los valores por defecto en lso atributos restantes) ");

        nombre = leerNombre();

        if (!RazaSiNo())
        
            p = new Personaje(nombre);
        else{

            raza = leerRaza();
            
            if (!fisicosSiNo())

                p = new Personaje(nombre, raza);

            else{


            }
        } 
    }

    static boolean fisicosSiNo() {

        Scanner sc = new Scanner(System.in);
        char respuesta = 'x';

        while (respuesta != 's' || respuesta != 's' ) {

            System.out.println();
            System.out.println("(OPCIONAL)");
            System.out.println("Introducir atributos físicos del personaje? ( s | n )");
    
            try {
    
                respuesta = sc.nextLine().toLowerCase().charAt(0);
            } catch (Exception e) {
    
                sc.next();
                continue;
            }
        }
        return respuesta == 's';
    }

    static String leerRaza () {

        Scanner sc = new Scanner(System.in);
        String raza = "";

        while (!raza.toUpperCase().matches("HUMANO|ELFO|ENANO|HOBBIT|ORCO|TROLL")) {

            System.out.println();
            System.out.println("Introduce la raza del personaje");
            System.out.println("( HUMANO | ELFO | ENANO | HOBBIT | ORCO | TROLL )");
            raza = sc.nextLine();
        }

        return raza;
    }

    static String leerNombre () {

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("(OBLIGATORIO)");
        System.out.println("Introduce el nombre: ");
        return sc.nextLine();
    }

    static boolean RazaSiNo () {

        Scanner sc = new Scanner(System.in);
        char respuesta = 'x';

        while (respuesta != 's' || respuesta != 's' ) {

            System.out.println();
            System.out.println("(OPCIONAL)");
            System.out.println("Introducir raza del personaje? ( s | n )");
    
            try {
    
                respuesta = sc.nextLine().toLowerCase().charAt(0);
            } catch (Exception e) {
    
                sc.next();
                continue;
            }
        }

        return respuesta == 's';
    }
    
}
