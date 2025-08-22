package com.ozdmrgurkan.dao;


import java.sql.Connection;
import java.util.ArrayList;

public interface IDaoGenerics<T> {

    // CRUD
    // CREATE
    T create(T t);

    // FIND BY NAME,ID
    T findByName(String name);
    T findById(int id);
    // LIST
    ArrayList<T> list();

    // UPDATE
    T update(int id, T t);

    // DELETE
    T delete(int id);

    // CHOOISE
    void chooise();

    // DATABASE CONNECTION
    default Connection getInterfaceConnection() {
        return null;
    }



}
