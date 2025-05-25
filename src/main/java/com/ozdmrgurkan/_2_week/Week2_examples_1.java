package com.ozdmrgurkan._2_week;

import java.util.Scanner;
// Kullanıcının verdiği pozitif bir tam sayının çift sayı mı tek sayı mı oldugunu hesaplayan algoritma.
public class Week2_examples_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz:");
        int sayi = scanner.nextInt();

        if (sayi>=0 && sayi % 2 == 0){
            System.out.println("Girdiğiniz " + sayi + " değeri çift sayıdır.");
        }
        else if (sayi>=0 && sayi % 2 == 1) {
            System.out.println("Girdiğiniz " + sayi + " değeri tek sayıdır.");
        }
        else {
            System.out.println("Negatif bir değer girdiniz. \n Geçersiz işlem!");
        }

    }
}
