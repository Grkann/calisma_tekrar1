package com.ozdmrgurkan.tutorials._1_week;

import java.util.Scanner;

public class _08_1_Scanner {
    public static void main(String[] args) {

        //Field
        String name,surname;
        int language;

        //Kullanıcıdan veri alınması için kullanılır.
        Scanner klavye = new Scanner(System.in);

        System.out.println("Lütfen adınızı giriniz:");
        name=klavye.next(); // Bu sadece ilk kelimeyi okur ve ENTER'ı bırakır.

        // next()'ten sonra bir nextLine() çağırıyorsan, araya fazladan bir nextLine() ekle ki ENTER karakteri temizlensin.
        klavye.nextLine();

        System.out.println("Lütfen soyadınızı giriniz:");
        surname=klavye.nextLine();// Bu hemen boş bir satır okur!


        System.out.println("Bildiğiniz Diller & Teknolojiler");
        language=klavye.nextInt();

        System.out.println("Adınız: "+name+" Surname: " +surname + " \nDiller: "+language);

        //kullanmadıgım Scanner nesnesini kapatalım.
        klavye.close();

    }
}
