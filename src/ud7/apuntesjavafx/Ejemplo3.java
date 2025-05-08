package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejemplo3 extends Application{
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        TextField txtNum1 = new TextField("Escribe un número...");
        TextField txtNum2 = new TextField("Otro número...");
        Button btnSumar = new Button("Sumar");
        Label lblResultado = new Label();

        txtNum1.setOnKeyTyped(e -> {

            int resultado, num1=0, num2=0;

            try {
                num1 = Integer.parseInt(txtNum1.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                resultado = num1 + num2;
                lblResultado.setText(String.valueOf(resultado));
            } catch (Exception ex) {
                lblResultado.setText("ERROR");
            }
        });

        btnSumar.setOnAction(e -> {

            int resultado, num1=0, num2=0;

            try {
                num1 = Integer.parseInt(txtNum1.getText());
                num2 = Integer.parseInt(txtNum2.getText());
                resultado = num1 + num2;
                lblResultado.setText(String.valueOf(resultado));
            } catch (Exception ex) {
                lblResultado.setText("ERROR");
            }
        });

        VBox vbox = new VBox(txtNum1,txtNum2 ,btnSumar,lblResultado);

        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }
    
    
}
