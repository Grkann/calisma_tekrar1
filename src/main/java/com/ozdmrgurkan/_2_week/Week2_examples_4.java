package com.ozdmrgurkan._2_week;

import java.util.Scanner;

public class Week2_examples_4 {

    //Kullanıcıdan sayısal değerler al.
   public static int isNumber (){

       // Iterative
       // Veriables

       int sayi= 1;
       byte doubleRemainingRight = 3;  // Ondalıklı sayı giris hakkı
       boolean isActive = true;

       //Scanner
       Scanner veriGirisi = new Scanner(System.in);

       while (true) {
           if (doubleRemainingRight > 0) {
               System.out.println(_15_4_SpecialColor.BLUE + " Faktöriyelini bulmak istediginiz sayıyı giriniz:");

               //Kullanıcıdan ondalıklı sayı girip girmedigini kontrol edelim.

               if (veriGirisi.hasNextInt()) {

                   sayi = veriGirisi.nextInt();
                   if (sayi < 0) {
                       System.out.println(_15_4_SpecialColor.RED + " Negatif değer girdiniz! Sistem kapatılıyor." + _15_4_SpecialColor.RESET);
                       // sayi = Math.abs(sayi);
                       break; // 1.YOL (Yalnızca bulundugu döngü veya switch blogunu etkiliyor.)
                       // System.exit();  2.YOL ( JVM yi kapatarak programı tamamen sonlandırıyor.

                   } else if (sayi == 0) {
                       System.out.println(_15_4_SpecialColor.BLUE + sayi + _15_4_SpecialColor.BLUE + " sayısının faktöriyeli = 1 ' dir.");
                       return 1;

                   } else {
                      iteretiveFactoriyel(sayi);
                   }
               } else if (veriGirisi.hasNextDouble()) {
                   doubleRemainingRight--;
                   System.out.println(_15_4_SpecialColor.RED + " Ondalıklı bir sayı girdiniz. Kalan hakkınız :" + doubleRemainingRight + _15_4_SpecialColor.RESET);

                   if (doubleRemainingRight == 0) {
                       System.out.println(_15_4_SpecialColor.RED + " Üç defa ondalıklı değer girdiğiniz için program sonlandı." + _15_4_SpecialColor.RESET);
                       isActive = false;
                       System.exit(0);
                   }
                   veriGirisi.next();
               } else {
                   System.out.println(_15_4_SpecialColor.RED + " Harf veya geçersiz bir karakter girdiniz." + _15_4_SpecialColor.RESET);
                   // break;
                   veriGirisi.next(); // Döngünün sonsuza kadar gitmesini engelliyor tekrar veri istiyor.
               }
           } else {
               System.out.println("Ondalıklı sayı giriş hakkınız kalmadı. Program sonlandırılıyor. (JVM tarafından.)");
               System.exit(0);
           }


       }
       veriGirisi.close();

       return 0;
   }

    //Iterative method
    public static void iteretiveFactoriyel(int userData) {
      int fakt = 1;
        for (int i = 1; i <= userData; i++) {
            fakt *= i;

        }
        System.out.println(_15_4_SpecialColor.BLUE + userData + _15_4_SpecialColor.BLUE + " sayısının faktöriyeli = " + fakt);
    }

    public static int recursiveFactoriyel(int userData) {
// Sıfır veya bir faktöriyel 1dir.
     if (userData==0 || userData==1)
    return 1;
return userData*recursiveFactoriyel(userData-1);


    }

    public static void isResult(){
        System.out.println("Lütfen seçim yapınız \n 1-Iterative Factoriyel \n 2-Recursive Factoriyel \n 3-Çıkış");

        Scanner veriGirisi = new Scanner(System.in);

        int chooise = veriGirisi.nextInt();

        switch (chooise) {
            case 1:
                iteretiveFactoriyel(isNumber());
                break;
            case 2:
                recursiveFactoriyel(isNumber());
                break;
            default:
                System.out.println("Doğru seçin yapınız!");
                break;
        }
    }

    //PSVM
    public static void main(String[] args) {
isResult();


    }

}
