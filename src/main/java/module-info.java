module com.example.javafxapplifecycle {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javafxapplifecycle to javafx.fxml;
    exports com.example.javafxapplifecycle;
}