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
        User user1 = userDao.get(6);
//        User inserted = userDao.save(user1);
//        System.out.println(inserted.getId());
//        inserted.setGender("F");
//        userDao.update(inserted);
//        int idUpdated = inserted.getId();
//        System.out.println(idUpdated);
//        DatabaseHelper.close();
//       int num =  userDao.delete(user1);
//        System.out.println(num);
        System.out.println(userDao.getAllOrderBy("user_name", "DESC"));

    }

}
