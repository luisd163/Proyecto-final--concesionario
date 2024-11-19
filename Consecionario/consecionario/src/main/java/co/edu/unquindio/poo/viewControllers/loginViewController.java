package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'loginView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.LoginController;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginViewController {

        LoginController loginController;
        App app;

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="btnIniciarSesion"
        private Button btnIniciarSesion; // Value injected by FXMLLoader

        @FXML // fx:id="txtOlvidasteLaContrasenia"
        private Label txtOlvidasteLaContrasenia; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacion"
        private TextField txtIdentificacion; // Value injected by FXMLLoader

        @FXML // fx:id="txtContrasenia"
        private TextField txtContrasenia; // Value injected by FXMLLoader

        @FXML
        void iniciarSesionAction(ActionEvent event) {
                boolean validar = validarDatos(txtIdentificacion.getText(), txtContrasenia.getText());
                if (validar) {
                        boolean login = loginController.iniciarSesion(txtIdentificacion.getText(), txtContrasenia.getText());
                        if (login) {
                                app.openViewPaginaPrincipal();
                        } else {
                                showAlert("Error", "Usuario o contraseña incorrectos");
                        }
                }
        }

        @FXML
        void olvidasteLaContraseniaAction(MouseEvent event) {
                app.openViewOlvidasteLaContrasenia();
        }

        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
        }

        public void setApp(App app) {
                this.app = app;
                loginController = new LoginController(app.getEmpresa());
        }

        public boolean validarDatos(String identificacion, String contrasenia) {
                if (identificacion.isEmpty()) {
                        showAlert("Campo obligatorio", "Ingrese una identificación valida");
                        return false;
                }
                if (contrasenia.isEmpty()) {
                        showAlert("Campo obligatorio", "Ingrese una contraseña valida");
                        return false;
                }
                return true;
        }

        private void showAlert(String title, String message) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle(title);
                alert.setHeaderText(null);
                alert.setContentText(message);
                alert.showAndWait();
        }
}
