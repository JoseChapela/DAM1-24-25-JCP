package ud7.apuntesjavafx.examenUD7;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppInventarioFX extends Application{

    //Importante el src
    static final String FILE_PATH = "src/ud7/apuntesjavafx/examenUD7/inventario.dat";

    static List<Producto> inventario = new ArrayList<>();
    static Stage mainStage;

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        mainStage = primaryStage;

        Parent fxml = FXMLLoader.load(AppInventarioFX.class.getResource("Inventario.fxml"));        
        Scene scene = new Scene(fxml);

        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

    public static Producto findProductByID(int codigo){
        for (Producto p : inventario) {
            if (p.getCodigo() == codigo) {
                return p;
            }
        }
        return null;
    }


    static public void cargarInventario(String file_path){

        // Crear un fichero binario para escritura
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file_path))) {
            AppInventarioFX.inventario = (List<Producto>)in.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("Error: Archivo no encontrado");
        } catch (NotSerializableException e) {
            System.out.println("Error: Objeto no serializable");            
        } catch (IOException e) {
            System.out.println("Error de E/S al leer el archivo");
        } catch (Exception e) {
            System.out.println("Error desconocido al guardar el archivo");
        }
    }


    static public void guardarInventario(String file_path){

        // Crear un fichero binario para escritura
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(AppInventarioFX.FILE_PATH))) {
            out.writeObject(AppInventarioFX.inventario);
        } catch (FileNotFoundException e) {
            System.out.println("Error: Ruta Invalida o mal formada");
        } catch (NotSerializableException e) {
            System.out.println("Error: Objeto no serializable");            
        } catch (IOException e) {
            System.out.println("Error de E/S al escribir en el archivo");
        } catch (Exception e) {
            System.out.println("Error desconocido al guardar el archivo");
        }
    }


}


/*
 

} catch (FileNotFoundException e) {
            // fichero no existe o no se puede crear
        } catch (UnsupportedEncodingException e) {
            // codificación no soportada
        } catch (IOException e) {
            // error de lectura/escritura genérico
        } catch (SecurityException e) {
            // acceso denegado por SecurityManager
        }
        // IOException y Exception
        // EOFException solo en DataInputStream / ObjectInputStream
        // InputMismatchException solo en Scanner

        // ArithmeticException  comunmente division entre 0

 */


 /*    CUSTOM EXCEPTION


public class Divider {
    public static int divideStringByNumber(String str, int divisor) throws InvalidDivisionException {
        if (!str.matches("-?\\d+")) {
            throw new InvalidDivisionException("String is not a valid number: " + str);
        }

        int num = Integer.parseInt(str);

        if (divisor == 0) {
            throw new InvalidDivisionException("Cannot divide by zero");
        }

        return num / divisor;
    }
}



  */