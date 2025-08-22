package com.ozdmrgurkan.controller;

import com.ozdmrgurkan.dao.IDaoGenerics;
import com.ozdmrgurkan.dao.StudentDao;
import com.ozdmrgurkan.dto.StudentDto;

import java.util.ArrayList;

public class StudentController implements IDaoGenerics<StudentDto> {



    // Injection
    private final StudentDao studentDao;

    // Parametresiz Constructor
    public StudentController() {
        studentDao = new StudentDao();

    }

    /// //////////////////////////////////


    //CREATE
    @Override
    public StudentDto create(StudentDto studentDto) {
        return studentDao.create(studentDto);
    }

    //FIND BY NAME
    @Override
    public StudentDto findByName(String name) {
        return studentDao.findByName(name);
    }

    @Override
    public StudentDto findById(int id) {
        return null;
    }

    // LIST
    @Override
    public ArrayList<StudentDto> list() {
        return studentDao.list();
    }

    //UPDATE
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        return studentDao.update(id,studentDto);
    }

    //DELETE
    @Override
    public StudentDto delete(int id) {
        return studentDao.delete(id);
    }

    //CHOOISE(switch-case)
    @Override
    public void chooise() {
        studentDao.chooise();
    }
}
