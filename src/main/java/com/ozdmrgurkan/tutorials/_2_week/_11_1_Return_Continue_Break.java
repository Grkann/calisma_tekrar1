package com.ozdmrgurkan.tutorials._2_week;

import java.util.Scanner;

public class _11_1_Return_Continue_Break {
    public static void main(String[] args) {

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
