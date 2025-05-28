package ud7.apuntesjavafx.examenUD7.notas;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class AppNotas {

    public static void main(String[] args) {
        final String INPUT_FILE_PATH = "src/ud7/apuntesjavafx/examenUD7/notas/notas.txt";
        final String OUTPUT_FILE_PATH = "src/ud7/apuntesjavafx/examenUD7/notas/promedios.txt";

        List<String> outputLines = new ArrayList<>();

        /* 
        try {
            if (Files.size(Paths.get(INPUT_FILE_PATH)) == 0) {
                System.out.println("Error: El fichero " + INPUT_FILE_PATH + " está vacío.");
                return;
            }
        } catch (IOException e) {
            System.out.println("Error al verificar el fichero: " + e.getMessage());
            return;
        }
        */


        try (BufferedReader in = new BufferedReader(new FileReader(INPUT_FILE_PATH))) {
            String line;
            int lineNum = 0;
            while ((line = in.readLine()) != null) {
                lineNum++;
                line = line.trim();
                if (line.isEmpty()){
                    continue;
                }

                // Dividir nombre y notas
                String[] parts = line.split(",");
                if (parts.length < 2) {
                        System.out.println("Error: Faltan datos en la línea " + lineNum + ": " + line);
                        continue;
                }
                else{
                    // Nombre y Apellido Validos
                    String[] name = parts[0].split(" ");
                    boolean isNumber = false;
                    for (String namePart : name) {
                        if (isNumeric(namePart)) {
                            System.out.print("Error: Datos incorrectos en la línea " + lineNum + ": " + line);
                            System.out.println(" El nombre no puede contener números");
                            System.out.println("Todos los números deben ser precedidos por una coma");
                            isNumber = true;
                            break;
                        }
                    }

                    if (isNumber){
                        continue;
                    } 
                }

                String nombre = parts[0].trim();

                // Leer calificaciones
                double suma = 0;
                int count = 0;
                boolean errorEnNotas = false;
                for (int i = 1; i < parts.length; i++) {
                    try {
                        double nota = Double.parseDouble(parts[i].trim());
                        suma += nota;
                        count++;
                    } catch (NumberFormatException e) {
                        System.out.println("Error: Nota inválida en línea " + lineNum + ": " + parts[i]);
                        errorEnNotas = true;
                        break;
                    }
                }

                if (errorEnNotas) continue;

                double promedio = suma / count;
                outputLines.add(nombre + ": " + promedio);
            }
        }catch (FileNotFoundException e) {
            System.out.println("Error: El fichero " + INPUT_FILE_PATH + " no existe.");
            return;
        } catch (IOException e) {
            System.out.println("Error leyendo el fichero: " + e.getMessage());
            return;
        }

        // Fichero vacio o falta datos
        if (outputLines.isEmpty()){
            System.out.println("El fichero está vacio o no contiene los datos suficientes para calcular el promedio");
            return;
        }

        // Escribir resultados en el fichero de salida
        try (PrintWriter out = new PrintWriter(new FileWriter(OUTPUT_FILE_PATH))) {
            for (String outputLine : outputLines) {
                out.println(outputLine);
            }
            System.out.println("Promedios calculados y guardados en " + OUTPUT_FILE_PATH);
        } catch (IOException e) {
            System.out.println("Error escribiendo el fichero: " + e.getMessage());
        }
    }


    public static boolean isNumeric(String str) {
        if (str == null || str.isEmpty()) return false;
        try {
            Double.parseDouble(str); // or Integer.parseInt(str), depending on context
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }


}
