/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject.model.service;

import com.mycompany.dcoffeeproject.model.User;
import com.mycompany.dcoffeeproject.model.dao.UserDao;

/**
 *
 * @author USER
 */
public class UserService {
    public User login (String name,String password){
        UserDao userDao = new UserDao();
       User user =  userDao.getUserByName(name);
       
       if(user!=null && password.equals(user.getPassword())){
           return user;
       }
       return null;
    }
    
}
