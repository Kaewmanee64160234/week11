/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject.model.dao;

import com.mycompany.dcoffeeproject.SelectDatabase;
import com.mycompany.dcoffeeproject.model.User;
import com.mycompany.dcoffeeproject.model.dao.hepler.DatabaseHelper;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author USER
 */
public class UserDao implements Dao<User> {

    @Override
    public User get(int id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public List<User> getAll() {
        ArrayList<User> list = new ArrayList();
        String sql = "SELECT * FROM user";
        Connection conn = DatabaseHelper.getConnect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user.setId(rs.getInt("user_id"));
                user.setName(rs.getString("user_name"));
                user.setRole(rs.getInt("user_role"));
                user.setGender(rs.getString("user_gender"));
                user.setPassword(rs.getString("user_pasaword"));
                list.add(user);
                System.out.println(rs.getInt("cat_id") + " " + rs.getString("cat_name"));

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
        return list;
    }

    @Override
    public User save(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public User update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int delete(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
