/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject.model.dao.hepler;

import com.mycompany.dcoffeeproject.DcoffeeProject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DatabaseHelper {

    private static Connection conn = null;
    private static String URL = "jdbc:sqlite:dcoffee.db";

    static {
        getConnect();
    }

    public static synchronized Connection getConnect() {

        if (conn == null) {
            try {
                conn = DriverManager.getConnection(URL);
                System.out.println("Connection to sqlite has been sucess");
            } catch (SQLException ex) {
                Logger.getLogger(DcoffeeProject.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return conn;
    }

    public static void close() {
        if (conn != null) {

            try {
                conn.close();
                conn = null;
            } catch (SQLException ex) {
                Logger.getLogger(DatabaseHelper.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

}
