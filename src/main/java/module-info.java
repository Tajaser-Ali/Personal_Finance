module com.example.personalfinance {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires com.almasb.fxgl.all;
    requires java.desktop;

    opens com.example.personal_finance to javafx.fxml;
    exports com.example.personal_finance;


    opens Personal_Finance to javafx.fxml;
    exports Personal_Finance;

    opens subject_selector to javafx.fxml;
    exports subject_selector;
}