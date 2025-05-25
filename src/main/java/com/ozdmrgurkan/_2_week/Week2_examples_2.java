package com.ozdmrgurkan._2_week;

import java.util.Scanner;
// Kullanıcının verdiği bir sayının pozitif mi negatif mi oldugunu hesaplayan algoritma.

public class Week2_examples_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int aValue = scanner.nextInt();

        if (aValue>0){
            System.out.println("Girdiğiniz değer pozitiftir.");
        }
        else if (aValue<0){
            System.out.println("Girdiğiniz değer negatitiftir.");
        }
        else {
            System.out.println("0 değeri ne pozitif ne negatitiftir.");
        }

scanner.close();

    }
}
