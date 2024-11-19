package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'OlvidasteLaContraseñaView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.OlvidasteLaContraseniaController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class OlvidasteLaContraseniaViewController {

    App app;
    OlvidasteLaContraseniaController olvidasteLaContraseniaController;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="btnIniciarSesion"
    private Button btnIniciarSesion; // Value injected by FXMLLoader

    @FXML // fx:id="btnVolver"
    private Button btnVolver; // Value injected by FXMLLoader

    @FXML // fx:id="txtPalabraClave"
    private TextField txtPalabraClave; // Value injected by FXMLLoader

    @FXML
    void iniciarSesionAction(ActionEvent event) {
        boolean validar = validarDatos(txtPalabraClave.getText());
        if (validar) {
            boolean iniciarSesion = olvidasteLaContraseniaController.iniciarSesionPalabraClave(txtPalabraClave.getText());
            if (iniciarSesion) {
                app.openViewPaginaPrincipal();
            } else {
                showAlert("Datos incorrectos", "Verifique los datos ingresados");
            }
        }
    }

    public boolean validarDatos(String campo) {
        if (campo.isEmpty()) {
            showAlert(null, "Campo obligatorio");
            return false;
        }
        return true;
    }

    @FXML
    void volverAction(ActionEvent event) {
        app.openViewLogin();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    public void setApp(App app) {
        this.app = app;
        olvidasteLaContraseniaController = new OlvidasteLaContraseniaController(app.getEmpresa());
    }
}
