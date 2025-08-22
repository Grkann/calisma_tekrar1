package com.ozdmrgurkan.exceptions;

//Öğrenci bulunamazsa fırlatılacak Özel Exception
public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message) {
        super(message);
    }
}
