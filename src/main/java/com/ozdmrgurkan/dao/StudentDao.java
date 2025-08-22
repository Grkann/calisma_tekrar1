package com.ozdmrgurkan.dao;


import com.ozdmrgurkan.dto.EStudentType;
import com.ozdmrgurkan.dto.StudentDto;
import com.ozdmrgurkan.exceptions.StudentNotFoundException;
import com.ozdmrgurkan.tutorials._2_week._15_4_SpecialColor;

import java.io.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Optional;
import java.util.Scanner;

// Öğrenci Yönetim Sistemi
public class StudentDao implements IDaoGenerics<StudentDto> {

    //Field
    private ArrayList<StudentDto> studentDtoList = new ArrayList<>();
    private int studentCounter = 0;
    private static final String FILE_NAME = "students.txt";

    //static
    static {

    }

    //Parametresiz Constructor
    public StudentDao() {
        // Eğer students.txt yoksa otomatik oluştur.
        createFileIfNotExists();
        //Program başlarken Öğrenci listesini hemen yüklesin.
        loadStudentsListFromFile();
    }

    //////////////////////////////////////////////////////////////

    //  FileIO create

    // File If Not Exists (Eğer students.txt yoksa oluştur.)
    private void createFileIfNotExists() {
        //students.txt
        File file = new File(FILE_NAME);
        if (!file.exists()) {
            try {
                if (file.createNewFile()) {
                    System.out.println(_15_4_SpecialColor.YELLOW + FILE_NAME + " doysası olusturuldu." + _15_4_SpecialColor.RESET);
                }
            } catch (IOException e) {
                System.out.println(_15_4_SpecialColor.RED + "Dosya olusturulurken hata olustu!" + _15_4_SpecialColor.RESET);
                e.printStackTrace();
            }

        }
    }


