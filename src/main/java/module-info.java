module com.singhsn.connectfour.connect4 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.singhsn.connectfour.connect4 to javafx.fxml;
    exports com.singhsn.connectfour.connect4;
}