package ud5.interfacesejercicios.alumnos;

public class Alumno implements Comparable{

    protected String nombre;
    protected String apellido;
    protected int edad;
    protected float notaMedia;
    
    //CONSTRUCTOR

    public Alumno(String nombre, String apellido, int edad, float notaMedia) {
        
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.notaMedia = notaMedia;
    }

    @Override
    public String toString() {

        return String.format("Nombre: %s \nApellido: %s \nEdad: %s \nNota Media: %s", nombre, apellido, edad, notaMedia);
    }

    @Override
    public int compareTo (Object o) {

        return apellido.compareTo(((Alumno)o).apellido);
    }
}
