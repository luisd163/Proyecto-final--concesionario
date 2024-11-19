package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'CrearCamionView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.CrearVehiculoController;
import co.edu.unquindio.poo.model.Camion;
import co.edu.unquindio.poo.model.TipoCamion;
import co.edu.unquindio.poo.model.TipoDeVehiculo;
import co.edu.unquindio.poo.model.TipoTransmision;
import co.edu.unquindio.poo.model.Vehiculo;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class CrearCamionViewController {

    App app;
    CrearVehiculoController crearVehiculoController;
    PaginaPrincipalViewController paginaPrincipalViewController;
    ObservableList<Vehiculo> vehiculosTabla;
    TableView<Vehiculo> tableListaVehiculos;

    public void setPaginaPrincipalViewController(PaginaPrincipalViewController controller) {
        this.paginaPrincipalViewController = controller;
        this.vehiculosTabla = paginaPrincipalViewController.obtenerListaVehiculos();
        this.tableListaVehiculos = paginaPrincipalViewController.obtenerTablaVehiculos();
    }

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtAbs"
    private TextField txtAbs; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroDeEjes"
    private TextField txtNumeroDeEjes; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoCamion"
    private ComboBox<TipoCamion> comboTipoCamion; // Value injected by FXMLLoader

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarVehiculo"
    private Button btnActualizarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoVehiculo"
    private ComboBox<TipoDeVehiculo> comboTipoVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapacidadCarga"
    private TextField txtCapacidadCarga; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminarVehiculo"
    private Button btnEliminarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelocidadMaxima"
    private TextField txtVelocidadMaxima; // Value injected by FXMLLoader

    @FXML // fx:id="txtFrenosDeAire"
    private TextField txtFrenosDeAire; // Value injected by FXMLLoader

    @FXML // fx:id="txtAireAcondicionado"
    private TextField txtAireAcondicionado; // Value injected by FXMLLoader

    @FXML // fx:id="txtCambios"
    private TextField txtCambios; // Value injected by FXMLLoader

    @FXML // fx:id="btnVolver"
    private Button btnVolver; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoTransmision"
    private ComboBox<TipoTransmision> comboTipoTransmision; // Value injected by FXMLLoader

    @FXML // fx:id="btnCrearVehiculo"
    private Button btnCrearVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtCilindraje"
    private TextField txtCilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="txtMatricula"
    private TextField txtMatricula; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML // fx:id="txtNuevoOUsado"
    private TextField txtNuevoOUsado; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimpiarCampos"
    private Button btnLimpiarCampos; // Value injected by FXMLLoader

    @FXML
    void crearVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), txtCapacidadCarga.getText(), txtAireAcondicionado.getText(), txtFrenosDeAire.getText(), txtAbs.getText(), txtNumeroDeEjes.getText());
        if (validar) {
            Vehiculo camion = new Camion(comboTipoTransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), comboTipoVehiculo.getValue(), txtCapacidadCarga.getText(), txtAireAcondicionado.getText(), txtFrenosDeAire.getText(), txtAbs.getText(), txtNumeroDeEjes.getText(), comboTipoCamion.getValue());
            boolean estado = crearVehiculoController.CrearVehiculo(camion);
            if (estado) {
                vehiculosTabla.add(camion);
                tableListaVehiculos.setItems(vehiculosTabla);
                showAlert(null, "Vehiculo creado con exito");
            } else {
                showAlert(null, "Error, verifique los datos ingresados");
            }
        }
    }

    /**
     * Método que valida que los campos no esten vacios
     * @param marca
     * @param nuevoOUsado
     * @param modelo
     * @param cambios
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @param capacidadDeCarga
     * @param aireAcondicionado
     * @param frenosDeAire
     * @param Abs
     * @param numeroDeEjes
     * @return false si algun campo esta vacio, true si todos los campos tienen datos
     */
    private boolean validarDatos(String marca, String nuevoOUsado, String modelo, String cambios, String velocidadMaxima, String cilindraje, String matricula, String capacidadDeCarga, String aireAcondicionado, String frenosDeAire, String Abs, String numeroDeEjes) {
        if (marca.isEmpty() || nuevoOUsado.isEmpty() || modelo.isEmpty() || cambios.isEmpty() || velocidadMaxima.isEmpty() || cilindraje.isEmpty() || matricula.isEmpty() || capacidadDeCarga.isEmpty() || aireAcondicionado.isEmpty() || frenosDeAire.isEmpty() || Abs.isEmpty() || numeroDeEjes.isEmpty()) {
            showAlert(null, "Todos los campos son obligatorios");
            return false;
        }
        return true;
    }

    @FXML
    void actualizarVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), txtCapacidadCarga.getText(), txtAireAcondicionado.getText(), txtFrenosDeAire.getText(), txtAbs.getText(), txtNumeroDeEjes.getText());
        if (validar) {
            boolean actualizado = crearVehiculoController.actualizarVehiculo(comboTipoTransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), comboTipoVehiculo.getValue());
            if (actualizado) {
                showAlert(null, "Veiculo actualizado correctamente");
                tableListaVehiculos.setItems(vehiculosTabla);
            } else {
                showAlert(null, "Error, verifique los datos ingresados");
            }
        }
    }

    @FXML
    void eliminarVehiculoAction(ActionEvent event) {
        Vehiculo camion = new Camion(null, null, null, null, null, null, 
        null, txtMatricula.getText(), null, null, null, null, null, null, null);
        boolean eliminada = crearVehiculoController.eliminarVehiculo(camion);
        if (eliminada) {
            vehiculosTabla.remove(camion);
            tableListaVehiculos.setItems(vehiculosTabla);
            showAlert(null, "vehiculo eliminado correctamente");
        } else {
            showAlert(null, "Error, verifique los datos ingresados");
        }
    }

    @FXML
    void limpiarCamposAction(ActionEvent event) {
        txtMarca.clear();
        txtNuevoOUsado.clear(); 
        txtModelo.clear();
        txtCambios.clear();
        txtVelocidadMaxima.clear();
        txtCilindraje.clear();
        txtMatricula.clear();
        txtCapacidadCarga.clear();
        txtAireAcondicionado.clear();
        txtFrenosDeAire.clear();
        txtAbs.clear(); 
        txtNumeroDeEjes.clear();
    }

    @FXML
    void volverAction(ActionEvent event) {
        app.openViewPaginaPrincipal();
    }

    public void setApp(App app) {
        this.app = app;
        crearVehiculoController = new CrearVehiculoController(app.getEmpresa());

        ArrayList<TipoTransmision> tiposDeTransmision = new ArrayList<>();
        tiposDeTransmision.add(TipoTransmision.AUTOMATICA);
        tiposDeTransmision.add(TipoTransmision.MANUAL);

        ObservableList<TipoTransmision> optionsTransmision = FXCollections.observableArrayList(tiposDeTransmision);
        comboTipoTransmision.setItems(optionsTransmision);

        ArrayList<TipoDeVehiculo> tiposDeVehiculo = new ArrayList<>();
        tiposDeVehiculo.add(TipoDeVehiculo.DIESEL);
        tiposDeVehiculo.add(TipoDeVehiculo.ELECTRICO);
        tiposDeVehiculo.add(TipoDeVehiculo.GASOLINA);
        tiposDeVehiculo.add(TipoDeVehiculo.HIBRIDO);

        ObservableList<TipoDeVehiculo> optionsTipoVehiculo = FXCollections.observableArrayList(tiposDeVehiculo);
        comboTipoVehiculo.setItems(optionsTipoVehiculo);

        ArrayList<TipoCamion> tiposCamion = new ArrayList<>();
        tiposCamion.add(TipoCamion.ARTICULADO);
        tiposCamion.add(TipoCamion.RIGIDO);
        tiposCamion.add(TipoCamion.RIGIDO);

        ObservableList<TipoCamion> optionsTipoCamion = FXCollections.observableArrayList(tiposCamion);
        comboTipoCamion.setItems(optionsTipoCamion);
        
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
}
