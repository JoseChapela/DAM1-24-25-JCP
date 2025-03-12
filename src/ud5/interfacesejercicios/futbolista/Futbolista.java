package ud5.interfacesejercicios.futbolista;

public class Futbolista {

    String dni;
    String nombre;
    int edad;
    int numGoles;

    //CONSTRUCTORES

    public Futbolista(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    //MÉTODOS

    @Override
    public String toString() {

        return "";
    }

    @Override
    public boolean equals( Object o) {

    if (o == null || !(o instanceof Futbolista)) return false;
    return dni == ((Futbolista)o).dni;
    }

    
}
