/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class InsertData {
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
        //Insert
        String sql = "INSERT INTO category VALUES (?,?)";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, 3);
            stmt.setString(2, "candy");
            int status = stmt.executeUpdate();
//            ResultSet key = stmt.getGeneratedKeys();
//            key.next();
//            System.out.println(""+key.getInt(1));
            
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
