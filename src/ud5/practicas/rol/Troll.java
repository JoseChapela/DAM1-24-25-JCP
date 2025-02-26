package ud5.practicas.rol;

public class Troll extends Monstruo {
    
    Troll(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        
        super(null, Personaje.intAleatorioEntre(60, 120), Personaje.intAleatorioEntre(50, 70), Personaje.intAleatorioEntre(20, 40), Personaje.intAleatorioEntre(100, 200));
    }
}
