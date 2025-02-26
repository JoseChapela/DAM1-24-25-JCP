package ud5.practicas.rol;

public class Monstruo {

    //ATRIBUTOS

    private String nombre = "";
    private int ataque;
    private int defensa;
    private int velocidad;
    private int puntosVida;

    //CONSTRUCTORES

    Monstruo(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        this.nombre = nombre;
        this.ataque = ataque;
        this.defensa = defensa;
        this.velocidad = velocidad;
        this.puntosVida = puntosVida;
    }
    
    
    //MÉTODOS

    boolean estaVivo() {

        if (puntosVida > 0) return true;
        return false;
    }

    boolean perderVida (int puntos) {

        puntosVida -= puntos;
        if (puntosVida <= 0) return true;
        return false;
    }

    int atacar (Personaje p) {

        int ptsAtaque = (ataque + Personaje.intAleatorioEntre(1, 100)) - (p.getAgilidad() + Personaje.intAleatorioEntre(1, 100));

        if (ptsAtaque < 0) ptsAtaque = 0;
        if (ptsAtaque > p.getHp()) ptsAtaque = p.getHp();

        p.perderVida(ptsAtaque);
        p.sumarExperiencia(ptsAtaque);

        return ptsAtaque;
    }

    void mostrar() {

        System.out.println();
        System.out.println("INFORMACIÓN DE MONSTRUO");
        System.out.println();
        if (nombre != "") System.out.println("Nombre: " + this.nombre);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defensa: " + defensa);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Vida: " + puntosVida);
        System.out.println();
    } 

    public String toString() {

        
    }

    public int getAtaque() {
        return ataque;
    }

    public int getDefensa() {
        return defensa;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getPuntosVida() {
        return puntosVida;
    }

    
}
