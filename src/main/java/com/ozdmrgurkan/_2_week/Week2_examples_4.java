package com.ozdmrgurkan._2_week;

import java.util.Scanner;

public class Week2_examples_4 {
    public static void main(String[] args) {
        // Iterative
        // Veriables

        int sayi, fakt = 1;

        //Scanner
        Scanner veriGirisi = new Scanner(System.in);

        System.out.println(_15_4_SpecialColor.BLUE + " Faktöriyelini bulmak istediginiz sayıyı giriniz:");
        sayi = veriGirisi.nextInt();

        if (sayi < 0) {
            System.out.println(_15_4_SpecialColor.BLUE + " Negatif değer girdiniz!" + _15_4_SpecialColor.RESET);
            sayi = Math.abs(sayi);
        } else if (sayi == 0) {
            System.out.println(_15_4_SpecialColor.BLUE + sayi + _15_4_SpecialColor.BLUE + " sayısının faktöriyeli = 1 ' dir.");
        } else {
            for (int i = 1; i <= sayi; i++) {
                fakt *= i;
            }
            System.out.println(_15_4_SpecialColor.BLUE + sayi + _15_4_SpecialColor.RED + " sayısının faktöriyeli = " + fakt);
        }
    }
}
