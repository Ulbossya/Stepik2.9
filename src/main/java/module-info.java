module com.example.transportvidy {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.transportvidy to javafx.fxml;
    exports com.example.transportvidy;
}