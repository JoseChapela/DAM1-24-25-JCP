/**Jose Chapela Pastoriza */

package ud7.jcpexamen.entrenamiento;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class EntrenamientoController implements Initializable {

    @FXML
    private TextField fichero;

    @FXML
    private TextField txtDate;

    @FXML
    private TextField txtKm;

    @FXML
    private TextField txtName;

    @FXML
    private ListView<Entrenamiento> lstTraining;

    @FXML
    void anadir(ActionEvent event) {

        Entrenamiento e = new Entrenamiento(txtName.getText(), txtDate.getText(), Double.valueOf(txtKm.getText()));
        AppEntrenamiento.entrenamientos.add(e);
        lstTraining.getItems().add(e);
    }

    @FXML
    void cargar(ActionEvent event) {
        List<Entrenamiento> lista = AppEntrenamiento.agregarArchivo(fichero.getText());
        lstTraining.getItems().addAll(lista);
        AppEntrenamiento.entrenamientos.clear();
        AppEntrenamiento.entrenamientos.addAll(lista);
    }

    @FXML
    void guardar(ActionEvent event) {
        AppEntrenamiento.guardarArchivo(fichero.getText());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lstTraining.getItems().addAll(AppEntrenamiento.getLista());
        lstTraining.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, entrenamiento) -> {
                    if (entrenamiento != null) {
                        txtName.setText(entrenamiento.getNome());
                        txtDate.setText(entrenamiento.getFecha());
                        txtKm.setText(String.valueOf(entrenamiento.getKm()));
                    }
                });
    }

}