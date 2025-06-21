module com.mycompany.it2303_buoithuchanhmot_quizapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;
    requires lombok;
    requires java.sql;

    opens com.mycompany.it2303_buoithuchanhmot_quizapp to javafx.fxml;
    exports com.mycompany.it2303_buoithuchanhmot_quizapp;
}
