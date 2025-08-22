package com.ozdmrgurkan;

import com.ozdmrgurkan.controller.StudentController;

public class MainTest {
    public static void main(String[] args) {
        try{
            StudentController studentController = new StudentController();
            studentController.chooise();

        } catch (Exception e){
            e.printStackTrace();
        }

    }
}