    //  File Create (Öğrencileri kaydet.)
    private void saveToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_NAME))) {
            for (StudentDto student : studentDtoList) {
                writer.write(studentToCsv(student) + "\n");
            }
            System.out.println(_15_4_SpecialColor.GREEN + "Öğrenciler dosyaya kaydedildi." + _15_4_SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(_15_4_SpecialColor.RED + "Dosya kaydetme hatası ! " + _15_4_SpecialColor.RESET);
            e.printStackTrace();
        }

    }

    //  File Read
    private void loadStudentsListFromFile() {
        // Listedeki verileri temizle.
        studentDtoList.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(FILE_NAME))) {
            String line;
            while ((line = reader.readLine()) != null) {
                StudentDto student = csvToStudent(line);
                if (student != null) {
                    studentDtoList.add(student);
                }
            }
            studentCounter = studentDtoList.size();
            System.out.println(_15_4_SpecialColor.BLUE + "Dosyadan yüklenen öğrenci sayısı : " + studentCounter + _15_4_SpecialColor.RESET);
        } catch (IOException e) {
            System.out.println(_15_4_SpecialColor.RED + "Dosya okuma hatası ! " + _15_4_SpecialColor.RESET);
            e.printStackTrace();
        }
    }

    //////////////////////////////////////////////////////////////

    // Öğrenci nesnesini CSV formatına çevirme.
    // Bu metod, bir StudentDto nesnesini virgülle ayrılmıs bir metin (CSV) formatına çevirir.
    // Böylece öğrenci verileri bir dosyada satır bazlı olarak saklayabilir.
    private String studentToCsv(StudentDto student) {
        return student.getId() + "," +             // Öğrenci ID 'sini ekler.
                student.getName() + "," +          // Öğrenci adını ekler.
                student.getSurname() + "," +       // Öğrenci soyadını ekler.
                student.getMidTerm() + "," +       // Öğrenci vize notunu ekler.
                student.getFinalTerm() + "," +     // Öğrenci final notunu ekler.
                student.getResultTerm() + "," +    // Öğrenci sonuç notunu ekler.
                student.getBirthDay() + "," +      // Öğrenci doğum tarihini ekler.
                student.geteStudentType();         // Öğrenci eğitim türünü ekler. (Lisans , Yüksek Lisans vb.)
    }

    //CSV formatındaki satırı StudentDto nesnesine çevirme
    // Bu metod,CSV formatındaki bir satırı parçalayarak bir StudentDto nesnesine dönüştürür.
    // Dosyadan okunan her satır için çağrılır ve veriyi uygun şekilde nesneye aktarır.
    private StudentDto csvToStudent(String csvLine) {
        try {
            String[] parts = csvLine.split(",");   //Satırı virgülle bölerek bir dizi oluşturur.
            if (parts.length < 8) return null;      // Eksik veri varsa işlemi durdurur ve null döndürür.

            return new StudentDto(
                    Integer.parseInt(parts[0]), // Id değerini integer olarak döndürür
                    parts[1],                   // Adı alır.
                    parts[2],                   // Soyadı alır.
                    Double.parseDouble(parts[3]), // Vize notunu double olarak dönüştürür.
                    Double.parseDouble(parts[4]),  // Final notunu double olarak dönüştürür.
                    LocalDate.parse(parts[6]),   // Doğum tarihini LocalDate formatına çevirir.
                    EStudentType.valueOf(parts[7]) // Öğrencinin eğitim türünü (Enum) çevirir.
            );

        } catch (Exception e) {
            //Eğer CSV 'dan okuma sırasında hata olursa hata mesajını gösterir.
            System.out.println(_15_4_SpecialColor.RED + "CSV'dan öğrenci yükleme hatası!" + _15_4_SpecialColor.RESET);
            return null; // Hata durumunda null döndürerek programın çökmesini engeller.
        }
    }

    /// ///////////////////////////////////////////////
    // C-R-U-D
    // Öğrenci ekle
    @Override
    public StudentDto create(StudentDto studentDto) {
        studentDtoList.add(
                new StudentDto(++studentCounter, studentDto.getName(), studentDto.getSurname(), studentDto.getMidTerm(), studentDto.getFinalTerm(),
                        studentDto.getBirthDay(), studentDto.geteStudentType()));
        System.out.println(_15_4_SpecialColor.GREEN + " Öğrenci eklendi." + _15_4_SpecialColor.RESET);
        // File ekle
        saveToFile();
        return studentDto;
    }

    /// ///////////////////////////////////////////////////////////
    // Öğrenci listesi
    @Override
    public ArrayList<StudentDto> list() {
        //Öğrenci Yoksa
        if (studentDtoList.isEmpty()) {
            System.out.println(_15_4_SpecialColor.RED + "Öğrenci yoktur." + _15_4_SpecialColor.RESET);
            throw new StudentNotFoundException("Öğrenci yoktur.");
        } else {
            System.out.println(_15_4_SpecialColor.BLUE + "Öğrenci Listesi" + _15_4_SpecialColor.RESET);
            studentDtoList.forEach(System.out::println);
        }
        return studentDtoList;
    }

    // Öğrenci ara
    @Override
    public StudentDto findByName(String name) {
        // Eğer öğrenci varsa true döndür
        // 1.YOL
        /*studentDtoList.stream()
                .filter(temp -> temp.getName().equalsIgnoreCase(name))
                .forEach(System.out::println);*/
        // 2.YOL
      /*  boolean found =
                studentDtoList
                        .stream()
                        .filter(temp -> temp.getName().equalsIgnoreCase(name))
                        .peek(System.out::println)  //Eğer ilgili data varsa yazdır.
                        .findAny() //Herhangi bir eşleşen öğrenci var mı yok mu ? kontrol et.
                        .isPresent();

        // Öğrenci yoksa
        if (!found) {
            throw new StudentNotFoundException(name + "isimli öğrenci bulunamadı.");
        }
        */

        // 3.YOL
        Optional<StudentDto> student = studentDtoList.stream()
                .filter(s -> s.getName().equalsIgnoreCase(name))
                .findFirst();
        return student.orElseThrow(() -> new StudentNotFoundException(name + "isimli öğrenci bulunamadı"));
    }

    // Fınd By ID
    @Override
    public StudentDto findById(int id) {
        return null;
    }


    // Öğrenci güncelle
    @Override
    public StudentDto update(int id, StudentDto studentDto) {
        for (StudentDto temp : studentDtoList) {
            if (temp.getId() == id) {
                temp.setName(studentDto.getName());
                temp.setSurname(studentDto.getSurname());
                temp.setBirthDay(studentDto.getBirthDay());
                temp.setMidTerm(studentDto.getMidTerm());
                temp.setFinalTerm(studentDto.getFinalTerm());
                temp.setStudentType(studentDto.geteStudentType());
                //Güncellenmiş öğrenci bilgileri.
                System.out.println(_15_4_SpecialColor.BLUE + temp + " Öğrenci bilgileri güncellendi." + _15_4_SpecialColor.RESET);
                //Dosyaya kaydet.
                saveToFile();
                return temp;

            }
        }
        throw new StudentNotFoundException("Öğrenci bulunamadı.");
    }


    // Öğrenci sil
    @Override
    public StudentDto delete(int id) {
        // studentDtoList.removeIf(temp -> temp.getId() == id);
        boolean removed = studentDtoList.removeIf(temp -> temp.getId() == id);
        if (removed) {
            System.out.println(_15_4_SpecialColor.BLUE + "Öğrenci silindi." + _15_4_SpecialColor.RESET);
            //Silinen öğrenciyi dosyaya kaydet.
            saveToFile();
            return null;
        } else {
            System.out.println(_15_4_SpecialColor.RED + "Öğrenci silinmedi." + _15_4_SpecialColor.RESET);
            throw new StudentNotFoundException("Öğrenci silinmedi. ID bulunamadı!");
        }
    }

    /// ///////////////////////////////////////////////////////////
    // Toplam öğrenci sayısı
    // Rastgele öğrenci
    // Tüm Öğrenci not ortalaması hesapla
    // En yüksek veya en düşük not alan öğrenci
    // Öğrenci sıralaması (Doğum günü)


