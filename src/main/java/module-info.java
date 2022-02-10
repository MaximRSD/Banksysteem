module com.example.banksysteem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.banksysteem to javafx.fxml;
    exports com.example.banksysteem;
    exports com.example.banksysteem.classes;
    opens com.example.banksysteem.classes to javafx.fxml;
}