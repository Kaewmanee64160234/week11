/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject.model.dao;

import com.mycompany.dcoffeeproject.SelectDatabase;
import com.mycompany.dcoffeeproject.model.User;
import com.mycompany.dcoffeeproject.model.dao.hepler.DatabaseHelper;
import java.sql.Connection;
import java.sql.PreparedStatement;
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
        User user = null;
        String sql = "SELECT * FROM user WHERE user_id=?";
        Connection conn = DatabaseHelper.getConnect();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                user = new User();
                user = user.fromRecordSet(rs);

//                System.out.println(user.toString());
            }
            return user;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

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
                user = user.fromRecordSet(rs);
                list.add(user);
//                System.out.println(user.toString());

            }
            return list;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    @Override
    public List<User> getAll(String where, String order) {
        ArrayList<User> list = new ArrayList();
        String sql = "SELECT * FROM user where " + where + " ORDER BY " + order;
        Connection conn = DatabaseHelper.getConnect();
        try {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                User user = new User();
                user = user.fromRecordSet(rs);
                list.add(user);
//                System.out.println(user.toString());

            }
            return list;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    @Override
    public User save(User obj) {

        String sql = "INSERT INTO user  (user_name,user_gender,user_password,user_role) VALUES (?,?,?,?)";
        Connection conn = DatabaseHelper.getConnect();
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getName());
            stmt.setString(2, obj.getGender());
            stmt.setString(3, obj.getPassword());
            stmt.setInt(4, obj.getRole());
            stmt.executeUpdate();
            int id = DatabaseHelper.getInsertedId(stmt);
            obj.setId(id);
            return obj;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

            return null;
        }

    }

    @Override
    public User update(User obj) {
        Connection conn = DatabaseHelper.getConnect();
        String sql = "UPDATE user"
                + " SET user_name= ?,user_gender= ?,user_password= ?,user_role= ? \n"
                + "WHERE user_id= ?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, obj.getName());
            stmt.setString(2, obj.getGender());
            stmt.setString(3, obj.getPassword());
            stmt.setInt(4, obj.getRole());
            stmt.setInt(5, obj.getId());
            int ret = stmt.executeUpdate();
            System.out.println(ret);
            System.out.println(sql);
            return obj;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
            return null;
        }

    }

    @Override
    public int delete(User obj) {
        Connection conn = DatabaseHelper.getConnect();
        String sql = "DELETE FROM user WHERE user_id=?";
        try {
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setInt(1, obj.getId());
            int status = stmt.executeUpdate();
//            ResultSet key = stmt.getGeneratedKeys();
//            key.next();
//            System.out.println(""+key.getInt(1));
            return status;
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());

        }
        return -1;
    }

}
