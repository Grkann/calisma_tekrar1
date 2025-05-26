package com.ozdmrgurkan._2_week;

public class _12_1_String1 {
    public static void main(String[] args) {
        //1.YOL
        // String vocabulary = new String();
        // vocabulary = " Java ÖğreniYORum ";

        //2.YOL
        // String vocabulary = new String(" Java ÖğreniYORum ")


        String vocabulary = " Java ÖğreniYORum ";
        String vocabulary2 = " Java ÖğreniYORum ";


        //length()
        System.out.println("Harf sayısı: " + vocabulary.length());

        //equals()
        System.out.println(vocabulary==vocabulary2);
        System.out.println(vocabulary.equals(vocabulary2));

        //charAt : Sıfırdan saymaya başlar ve verdiğimiz sayı ilgili
        System.out.println(vocabulary.charAt((4)));
        System.out.println(vocabulary.charAt((0)));

        // trim: baştaki veya sondaki boşlukları alır.
        System.out.println("Trim:" + vocabulary.trim());
        System.out.println("Trim:" + vocabulary.trim().length());

        //toUpperCase() --> hepsini BÜYÜK yap.    toLowerCase --> hepsini kücük harf yap.
        System.out.println("BÜYÜK HARF: " + vocabulary.toUpperCase());
        System.out.println("küçük harf: " + vocabulary.toLowerCase());

        //startsWith()
        System.out.println(vocabulary.startsWith("") + " :  ile mi başlıyor?");
        System.out.println(vocabulary.endsWith("m") + " : m ile mi bitiyor?");








    }
}
