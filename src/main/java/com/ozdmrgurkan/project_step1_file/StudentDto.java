package com.ozdmrgurkan.project_step1_file;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.ToString;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Date;

//LOMBOK
@AllArgsConstructor
@Builder
@ToString
@EqualsAndHashCode

//Student
 public class StudentDto implements Serializable {
    //Serileştirme
    private static final long serialVersionUID = 556123124156L;

    //Field

    private Integer id;
    private String name;
    private String surname;
    private LocalDate birthDay;
    private Date dateOfBirth;
    private Double grade; // basarı notu

    // static (Nesne boyunca 1 kere olusturulur.)
    static {

    }


    //Parametresiz constructor
    public StudentDto() {

    }

    //Parametreli constructor
    public StudentDto(String name, Integer id, String surname, LocalDate birthDay, Double grade) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.birthDay = birthDay;
        this.grade = grade;
    }

//Metotlar

    //Getter and Setter


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public Double getGrade() {
        return grade;
    }

    public void setGrade(Double grade) {
        this.grade = grade;
    }
} // end Student
