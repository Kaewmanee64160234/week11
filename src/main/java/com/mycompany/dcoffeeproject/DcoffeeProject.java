/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.dcoffeeproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class DcoffeeProject {

    public static void main(String[] args) {
        Connection conn = null;
        String url = "jdbc:sqlite:dcoffee.db";
        try {
            conn = DriverManager.getConnection(url);
            System.out.println("Connection to sqlite has been sucess");
        } catch (SQLException ex) {
            Logger.getLogger(DcoffeeProject.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            if(conn!=null){
                try{
                    conn.close();
                }catch(SQLException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        
    }
}
