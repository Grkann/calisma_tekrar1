package com.ozdmrgurkan.project_file;

import com.ozdmrgurkan._2_week._15_4_SpecialColor;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

// Öğrenci Yönetim Sistemi
public class StudentManagementSystem {

    //Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
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


    /// ///////////////////////////////////////////////////////////
    // Login
    // Register

    /// ///////////////////////////////////////////////////////////

    //  FileIO create
    //  File Create
    private void saveToFile() {
        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            objectOutputStream.writeObject(studentDtoList);
        } catch (IOException io) {
            System.out.println(_15_4_SpecialColor.RED + "Dosya ekleme hatası. " + _15_4_SpecialColor.RESET);
            io.printStackTrace();
        }


    }


    //  File Read
    private void loadStudentsListFromFile() {
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            studentDtoList = (ArrayList<StudentDto>) objectInputStream.readObject();
            studentCounter = studentDtoList.size();
            System.out.println(_15_4_SpecialColor.BLUE + "Dosyadan yüklenen öğrenci sayısı : " + studentCounter);

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(_15_4_SpecialColor.RED + "Dosyadan yüklenen öğrenci kaydı bulunamadı. " + _15_4_SpecialColor.RESET);
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println(_15_4_SpecialColor.RED + "Dosya okuma hatası. " + _15_4_SpecialColor.RESET);
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    /// ///////////////////////////////////////////////////////////


    // Öğrenci ekle
    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getMidTerm(),dto.getFinalTerm(),dto.getBirthDay()));
        System.out.println(_15_4_SpecialColor.GREEN + " Öğrenci eklendi." + _15_4_SpecialColor.RESET);
        // File ekle
        saveToFile();

    }


    /// ///////////////////////////////////////////////////////////
    // Öğrenci listesi
    public void list() {
        //Öğrenci Yoksa
        if (studentDtoList.isEmpty()) {
            System.out.println(_15_4_SpecialColor.RED + "Öğrenci bulunamadı" + _15_4_SpecialColor.RESET);
            return;
        } else {
            System.out.println(_15_4_SpecialColor.BLUE + "Öğrenci Listesi" + _15_4_SpecialColor.RESET);
            studentDtoList.forEach(System.out::println);
        }
    }


    // Öğrenci ara
    public void search(String name) {
                 // Eğer öğrenci varsa true döndür
        /*studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);*/
        boolean found =
                studentDtoList
                .stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .peek(System.out::println)  //Eğer ilgili data varsa yazdır.
                .findAny() //Herhangi bir eşleşen öğrenci var mı yok mu ? kontrol et.
                .isPresent();

                //Öğrenci yoksa
        if (!found){
            throw new StudentNotFoundException(name + "isimli öğrenci bulunamadı.");
        }

    }
    // Öğrenci güncelle

    public void update(int id, StudentDto dto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(dto.getName());
                temp.setSurname(dto.getSurname());
                temp.setBirthDay(dto.getBirthDay());
                temp.setFinalTerm(dto.getFinalTerm());
                System.out.println("Öğrenci güncellendi.");
                saveToFile();
                return;

            }
        }
        System.out.println(_15_4_SpecialColor.RED + "Öğrenci bulunamadı." + _15_4_SpecialColor.RESET);
    }


    // Öğrenci sil
    public void delete(int id) {
        studentDtoList.removeIf(temp -> temp.getId() == id);
        System.out.println(_15_4_SpecialColor.BLUE + "Öğrenci silindi." + _15_4_SpecialColor.RESET);
        saveToFile();
    }


    /// ///////////////////////////////////////////////////////////
    // Toplam öğrenci sayısı
    // Öğrenci not ortalaması hesapla
    // En yüksek veya en düşük not alan öğrenci
    // Öğrenci sıralaması (Doğum günü)

    /// ///////////////////////////////////////////////////////////
    //  Console Seçim (Öğrenci ekle)
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

//Sonsuz while

        while (true) {
            System.out.println("\n 1.Öğrenci Ekle");
            System.out.println("\n 2.Öğrenci Listele");
            System.out.println("\n 3.Öğrenci Ara");
            System.out.println("\n 4.Öğrenci Güncelle");
            System.out.println("\n 5.Öğrenci Sil");
            System.out.println("\n 6.Öğrenci Toplam Sayısı");
            System.out.println("\n 7.Öğrenci Rastgele");
            System.out.println("\n 8.Öğrenci Not Hesapla");
            System.out.println("\n 9.Öğrenci En Yüksek ,En Düsük Notları Göster");
            System.out.println("\n 10.Öğrenci Sıralaması Dogum Gününe Göre Göster");
            System.out.println("\n 11.Çıkış ");
            System.out.println("\n Lütfen seçiminizi yapınız.");

            int chooise = scanner.nextInt();
            scanner.nextLine(); //Durma yerimiz
            StudentDto studentDto = new StudentDto();
            String name, surname;
            String birthDay;
            Double grade;

            switch (chooise) {
                case 1:
                    System.out.println("Öğrenci Adı: ");
                    name = scanner.nextLine();
                    System.out.println("Öğrenci Soyadı:");
                    surname = scanner.nextLine();
                    System.out.println("Doğum Tarihi:");
                    birthDay = scanner.nextLine().toString();
                    System.out.println("Öğrenci Puanı");
                    grade = scanner.nextDouble();

                    studentDto.setId(studentCounter);
                    studentDto.setName(name);
                    studentDto.setSurname(surname);
                    studentDto.setDateOfBirth(new Date(System.currentTimeMillis()));
                    // studentDto.setBirthDay(birthDay);
                    studentDto.setFinalTerm(grade);
                    studentManagementSystem.add(studentDto);
break;

                case 2:
                    studentManagementSystem.list();
                    break;
            }



        }


    }
}
