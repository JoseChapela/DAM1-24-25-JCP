package ud5.practicas.rol;

public class Dragon extends Monstruo {
    
    Dragon(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
            
        super(nombre, ataque, defensa, velocidad, puntosVida);
    }
    
    static Dragon generarDragon() {
        
        Dragon dragon = new Dragon (null, Personaje.intAleatorioEntre(30, 80), Personaje.intAleatorioEntre(30, 50), Personaje.intAleatorioEntre(30, 60), Personaje.intAleatorioEntre(30, 100));
        return dragon;
    }

    @Override
    public String toString() {

        String cad = "";
        if ( getNombre() != "") cad = getNombre() + "-";
        return cad + "Dragon (" + getPuntosVida() + ")";
    }
}
