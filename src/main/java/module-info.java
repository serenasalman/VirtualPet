module com.example.virtualpet {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.virtualpet to javafx.fxml;
    exports com.example.virtualpet;
}