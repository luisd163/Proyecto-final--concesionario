module co.edu.unquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.base;
    requires java.logging;
    

    opens co.edu.unquindio.poo to javafx.fxml;
    opens co.edu.unquindio.poo.viewControllers to javafx.fxml;
    exports co.edu.unquindio.poo.application;
}
