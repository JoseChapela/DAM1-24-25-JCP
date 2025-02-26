package ud5.practicas.rol;

public class Dragon extends Monstruo {
    
    Dragon(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
        
        super(null, Personaje.intAleatorioEntre(100, 200), Personaje.intAleatorioEntre(60, 100), Personaje.intAleatorioEntre(80, 120), Personaje.intAleatorioEntre(120, 250));
    }
}
