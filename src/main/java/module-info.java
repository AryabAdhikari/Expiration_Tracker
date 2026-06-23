module com.example.expirationtracker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens app to javafx.fxml;
    exports app;
}