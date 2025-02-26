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
        hp = maxhp;
    }

    public Personaje (String nombre, String raza, int fuerza, int agilidad, int constitucion) {

        this(nombre, raza, fuerza, agilidad, constitucion, 1, 0, 50 + constitucion);
        
    }

    public Personaje (String nombre, String raza) {

        this(nombre, raza, intAleatorioEntre(1, 100), intAleatorioEntre(1, 100), intAleatorioEntre(1, 100));
    }

    public Personaje (String nombre) {

        this(nombre, "HUMANO");
    }

    //MÉTODOS PÚBLICOS

    public void mostrar () {

        System.out.println();
        System.out.println("INFORMACIÓN DE PERSONAJE");
        System.out.println();
        System.out.println("Nombre: " + this.nombre + "   Nvl: " + this.nivel);
        System.out.println("Raza: " + this.raza.toString());
        System.out.println("Fuerza: " + this.fuerza);
        System.out.println("Agilidad: " + this.agilidad);
        System.out.println("Constitucion: " + this.constitucion);
        System.out.println("Vida: " + hp + "/" + this.maxhp);
        System.out.println();
    }

    public String toString () {

        return String.format(this.nombre + "  (" + hp + "/" + maxhp + ")" );
    }

    public byte sumarExperiencia (int puntos) {

        byte numNiveles = 0;

        if (this.experiencia/1000 != (this.experiencia + puntos) / 1000) 
            numNiveles = (byte)(this.experiencia/1000 - (this.experiencia + puntos) / 1000);

        for (int i = 0; i < numNiveles; i++) subirNivel();
        this.experiencia += puntos;

        return numNiveles;
    }

    public void subirNivel () {

        this.nivel++;
        this.fuerza *= 1.05;
        this.agilidad *= 1.05;
        this.constitucion *= 1.05;
    }

    public void curar () {

        if (this.hp < this.maxhp) 
            this.hp = this.maxhp;
        
    }

    public boolean perderVida (int puntos) {

        this.hp -= puntos;
        if (this.hp <= 0) return true;
        return false;
    }

    public boolean estaVivo () {

        if (this.hp > 0) return true;
        return false;
    }

    public int atacar (Personaje enemigo) {

        int ptsAtaque = (this.fuerza + intAleatorioEntre(1, 100)) - (enemigo.agilidad + intAleatorioEntre(1, 100));

        if (ptsAtaque < 0) ptsAtaque = 0;
        if (ptsAtaque > enemigo.hp) ptsAtaque = enemigo.hp;

        enemigo.hp -= ptsAtaque;
        sumarExperiencia(ptsAtaque);
        enemigo.sumarExperiencia(ptsAtaque);
        
        return ptsAtaque;
    }

    public int atacar (Monstruo m) {

        int ptsAtaque = (this.fuerza + intAleatorioEntre(1, 100)) - (m.getDefensa() + intAleatorioEntre(1, 100));

        if (ptsAtaque < 0) ptsAtaque = 0;
        if (ptsAtaque > m.getPuntosVida()) ptsAtaque = m.getPuntosVida();

        m.perderVida(ptsAtaque);
        sumarExperiencia(ptsAtaque);
        
        return ptsAtaque;        
    }

    public int getAgilidad() {
        return agilidad;
    }

    public int getHp() {
        return hp;
    }

    public String getNombre() {
        return nombre;
    }

    //MÉTODOS PRIVADOS

    static int intAleatorioEntre (int inicio, int fin) {

        Random rnd = new Random();
        return rnd.nextInt(inicio, fin+1);
    }

}
