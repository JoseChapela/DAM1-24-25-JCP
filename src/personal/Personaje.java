package personal;

public class Personaje {

    private String nombre;
    private int vida;
    private int atackPoints;
    private int defensePoints;
    enum Tipo {GUERRERO, ARQUERO, BRUJO};
    private Tipo tipo;
    private boolean poisoned = false;

    //CONSTRUCTOR

    Personaje (String nombre, Tipo tipo) {

    this.nombre = nombre;
    this.tipo = tipo;
    rol(tipo);
    }

    //MÉTODO

    public void atack (Personaje enemigo) {

        enemigo.vida -= atackPoints - enemigo.defensePoints;

        if (poisoned = true) poisoned();
    }

    public void poisoned () {

        
    }

    public void poisonPotion (Personaje enemigo) {

        enemigo.poisoned = true;
    }

    public void healthPotion () {

        vida += 50;
    }

    public void fastTravel () {

        ANIM.gusano();
    }

    private void rol (Tipo tipo) {

        switch (tipo) {
            case GUERRERO:

                vida = 200;
                atackPoints = 50;
                defensePoints = 30;    
                break;

            case ARQUERO:

                vida = 100;
                atackPoints = 20;
                defensePoints = 10;    
                break;

            case BRUJO:

                vida = 150;
                atackPoints = 10;
                defensePoints = 30;    
                break;
        
            default:
                break;
        }
    }

}
