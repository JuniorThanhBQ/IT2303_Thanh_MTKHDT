package com.mycompany.it2303_buoithuchanhmot_quizapp;

import com.mtkhdt.utils.MyAlert;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class PrimaryController {
    public void HandleQuestionManagement(ActionEvent event) throws IOException{
        Scene scene = new Scene(new FXMLLoader(App.class.getResource("Question.fxml")).load());
        
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.setTitle("QuizApp");
        stage.show();
    }
    
    public void HandlePratice(ActionEvent event){
        MyAlert.getIstance().showMsg("Bắt đầu thi!");
    }
}
