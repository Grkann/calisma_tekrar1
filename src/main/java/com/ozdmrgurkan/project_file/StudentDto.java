package com.ozdmrgurkan.project_file;

import com.ozdmrgurkan.tutorials._2_week._15_4_SpecialColor;
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
    private EStudentType eStudentType; // Enum öğrenci seviyesi
    private Double midTerm; //Vize
    private Double finalTerm; //Final
    private Double resultTerm; // Sonuç: (%40 vize + %60Final)
    private LocalDate birthDay;
    private Date dateOfBirth; //Created Date //Sistem otomatik tarihi


    // static (Nesne boyunca 1 kere olusturulur.)
    static {
        System.out.println(_15_4_SpecialColor.CYAN + "static studentDto yüklendi." + _15_4_SpecialColor.RESET);

    }


    //Parametresiz constructor
    public StudentDto() {

    }

    //Parametreli constructor

    public StudentDto(Integer id, String name, String surname, Double midTerm, Double finalTerm, LocalDate birthDay,EStudentType eStudentType ) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.midTerm = midTerm;
        this.finalTerm = finalTerm;
        this.birthDay = birthDay;
        this.resultTerm = calculateResult();
        this.dateOfBirth = new Date(System.currentTimeMillis());
        this.eStudentType = eStudentType;
    }



    //Metotlar
    //Vize ve Final Notu Hesabı
    private Double calculateResult() {
        if (midTerm == null || finalTerm == null) {
            return 0.0;
        }
        else{
            return(midTerm*0.4 + finalTerm*0.6);
        }

    }




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

    public Double getMidTerm() {
        return midTerm;
    }

    public void setMidTerm(Double midTerm) {
        this.midTerm = midTerm;
        this.resultTerm = calculateResult();
    }

    public Double getFinalTerm() {
        return finalTerm;
    }

    public void setFinalTerm(Double finalTerm) {
        this.finalTerm = finalTerm;
        this.resultTerm = calculateResult();
    }

    public Double getResultTerm() {
        return resultTerm;
    }

    public void setResultTerm(Double resultTerm) {
        this.resultTerm = resultTerm;
    }

    public EStudentType geteStudentType() {
        return eStudentType;
    }

    public void setStudentType(EStudentType eStudentType) {
        this.eStudentType = eStudentType;
    }
} // end Student
