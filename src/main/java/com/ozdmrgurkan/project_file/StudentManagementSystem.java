package com.ozdmrgurkan.project_file;

import com.ozdmrgurkan._2_week._15_4_SpecialColor;

import java.io.*;
import java.time.LocalDate;
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
        studentDtoList.add(new StudentDto(++studentCounter, dto.getName(), dto.getSurname(), dto.getMidTerm(), dto.getFinalTerm(), dto.getBirthDay(),dto.geteStudentType()));
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
        if (!found) {
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
                temp.setMidTerm(dto.getMidTerm());
                temp.setFinalTerm(dto.getFinalTerm());
                temp.setStudentType(dto.geteStudentType());
                //Güncellenmiş öğrenci bilgileri.
                System.out.println(_15_4_SpecialColor.BLUE + temp + " Öğrenci bilgileri güncellendi." + _15_4_SpecialColor.RESET);
                //Dosyaya kaydet.
                saveToFile();
                return;

            }
        }
        System.out.println(_15_4_SpecialColor.RED + "Öğrenci bulunamadı." + _15_4_SpecialColor.RESET);
    }


    // Öğrenci sil
    public void delete(int id) {
        // studentDtoList.removeIf(temp -> temp.getId() == id);
        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println(_15_4_SpecialColor.BLUE + "Öğrenci silindi." + _15_4_SpecialColor.RESET);
            //Silinen öğrenciyi dosyaya kaydet.
            saveToFile();
        } else {
            System.out.println(_15_4_SpecialColor.RED + "Öğrenci silinmedi." + _15_4_SpecialColor.RESET);
        }

    }


    /// ///////////////////////////////////////////////////////////
    // Toplam öğrenci sayısı
    // Öğrenci not ortalaması hesapla
    // En yüksek veya en düşük not alan öğrenci
    // Öğrenci sıralaması (Doğum günü)



//Enum Öğrenci Türü Method
    private EStudentType studentTypeMethod(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci Seviyesini Seçiniz: \n 1-Lisans \n 2- Yüksek Lisans \n 3-Doktora");
        int typeChoice = scanner.nextInt();
        EStudentType switchCaseStudent = switch (typeChoice){
            case 1 -> EStudentType.UNDERGRADUATE;
            case 2 -> EStudentType.GRADUATE;
            case 3 -> EStudentType.PHD;
            default -> EStudentType.OTHER;
        };

        return switchCaseStudent;
    }






    /// ///////////////////////////////////////////////////////////
    //  Console Seçim (Öğrenci ekle)
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem studentManagementSystem = new StudentManagementSystem();

//Sonsuz while

        while (true) {
            System.out.println(_15_4_SpecialColor.YELLOW + " 1.Öğrenci Ekle" );
            System.out.println(" 2.Öğrenci Listele");
            System.out.println(" 3.Öğrenci Ara");
            System.out.println(" 4.Öğrenci Güncelle");
            System.out.println(" 5.Öğrenci Sil");
            System.out.println(" 6.Öğrenci Toplam Sayısı");
            System.out.println(" 7.Öğrenci Rastgele");
            System.out.println(" 8.Öğrenci Not Hesapla");
            System.out.println(" 9.Öğrenci En Yüksek ,En Düsük Notları Göster");
            System.out.println(" 10.Öğrenci Sıralaması Dogum Gününe Göre Göster");
            System.out.println(" 11.Çıkış " +_15_4_SpecialColor.RESET);
            System.out.println(_15_4_SpecialColor.CYAN + " Lütfen seçiminizi yapınız." + _15_4_SpecialColor.RESET);

            // Seçim yap.
            int chooise = scanner.nextInt();
            scanner.nextLine(); //Durma yerimiz

            //Karar bölümü
            switch (chooise) {
                case 1: // Öğrenci ekle
                    System.out.println("Öğrenci Adı: ");
                    String name = scanner.nextLine();

                    System.out.println("Öğrenci Soyadı:");
                    String surname = scanner.nextLine();

                    System.out.println("Doğum Tarihi: YYYY-MM-DD");
                    LocalDate birthDay = LocalDate.parse(scanner.nextLine());

                    System.out.println("Öğrenci Vize Puanı");
                    double midTerm = scanner.nextDouble();

                    System.out.println("Öğrenci Final Puanı");
                    double finalTerm = scanner.nextDouble();

                    studentManagementSystem.add(new StudentDto(++studentCounter, name, surname, midTerm, finalTerm, birthDay,studentTypeMethod()));
                    break;

                case 2: // Listelemek
                    studentManagementSystem.list();
                    break;

                case 3: // Öğrenci ara
                    studentManagementSystem.list();
                    System.out.println(_15_4_SpecialColor.BLUE + "Aranacak öğrenci adını yazınız: " + _15_4_SpecialColor.RESET);
                    String searchName = scanner.nextLine();
                    studentManagementSystem.search(searchName);
                    break;

                case 4: // Öğrenci güncelle

                    System.out.println("Güncelleme Yapılacak Öğrenci ID'si giriniz : ");
                    int id = scanner.nextInt();
                    scanner.nextLine();  // Eğer int sonrası String gelecekse yazmalıyız.

                    System.out.println("Yeni Öğrenci Adı:");
                    String nameUpdate = scanner.nextLine();

                    System.out.println("Yeni Öğrenci Soyadı:");
                    String surnameUpdate = scanner.nextLine();

                    System.out.println("Doğum Tarihi: YYYY-MM-DD");
                    LocalDate birthDayUpdate = LocalDate.parse(scanner.nextLine());

                    System.out.println("Öğrenci Vize Puanı");
                    double midTermUpdate = scanner.nextDouble();

                    System.out.println("Öğrenci Final Puanı");
                    double finalTermUpdate = scanner.nextDouble();

                    StudentDto studentDtoUpdate = StudentDto.builder()
                            .name(nameUpdate)
                            .surname(surnameUpdate)
                            .midTerm(midTermUpdate)
                            .finalTerm(finalTermUpdate)
                            .birthDay(birthDayUpdate)
                            .eStudentType(studentTypeMethod())
                            .build();

                    try {
                        studentManagementSystem.update(id, studentDtoUpdate);
                    } catch (StudentNotFoundException e) {
                        System.out.println(_15_4_SpecialColor.RED + e.getMessage());
                        e.printStackTrace();
                    }
                    break;

                case 5: // Öğrenci Sil.
                    studentManagementSystem.list();
                    System.out.println("Silinecek öğrenci ID'si giriniz : ");
                    int deleteId = scanner.nextInt();
                    scanner.nextLine();
                    studentManagementSystem.delete(deleteId);
                    break;

                 //
            }


        }


    }
}
