module com.example.expirationtracker {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;

    opens com.example.expirationtracker to javafx.fxml;
    exports com.example.expirationtracker;
}