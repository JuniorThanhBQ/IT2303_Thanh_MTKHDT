package com.mtkhdt.services;

import com.mtkhdt.pojo.Category;
import com.mtkhdt.utils.jdbcConnector;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javafx.collections.FXCollections;

public class CategoryServices {
    public List<Category> getCates() throws SQLException{
        Connection conn = jdbcConnector.getInstance().connect();
        Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * FROM category");
                          System.out.print("tired");
            List<Category> categoryList = new ArrayList<>();
            while(rs.next()){
                Category C = new Category(rs.getInt("ID"),rs.getString("Name"));
                System.out.print(C);
                categoryList.add(C);
            }
           return categoryList;
    }
}
