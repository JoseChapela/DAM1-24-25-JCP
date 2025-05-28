/**Jose Chapela Pastoriza */

package ud7.jcpexamen.entrenamiento;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class AppEntrenamiento extends Application {

    static List<Entrenamiento> entrenamientos;
    static String path = "src/ud7/jcpexamen/entrenamiento/archivo.dat";
    static String semipath = "src/ud7/jcpexamen/entrenamiento/";

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(AppEntrenamiento.class.getResource("Entrenamiento.fxml"));
        Scene scene = new Scene(root);
        primaryStage.setTitle("ENTRENAMIENTO");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    static List<Entrenamiento> getLista() {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(path))) {
            List<Entrenamiento> e = (List<Entrenamiento>) in.readObject();
            e.sort((e1, e2) -> e1.fecha.compareTo(e2.fecha));
            return e;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return new ArrayList<Entrenamiento>();
    }

    static boolean guardarArchivo(String archivo) {
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(semipath + archivo + ".dat"))) {
            out.writeObject(entrenamientos);
            return true;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return false;
    }

    static List<Entrenamiento> agregarArchivo(String archivo) {
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(semipath + archivo + ".dat"))) {
            List<Entrenamiento> lista = (List<Entrenamiento>) in.readObject();
            return lista;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return null;
    }

}
