/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject;

import com.mycompany.dcoffeeproject.model.dao.UserDao;

/**
 *
 * @author USER
 */
public class TestUserDao {
    public static void main(String[] args) {
        UserDao userDao = new UserDao();
        System.out.println(userDao.get(2));
        
    }
    
}
