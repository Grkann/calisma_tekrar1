package com.ozdmrgurkan.project_step1_file;
import com.ozdmrgurkan._2_week._15_4_SpecialColor;
import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;

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

        } catch (FileNotFoundException fileNotFoundException) {
            System.out.println(_15_4_SpecialColor.RED + "Öğrenci kaydı bulunamadı. " + _15_4_SpecialColor.RESET);
            fileNotFoundException.printStackTrace();
        } catch (IOException io) {
            System.out.println(_15_4_SpecialColor.RED + "Dosya okuma hatası. " + _15_4_SpecialColor.RESET);
            io.printStackTrace();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //  Console Seçim (Öğrenci ekle)

    /// ///////////////////////////////////////////////////////////


    // Öğrenci ekle
    public void add(StudentDto dto) {
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getBirthDay(), dto.getGrade()));
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
            studentDtoList.forEach(System.out::println);
        }
    }


    // Öğrenci ara
    public void search(String name) {
        studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);
    }
        // Öğrenci güncelle

        public void update (int id, StudentDto dto){
            for (StudentDto temp : studentDtoList) {
                if (temp.getId() == id) {
                    temp.setName(dto.getName());
                    temp.setSurname(dto.getSurname());
                    temp.setBirthDay(dto.getBirthDay());
                    temp.setGrade(dto.getGrade());
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
}
