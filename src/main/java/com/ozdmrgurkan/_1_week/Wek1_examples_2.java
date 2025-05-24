package com.ozdmrgurkan._1_week;

import java.util.Scanner;

public class Wek1_examples_2 {
    public static void main(String[] args) {
       /* 2. Santigrat(Celcius) - Fahreneit Dönüştürücü
        Soru:
        Kullanıcıdan Celcius cinsinden sıcaklık alıp Fahrenheit'e çeviren programı yazınız.
        Formül: F=(C * 9/5)+32
       */
Scanner scanner = new Scanner(System.in);
double dereceValue,fahrenheitValue;

        System.out.println("Lütfen sıcaklık değerini giriniz:");
        dereceValue = scanner.nextDouble();
        //F=(C * 9/5)+32
        fahrenheitValue = (dereceValue * 9/5) + 32;
        System.out.println("Derece: " + dereceValue);
        System.out.println("Fahrenheit: " + fahrenheitValue);

        scanner.close();
    }
}
