module JavaFX_JDBC {
    requires javafx.controls;
    requires javafx.fxml;
    
    // Exporta para todos os módulos
    exports application;
    exports gui;
    
    // Abre para reflexão
    opens application;
    opens gui;
}