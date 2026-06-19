module com.bqt.app.bqtenglishquizzapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.bqt.app.bqtenglishquizzapp to javafx.fxml;
    exports com.bqt.app.bqtenglishquizzapp;
}
