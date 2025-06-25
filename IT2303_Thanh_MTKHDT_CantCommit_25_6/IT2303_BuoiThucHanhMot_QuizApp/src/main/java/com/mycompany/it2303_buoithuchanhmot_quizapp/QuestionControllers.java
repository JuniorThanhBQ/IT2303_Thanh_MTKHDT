/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.it2303_buoithuchanhmot_quizapp;

import com.mtkhdt.utils.jdbcConnector;
import com.mtkhdt.pojo.Category;
import com.mtkhdt.services.CategoryServices;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

/**
 * FXML Controller class
 *
 * @author admin
 */
public class QuestionControllers implements Initializable {
    @FXML private ComboBox<Category> cbCates;
    
    private static final CategoryServices cateServices = new CategoryServices();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            Connection conn = jdbcConnector.getInstance().connect();
          
            this.cbCates.setItems(FXCollections.observableList(cateServices.getCates()));
          
        }catch(SQLException ex){
               System.out.println(ex.toString());
        }
    }    
    
}
