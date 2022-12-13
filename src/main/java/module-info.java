module hu.petrik.adatbazisjavafx.adatbazisjavafx {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens hu.petrik.adatbazisjavafx.adatbazisjavafx to javafx.fxml;
    exports hu.petrik.adatbazisjavafx.adatbazisjavafx;
}