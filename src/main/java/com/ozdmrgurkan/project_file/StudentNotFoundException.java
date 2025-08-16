package com.ozdmrgurkan.project_file;

//Öğrenci bulunamazsa fırlatılacak Özel Exception
public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message) {
        super(message);
    }
}
