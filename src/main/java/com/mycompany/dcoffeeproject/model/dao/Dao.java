/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.dcoffeeproject.model.dao;

import java.util.List;

/**
 *
 * @author USER
 */
public interface Dao <T>{
    T get(int id);
    List<T> getAll();
    T save(T obj);
    T update(T obj);
    int delete(T obj);
    List<T> getAll(String where,String order);
    
    
    
}
