package ud5.practicas.rol;

public class App1Inventario {
    public static void main(String[] args) {

        Item[] items = {new Item("Cota de Malla", 10, 2000), new Item("Espada larga", 3, 10000)};
        PersonajeEx p1 = new PersonajeEx("Arturo", "humano", 10, 10, 10, items);
        System.out.println("1. Inventario de personaje");
        System.out.println("==========================");
        System.out.println();
        p1.mostrarItems();
    }
    
}
