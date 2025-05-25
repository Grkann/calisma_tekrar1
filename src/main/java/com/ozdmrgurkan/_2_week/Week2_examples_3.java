package com.ozdmrgurkan._2_week;

import java.util.Scanner;

// Kullanıcının verdiği bir sayının o sayıya kadar olan toplamını hesaplayan algoritma?
// Şart-1 100 değerinden fazla bir değer girerse 100 den sonra toplama yapmayı bıraksın
// Şart-2 Kullanıcının verdiği sayılar içinde 47 varsa bunu toplamaya dahil etmesin.
public class Week2_examples_3 {
    public static void main(String[] args) {
        //  Kullanıcının verdiği pozitif bir tam sayıya kadar toplamı hesaplayan algoritma.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayi giriniz:");
        int sayi = scanner.nextInt();
        int toplam = 0;

        if (sayi <= 100) {
            for (int i = 1; i <= sayi; i++) {
                if (i == 47) {
                    System.out.println("47 sayısı toplama dahil edilmedi.");
                    continue; // 47'yi atla.
                }
                toplam += i;
            }
        } else {
            System.out.println("Girilen sayı 100'den büyük, sadece 1'den 100'e kadar olan sayılar toplanacak.");
            for (int i = 1; i <= 100; i++) {
                if (i == 47) {
                    System.out.println("47 sayısı toplama dahil edilmedi.");
                    continue; // 47'yi atla.
                }
                toplam += i;
            }
        }

        System.out.println("Toplam: " + toplam);
    }
}
