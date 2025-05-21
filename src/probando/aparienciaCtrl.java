package probando;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class aparienciaCtrl implements Initializable{

    @FXML
    private Button btnActualizar;

    @FXML
    private Button btnAdd;

    @FXML
    private Button btnDelete;

    @FXML
    private TextField fieldNombre;

    @FXML
    private TextField fieldTarea;

    @FXML
    private ListView<Trabajador> lstView;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        lstView.getItems().addAll(AppTrabajadores.lista);

        lstView.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, trabajadorPointed) -> {
                    fieldNombre.setText(trabajadorPointed.getName());
                });
    }

    @FXML
    void actualizar(ActionEvent event) {
        String name = fieldNombre.getText();
        int indice = AppTrabajadores.lista.indexOf(new Trabajador(name));
        if (indice != -1) {
            Trabajador e = AppEmpresa.empresas.get(indice);
            e.setNombre(txtNombre.getText());
            e.setWeb(txtWeb.getText());

            // TODO Actualizar listview más quirúrgicamente
            lstEmpresas.getItems().clear();
            lstEmpresas.getItems().addAll(AppEmpresa.empresas);
        }
    }

    @FXML
    void add(ActionEvent event) {

    }

    @FXML
    void delete(ActionEvent event) {

    }

}