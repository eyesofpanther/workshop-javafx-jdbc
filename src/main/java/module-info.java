module com.alcateia {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;

    opens com.alcateia to javafx.fxml;
    opens com.alcateia.gui to javafx.fxml;
    
    exports com.alcateia;
}
