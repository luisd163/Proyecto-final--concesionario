package co.edu.unquindio.poo.application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

import co.edu.unquindio.poo.model.Empresa;
import co.edu.unquindio.poo.viewControllers.CrearBusViewController;
import co.edu.unquindio.poo.viewControllers.CrearCamionViewController;
import co.edu.unquindio.poo.viewControllers.CrearCamionetaViewController;
import co.edu.unquindio.poo.viewControllers.CrearDeportivoViewController;
import co.edu.unquindio.poo.viewControllers.CrearMotoViewController;
import co.edu.unquindio.poo.viewControllers.CrearPickUpViewController;
import co.edu.unquindio.poo.viewControllers.CrearSedanViewController;
import co.edu.unquindio.poo.viewControllers.CrearVanViewController;
import co.edu.unquindio.poo.viewControllers.OlvidasteLaContraseniaViewController;
import co.edu.unquindio.poo.viewControllers.PaginaPrincipalViewController;
import co.edu.unquindio.poo.viewControllers.VerReportesViewController;
import co.edu.unquindio.poo.viewControllers.loginViewController;

/**
 * JavaFX App
 */
public class App extends Application {

    private Stage primaryStage;
    private PaginaPrincipalViewController paginaPrincipalViewController;
    Empresa empresa = new Empresa("TuCarroUQ", "XLR8");

    public Empresa getEmpresa() {
        return empresa;
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Inicio Sesion");
        empresa.inicializarDatos();
        openViewLogin();
    }

    public void openViewLogin() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/loginView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            loginViewController primaryController = loader.getController();
            primaryController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewPaginaPrincipal() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/PaginaPrincipal1.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            PaginaPrincipalViewController primaryController = loader.getController();
            paginaPrincipalViewController = primaryController;
            primaryController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewOlvidasteLaContrasenia() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/OlvidasteLaContraseniaView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            OlvidasteLaContraseniaViewController primaryController = loader.getController();
            primaryController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearMoto() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearMoto.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearMotoViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearBus() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearBusView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearBusViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearCamion() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearCamionView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearCamionViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearCamioneta() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearCamionetaView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearCamionetaViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearDeportivo() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearDeportivoView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearDeportivoViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearPickUp() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearPickUpView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearPickUpViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearSedan() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearSedanView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearSedanViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewCrearVan() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/CrearVanView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            CrearVanViewController primaryController = loader.getController();
            primaryController.setApp(this);
            primaryController.setPaginaPrincipalViewController(paginaPrincipalViewController);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public void openViewVerReportes() {
        try {
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(App.class.getResource("/co/edu/unquindio/poo/VerReportesView.fxml"));
            javafx.scene.layout.AnchorPane rootLayout = (javafx.scene.layout.AnchorPane) loader.load();
            VerReportesViewController primaryController = loader.getController();
            primaryController.setApp(this);
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}