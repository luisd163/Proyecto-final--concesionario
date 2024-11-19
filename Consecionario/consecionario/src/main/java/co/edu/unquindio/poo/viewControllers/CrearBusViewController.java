package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'CrearBusView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.CrearVehiculoController;
import co.edu.unquindio.poo.model.Bus;
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

public class CrearBusViewController {

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

    @FXML // fx:id="txtModelo"
    private TextField txtModelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroDePasajeros"
    private TextField txtNumeroDePasajeros; // Value injected by FXMLLoader

    @FXML // fx:id="txtSalidasDeEmergencia"
    private TextField txtSalidasDeEmergencia; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarVehiculo"
    private Button btnActualizarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoVehiculo"
    private ComboBox<TipoDeVehiculo> comboTipoDeVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroPuertas"
    private TextField txtNumeroPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminarVehiculo"
    private Button btnEliminarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelocidadMaxima"
    private TextField txtVelocidadMaxima; // Value injected by FXMLLoader

    @FXML // fx:id="txtAireAcondicionado"
    private TextField txtAireAcondicionado; // Value injected by FXMLLoader

    @FXML // fx:id="txtCambios"
    private TextField txtCambios; // Value injected by FXMLLoader

    @FXML // fx:id="btnVolver"
    private Button btnVolver; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoTransmision"
    private ComboBox<TipoTransmision> comboTipoTransmision; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroBolsasDeAire"
    private TextField txtNumeroBolsasDeAire; // Value injected by FXMLLoader

    @FXML // fx:id="btnCrearVehiculo"
    private Button btnCrearVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroEjes"
    private TextField txtNumeroEjes; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapacidadMaletero"
    private TextField txtCapacidadMaletero; // Value injected by FXMLLoader

    @FXML // fx:id="txtCilindraje"
    private TextField txtCilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="txtAlquiler"
    private TextField txtAlquiler; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML // fx:id="txtMatricula"
    private TextField txtMatricula; // Value injected by FXMLLoader

    @FXML // fx:id="txtNuevoOUsado"
    private TextField txtNuevoOUsado; // Value injected by FXMLLoader

    @FXML // fx:id="txtCamaraReversa"
    private TextField txtCamaraReversa; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimpiarCampos"
    private Button btnLimpiarCampos; // Value injected by FXMLLoader

    @FXML
    void crearVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(),
                txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(),
                txtNumeroDePasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasDeAire.getText(),
                txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraReversa.getText(),
                txtAbs.getText(), txtAlquiler.getText(), txtNumeroEjes.getText(), txtSalidasDeEmergencia.getText());
        if (validar) {
            Vehiculo bus = new Bus(comboTipoTransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(),
                    txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(),
                    txtMatricula.getText(), comboTipoDeVehiculo.getValue(), txtNumeroDePasajeros.getText(),
                    txtNumeroPuertas.getText(), txtNumeroBolsasDeAire.getText(), txtCapacidadMaletero.getText(),
                    txtAireAcondicionado.getText(), txtCamaraReversa.getText(), txtAbs.getText(),
                    txtNumeroEjes.getText(), txtSalidasDeEmergencia.getText());
            boolean estado = crearVehiculoController.CrearVehiculo(bus);
            if (estado) {
                vehiculosTabla.add(bus);
                tableListaVehiculos.setItems(vehiculosTabla);
                showAlert(null, "Vehiculo creado correctamente");
            } else {
                showAlert(null, "Error, verifique los datos ingresados");
            }
        }
    }

    /**
     * Método que valida que los campos no esten vacios
     * 
     * @param marca
     * @param nuevoOUsado
     * @param modelo
     * @param cambios
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @param numeroPasajeros
     * @param numeroPuertas
     * @param numeroBolsasAire
     * @param maletero
     * @param aireAcondicionado
     * @param camaraReversa
     * @param abs
     * @param alquiler
     * @param numeroEjes
     * @param salidasEmergencia
     * @return true si ningun campo esta vacio, false si falta algun campo
     */
    public boolean validarDatos(String marca, String nuevoOUsado, String modelo, String cambios, String velocidadMaxima,
            String cilindraje, String matricula, String numeroPasajeros, String numeroPuertas, String numeroBolsasAire,
            String maletero, String aireAcondicionado, String camaraReversa, String abs, String alquiler,
            String numeroEjes, String salidasEmergencia) {
        if (marca.isEmpty() || nuevoOUsado.isEmpty() || modelo.isEmpty() || cambios.isEmpty()
                || velocidadMaxima.isEmpty() || cilindraje.isEmpty() || matricula.isEmpty() || numeroPasajeros.isEmpty()
                || numeroPuertas.isEmpty() || numeroBolsasAire.isEmpty() || maletero.isEmpty()
                || aireAcondicionado.isEmpty() || camaraReversa.isEmpty() || abs.isEmpty() || alquiler.isEmpty()
                || numeroEjes.isEmpty() || salidasEmergencia.isEmpty()) {
            showAlert(null, "Todos los campos son obligatorios");
            return false;
        }
        return true;
    }

    @FXML
    void actualizarVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(),
                txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(),
                txtNumeroDePasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasDeAire.getText(),
                txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraReversa.getText(),
                txtAbs.getText(), txtAlquiler.getText(), txtNumeroEjes.getText(), txtSalidasDeEmergencia.getText());
        if (validar) {
            boolean actualizado = crearVehiculoController.actualizarVehiculo(comboTipoTransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), comboTipoDeVehiculo.getValue());
            if (actualizado) {
                showAlert(null, "Vehiculo actualizado correctamente");
                tableListaVehiculos.setItems(vehiculosTabla);
            } else {
                showAlert(null, "Error, verifique los datos ingresados");
            }
        }
    }

    @FXML
    void eliminarVehiculoAction(ActionEvent event) {
        Vehiculo bus = new Bus(null, null, null, null, null, null, null, txtMatricula.getText(), null, null, null, null,
                null, null, null, null, null, null);
        boolean eliminado = crearVehiculoController.eliminarVehiculo(bus);
        if (eliminado) {
            vehiculosTabla.remove(bus);
            tableListaVehiculos.setItems(vehiculosTabla);
            showAlert(null, "Vehiculo eliminado con exito");
        } else {
            showAlert(null, "Error, Verifique los datos ingresados");
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
        txtNumeroDePasajeros.clear();
        txtNumeroPuertas.clear(); 
        txtNumeroBolsasDeAire.clear();
        txtCapacidadMaletero.clear();
        txtAireAcondicionado.clear(); 
        txtCamaraReversa.clear();
        txtAbs.clear();
        txtAlquiler.clear(); 
        txtNumeroEjes.clear(); 
        txtSalidasDeEmergencia.clear();
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

        ObservableList<TipoDeVehiculo> optionsVehiculo = FXCollections.observableArrayList(tiposDeVehiculo);
        comboTipoDeVehiculo.setItems(optionsVehiculo);
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