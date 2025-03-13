package ud5.interfacesejercicios.futbolista;

import java.util.Arrays;

public class Futbolista implements Comparable{

    String dni;
    String nombre;
    int edad;
    int numGoles;

    //CONSTRUCTORES

    public Futbolista(String dni, String nombre, int edad) {
        this.dni = dni;
        this.nombre = nombre;
        this.edad = edad;
    }

    //MÉTODOS

    @Override
    public String toString() {

        return String.format("Dni: %s \nNombre: %s \nEdad: %d \nNúmero de goles", dni, nombre, edad, numGoles);
    }

    @Override
    public boolean equals( Object o) {

    if (o == null || !(o instanceof Futbolista)) return false;
    return dni == ((Futbolista)o).dni;
    }

    @Override
    public int compareTo( Object o) {

        return dni.compareTo(((Futbolista)o).dni);
    }

    public static void main(String[] args) {
        
        Futbolista[] t = {new Futbolista("3", "Jose", 23), new Futbolista("2", "Manuel", 17), new Futbolista("1", "Ana", 28), new Futbolista("4", "Francisco", 21), new Futbolista("5", "Victor", 19)};

        System.out.println("Tabla sin ordenar:");
        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i]);
        }

        System.out.println("**************************");

        Arrays.sort(t);
        System.out.println("Tabla por orden natural:");
        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i]);
        }

        System.out.println("**************************");

        Arrays.sort(t, new ComparadorFutbolista_nombre());
        System.out.println("Tabla ordenada por nombres:");
        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i]);
        }

        System.out.println("**************************");

        Arrays.sort(t, new ComparadorFutbolista_edad());
        System.out.println("Tabla ordenada por edades:");
        for (int i = 0; i < t.length; i++) {

            System.out.println(t[i]);
        }
       
    }

    
}
