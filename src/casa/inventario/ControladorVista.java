package casa.inventario;

import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;

public class ControladorVista implements Initializable{

    @FXML
    private Button btn_agregar;

    @FXML
    private ListView<Producto> lst_Productos;

    @FXML
    private TextField txt_cantidad;

    @FXML
    private TextField txt_codigo;

    @FXML
    private TextField txt_nombre;

    @FXML
    private TextField txt_precio;

    @FXML
    void agregarPr(ActionEvent event) {
        Producto p = new Producto(Integer.valueOf(txt_codigo.getText()), txt_nombre.getText(), Integer.valueOf(txt_cantidad.getText()), Double.valueOf(txt_precio.getText()));
        AppInventario.agregarProducto(p);
        lst_Productos.getItems().add(p);
    }

    @FXML
    void buscarPr(ActionEvent event) {
        int codigo = Integer.valueOf(txt_codigo.getText());
        Producto producto = AppInventario.buscarProducto(codigo);
        lst_Productos.getSelectionModel().select(producto);
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

        lst_Productos.getItems().addAll(AppInventario.getLista());
        lst_Productos.getSelectionModel().selectedItemProperty().addListener(
                (obs, oldSelection, producto) -> {
                    if (producto!=null){
                        txt_codigo.setText(String.valueOf(producto.getCodigo()));
                        txt_nombre.setText(producto.getNombre());
                        txt_cantidad.setText(String.valueOf(producto.getCantidad()));
                        txt_precio.setText(String.valueOf(producto.getPrecio()));
                    }
        });
    }

}
