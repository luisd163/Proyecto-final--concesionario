package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'CrearSedanView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.CrearVehiculoController;
import co.edu.unquindio.poo.model.Moto;
import co.edu.unquindio.poo.model.Sedan;
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

public class CrearSedanViewController {

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

    @FXML // fx:id="txtSensoresDeColision"
    private TextField txtSensoresDeColision; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipoVehiculo"
    private ComboBox<TipoDeVehiculo> comboTipoVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroPuertas"
    private TextField txtNumeroPuertas; // Value injected by FXMLLoader

    @FXML // fx:id="comboTipotransmision"
    private ComboBox<TipoTransmision> comboTipotransmision; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelocidadMaxima"
    private TextField txtVelocidadMaxima; // Value injected by FXMLLoader

    @FXML // fx:id="txtAireAcondicionado"
    private TextField txtAireAcondicionado; // Value injected by FXMLLoader

    @FXML // fx:id="btnVolver"
    private Button btnVolver; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroPasajeros"
    private TextField txtNumeroPasajeros; // Value injected by FXMLLoader

    @FXML // fx:id="txtVelocidadDeCrucero"
    private TextField txtVelocidadDeCrucero; // Value injected by FXMLLoader

    @FXML // fx:id="txtMatricula"
    private TextField txtMatricula; // Value injected by FXMLLoader

    @FXML // fx:id="txtNuevoOUsado"
    private TextField txtNuevoOUsado; // Value injected by FXMLLoader

    @FXML // fx:id="btnLimpiarCampos"
    private Button btnLimpiarCampos; // Value injected by FXMLLoader

    @FXML // fx:id="txtAbs"
    private TextField txtAbs; // Value injected by FXMLLoader

    @FXML // fx:id="txtNumeroBolsasAire"
    private TextField txtNumeroBolsasAire; // Value injected by FXMLLoader

    @FXML // fx:id="btnActualizarVehiculo"
    private Button btnActualizarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtAsistenciaDePermanencia"
    private TextField txtAsistenciaDePermanencia; // Value injected by FXMLLoader

    @FXML // fx:id="btnEliminarVehiculo"
    private Button btnEliminarVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtSensoresDeTraficoCruzado"
    private TextField txtSensoresDeTraficoCruzado; // Value injected by FXMLLoader

    @FXML // fx:id="txtCambios"
    private TextField txtCambios; // Value injected by FXMLLoader

    @FXML // fx:id="txtCamaraDeReversa"
    private TextField txtCamaraDeReversa; // Value injected by FXMLLoader

    @FXML // fx:id="btnCrearVehiculo"
    private Button btnCrearVehiculo; // Value injected by FXMLLoader

    @FXML // fx:id="txtCapacidadMaletero"
    private TextField txtCapacidadMaletero; // Value injected by FXMLLoader

    @FXML // fx:id="txtCilindraje"
    private TextField txtCilindraje; // Value injected by FXMLLoader

    @FXML // fx:id="txtmodelo"
    private TextField txtmodelo; // Value injected by FXMLLoader

    @FXML // fx:id="txtMarca"
    private TextField txtMarca; // Value injected by FXMLLoader

