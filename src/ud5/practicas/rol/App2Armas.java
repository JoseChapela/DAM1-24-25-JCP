package ud5.practicas.rol;

public class App2Armas {
    public static void main(String[] args) {
        
    PersonajeEx p1 = new PersonajeEx("Valkiria", new Arma("Espada larga", 20, 1000, 60), new Armadura("Escudo de madera", 21, 11, 10, "ESCUDO"), new Armadura("Yelmo de hierro", 22, 22, 5, "YELMO"), new Armadura("Cota de malla", 22, 22, 20, "ARMADURA"));
    
    p1.mostrarArmamento();
    }
}
