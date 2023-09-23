/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject;

import com.mycompany.dcoffeeproject.model.User;
import com.mycompany.dcoffeeproject.model.dao.UserDao;
import com.mycompany.dcoffeeproject.model.dao.hepler.DatabaseHelper;

/**
 *
 * @author USER
 */
public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        User user1 = new User("user3","password",2,"F");
        User inserted = userDao.save(user1);
        System.out.println(inserted);
        DatabaseHelper.close();
        
        
    }
 
    
}
