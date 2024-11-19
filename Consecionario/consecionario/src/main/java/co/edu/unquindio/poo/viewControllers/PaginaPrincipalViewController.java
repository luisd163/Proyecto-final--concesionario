package co.edu.unquindio.poo.viewControllers;

/**
 * Sample Skeleton for 'PaginaPrincipal1.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import co.edu.unquindio.poo.application.App;
import co.edu.unquindio.poo.controller.PaginaPrincipalController;
import co.edu.unquindio.poo.model.Alquiler;
import co.edu.unquindio.poo.model.Cliente;
import co.edu.unquindio.poo.model.Compra;
import co.edu.unquindio.poo.model.Empleado;
import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.model.TipoDeVehiculo;
import co.edu.unquindio.poo.model.TipoTransmision;
import co.edu.unquindio.poo.model.Vehiculo;
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

public class PaginaPrincipalViewController {

        PaginaPrincipalController paginaPrincipalController;
        App app;

        ObservableList<Vehiculo> VehiculosTabla = FXCollections.observableArrayList();
        ObservableList<Cliente> clientesTabla = FXCollections.observableArrayList();
        ObservableList<Empleado> empleadosTabla = FXCollections.observableArrayList();
        ObservableList<Alquiler> alquileresTabla = FXCollections.observableArrayList();
        ObservableList<Venta> ventaTabla = FXCollections.observableArrayList();
        ObservableList<Compra> compraTabla = FXCollections.observableArrayList();
        
        
        public void setApp(App app) {
                this.app = app;
                paginaPrincipalController = new PaginaPrincipalController();
                paginaPrincipalController.setEmpresa(app.getEmpresa());
                VehiculosTabla = app.getEmpresa().obtenerListaVehiculosEmpresa();
                clientesTabla = app.getEmpresa().obtenerListaClientesEmpresa();
                empleadosTabla = app.getEmpresa().obtenerListaEmpleadosEmpresa();
                alquileresTabla = app.getEmpresa().obtenerListaAlquileresEmpresa();
                obtenerVehiculos();
                initBinding();
        }

        @FXML // ResourceBundle that was given to the FXMLLoader
        private ResourceBundle resources;

        @FXML // URL location of the FXML file that was given to the FXMLLoader
        private URL location;

        @FXML // fx:id="btnCrearEmpleado"
        private Button btnCrearEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="columnSueldoEmpleado"
        private TableColumn<Empleado, String> columnSueldoEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="btnActualizarAlquiler"
        private Button btnActualizarAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="btnbtnReportes"
        private Button btnReportes; // Value injected by FXMLLoader

        @FXML // fx:id="columnFechaDevolucionAlquiler"
        private TableColumn<Alquiler, String> columnFechaDevolucionAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdClienteCompra"
        private TableColumn<Compra, String> columnIdClienteCompra; // Value injected by FXMLLoader

        @FXML // fx:id="columnMatriculaVehiculoCompra"
        private TableColumn<Compra, String> columnMatriculaVehiculoCompra; // Value injected by FXMLLoader

        @FXML // fx:id="columnTipoDeVehiculo"
        private TableColumn<Vehiculo, String> columnTipoDeVehiculo; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdClienteAlquiler"
        private TableColumn<Alquiler, String> columnIdClienteAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="columnCodigoAlquiler"
        private TableColumn<Alquiler, String> columnCodigoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="txtCodigoVenta"
        private TextField txtCodigoVenta; // Value injected by FXMLLoader

        @FXML // fx:id="txtCodigoAlquiler"
        private TextField txtCodigoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="btnCrearAlquiler"
        private Button btnCrearAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="txtFechaPrestamoAlquiler"
        private TextField txtFechaPrestamoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="columnNuevoOUsado"
        private TableColumn<Vehiculo, String> columnNuevoOUsado; // Value injected by FXMLLoader

        @FXML // fx:id="txtTelefonoEmpleado"
        private TextField txtTelefonoEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdentificacionCliente"
        private TableColumn<Cliente, String> columnIdentificacionCliente; // Value injected by FXMLLoader

        @FXML // fx:id="btnLimpiarCamposAlquiler"
        private Button btnLimpiarCamposAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="columnContraseniaEmpleado"
        private TableColumn<Empleado, String> columnContraseniaEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionEmpleado"
        private TextField txtIdentificacionEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdEmpleadoVenta"
        private TableColumn<Venta, String> columnIdEmpleadoVenta; // Value injected by FXMLLoader

        @FXML // fx:id="tableListaCompras"
        private TableView<Compra> tableListaCompras; // Value injected by FXMLLoader

        @FXML // fx:id="columnCambios"
        private TableColumn<Vehiculo, String> columnCambios; // Value injected by FXMLLoader

        @FXML // fx:id="columnMatriculaVehiculoVenta"
        private TableColumn<Venta, String> columnMatriculaVehiculoVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnCrearVenta"
        private Button btnCrearVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnActualizarVehiculo"
        private Button btnActualizarVehiculo; // Value injected by FXMLLoader

        @FXML // fx:id="txtMatriculaVehiculoVenta"
        private TextField txtMatriculaVehiculoVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnLimpiarCamposCompra"
        private Button btnLimpiarCamposCompra; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdEmpleadoCompra"
        private TableColumn<Compra, String> columnIdEmpleadoCompra; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionEmpleadoVenta"
        private TextField txtIdentificacionEmpleadoVenta; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdentificacionEmpleado"
        private TableColumn<Empleado, String> columnIdentificacionEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionCliente"
        private TextField txtIdentificacionCliente; // Value injected by FXMLLoader

        @FXML // fx:id="btnActualizarEmpleado"
        private Button btnActualizarEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="btnEliminarCliente"
        private Button btnEliminarCliente; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionClienteVenta"
        private TextField txtIdentificacionClienteVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnPickUp"
        private Button btnPickUp; // Value injected by FXMLLoader

        @FXML // fx:id="txtSueldoEmpleado"
        private TextField txtSueldoEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="columnCorreoCliente"
        private TableColumn<Cliente, String> columnCorreoCliente; // Value injected by FXMLLoader

        @FXML // fx:id="tableListaEmpleados"
        private TableView<Empleado> tableListaEmpleados; // Value injected by FXMLLoader

        @FXML // fx:id="txtCodigoCompra"
        private TextField txtCodigoCompra; // Value injected by FXMLLoader

        @FXML // fx:id="btnActualizarVenta"
        private Button btnActualizarVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnCrearCliente"
        private Button btnCrearCliente; // Value injected by FXMLLoader

        @FXML // fx:id="tableListaClientes"
        private TableView<Cliente> tableListaClientes; // Value injected by FXMLLoader

        @FXML // fx:id="columnMarca"
        private TableColumn<Vehiculo, String> columnMarca; // Value injected by FXMLLoader

        @FXML // fx:id="txtContrasenia"
        private TextField txtContrasenia; // Value injected by FXMLLoader

        @FXML // fx:id="columnModelo"
        private TableColumn<Vehiculo, String> columnModelo; // Value injected by FXMLLoader

        @FXML // fx:id="columnCodigoVenta"
        private TableColumn<Venta, String> columnCodigoVenta; // Value injected by FXMLLoader

        @FXML // fx:id="txtNombreEmpleado"
        private TextField txtNombreEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="txtCorreoCliente"
        private TextField txtCorreoCliente; // Value injected by FXMLLoader

        @FXML // fx:id="tableListaAlquileres"
        private TableView<Alquiler> tableListaAlquileres; // Value injected by FXMLLoader

        @FXML // fx:id="columnCorreoEmpleado"
        private TableColumn<Empleado, String> columnCorreoEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdClienteVenta"
        private TableColumn<Venta, String> columnIdClienteVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnEliminarVenta"
        private Button btnEliminarVenta; // Value injected by FXMLLoader

        @FXML // fx:id="columnTelefonoEmpleado"
        private TableColumn<Empleado, String> columnTelefonoEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="columnNombreCliente"
        private TableColumn<Cliente, String> columnNombreCliente; // Value injected by FXMLLoader

        @FXML // fx:id="txtMatriculaVehiculoAlquiler"
        private TextField txtMatriculaVehiculoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="btnEliminarCompra"
        private Button btnEliminarCompra; // Value injected by FXMLLoader

        @FXML // fx:id="btnCrearCompra"
        private Button btnCrearCompra; // Value injected by FXMLLoader

        @FXML // fx:id="columnIdEmpleadoAlquiler"
        private TableColumn<Alquiler, String> columnIdEmpleadoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="btnCamion"
        private Button btnCamion; // Value injected by FXMLLoader

        @FXML // fx:id="btnActualizarCompra"
        private Button btnActualizarCompra; // Value injected by FXMLLoader

        @FXML // fx:id="btnEliminarEmpleado"
        private Button btnEliminarEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="btnBus"
        private Button btnBus; // Value injected by FXMLLoader

        @FXML // fx:id="columnVelocidadMaxima"
        private TableColumn<Vehiculo, String> columnVelocidadMaxima; // Value injected by FXMLLoader

        @FXML // fx:id="columnFechaPrestamoAlquiler"
        private TableColumn<Alquiler, String> columnFechaPrestamoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="tableListaVentas"
        private TableView<Venta> tableListaVentas; // Value injected by FXMLLoader

        @FXML // fx:id="txtNombreCliente"
        private TextField txtNombreCliente; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionClienteAlquiler"
        private TextField txtIdentificacionClienteAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="columnMatriculaVehiculoAlquiler"
        private TableColumn<Alquiler, String> columnMatriculaVehiculoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="btnMoto"
        private Button btnMoto; // Value injected by FXMLLoader

        @FXML // fx:id="txtFechaDevolucionAlquiler"
        private TextField txtFechaDevolucionAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="txtCorreoEmpleado"
        private TextField txtCorreoEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="txtTelefonoCliente"
        private TextField txtTelefonoCliente; // Value injected by FXMLLoader

        @FXML // fx:id="txtMatriculaVehiculoCompra"
        private TextField txtMatriculaVehiculoCompra; // Value injected by FXMLLoader

        @FXML // fx:id="btnLimpiarCamposEmpleado"
        private Button btnLimpiarCamposEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionEmpleadoCompra"
        private TextField txtIdentificacionEmpleadoCompra; // Value injected by FXMLLoader

        @FXML // fx:id="btnActualizarCliente"
        private Button btnActualizarCliente; // Value injected by FXMLLoader

        @FXML // fx:id="columnMatricula"
        private TableColumn<Vehiculo, String> columnMatricula; // Value injected by FXMLLoader

        @FXML // fx:id="columnNombreEmpleado"
        private TableColumn<Empleado, String> columnNombreEmpleado; // Value injected by FXMLLoader

        @FXML // fx:id="btnEliminarVehiculo"
        private Button btnEliminarVehiculo; // Value injected by FXMLLoader

        @FXML // fx:id="btnLimpiarCamposCliente"
        private Button btnLimpiarCamposCliente; // Value injected by FXMLLoader

        @FXML // fx:id="btnLimpiarCamposVenta"
        private Button btnLimpiarCamposVenta; // Value injected by FXMLLoader

        @FXML // fx:id="btnDeportivo"
        private Button btnDeportivo; // Value injected by FXMLLoader

        @FXML // fx:id="btnCamioneta"
        private Button btnCamioneta; // Value injected by FXMLLoader

        @FXML // fx:id="columnCilindraje"
        private TableColumn<Vehiculo, String> columnCilindraje; // Value injected by FXMLLoader

        @FXML // fx:id="columnTelefonoCliente"
        private TableColumn<Cliente, String> columnTelefonoCliente; // Value injected by FXMLLoader

        @FXML // fx:id="columnCodigoCompra"
        private TableColumn<Compra, String> columnCodigoCompra; // Value injected by FXMLLoader

        @FXML // fx:id="columnTipoDeTransmision"
        private TableColumn<Vehiculo, String> columnTipoDeTransmision; // Value injected by FXMLLoader

        @FXML // fx:id="btnVan"
        private Button btnVan; // Value injected by FXMLLoader

        @FXML // fx:id="btnEliminarAlquiler"
        private Button btnEliminarAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionEmpleadoAlquiler"
        private TextField txtIdentificacionEmpleadoAlquiler; // Value injected by FXMLLoader

        @FXML // fx:id="txtIdentificacionClienteCompra"
        private TextField txtIdentificacionClienteCompra; // Value injected by FXMLLoader

        @FXML // fx:id="tableListaVehiculos"
        private TableView<Vehiculo> tableListaVehiculos; // Value injected by FXMLLoader

        @FXML // fx:id="btnSedan"
        private Button btnSedan; // Value injected by FXMLLoader

        @FXML
        void verReportesAction(ActionEvent event) {
                app.openViewVerReportes();
        }

        @FXML
        void abrirVentanaMotoAction(ActionEvent event) {
                app.openViewCrearMoto();
        }

        @FXML
        void abrirVentanaDeportivoAction(ActionEvent event) {
                app.openViewCrearDeportivo();
        }

        @FXML
        void abrirVentanaBusAction(ActionEvent event) {
                app.openViewCrearBus();
        }

        @FXML
        void abrirVentanaPickUpAction(ActionEvent event) {
                app.openViewCrearPickUp();
        }

        @FXML
        void abrirVentanaSedanAction(ActionEvent event) {
                app.openViewCrearSedan();
        }

        @FXML
        void abrirVentanaCamionetaAction(ActionEvent event) {
                app.openViewCrearCamioneta();
        }

        @FXML
        void abrirVentanaVanAction(ActionEvent event) {
                app.openViewCrearVan();
        }

        @FXML
        void abrirVentanaCamionAction(ActionEvent event) {
                app.openViewCrearCamion();
        }

        @FXML
        void crearAlquilerAction(ActionEvent event) {
                boolean validar = validarDatosAlquiler(txtCodigoAlquiler.getText(),
                                txtIdentificacionClienteAlquiler.getText(), txtIdentificacionEmpleadoAlquiler.getText(),
                                txtFechaPrestamoAlquiler.getText(), txtFechaDevolucionAlquiler.getText(),
                                txtMatriculaVehiculoAlquiler.getText());
                if (validar) {
                        Alquiler alquiler = new Alquiler(txtCodigoAlquiler.getText(),
                                        txtIdentificacionClienteAlquiler.getText(),
                                        txtIdentificacionEmpleadoAlquiler.getText(), txtFechaPrestamoAlquiler.getText(),
                                        txtFechaDevolucionAlquiler.getText(), txtMatriculaVehiculoAlquiler.getText());
                        boolean estado = paginaPrincipalController.crearAlquiler(alquiler);
                        if (estado) {
                                showAlert(null, "Alquiler registrado con exito");
                                alquileresTabla.add(alquiler);
                                tableListaAlquileres.setItems(alquileresTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }

        }

        /**
         * Método que valida los datos del campo de alquiler
         * 
         * @param codigoAlquiler
         * @param idCliente
         * @param idEmpleado
         * @param fechaPrestamo
         * @param fechaDevolucion
         * @param matriculaVehiculo
         * @return
         */
        public boolean validarDatosAlquiler(String codigoAlquiler, String idCliente, String idEmpleado,
                        String fechaPrestamo, String fechaDevolucion, String matriculaVehiculo) {
                if (codigoAlquiler.isEmpty() || idCliente.isEmpty() || idEmpleado.isEmpty() || fechaPrestamo.isEmpty()
                                || fechaDevolucion.isEmpty() || matriculaVehiculo.isEmpty()) {
                        showAlert(null, "Todos los campos son obligatorios");
                        return false;
                }
                return true;
        }

        @FXML
        void eliminarAlquilerAction(ActionEvent event) {
                Alquiler alquiler = new Alquiler(txtCodigoAlquiler.getText(), null, null, null, null, null);
                boolean eliminado = paginaPrincipalController.eliminarAlquiler(alquiler);
                if (eliminado) {
                        showAlert(null, "Alquiler eliminado correctamente");
                        alquileresTabla.remove(alquiler);
                        tableListaAlquileres.setItems(alquileresTabla);
                } else {
                        showAlert(null, "Error, verifique los datos ingresados");
                }
        }

        @FXML
        void actualizarAlquilerAction(ActionEvent event) {
                boolean validar = validarDatosAlquiler(txtCodigoAlquiler.getText(),
                                txtIdentificacionClienteAlquiler.getText(), txtIdentificacionEmpleadoAlquiler.getText(),
                                txtFechaPrestamoAlquiler.getText(), txtFechaDevolucionAlquiler.getText(),
                                txtMatriculaVehiculoAlquiler.getText());
                if (validar) {
                        boolean actualizado = paginaPrincipalController.actualizarAlquiler(txtCodigoAlquiler.getText(),
                                        txtIdentificacionClienteAlquiler.getText(),
                                        txtIdentificacionEmpleadoAlquiler.getText(), txtFechaPrestamoAlquiler.getText(),
                                        txtFechaDevolucionAlquiler.getText(), txtMatriculaVehiculoAlquiler.getText());
                        if (actualizado) {
                                showAlert(null, "Alquiler actualizado con exito");
                                tableListaAlquileres.setItems(alquileresTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        @FXML
        void limpiarCamposAlquilerAction(ActionEvent event) {
                txtCodigoAlquiler.clear();
                txtIdentificacionClienteAlquiler.clear();
                txtIdentificacionEmpleadoAlquiler.clear();
                txtFechaPrestamoAlquiler.clear();
                txtFechaDevolucionAlquiler.clear();
                txtMatriculaVehiculoAlquiler.clear();
        }

        @FXML
        void crearVentaAction(ActionEvent event) {
                boolean validar = validarDatosVenta(txtCodigoVenta.getText(), txtIdentificacionClienteVenta.getText(),
                                txtIdentificacionEmpleadoVenta.getText(), txtMatriculaVehiculoVenta.getText());
                if (validar) {
                        Venta venta = new Venta(txtCodigoVenta.getText(), txtIdentificacionClienteVenta.getText(),
                                        txtIdentificacionEmpleadoVenta.getText(), txtMatriculaVehiculoVenta.getText());
                        boolean estado = paginaPrincipalController.crearVenta(venta);
                        if (estado) {
                                showAlert(null, "Venta creada con exito");
                                ventaTabla.add(venta);
                                tableListaVentas.setItems(ventaTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        /**
         * Método que valida que los campos de texto de venta no esten vacios
         * 
         * @param codigo
         * @param idCliente
         * @param idEmpleado
         * @param matriculaVehiculo
         * @return
         */
        public boolean validarDatosVenta(String codigo, String idCliente, String idEmpleado, String matriculaVehiculo) {
                if (codigo.isEmpty() || idCliente.isEmpty() || idEmpleado.isEmpty() || matriculaVehiculo.isEmpty()) {
                        showAlert(null, "Todos los campos son obligatorios");
                        return false;
                }
                return true;
        }

        @FXML
        void eliminarVentaAction(ActionEvent event) {
                Venta venta = new Venta(txtCodigoVenta.getText(), null, null, null);
                boolean eliminada = paginaPrincipalController.eliminarVenta(venta);
                if (eliminada) {
                        showAlert(null, "Venta eliminada correctamente");
                        ventaTabla.remove(venta);
                        tableListaVentas.setItems(ventaTabla);
                } else {
                        showAlert(null, "Error, verifique los datos ingresados");
                }
        }

        @FXML
        void actualizarVentaAction(ActionEvent event) {
                boolean validar = validarDatosVenta(txtCodigoVenta.getText(), txtIdentificacionClienteVenta.getText(),
                                txtIdentificacionEmpleadoVenta.getText(), txtMatriculaVehiculoVenta.getText());
                if (validar) {
                        boolean actualizado = paginaPrincipalController.actualizarVenta(txtCodigoVenta.getText(),
                                        txtIdentificacionClienteVenta.getText(),
                                        txtIdentificacionEmpleadoVenta.getText(), txtMatriculaVehiculoVenta.getText());
                        if (actualizado) {
                                showAlert(null, "Venta actualizada");
                                tableListaVentas.setItems(ventaTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        @FXML
        void limpiarCamposVentaAction(ActionEvent event) {
                txtCodigoVenta.clear();
                txtIdentificacionClienteVenta.clear();
                txtIdentificacionEmpleadoVenta.clear();
                txtMatriculaVehiculoVenta.clear();
        }

        @FXML
        void crearCompraAction(ActionEvent event) {
                boolean validar = validarDatosCompra(txtIdentificacionClienteCompra.getText(),
                                txtIdentificacionEmpleadoCompra.getText(), txtCodigoCompra.getText(),
                                txtMatriculaVehiculoCompra.getText());

                if (validar) {
                        Compra compra = new Compra(txtCodigoCompra.getText(), txtIdentificacionClienteCompra.getText(),
                                        txtIdentificacionEmpleadoCompra.getText(),
                                        txtMatriculaVehiculoCompra.getText());
                        boolean estado = paginaPrincipalController.crearCompra(compra);
                        if (estado) {
                                showAlert(null, "Compra registrada con exito");
                                compraTabla.add(compra);
                                tableListaCompras.setItems(compraTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        /**
         * Método que valida que los campos de texto de compra no esten vacios
         * 
         * @param idCliente
         * @param idEmpleado
         * @param codigoCompra
         * @param matriculaVehiculo
         * @return false si estan vacios, true si no estan vacios
         */
        public boolean validarDatosCompra(String idCliente, String idEmpleado, String codigoCompra,
                        String matriculaVehiculo) {
                if (idCliente.isEmpty() || idEmpleado.isEmpty() || codigoCompra.isEmpty()
                                || matriculaVehiculo.isEmpty()) {
                        showAlert(null, "Todos campos son obligatorios");
                        return false;
                }
                return true;
        }

        @FXML
        void actualizarCompraAction(ActionEvent event) {
                boolean validar = validarDatosCompra(txtIdentificacionClienteCompra.getText(),
                                txtIdentificacionEmpleadoCompra.getText(), txtCodigoCompra.getText(),
                                txtMatriculaVehiculoCompra.getText());
                if (validar) {
                        boolean actualizar = paginaPrincipalController.actualizarCompra(
                                        txtIdentificacionClienteCompra.getText(),
                                        txtIdentificacionEmpleadoCompra.getText(), txtCodigoCompra.getText(),
                                        txtMatriculaVehiculoCompra.getText());
                        if (actualizar) {
                                showAlert(null, "Compra actualizada correctamente");
                                tableListaCompras.setItems(compraTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        @FXML
        void eliminarCompraAction(ActionEvent event) {
                Compra compra = new Compra(txtCodigoCompra.getText(), null, null, null);
                boolean eliminada = paginaPrincipalController.eliminarCompra(compra);
                if (eliminada) {
                        showAlert(null, "Compra eliminada correctamente");
                        compraTabla.remove(compra);
                        tableListaCompras.setItems(compraTabla);
                } else {
                        showAlert(null, "Error, verifique los datos ingresados");
                }
        }

        @FXML
        void limpiarCamposCompraAction(ActionEvent event) {
                txtCodigoCompra.clear();
                txtIdentificacionClienteCompra.clear();
                txtIdentificacionEmpleadoCompra.clear();
                txtMatriculaVehiculoCompra.clear();
        }

        @FXML
        void crearClienteAction(ActionEvent event) {
                boolean validar = validarDatosCliente(txtNombreCliente.getText(), txtIdentificacionCliente.getText(),
                                txtTelefonoCliente.getText(), txtCorreoCliente.getText());
                if (validar) {
                        Cliente cliente = new Cliente(txtNombreCliente.getText(), txtIdentificacionCliente.getText(),
                                        txtTelefonoCliente.getText(), txtCorreoCliente.getText());

                        boolean estado = paginaPrincipalController.crearCliente(cliente); // Uso la variable "estado"
                                                                                          // para confirmar si se creo
                                                                                          // correctamente

                        if (estado) {
                                showAlert(null, "Cliente creado correctamente");
                                clientesTabla.add(cliente);
                                tableListaClientes.setItems(clientesTabla);

                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        /**
         * Método que valida que los campos de texto de cliente no estan vacios
         * 
         * @param nombre
         * @param identificacion
         * @param telefono
         * @param correo
         * @return false si estan vacios, true si no estan vacios
         */
        public boolean validarDatosCliente(String nombre, String identificacion, String telefono, String correo) {
                if (nombre.isEmpty() || identificacion.isEmpty() || telefono.isEmpty() || correo.isEmpty()) {
                        showAlert(null, "Todos los campos son obligatorios");
                        return false;
                }

                return true;
        }

        @FXML
        void eliminarClienteAction(ActionEvent event) {
                Cliente cliente = new Cliente(null, txtIdentificacionCliente.getText(), null, null);

                boolean eliminado = paginaPrincipalController.eliminarCliente(cliente);
                if (eliminado) {
                        showAlert(null, "Cliente eliminado con exito");
                        clientesTabla.remove(cliente);
                        tableListaClientes.setItems(clientesTabla);
                } else {
                        showAlert(null, "Error, verifique los datos ingresados");
                }
        }

        @FXML
        void actualizarClienteAction(ActionEvent event) {
                boolean validar = validarDatosCliente(txtNombreCliente.getText(), txtIdentificacionCliente.getText(),
                                txtTelefonoCliente.getText(), txtCorreoCliente.getText());
                if (validar) {
                        boolean actualizar = paginaPrincipalController.actualizarCliente(txtNombreCliente.getText(),
                                        txtIdentificacionCliente.getText(), txtTelefonoCliente.getText(),
                                        txtCorreoCliente.getText());

                        if (actualizar) {
                                showAlert(null, "Cliente actualizado con exito");
                                tableListaClientes.setItems(clientesTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        @FXML
        void limpiarCamposClienteAction(ActionEvent event) {
                txtNombreCliente.clear();
                txtIdentificacionCliente.clear();
                txtTelefonoCliente.clear();
                txtCorreoCliente.clear();
        }

        @FXML
        void crearEmpleadoAction(ActionEvent event) {
                boolean validar = validarDatosEmpleado(txtNombreEmpleado.getText(), txtIdentificacionEmpleado.getText(),
                                txtTelefonoEmpleado.getText(), txtCorreoEmpleado.getText(), txtSueldoEmpleado.getText(),
                                txtContrasenia.getText());

                if (validar) {
                        Empleado empleado = new Empleado(txtNombreEmpleado.getText(),
                                        txtIdentificacionEmpleado.getText(), txtTelefonoEmpleado.getText(),
                                        txtCorreoEmpleado.getText(), txtSueldoEmpleado.getText(),
                                        txtContrasenia.getText());

                        boolean estado = paginaPrincipalController.crearEmpleado(empleado); // Uso la variable "estado"
                                                                                            // para confirmar si se creo
                                                                                            // correctamente
                        if (estado) {
                                showAlert(null, "Empleado creado correctamente");
                                empleadosTabla.add(empleado);
                                tableListaEmpleados.setItems(empleadosTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        /**
         * Método que valida que los campos de texto de empleado no esten vacios
         * 
         * @param nombre
         * @param identificacion
         * @param telefono
         * @param correo
         * @param sueldo
         * @param contraseña
         * @return false si estan vacios, true si no estan vacios
         */
        public boolean validarDatosEmpleado(String nombre, String identificacion, String telefono, String correo,
                        String sueldo, String contraseña) {
                if (nombre.isEmpty() || identificacion.isEmpty() || telefono.isEmpty() || correo.isEmpty()
                                || sueldo.isEmpty() || contraseña.isEmpty()) {
                        showAlert(null, "Todos los campos son obligatorios");
                        return false;
                }
                return true;
        }

        @FXML
        void limpiarCamposEmpleadoAction(ActionEvent event) {
                txtNombreEmpleado.clear();
                txtIdentificacionEmpleado.clear();
                txtTelefonoEmpleado.clear();
                txtCorreoEmpleado.clear();
                txtSueldoEmpleado.clear();
                txtContrasenia.clear();
        }

        @FXML
        void actualizarEmpleadoAction(ActionEvent event) {
                boolean validar = validarDatosEmpleado(txtNombreEmpleado.getText(), txtIdentificacionEmpleado.getText(),
                                txtTelefonoEmpleado.getText(), txtCorreoEmpleado.getText(), txtSueldoEmpleado.getText(),
                                txtContrasenia.getText());
                if (validar) {
                        boolean actualizar = paginaPrincipalController.actualizarEmpleado(txtNombreEmpleado.getText(),
                                        txtIdentificacionEmpleado.getText(), txtTelefonoEmpleado.getText(),
                                        txtCorreoEmpleado.getText(), txtSueldoEmpleado.getText(),
                                        txtContrasenia.getText());

                        if (actualizar) {
                                showAlert(null, "Empleado actualizado correctamente");
                                tableListaEmpleados.setItems(empleadosTabla);
                        } else {
                                showAlert(null, "Error, verifique los datos ingresados");
                        }
                }
        }

        @FXML
        void eliminarEmpleadoAction(ActionEvent event) {
                Empleado empleado = new Empleado(null, txtIdentificacionEmpleado.getText(), null, null, null, null);
                boolean eliminado = paginaPrincipalController.eliminarEmpleado(empleado);
                if (eliminado) {
                        showAlert(null, "Empleado eliminado correctamente");
                        empleadosTabla.remove(empleado);
                        tableListaEmpleados.setItems(empleadosTabla);
                } else {
                        showAlert(null, "Error, verifique los datos ingresados");
                }
        }


        @FXML // This method is called by the FXMLLoader when initialization is complete
        void initialize() {
                Vehiculo vehiculo = new Vehiculo(TipoTransmision.MANUAL, "Nissan", "Nuevo", "Skyline", "6", "250km",
                                "2.6 litros", "12345678", TipoDeVehiculo.GASOLINA);
                VehiculosTabla.add(vehiculo);
                Empleado empleado = new Empleado("Juan", "123", "12334", "Juan@gmail.com", "100000", "1234");
                empleadosTabla.add(empleado);
                Cliente cliente = new Cliente("Luis", "321", "1233",
                                "luisd@uqvirtual");
                clientesTabla.add(cliente);
                tableListaVehiculos.setItems(VehiculosTabla);
                tableListaEmpleados.setItems(empleadosTabla);
                tableListaClientes.setItems(clientesTabla);

        }

        private void obtenerVehiculos() {
                VehiculosTabla.addAll(paginaPrincipalController.obtenerVehiculos());
                tableListaVehiculos.setItems(VehiculosTabla);
        }

        private void initBinding() {

                // Tabla de vehiculos
                columnMarca.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getMarca()));
                columnNuevoOUsado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getNuevoOUsado()));
                columnModelo.setCellValueFactory(cellData -> new SimpleStringProperty(cellData.getValue().getModelo()));
                columnCambios.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCambios()));
                columnVelocidadMaxima.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getVelocidadMaxima()));
                columnCilindraje.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCilindraje()));
                columnMatricula.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getMatricula()));
                columnTipoDeTransmision.setCellValueFactory(
                                cellData -> new SimpleStringProperty(
                                                cellData.getValue().getTipoTransmision().toString()));
                columnTipoDeVehiculo.setCellValueFactory(
                                cellData -> new SimpleStringProperty(
                                                cellData.getValue().getTipoDeVehiculo().toString()));

                // Tabla de alquileres
                columnIdClienteAlquiler.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCodigoAlquiler()));
                columnIdEmpleadoAlquiler.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdEmpleado()));
                columnMatriculaVehiculoAlquiler.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getMatriculaVehiculo()));
                columnFechaPrestamoAlquiler.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getFechaPrestamo()));
                columnFechaDevolucionAlquiler.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getFechaDevolucion()));
                columnCodigoAlquiler.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCodigoAlquiler()));

                // Tabla de Clientes
                columnNombreCliente.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
                columnIdentificacionCliente.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdentificacion()));
                columnTelefonoCliente.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
                columnCorreoCliente.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));

                // Tabla empleados
                columnNombreEmpleado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getNombre()));
                columnIdentificacionEmpleado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdentificacion()));
                columnTelefonoEmpleado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getTelefono()));
                columnCorreoEmpleado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCorreo()));
                columnSueldoEmpleado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getSueldo()));
                columnContraseniaEmpleado.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getContrasenia()));

                // Tabla de Compras
                columnIdClienteCompra.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdcliente()));
                columnIdEmpleadoCompra.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdEmpleado()));
                columnCodigoCompra.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCodigoCompra()));
                columnMatriculaVehiculoCompra.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getMatriculaVehiculo()));

                // Tabla de Ventas
                columnIdClienteVenta.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdCliente()));
                columnIdEmpleadoVenta.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getIdEmpleado()));
                columnCodigoVenta.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getCodigoVenta()));
                columnMatriculaVehiculoVenta.setCellValueFactory(
                                cellData -> new SimpleStringProperty(cellData.getValue().getMatriculaVehiculo()));
        }

        /**
         * Método que retorna la tabla de vehiculos
         * 
         * @return
         */
        public ObservableList<Vehiculo> obtenerListaVehiculos() {
                return VehiculosTabla;
        }

        public TableView<Vehiculo> obtenerTablaVehiculos() {
                return tableListaVehiculos;
        }

        private void showAlert(String title, String message) {
                Alert alert = new Alert(AlertType.INFORMATION);
                alert.setTitle(title);
                alert.setHeaderText(null);
                alert.setContentText(message);
                alert.showAndWait();
        }


}
