package ud5.practicas.rol;

public class PersonajeEx extends Personaje {

    private int monedas;
    private Item[] items;
    private int cargaMax;
    Item itemManoIzq;
    Item itemManoDch;
    Item armaduraCabeza;
    Item armaduraCuerpo;

    public PersonajeEx (String nombre, Item itemManoIzq, Item itemManoDch, Item armaduraCabeza, Item armaduraCuerpo) {

        super(nombre);

        if (itemManoIzq instanceof Arma) {

            Arma arma = (Arma)itemManoIzq;
            if (arma.getDosManos() && itemManoDch != null) throw new IllegalArgumentException("Si el arma es a dos manos, debes marcar la otra mano como null");
        }

        if (itemManoDch instanceof Arma) {

            Arma arma = (Arma)itemManoDch;
            if (arma.getDosManos() && itemManoIzq != null) throw new IllegalArgumentException("Si el arma es a dos manos, debes marcar la otra mano como null");
        }

        this.itemManoIzq = itemManoIzq;
        this.itemManoDch = itemManoDch;
        this.armaduraCabeza = armaduraCabeza;
        this.armaduraCuerpo = armaduraCuerpo;
    }

    public PersonajeEx(String nombre, String raza, int fuerza, int agilidad, int constitucion, int monedas, Item[] items) {

        super(nombre, raza, fuerza, agilidad, constitucion);
        this.monedas = monedas;
        this.items = items;
        cargaMax = 50 + constitucion*2;
    }

    public PersonajeEx(String nombre, String raza, int fuerza, int agilidad, int constitucion, Item[] items) {

        this(nombre, raza, fuerza, agilidad, constitucion, 0, items);
    }

    public int getMonedas() {
        return monedas;
    }

    public Item[] getItems() {
        return items;
    }

    boolean addToInventario (Item item) {

        return getPesoActual() + item.getPeso() <= cargaMax;
    }

    double getPesoActual() {

        double pesoTotal = 0;
        for (int i = 0; i < items.length; i++) {

            pesoTotal += items[i].getPeso();
        }
        return pesoTotal;
    }

    public void mostrarItems() {

        double cargaTotal = 0;

        System.out.println("Inventario de " + super.getNombre());
        
        for (int i = 0; i < items.length; i++) {

            System.out.println(i+1 + ". " + items[i].getNombre() + ", peso: " + items[i].getPeso() + " kilos, precio: " + items[i].getPrecio() + " monedas");

            cargaTotal += items[i].getPeso();
        }

        System.out.println("Carga total transportada: " + cargaTotal + "/" + cargaMax);
    }

    public void mostrarArmamento() {

        System.out.println("2. Armas y Armaduras");
        System.out.println("====================");
        System.out.println();
        System.out.println("Equipo de combate de " + this.getNombre());
        if (armaduraCabeza != null) {

            Armadura arma = (Armadura)armaduraCabeza;
            System.out.println(armaduraCabeza.getNombre() + " (+" + arma.getDefensa() + " defensa)");
        }
        if (armaduraCuerpo != null) {

            Armadura arma = (Armadura)armaduraCuerpo;
            System.out.println(armaduraCuerpo.getNombre() + " (+" + arma.getDefensa() + " defensa)");
        }
        if (itemManoDch != null) {

            if (itemManoDch instanceof Arma) {

                Arma arma = (Arma)itemManoDch;
                System.out.println(arma.getNombre() + " (+" + arma.getAtaque() + " ataque)");
            } else {

                Armadura arma = (Armadura)itemManoDch;
                System.out.println(arma.getNombre() + " (+" + arma.getDefensa() + " defensa)");
            }
        }
        if (itemManoIzq != null) {

            if (itemManoIzq instanceof Arma) {

                Arma arma = (Arma)itemManoIzq;
                System.out.println(arma.getNombre() + " (+" + arma.getAtaque() + " ataque)");
            } else {

                Armadura arma = (Armadura)itemManoIzq;
                System.out.println(arma.getNombre() + " (+" + arma.getDefensa() + " defensa)");
            }
        }
        
    }

}
