module com.alcateia {
    requires javafx.controls;
    requires javafx.fxml;
    requires transitive javafx.graphics;
    requires java.sql;

    opens com.alcateia to javafx.fxml;
    opens com.alcateia.gui to javafx.fxml;
    opens com.alcateia.model.entities to javafx.base, javafx.fxml;
    
    exports com.alcateia;
}
