package ud5.practicas.rol;

import java.util.Random;

public class Personaje {

    private String nombre;
    private enum Raza {HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL};
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int nivel = 1;
    private int experiencia = 0;
    private int maxhp = 50;
    private int hp;

    //CONSTRUCTORES

    public Personaje (String nombre, String raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, int maxhp) {

        if (fuerza < 1 || agilidad < 1 || constitucion < 1 || nivel < 1 || experiencia < 0 || maxhp < 1) throw new IllegalArgumentException("Parámetros no válidos");

        try {
            this.raza = Raza.valueOf(raza.toUpperCase());
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Parámetros no válidos");
        }

        this.nombre = nombre;
        this.fuerza = fuerza;
        this.agilidad = agilidad;
        this.constitucion = constitucion;
        this.nivel = nivel;
        this.experiencia = experiencia;
        this.maxhp = maxhp;
    }

    public Personaje (String nombre, String raza, int fuerza, int agilidad, int constitucion) {

        this(nombre, raza, fuerza, agilidad, constitucion, fuerza, agilidad, constitucion);
        this.maxhp += constitucion;
    }

    public Personaje (String nombre, String raza) {

        this(nombre, raza, intAleatorioEntre(1, 100), intAleatorioEntre(1, 100), intAleatorioEntre(1, 100));
    }

    public Personaje (String nombre) {

        this(nombre, "HUMANO");
    }

    //MÉTODOS PÚBLICOS

    public void mostrar () {

        System.out.println("INFORMACIÓN DE PERSONAJE");
        System.out.println();
        System.out.println("Nombre: " + this.nombre + "   Nvl" + this.nivel);
        System.out.println("Raza: " + this.raza.toString());
        System.out.println("Fuerza: " + this.fuerza);
        System.out.println("Agilidad: " + this.agilidad);
        System.out.println("Constitucion: " + this.constitucion);
        System.out.println("Vida: " + hp + "/" + this.maxhp);
    }

    public String toString () {

        return String.format(this.nombre + "  (" + hp + "/" + maxhp + ")" );
    }

    //MÉTODOS PRIVADOS

    private static int intAleatorioEntre (int inicio, int fin) {

        Random rnd = new Random();
        return rnd.nextInt(inicio, fin+1);
    }

}
