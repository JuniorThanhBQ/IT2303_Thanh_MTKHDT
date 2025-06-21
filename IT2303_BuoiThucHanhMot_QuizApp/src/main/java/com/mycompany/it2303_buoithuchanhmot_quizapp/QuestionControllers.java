/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.it2303_buoithuchanhmot_quizapp;

import com.mtkhdt.pojo.Category;
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
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/quizdb", "root", "root");
            
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM category");
                          System.out.print("tired");
            List<Category> categoryList = new ArrayList<>();
            while(rs.next()){
                Category C = new Category(rs.getInt("ID"),rs.getString("Name"));
                System.out.print(C);
                categoryList.add(C);
            }
            
            this.cbCates.setItems(FXCollections.observableList(categoryList));
            conn.close();
        }catch(ClassNotFoundException | SQLException ex){
               System.out.println(ex.toString());
        }
    }    
    
}
