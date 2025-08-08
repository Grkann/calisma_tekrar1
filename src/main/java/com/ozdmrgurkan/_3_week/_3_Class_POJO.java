package com.ozdmrgurkan._3_week;


//POJO : Plain Old Java Object
// Sadece field + getter and setter bölümü.

import com.ozdmrgurkan._2_week._15_4_SpecialColor;

// this : global nesneye işaret eder.
public class _3_Class_POJO {
    //Field
    private String name;
    private String surname;

    //Getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        // name = _name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname.toUpperCase();
    }

    public static void main(String[] args) {
        _3_Class_POJO pojo = new _3_Class_POJO();
        pojo.setName("Gurkan");
        pojo.setSurname("Ozdemir");
        String nameAndSurname = pojo.getName().toString() + " " + pojo.getSurname().toString();
        System.out.println(_15_4_SpecialColor.CYAN + nameAndSurname + _15_4_SpecialColor.RESET);
    }



}
