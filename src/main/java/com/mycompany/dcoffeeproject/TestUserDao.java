/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject;

import com.mycompany.dcoffeeproject.model.User;
import com.mycompany.dcoffeeproject.model.dao.UserDao;
import com.mycompany.dcoffeeproject.model.dao.hepler.DatabaseHelper;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author USER
 */
public class TestUserDao {

    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = userDao.get(5);
//        User inserted = userDao.save(user1);
//        System.out.println(inserted.getId());
//        inserted.setGender("F");
//        userDao.update(inserted);
//        int idUpdated = inserted.getId();
//        System.out.println(idUpdated);
//        DatabaseHelper.close();
       int num =  userDao.delete(user1);
        System.out.println(num);
//        List<User> list  =  userDao.getAll("user_name like 'u%'", "user_name asc");
//        List<User> list = userDao.getAll();
//        for (User user : list) {
//            System.out.println(user);
//
//        }

    }

}
