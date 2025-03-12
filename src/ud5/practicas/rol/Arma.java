package ud5.practicas.rol;

public class Arma extends Item {

    int ataque;
    boolean dosManos;

    public Arma(String nombre, float peso, int precio, int ataque, boolean dosManos) {
        
        super(nombre, peso, precio);
        this.ataque = ataque;
        this.dosManos = dosManos;
    }

    public Arma(String nombre, float peso, int precio, int ataque) {
        
        this(nombre, peso, precio, ataque, false);
    }

    public boolean getDosManos () {

        return dosManos;
    }

    public int getAtaque () {

        return ataque;
    }
    
}
