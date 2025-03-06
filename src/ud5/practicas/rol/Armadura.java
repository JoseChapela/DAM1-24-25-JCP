package ud5.practicas.rol;

public class Armadura extends Item {

    int defensa;
    enum Tipo {YELMO, ARMADURA, ESCUDO};
    Tipo tipo;

    public Armadura(String nombre, float peso, int precio, int defensa, String tipo) {
        
        super(nombre, peso, precio);
        this.defensa = defensa;
        this.tipo = Tipo.valueOf(tipo);
    }
    
    public int getDefensa () {

        return defensa;
    }
}
