package ud6.ejercicios.ep1216;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;


public class Academico implements Comparable<Academico>{

    String nombre;
    int anhoIngreso;

    public Academico(String nombre, int anhoIngreso) {

        this.nombre=nombre;
        this.anhoIngreso=anhoIngreso;
    }

    public String toString() {

        return nombre + " (" + anhoIngreso + ")";
    }

    public int compareTo(Academico o) {

        return nombre.compareTo(o.nombre);
    }
   
    public static void main(String[] args) {

        Map<Character, Academico> academia = new TreeMap<>();
        
        String contenido = readFileToString("DATOS - Académicos RAE (2025_04_11).txt");
        String[] lineas = contenido.split("\\n");
        for (int i = 0; i < lineas.length; i++) {

            Character letra = lineas[i].charAt(6);
            String nombre = lineas[i].substring(7, lineas[i].length() - 6);
            int anho = Integer.parseInt(lineas[i].substring(lineas[i].length() - 5, lineas[i].length() - 1));
            
            nuevoAcademico(academia, new Academico(nombre, anho), letra);
        }
        //POR CLAVE
        System.out.println();
        System.out.println("POR CLAVE:");
        System.out.println(academia);

        //POR NOMBRE
        List<Academico> lista = new ArrayList<>(academia.values());
        Collections.sort(lista);
        System.out.println();
        System.out.println("POR NOMBRE:");
        for (Academico p : lista) {

            System.out.println(p);
        }

        System.out.println();
        System.out.println("POR ANHO INGRESO:");
        lista.sort( new Comparator<>() {
            
            public int compare(Academico a1, Academico a2) {

                int res = a1.anhoIngreso - a2.anhoIngreso;
                if (res==0) res = a1.nombre.compareTo(a2.nombre);
                return res;
            } 
        });
        for (Academico p : lista) {

            System.out.println(p);
        }

        
    }

    static boolean nuevoAcademico (Map<Character, Academico> academia, Academico nuevo, Character letra) {

        if (Character.isLetter(letra)) {

            academia.put(letra, nuevo);
            return true;
        }
        return false;
    }

    public static String readFileToString(String filePath) {
        StringBuilder fileContent = new StringBuilder();
        try {
            // Creamos un objeto FileReader que nos permitirá leer el fichero
            FileReader reader = new FileReader(filePath);

            // Creamos un buffer para leer el fichero de forma más eficiente
            BufferedReader buffer = new BufferedReader(reader);

            // Leemos el fichero línea a línea
            String line;
            while ((line = buffer.readLine()) != null) {
                // Vamos añadiendo cada línea al StringBuilder
                fileContent.append(line);
                // Añadimos un salto de línea al final de cada línea
                fileContent.append("\n");
            }

            // Cerramos el buffer y el fichero
            buffer.close();
            reader.close();
        } catch (IOException e) {
            System.out.println("No existe el fichero.");
            // e.printStackTrace();
        }

        // Devolvemos el contenido del fichero como un String
        return fileContent.toString();
    }
}