//Enum Öğrenci Türü Method
    private EStudentType studentTypeMethod() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Öğrenci Seviyesini Seçiniz: \n 1-Lisans \n 2- Yüksek Lisans \n 3-Doktora");
        int typeChoice = scanner.nextInt();
        EStudentType switchCaseStudent = switch (typeChoice) {
            case 1 -> EStudentType.UNDERGRADUATE;
            case 2 -> EStudentType.GRADUATE;
            case 3 -> EStudentType.PHD;
            default -> EStudentType.OTHER;
        };

        return switchCaseStudent;
    }
    /// ////////////////////////////// ///////////////////////////

    /// ///////////////////////////////////////////////////////////
    /// (Öğrenci Ekle)
    public void chooiseStudentAdd() {
        Scanner scanner = new Scanner(System.in);
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

        EStudentType studentType = studentTypeMethod();
        StudentDto newStudent = new StudentDto(++studentCounter, name, surname, midTerm, finalTerm, birthDay, studentTypeMethod());
        create(newStudent);
        System.out.println("Öğrenci başarıyla eklendi.");

    }

    /// (Öğrenci Listele)
    public void chooiseStudentList() {
        try {
            list();
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// (Öğrenci Araması)
    public void chooiseStudentSearch() {
        Scanner scanner = new Scanner(System.in);
        list();
        System.out.println(_15_4_SpecialColor.BLUE + "Aranacak öğrenci adını yazınız: " + _15_4_SpecialColor.RESET);
        String searchName = scanner.nextLine();
        try {
            System.out.println(findByName(searchName));
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// (Öğrenci Güncellemesi)
    public void chooiseStudentUpdate() {
        Scanner scanner = new Scanner(System.in);
        list();
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

        StudentDto studentUpdate = new StudentDto(id, nameUpdate, surnameUpdate, midTermUpdate, finalTermUpdate, birthDayUpdate, studentTypeMethod());


        try {
            update(id, studentUpdate);
            System.out.println("Öğrenci başarıyla güncellendi.");
        } catch (StudentNotFoundException e) {
            System.out.println(_15_4_SpecialColor.RED + e.getMessage());
        }
    }

    /// (Öğrenci Silme)
    public void chooiseStudentDelete() {
        Scanner scanner = new Scanner(System.in);
        list();
        System.out.println("Silinecek öğrenci ID'si giriniz : ");
        int deleteId = scanner.nextInt();
        scanner.nextLine();
        try {
            delete(deleteId);
            System.out.println("Öğrenci başarıyla silindi.");
        } catch (StudentNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }

    /// (Toplam Öğrenci Sayısı)
    public void chooiseStudentSize() {

        System.out.println("Toplam Öğrenci Sayısı:" + studentDtoList.size());
    }

    /// (Rastgele Öğrenci Seçme)
    public void chooiseRandomStudent() {
        if (!studentDtoList.isEmpty()) {
            StudentDto randomStudent = studentDtoList.get((int) (Math.random() * studentDtoList.size()));
            System.out.println("Rastgele seçilen öğrenci: " + randomStudent);
        } else {
            System.out.println("Sistemde öğrenci yok!");
        }
    }

    /// (Öğrencilerin Not Ortalaması Hesabı)
    public void chooiseStudentNoteAvarage() {
        if (!studentDtoList.isEmpty()) {
            double avg = studentDtoList.stream().mapToDouble(StudentDto::getResultTerm).average().orElse(0.0);
            System.out.println("Öğrencilerin Not Ortalaması : " + avg);
        } else {
            System.out.println("Öğrenci Listesi Boş!");
        }
    }

    /// (En Yüksek Ve En Düşük Not Alan Öğrenci)
    public void chooiseStundetNoteMinAndMax() {
        if (!studentDtoList.isEmpty()) {
            StudentDto maxStudent = studentDtoList.stream().max((s1, s2) -> Double.compare(s1.getResultTerm(), s2.getResultTerm
                            ()))
                    .orElse(null);

            StudentDto minStudent = studentDtoList.stream().min((s1, s2) -> Double.compare(s1.getResultTerm(), s2.getResultTerm()))
                    .orElse(null);


            System.out.println("En Yüksek Not Alan Öğrenci: " + maxStudent);
            System.out.println("En Düşük Not Alan Öğrenci: " + minStudent);
        } else {
            System.out.println("Öğrenci Listesi Boş.");
        }
    }

    /// (Öğrencileri Doğum Tarihine Göre Sırala)
    public void chooiseStudentBirthdaySortedDate() {
        studentDtoList.stream()
                .sorted((s1, s2) -> s1.getBirthDay().compareTo(s2.getBirthDay()))
                .forEach(System.out::println);

    }

    //  Console Seçim
    public void chooiseExit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Sistemden çıkılıyor.");
        scanner.close();
        return;

    }

    @Override
    public void chooise() {
        Scanner scanner = new Scanner(System.in);
        StudentDao studentManagementSystem = new StudentDao();

//Sonsuz while

        while (true) {
            System.out.println(_15_4_SpecialColor.YELLOW + "**********ÖĞRENCİ YÖNETİM SİSTEMİ***********");
            System.out.println(" 1.Öğrenci Ekle");
            System.out.println(" 2.Öğrenci Listele");
            System.out.println(" 3.Öğrenci Ara");
            System.out.println(" 4.Öğrenci Güncelle");
            System.out.println(" 5.Öğrenci Sil");
            System.out.println(" 6.Toplam Öğrenci Sayısı");
            System.out.println(" 7.Rastgele Öğrenci Seçimi");
            System.out.println(" 8.Tüm Öğrencilerin Not Ortalamasını Göster");
            System.out.println(" 9.Öğrenci En Yüksek,En Düsük Notları Göster");
            System.out.println(" 10.Öğrenci Sıralaması Dogum Gününe Göre Göster");
            System.out.println(" 11.Çıkış " + _15_4_SpecialColor.RESET);
            System.out.println(_15_4_SpecialColor.CYAN + " Lütfen seçiminizi yapınız." + _15_4_SpecialColor.RESET);

            // Seçim yap.
            int chooise = scanner.nextInt();
            scanner.nextLine(); //Durma yerimiz

            //Karar bölümü
            switch (chooise) {
                case 1: // Öğrenci Ekleme
                    chooiseStudentAdd();

                case 2: // Öğrenci Listeleme.
                    chooiseStudentList();

                case 3: // Öğrenci Ara.
                    chooiseStudentSearch();

                case 4: // Öğrenci Güncelle.
                    chooiseStudentUpdate();

                case 5: // Öğrenci Sil.
                    chooiseStudentDelete();

                case 6: // Toplam Öğrenci Sayısı.
                    chooiseStudentSize();

                case 7: // Rastgele Öğrenci Seçme
                    chooiseRandomStudent();

                case 8: // Öğrencilerin Not Ortalaması Hesapla.
                    chooiseStudentNoteAvarage();

                case 9:
                    chooiseStundetNoteMinAndMax();

                case 10:
                    chooiseStudentBirthdaySortedDate();

                case 11:
                    chooiseExit();

                default : {
                    System.out.println("Geçersiz seçim yaptınız Lütfen tekrar deneyiniz.");
                }
                //
            }

        }

    } // end chooise
} // end class
