/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject;

import com.mycompany.dcoffeeproject.model.User;
import com.mycompany.dcoffeeproject.model.service.UserService;

/**
 *
 * @author USER
 */
public class TestUserService {
    public static void main(String[] args) {
        UserService userService = new UserService();
      User user = userService.login("user3", "password");
      if(user==null){
          System.out.println("cannot login");
      }else{
          System.out.println("Login!!! "+user.getName()+" welcome");
      }
    }
    
}
