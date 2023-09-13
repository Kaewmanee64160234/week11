/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class SelectDatabase {

    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:sqlite:dcoffee.db";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to sqlite has been sucess");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return;

        }
        //select
        String sql = "SELECT * FROM category";
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs =  stmt.executeQuery(sql);
            
            while (rs.next()) {
                System.out.println(rs.getInt("cat_id")+" "+rs.getString("cat_name"));
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(SelectDatabase.class.getName()).log(Level.SEVERE, null, ex);
        }

        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());

            }
        }

    }

}
