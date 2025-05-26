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
        System.out.println(vocabulary == vocabulary2);
        System.out.println(vocabulary.equals(vocabulary2));
        System.out.println(vocabulary.equalsIgnoreCase(vocabulary2));

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
        //endsWtih()
        System.out.println(vocabulary.startsWith("") + " :  ile mi başlıyor?");
        System.out.println(vocabulary.endsWith("m") + " : m ile mi bitiyor?");


        //substring: parçalama --- Sıfırdan başlıyor.
        // 2 yöntemle parçalanır.
        // 1- süpürme --- 2-aralık alarak
        System.out.println(vocabulary.substring(1));
        System.out.println(vocabulary.trim().substring(1));
        System.out.println(vocabulary.substring(1).toLowerCase());
        System.out.println(vocabulary.substring(1, 10)); // 1 <= vocabulary < 10

        // String vocabulary3 = "Merhaba"; // length = 7/
        // System.out.println(vocabulary3.substring(1, 10)); // Hata verir. (StringIndexOutOfBoundsExeption)


        String vocabulary3 = "Merhaba"; // length = 7
        if (vocabulary3.length() >= 10) {
            System.out.println(vocabulary3.substring(1, 10));
        } else {
            System.out.println("Verdiğiniz kelimenin en fazla " + vocabulary.length() + " karakteri vardır.");
        }


    }
}
