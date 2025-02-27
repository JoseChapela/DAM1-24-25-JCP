package ud5.practicas.rol;

public class Aranha extends Monstruo {
    
    Aranha(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
            
        super(nombre, ataque, defensa, velocidad, puntosVida);
    }
    
    static Aranha generarAranha() {
        
        Aranha aranha = new Aranha (null, Personaje.intAleatorioEntre(30, 80), Personaje.intAleatorioEntre(30, 50), Personaje.intAleatorioEntre(30, 60), Personaje.intAleatorioEntre(30, 100));
        return aranha;
    }

    @Override
    public String toString() {

        String cad = "";
        if ( getNombre() != "") cad = getNombre() + "-";
        return cad + "Aranha (" + getPuntosVida() + ")";
    }
}
