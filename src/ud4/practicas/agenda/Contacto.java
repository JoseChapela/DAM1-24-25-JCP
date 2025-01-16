package ud4.practicas.agenda;

public class Contacto {

    private String nombre;
    private String apellidos;
    private int telefono;
    private String email;

    //CONSTRUCTORES

    Contacto (String nombre, String apellidos, int telefono, String email) {

        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
    }

    //MÉTODOS

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    
    
}
