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
        User user1 = userDao.get(1);
        System.out.println(user1);
        user1.setName("Kaewmanee");
        userDao.update(user1);
        
        System.out.println(user1);

        DatabaseHelper.close();
        
        
    }
 
    
}
