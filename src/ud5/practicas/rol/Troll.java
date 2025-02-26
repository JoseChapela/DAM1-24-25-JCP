package ud5.practicas.rol;

public class Troll extends Monstruo {
    
    Troll(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
            
        super(nombre, ataque, defensa, velocidad, puntosVida);
    }
    
    static Troll generarTroll() {
        
        Troll troll = new Troll (null, Personaje.intAleatorioEntre(30, 80), Personaje.intAleatorioEntre(30, 50), Personaje.intAleatorioEntre(30, 60), Personaje.intAleatorioEntre(30, 100));
        return troll;
    }

    @Override
    public String toString() {

        String cad = "";
        if ( getNombre() != "") cad = getNombre() + "-";
        return cad + "Troll (" + getPuntosVida() + ")";
    }
}
