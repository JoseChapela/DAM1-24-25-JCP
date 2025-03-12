package ud5.practicas.rol;

import java.util.Scanner;

public class AppCreaPersonaje {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        Personaje p = null;

        while (flag) {

            try {

                p = crearPersonaje();
            } catch (Exception e) {

                System.out.println("Has introducido algún valor inválido. Vuelve a intentarlo");
                sc.next();
                continue;
            }

            flag = false;
        }

        System.out.println();
        System.out.println("Personaje creado");
        System.out.println();
        p.mostrar();
        sc.close();
    }
    
    static Personaje crearPersonaje() {
        
        Scanner sc = new Scanner(System.in);
        String nombre, raza;
        int fuerza, agilidad, constitucion, nivel, experiencia, maxhp;
        boolean decision;

        System.out.println();
        System.out.println("*********************");
        System.out.println("CREACIÓN DE PERSONAJE");
        System.out.println("**********************");
        System.out.println();
        System.out.println("Todos los atributos deben ser positivos. (Experiencia puede ser 0)");
        System.out.println();
        System.out.println("Introduce nombre:");
        nombre = sc.nextLine();
        System.out.println();
        System.out.println("Introduce raza:");
        raza = sc.nextLine();

        System.out.println();
        System.out.println("Seguir con la creación manualmente? ( s | n )");
        decision = leerDecision();
        if (!decision) {

            Personaje p = new Personaje(nombre, raza);
            return p;
        }

        System.out.println();
        System.out.println("Introduce fuerza:");
        fuerza = sc.nextInt();
        System.out.println();
        System.out.println("Introduce agilidad:");
        agilidad = sc.nextInt();
        System.out.println();
        System.out.println("Introduce constitucion:");
        constitucion = sc.nextInt();

        System.out.println();
        System.out.println("Seguir con la creación manualmente? ( s | n )");
        decision = leerDecision();
        if (!decision) {

            Personaje p = new Personaje(nombre, raza, fuerza, agilidad, constitucion);
            return p;
        }

        System.out.println();
        System.out.println("Introduce nivel");
        nivel = sc.nextInt();
        System.out.println();
        System.out.println("Introduce experiencia");
        experiencia = sc.nextInt();
        System.out.println();
        System.out.println("Introduce salud inicial");
        maxhp = sc.nextInt();

        Personaje p = new Personaje(nombre, raza, fuerza, agilidad, constitucion, nivel, experiencia, maxhp);
        return p;
    

    }

    static boolean leerDecision () {

        Scanner sc = new Scanner(System.in);
        char entrada;
        entrada = 'x';
        while (entrada != 's' && entrada != 'n') {

            try {

                entrada = sc.nextLine().toLowerCase().charAt(0);
            }
            catch (Exception e) {
    
                System.out.println();
                System.out.println("Entrada incorrecta - Valores válidos ->( s | n )");
                sc.next();
                entrada = 'x';
            }
            if (entrada != 's' && entrada != 'n') {

                System.out.println();
                System.out.println("Entrada incorrecta - Valores válidos ->( s | n )");
            }
        }

        return entrada == 's';
    }
}
