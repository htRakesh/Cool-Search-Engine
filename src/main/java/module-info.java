module com.example.search_engine_acciojob {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.search_engine_acciojob to javafx.fxml;
    exports com.example.search_engine_acciojob;
}