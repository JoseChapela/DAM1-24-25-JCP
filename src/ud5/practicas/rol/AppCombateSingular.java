package ud5.practicas.rol;

public class AppCombateSingular {
    public static void main(String[] args) {
        
        Personaje p1 = new Personaje("Boromir", "Humano");
        Personaje p2 = new Personaje ("Legolas", "Elfo");
        Personaje primero, segundo;

        if (p1.getAgilidad() > p2.getAgilidad()) {

            primero = p1;
            segundo = p2;
        } else if (p1.getAgilidad() > p2.getAgilidad()) {

            primero = p2;
            segundo = p1;
        } else {

            if (Math.round(Math.random(1.0)) == 0) 
        }
    }
    
}
