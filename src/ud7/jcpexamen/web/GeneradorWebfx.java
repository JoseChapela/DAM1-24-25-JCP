/**Jose Chapela Pastoriza */

package ud7.jcpexamen.web;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GeneradorWebfx extends Application {
    public static void main(String[] args) {
        launch();
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField txtNombre = new TextField("Introduce nome da página");
        TextField txtTitulo = new TextField("Introduce titulo da página");
        TextField txtDescripcion = new TextField("Introduce descripcion da página");
        TextField txtUrl = new TextField("Introduce url da página");
        TextField txtEnlace = new TextField("Introduce texto de enlace da página");
        Button btn = new Button("CREAR PAGINA");
        btn.setOnAction(e -> {
            GeneraWeb.generarPaginaWeb(txtTitulo.getText(), txtDescripcion.getText(), txtUrl.getText(),
                    txtEnlace.getText(), txtNombre.getText());
        });
        VBox campos = new VBox(txtNombre, txtTitulo, txtDescripcion, txtUrl, txtEnlace);
        HBox opciones = new HBox(campos, btn);
        Scene escena = new Scene(opciones);
        primaryStage.setTitle("GENERADOR PAGINAS WEB");
        primaryStage.setScene(escena);
        primaryStage.show();
    }

}
