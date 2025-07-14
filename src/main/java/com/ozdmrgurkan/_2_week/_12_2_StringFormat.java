package com.ozdmrgurkan._2_week;
import java.util.Formatter;

public class _12_2_StringFormat {

    public static final String RESET = "\u001B[0m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";

    public static void formatter1(){
        // Eğer new Formatter yazarsak close() ile manuel kapatmak zorundayız.
        Formatter formatter= new Formatter();
        formatter.format("Merhabalar,Adınız : %s , Numaranız : %d, Bütçe: %f ","Gürkan",152,44.2);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakma
    }


    // Best Practice
    public static void formatter2(){
        // Eğer String.format() yazarsak kapatmak zorunda değiliz. Garbarage Collector otomatik çalışır.
       String formatterString= String.format("Merhabalar Adınız : %s, T.C : %d, Fiyat: %f", "Gürkan",152, 44.2);
        System.out.println(formatterString);
        System.out.println(CYAN+formatterString+RESET);
    }
    public static void formatter3(){


    }


    public static void formatter4(){
        String name ="Gürkan";
        int tcNo=152;
        double fiyat=44.2;
        System.out.printf("Merhabalar Adınız :%s, T.C : %d, Fiyat: %f",name,tcNo,fiyat);
        System.out.println();
        System.out.printf("Merhabalar Adınız :%10s, T.C : %d, Fiyat: %f",name,tcNo,fiyat); // 10s: Sağdan 10 karakter genişliğinde
        System.out.println();
        System.out.printf("Merhabalar Adınız :%-10s, T.C : %-8d, Fiyat: %.3f",name,tcNo,fiyat); //-10s : Sola dogru
    }

    public static void main(String[] args) {

      //  formatter1();
        formatter2();
      //  formatter4();
    }
}
