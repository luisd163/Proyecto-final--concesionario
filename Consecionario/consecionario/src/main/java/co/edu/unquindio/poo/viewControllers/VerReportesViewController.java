package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'VerReportesView.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.VerReportesController;
import co.edu.unquindio.poo.model.Compra;
import co.edu.unquindio.poo.model.Venta;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class VerReportesViewController {

    VerReportesController verReportesController;
    App app;
    ObservableList<Venta> ventasTabla = FXCollections.observableArrayList();
    ObservableList<Compra> comprasTabla = FXCollections.observableArrayList();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="columnCodigoVenta"
    private TableColumn<Venta, String> columnCodigoVenta; // Value injected by FXMLLoader

    @FXML // fx:id="columnMatriculaVehiculoVenta"
    private TableColumn<Venta, String> columnMatriculaVehiculoVenta; // Value injected by FXMLLoader

    @FXML // fx:id="txtdEmpleado"
    private TextField txtdEmpleado; // Value injected by FXMLLoader

    @FXML // fx:id="btnVolver"
    private Button btnVolver; // Value injected by FXMLLoader

    @FXML // fx:id="columnIdClienteVenta"
    private TableColumn<Venta, String> columnIdClienteVenta; // Value injected by FXMLLoader

    @FXML // fx:id="columnCodigoCompra"
    private TableColumn<Compra, String> columnCodigoCompra; // Value injected by FXMLLoader

    @FXML // fx:id="columnIdClienteCompra"
    private TableColumn<Compra, String> columnIdClienteCompra; // Value injected by FXMLLoader

    @FXML // fx:id="btnGenerarReporte"
    private Button btnGenerarReporte; // Value injected by FXMLLoader

    @FXML // fx:id="tableListaVentas"
    private TableView<Venta> tableListaVentas; // Value injected by FXMLLoader

    @FXML // fx:id="columnMatriculaVehiculoCompra"
    private TableColumn<Compra, String> columnMatriculaVehiculoCompra; // Value injected by FXMLLoader

    @FXML // fx:id="tableListaCompras"
    private TableView<Compra> tableListaCompras; // Value injected by FXMLLoader

    @FXML
    void generarReporteAction(ActionEvent event) {
        ObservableList<Venta> ventasEmpleado = verReportesController.generarReporteVentasEmpleado(txtdEmpleado.getText());
        ObservableList<Compra> comprasEmpleado = verReportesController.generarReporteComprasEmpleado(txtdEmpleado.getText());
        if (ventasEmpleado.isEmpty() && comprasEmpleado.isEmpty()) {
            showAlert("Reporte de ventas y compras", "No se encontraron ventas ni compras para el empleado");
        } else {
            ventasTabla.clear();
            ventasTabla.addAll(ventasEmpleado);
            tableListaVentas.setItems(ventasTabla);
            comprasTabla.clear();
            comprasTabla.addAll(comprasEmpleado);
            tableListaCompras.setItems(comprasTabla);
        }
    }

    @FXML
    void volverAction(ActionEvent event) {
        app.openViewPaginaPrincipal();
    }

    private void initBinding() {

        // Tabla de ventas
        columnCodigoVenta
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigoVenta()));
        columnIdClienteVenta
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdCliente()));
        columnMatriculaVehiculoVenta
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatriculaVehiculo()));

        // Tabla de compras
        columnCodigoCompra
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getCodigoCompra()));
        columnIdClienteCompra
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getIdcliente()));
        columnMatriculaVehiculoCompra
                .setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMatriculaVehiculo()));
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
    }

    public void setApp(App app) {
        this.app = app;
        verReportesController = new VerReportesController(app.getEmpresa());
        initBinding();

    }

    private void showAlert(String title, String message) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }


}
