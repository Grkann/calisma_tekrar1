package com.ozdmrgurkan.tutorials._2_week;

import java.util.Scanner;

public class _09_5_Conditional_SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int number = scanner.nextInt();

        //Switch-Case
        switch (number){
            case 1:
                System.out.println("Sayı 1");
                break;
            case 2:
                System.out.println("Sayı 2");
                break;
            case 3:
                System.out.println("Sayı 3");
                break;
            case 4:
                System.out.println("Sayı 4");
                break;
            case 5:
                System.out.println("Sayı 5");
                break;
            default:
                System.out.println(number + " , 1<= number <=5 dışındadır.");
                break;
        }
    }
}
