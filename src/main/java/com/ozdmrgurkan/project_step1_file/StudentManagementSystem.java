package com.ozdmrgurkan.project_step1_file;

import java.util.ArrayList;

// Öğrenci Yönetim Sistemi
public class StudentManagementSystem {

    //Field
    private ArrayList<StudentDto> students = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    //static
    static {


    }

    //Parametresiz Constructor
    public StudentManagementSystem() {
        //Program başlarken Öğrenci listesini hemen yüklesin.
        loadStudentsListFromFile();
    }

    //Öğrenci listesini yükle (Dosya)
    private void loadStudentsListFromFile() {


    }

    // Öğrenci ekle
    // Öğrenci listesi
    // Öğrenci güncelle
    // Öğrenci sil
    // Öğrenci ara
    /// ///////////////////////////////////////////////////////////
    // FileIO create
    // Öğrenci dosyalarını kaydeden metot
    // Öğrenci dosyalarını okuyan metot
    // Console Seçim (Öğrenci ekle)



    /// ///////////////////////////////////////////////////////////
    // Toplam öğrenci sayısı
    // Öğrenci not ortalaması hesapla
    // En yüksek veya en düşük not alan öğrenci
    // Öğrenci sıralaması (Doğum günü)
}
