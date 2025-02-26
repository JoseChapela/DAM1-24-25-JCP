package ud5.practicas.rol;

public class Aranha extends Monstruo {
    
    Aranha (String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        
        super(null, Personaje.intAleatorioEntre(10, 50), Personaje.intAleatorioEntre(20, 40), Personaje.intAleatorioEntre(40, 70), Personaje.intAleatorioEntre(30, 80));
    }
}
