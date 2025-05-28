package casa.notas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppNotas extends Application{

    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        
        VBox vboxPromedio = new VBox(new Label("NOTAS"), new Label(calcularNota()));
        Scene scene=new Scene(vboxPromedio,300,300);
        primaryStage.setTitle("NOTAS-PROMEDIO");
        primaryStage.setScene(scene);
        primaryStage.centerOnScreen();
        primaryStage.show();
    }

    static String calcularNota(){

        String respuesta="";
        
        try(BufferedReader in = new BufferedReader(new FileReader("src/casa/notas/notas.txt"));
            BufferedWriter out = new BufferedWriter(new FileWriter("src/casa/notas/promedio.txt"))){

            String cad = in.readLine();
            while(cad!=null){
                String[] cod = cad.split(",");
                int suma=0;
                double media;

                for (int i = 1; i < cod.length;i++)
                    suma+=Integer.valueOf(cod[i]);
                
                media=suma/(cod.length-1);
                String promedio=cod[0]+": "+media;
                respuesta+=promedio+"\n";
                out.write(promedio);
                out.newLine();
                cad=in.readLine();
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

        return respuesta;
        
    }
    
}
