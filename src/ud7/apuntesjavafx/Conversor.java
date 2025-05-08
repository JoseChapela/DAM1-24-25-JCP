package ud7.apuntesjavafx;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Conversor extends Application{

    TextField txtUnidad = new TextField("Unidad actual");
    TextField txtCantidad = new TextField("Cantidad");
    Button btnConvertir = new Button("Convertir");
    Label lblResultado = new Label();

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        btnConvertir.setOnAction(e -> convertir());
        txtCantidad.setOnKeyTyped(e -> convertir());
        txtUnidad.setOnKeyTyped(e -> convertir());
        txtUnidad.setOnKeyTyped(e -> texto());

        VBox vbox = new VBox(txtUnidad, txtCantidad ,btnConvertir,lblResultado);

        Scene scene = new Scene(vbox, 300, 150);

        primaryStage.setScene(scene);
        primaryStage.setTitle("Convertidor");
        primaryStage.setResizable(false);
        primaryStage.centerOnScreen();
        primaryStage.show();

    }

    private void texto() {
        try {
            String unidad1 = txtUnidad.getText().toLowerCase();
            switch (unidad1) {
                case "euros":
                    btnConvertir.setText("Convertir euros a dólares");
                    break;
                case "libras": 
                    btnConvertir.setText("Convertir libras a kilogramos");
                    break;
                case "millas": 
                    btnConvertir.setText("Convertir millas a kilómetros");
                    break;
                default: btnConvertir.setText("UNIDADES A CONVERTIR");
                    
            }
        } catch (Exception e) {
            lblResultado.setText("Indique cantidad");
        }
    }

    private void convertir() {
        double num=0;

        try {
            String unidad1 = txtUnidad.getText().toLowerCase();
            switch (unidad1) {
                case "euros": num = Double.parseDouble(txtCantidad.getText());
                    lblResultado.setText(String.valueOf(num*1.13) + " dólares");
                    btnConvertir.setText("Convertir euros a dólares");
                    break;
                case "libras": num = Double.parseDouble(txtCantidad.getText());
                    lblResultado.setText(String.valueOf(num*0.4535924) + " kilogramos");
                    btnConvertir.setText("Convertir libras a kilogramos");
                    break;
                case "millas": num = Double.parseDouble(txtCantidad.getText());
                    lblResultado.setText(String.valueOf(num*1.609344) + " kilometros");
                    btnConvertir.setText("Convertir millas a kilómetros");
                    break;
                default: lblResultado.setText("UNIDADES VÁLIDAS: Euros, Libras, Millas");
                    
            }
        } catch (Exception e) {
            lblResultado.setText("Indique cantidad");
        }
        
    }
    
}