    @FXML
    void crearVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtmodelo.getText(), txtMarca.getText(), txtCambios.getText(), txtNuevoOUsado.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), txtNumeroPasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasAire.getText(), txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraDeReversa.getText(), txtVelocidadDeCrucero.getText(), txtAbs.getText(), txtSensoresDeColision.getText(), txtSensoresDeTraficoCruzado.getText(), txtAsistenciaDePermanencia.getText());
        if (validar) {
            Vehiculo Sedan = new Sedan(comboTipotransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(), txtmodelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), comboTipoVehiculo.getValue(), txtNumeroPasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasAire.getText(), txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraDeReversa.getText(), txtVelocidadDeCrucero.getText(), txtAbs.getText(), txtSensoresDeColision.getText(), txtSensoresDeTraficoCruzado.getText(), txtAsistenciaDePermanencia.getText());
            boolean estado = crearVehiculoController.CrearVehiculo(Sedan);
            if (estado) {
                vehiculosTabla.add(Sedan);
                tableListaVehiculos.setItems(vehiculosTabla);
                showAlert(null, "Vehiculo creado con exito");
            } else {
                showAlert(null, "Error, verifique los datos ingresados");
            }
        }
    }

    /**
     * Método que valida que los campos no esten vacios
     * @param modelo
     * @param marca
     * @param cambios
     * @param nuevoOUsado
     * @param velocidadMaxima
     * @param cilindraje
     * @param matricula
     * @param numeroPasajeros
     * @param numeroPuertas
     * @param numeroBolsasAire
     * @param capacidadMaletero
     * @param aireACondicionado
     * @param camaraReversa
     * @param velocidadCrucero
     * @param abs
     * @param sensoresDeColision
     * @param sensorTraficoCruzado
     * @param asistenciaDePermanenciaEnElCarril
     * @return false si algun campo esta vacio, true si todos los campos tienen datos
     */
    public boolean validarDatos(String modelo, String marca, String cambios, String nuevoOUsado, String velocidadMaxima,
            String cilindraje, String matricula, String numeroPasajeros, String numeroPuertas,
            String numeroBolsasAire, String capacidadMaletero,
            String aireACondicionado, String camaraReversa, String velocidadCrucero, String abs,
            String sensoresDeColision, String sensorTraficoCruzado, String asistenciaDePermanenciaEnElCarril) {
        if (modelo.isEmpty() || marca.isEmpty() || cambios.isEmpty() || nuevoOUsado.isEmpty()
                || velocidadMaxima.isEmpty() || cilindraje.isEmpty() || matricula.isEmpty() || numeroPasajeros.isEmpty()
                || numeroPuertas.isEmpty() || numeroBolsasAire.isEmpty() || capacidadMaletero.isEmpty()
                || aireACondicionado.isEmpty() || camaraReversa.isEmpty() || velocidadCrucero.isEmpty() || abs.isEmpty()
                || sensoresDeColision.isEmpty() || sensorTraficoCruzado.isEmpty()
                || asistenciaDePermanenciaEnElCarril.isEmpty()) {
            showAlert(null, "Todos los campos son obligatorios");
            return false;
        }
        return true;
    }

    @FXML
    void actualizarVehiculoAction(ActionEvent event) {
        boolean validar = validarDatos(txtmodelo.getText(), txtMarca.getText(), txtCambios.getText(), txtNuevoOUsado.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), txtNumeroPasajeros.getText(), txtNumeroPuertas.getText(), txtNumeroBolsasAire.getText(), txtCapacidadMaletero.getText(), txtAireAcondicionado.getText(), txtCamaraDeReversa.getText(), txtVelocidadDeCrucero.getText(), txtAbs.getText(), txtSensoresDeColision.getText(), txtSensoresDeTraficoCruzado.getText(), txtAsistenciaDePermanencia.getText());
        if (validar) {
            boolean actualizado = crearVehiculoController.actualizarVehiculo(comboTipotransmision.getValue(), txtMarca.getText(), txtNuevoOUsado.getText(), txtmodelo.getText(), txtCambios.getText(), txtVelocidadMaxima.getText(), txtCilindraje.getText(), txtMatricula.getText(), comboTipoVehiculo.getValue());
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
        Vehiculo moto = new Moto(null, null, null, null, null, null, null,
                txtMatricula.getText(), null, null);
        boolean eliminada = crearVehiculoController.eliminarVehiculo(moto);
        if (eliminada) {
            vehiculosTabla.remove(moto);
            tableListaVehiculos.setItems(vehiculosTabla);
            showAlert(null, "vehiculo eliminado correctamente");
        } else {
            showAlert(null, "Error, verifique los datos ingresados");
        }
    }

    @FXML
    void limpiarCamposAction(ActionEvent event) {
        txtmodelo.clear();
        txtMarca.clear(); 
        txtCambios.clear(); 
        txtNuevoOUsado.clear(); 
        txtVelocidadMaxima.clear(); 
        txtCilindraje.clear(); 
        txtMatricula.clear();
        txtNumeroPasajeros.clear(); 
        txtNumeroPuertas.clear(); 
        txtNumeroBolsasAire.clear(); 
        txtCapacidadMaletero.clear(); 
        txtAireAcondicionado.clear(); 
        txtCamaraDeReversa.clear(); 
        txtVelocidadDeCrucero.clear(); 
        txtAbs.clear(); 
        txtSensoresDeColision.clear(); 
        txtSensoresDeTraficoCruzado.clear(); 
        txtAsistenciaDePermanencia.clear();
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
        comboTipotransmision.setItems(optionsTransmision);

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
