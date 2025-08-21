package com.ozdmrgurkan.tutorials._3_week;

import com.ozdmrgurkan.tutorials._2_week._15_4_SpecialColor;

import java.util.Date;
import java.util.Objects;

public class _4_Class_BEAN {

    //Field
    private Long id;
    private String name;
    private String surname;
    private Date createdDate;


    //Constructor Metot (parametresiz)
    public _4_Class_BEAN() {
        id = 0L;
        this.name = "Gurkan"; // İsim alanı
        this.surname = "Ozdemir"; // Soyisim alanı
        this.createdDate = new Date(System.currentTimeMillis());

    }

    //Constructor(parametreli)
    public _4_Class_BEAN(Long id, String name, String surname, Date createdDate) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = createdDate;
    }

    //Constructor(parametreli)
    //OVERLOADING
    public _4_Class_BEAN(Long id, String name, String surname) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.createdDate = new Date(System.currentTimeMillis());

    }
    //Method

    public String fullName() {
        return id + " " + name.toString() + " " + surname.toString() + " " + createdDate.toString();
    }

    @Override
    public String toString() {
        return "_4_Class_BEAN{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", createdDate=" + createdDate +
                '}';
    }

    // Equals and HashCode
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        _4_Class_BEAN classBean = (_4_Class_BEAN) o;
        return Objects.equals(id, classBean.id) && Objects.equals(name, classBean.name) && Objects.equals(surname, classBean.surname) && Objects.equals(createdDate, classBean.createdDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, surname, createdDate);
    }


    //Getter and setter


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws IllegalAccessException {
        //İsimde noktalama işareti vs varsa bunu kontrol etsin var ise eğer noktalamadan sonrasını silsin.
        if (name != null && !name.isEmpty()) {
            // İlk noktalama işaretinden sonrasını sil
            name = name.replaceAll("[.!;+:%&/(},'].*", "");
            // throw new IllegalAccessException("İsimde geçersiz karakter var.");
        }
        // İsmin ilk harfini büyük yapsın diğer harfleri kücültsün.
        if (name != null && !name.isEmpty()) {
            this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
        } else {
            this.name = "";
        }
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        //Soyismin ilk 3 harfini büyük yapsın daha sonra kalanı maskelesin (*****).
        if (surname != null && surname.length() >= 3) {
            this.surname = surname.substring(0, 3).toUpperCase() + "*".repeat(surname.length() - 3);
        } else if (surname != null) {
            this.surname = surname.toUpperCase();
        } else {
            this.surname = "";
        }
    }

    public Date getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(Date createdDate) {
        this.createdDate = createdDate;
    }

    //PSVM
    public static void main(String[] args) throws IllegalAccessException {
        _4_Class_BEAN bean1 = new _4_Class_BEAN();
        bean1.setId(1L);
        bean1.setName("gurkan,demir");
        bean1.setSurname("Ozdemirrr");
        System.out.println(_15_4_SpecialColor.CYAN + bean1.getId() + " " + bean1.getName() + " " + bean1.getSurname() + " " + bean1.createdDate + _15_4_SpecialColor.RESET);
        // System.out.println(_15_4_SpecialColor.GREEN + bean1 + _15_4_SpecialColor.RESET);

        //  _4_Class_BEAN bean2 = new _4_Class_BEAN(2L, "Gurkan", "Ozdemir");
        //  System.out.println(_15_4_SpecialColor.RED + bean2 + _15_4_SpecialColor.RESET);

    }
}
