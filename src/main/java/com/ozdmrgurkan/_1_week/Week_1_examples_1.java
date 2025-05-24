package com.ozdmrgurkan._1_week;

import java.util.Scanner;

public class Week_1_examples_1 {
    public static void main(String[] args) {
    /*    1. 1.Dereceden 1 Bilinmeyenli Denklemi Çözme
        Soru:
        Kullanıcıdan ax + b = 0 denklemindeki a ve b değerlerini alıp x'i hesaplayan programı yazınız.
    */

        Scanner scanner = new Scanner(System.in);

        double aValue, bValue, xValue;

        System.out.println("Lütfen a değerinizi giriniz: ");
        aValue = scanner.nextDouble();
        System.out.println("Lütfen b değerini giriniz:");
        bValue = scanner.nextDouble();

        //ax+b=0   x=-b/a
        xValue = (-bValue / aValue);
        System.out.println("A değeri: " + aValue + " B değeri:" + bValue);
        System.out.println("x değeri:" + xValue);
        if (aValue == 0) {
            System.out.println("Bu denklem tanımsızdır.");
        }
        scanner.close();


    }
}
