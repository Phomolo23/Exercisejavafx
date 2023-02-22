module com.example.increament {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.increament to javafx.fxml;
    exports com.example.increament;
}