package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'CrearVanView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.CrearVehiculoController;
import co.edu.unquindio.poo.model.TipoDeVehiculo;
import co.edu.unquindio.poo.model.TipoTransmision;
import co.edu.unquindio.poo.model.Van;
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

public class CrearVanViewController {

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

    @FXML // fx:id="txtnumeroPasajeros"
    private TextField txtnumeroPasajeros; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarVehiculo"
    private Button btnActualizarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoVehiculo"
    private ComboBox<TipoDeVehiculo> comboTipoVehiculo; // Value injected by FXMLLoader

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

    @FXML // fx:id="txtCapacidadMaletero"
    private TextField txtCapacidadMaletero; // Value injected by FXMLLoader

    @FXML // fx:id="txtCilindraje"
    private TextField txtCilindraje; // Value injected by FXMLLoader

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
        boolean validar = validarDatos(txtModelo.getText(), txtMarca.getText(), txtCambios.getText(),
                txtNuevoOUsado.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(),
                txtnumeroPasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasDeAire.getText(),
                txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraReversa.getText(),
                txtAbs.getText());
        if (validar) {
            Vehiculo van = new Van(comboTipoTransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(),
                    txtModelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(),
                    txtMatricula.getText(), comboTipoVehiculo.getValue(), txtnumeroPasajeros.getText(),
                    txtNumeroPuertas.getText(), txtNumeroBolsasDeAire.getText(), txtCapacidadMaletero.getText(),
                    txtAireAcondicionado.getText(), txtCamaraReversa.getText(), txtAbs.getText());
            boolean estado = crearVehiculoController.CrearVehiculo(van);
            if (estado) {
                vehiculosTabla.add(van);
                tableListaVehiculos.setItems(vehiculosTabla);
                showAlert(null, "Vehiculo creado con exito");
            } else {
                showAlert(null, "Error, verifique los datos ingresados");
            }
        }
    }

    /**
     * Método que valida que los campos no esten vacios
     * 
     * @param modelo
     * @param marca
     * @param cambios
     * @param nuevoOUsado
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @param color
     * @return false si algun campo esta vacio, true si todos los campos tienen
     *         datos
     */
    public boolean validarDatos(String modelo, String marca, String cambios, String nuevoOUsado, String velocidadMaxima,
            String cilindraje, String matricula, String numeroPasajeros, String numeroPuertas, String numeroBolsasAire,
            String capacidadMaletero, String aireACondicionado, String camaraReversa, String abs) {
        if (modelo.isEmpty() || marca.isEmpty() || cambios.isEmpty() || nuevoOUsado.isEmpty()
                || velocidadMaxima.isEmpty() || cilindraje.isEmpty() || matricula.isEmpty() || numeroPasajeros.isEmpty()
                || numeroPuertas.isEmpty() || numeroBolsasAire.isEmpty() || capacidadMaletero.isEmpty()
                || aireACondicionado.isEmpty() || camaraReversa.isEmpty() || abs.isEmpty()) {
            showAlert(null, "Todos los campos son obligatorios");
            return false;
        }
        return true;
    }

    @FXML
    void actualizarVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtModelo.getText(), txtMarca.getText(), txtCambios.getText(),
                txtNuevoOUsado.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(),
                txtnumeroPasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasDeAire.getText(),
                txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraReversa.getText(),
                txtAbs.getText());
        if (validar) {
            boolean actualizado = crearVehiculoController.actualizarVehiculo(comboTipoTransmision.getValue(),
                    txtMarca.getText(), txtNuevoOUsado.getText(), txtModelo.getText(), txtCambios.getText(),
                    txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(),
                    comboTipoVehiculo.getValue());
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
        Vehiculo van = new Van(null, null, null, null, null,
                null, null, txtMatricula.getText(), null, null, null, null, null, null, null, null);
        boolean eliminada = crearVehiculoController.eliminarVehiculo(van);
        if (eliminada) {
            vehiculosTabla.remove(van);
            tableListaVehiculos.setItems(vehiculosTabla);
            showAlert(null, "vehiculo eliminado correctamente");
        } else {
            showAlert(null, "Error, verifique los datos ingresados");
        }
    }

    @FXML
    void limpiarCamposAction(ActionEvent event) {
        txtModelo.clear();
        txtMarca.clear();
        txtCambios.clear();
        txtNuevoOUsado.clear();
        txtVelocidadMaxima.clear();
        txtCilindraje.clear();
        txtMatricula.clear();
        txtnumeroPasajeros.clear();
        txtNumeroPuertas.clear();
        txtNumeroBolsasDeAire.clear();
        txtCapacidadMaletero.clear();
        txtAireAcondicionado.clear();
        txtCamaraReversa.clear();
        txtAbs.clear();
    }

    @FXML
    void volverAction(ActionEvent event) {
        app.openViewPaginaPrincipal();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

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
    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

}
