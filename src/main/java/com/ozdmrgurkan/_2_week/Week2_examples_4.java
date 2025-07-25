package com.ozdmrgurkan._2_week;

import java.util.Scanner;

public class Week2_examples_4 {
    public static void main(String[] args) {
        // Iterative
        // Veriables

        int sayi, fakt = 1;
        byte doubleRemainingRight=3;

        //Scanner
        Scanner veriGirisi = new Scanner(System.in);

        while (true) {
            System.out.println(_15_4_SpecialColor.BLUE + " Faktöriyelini bulmak istediginiz sayıyı giriniz:");


            //Kullanıcıdan ondalıklı sayı girip girmedigini kontrol edelim.

            if (veriGirisi.hasNextInt()) {
                sayi = veriGirisi.nextInt();
                if (sayi < 0) {
                    System.out.println(_15_4_SpecialColor.RED + " Negatif değer girdiniz!" + _15_4_SpecialColor.RESET);
                    // sayi = Math.abs(sayi);
                    // break; // 1.YOL (Yalnızca bulundugu döngü veya switch blogunu etkiliyor.)
                    // System.exit();  2.YOL ( JVM yi kapatarak programı tamamen sonlandırıyor.
                    doubleRemainingRight--;
                    System.out.println(_15_4_SpecialColor.RED + " Kalan giriş hakkınız :" + doubleRemainingRight + _15_4_SpecialColor.RESET);
                    if (doubleRemainingRight == 0) {
                        System.out.println(_15_4_SpecialColor.RED + "Giriş hakkınız bitmiştir. Sistemden çıkılıyor..."+ _15_4_SpecialColor.RESET);
                        break;
                    }
                } else if (sayi == 0) {
                    System.out.println(_15_4_SpecialColor.BLUE + sayi + _15_4_SpecialColor.BLUE + " sayısının faktöriyeli = 1 ' dir.");
                    fakt = 1;

                } else {
                    fakt = 1;
                    for (int i = 1; i <= sayi; i++) {
                        fakt *= i;

                    }
                    System.out.println(_15_4_SpecialColor.BLUE + sayi + _15_4_SpecialColor.BLUE + " sayısının faktöriyeli = " + fakt);

                }

            }
            else if (veriGirisi.hasNextDouble()) {
                System.out.println(_15_4_SpecialColor.RED+ " Ondalıklı bir sayı girdiniz. Lütfen pozitif tam sayı giriniz."+ _15_4_SpecialColor.RESET);
                doubleRemainingRight--;
                System.out.println(_15_4_SpecialColor.RED + " Kalan giriş hakkınız :" + doubleRemainingRight + _15_4_SpecialColor.RESET);
            } else {
                System.out.println(_15_4_SpecialColor.RED+ " Harf veya geçersiz bir karakter girdiniz."+ _15_4_SpecialColor.RESET);
                doubleRemainingRight--;
                System.out.println(_15_4_SpecialColor.RED + " Kalan giriş hakkınız :" + doubleRemainingRight + _15_4_SpecialColor.RESET);
            }
        }
    }
}
