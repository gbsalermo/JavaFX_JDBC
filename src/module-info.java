module JavaFX_JDBC {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    
    // Abre os pacotes para reflexão
    opens gui to javafx.fxml;
    opens model.entities to javafx.base;
    opens application to javafx.graphics;  // ← ADICIONE ESTA LINHA
    
    // Exporta os pacotes (necessário para que outros módulos possam acessar)
    exports gui;
    exports model.entities;
    exports model.services;
    exports application;  // ← ADICIONE ESTA LINHA
}