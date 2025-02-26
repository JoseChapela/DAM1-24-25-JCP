package ud5.practicas.rol;

public class Orco extends Monstruo{

    //CONSTRUCTORES

    

    Orco(String nombre, int ataque, int defensa, int velocidad, int puntosVida) {
            
        super(nombre, ataque, defensa, velocidad, puntosVida);
    }
    
    static Orco generarOrco() {
        
        Orco orco = new Orco (null, Personaje.intAleatorioEntre(30, 80), Personaje.intAleatorioEntre(30, 50), Personaje.intAleatorioEntre(30, 60), Personaje.intAleatorioEntre(30, 100));
        return orco;
    }
     
    @Override
    public String toString() {

        String cad = "";
        if ( getNombre() != "") cad = getNombre() + "-";
        return cad + "Orco (" + getPuntosVida() + ")";
    }


}
