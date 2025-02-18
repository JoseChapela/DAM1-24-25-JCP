package ud5.practicas.rol;

public class Personaje {

    private String nombre;
    private enum Raza {HUMANO, ELFO, ENANO, HOBBIT, ORCO, TROLL};
    private Raza raza;
    private int fuerza;
    private int agilidad;
    private int constitucion;
    private int nivel = 1;
    private int experiencia = 0;
    private int hp = 50;

    //CONSTRUCTORES

    public Personaje (String nombre, String raza, int fuerza, int agilidad, int constitucion, int nivel, int experiencia, int hp) {

        if (fuerza < 1 || agilidad < 1 || constitucion < 1 || nivel < 1 || experiencia < 0 || hp < 1) throw new IllegalArgumentException("Parámetros no válidos");

        try {
            this.raza = Raza.valueOf(raza);
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
        this.hp = hp;
    }

    public Personaje (String nombre, String raza, int fuerza, int agilidad, int constitucion) {

        this.hp += constitucion;
    }

    static comprobarRaza () {
        
    }

}
