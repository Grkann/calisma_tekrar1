package com.ozdmrgurkan.tutorials._2_week;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class _16_1_Array {
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        //String dizisi
        // String[] city = {"g", "u", "r", "k", null, "n"};  // Eleman sayısı : 6
        String[] city = {"g", "u", "r", "k", "a", "n"};

        System.out.println(city[2]);
        System.out.println("Eleman sayısı: " + city.length);
        System.out.println("Son eleman:" + city[city.length - 1]);
        return city;

    }


    public static String[] arrayMethod2() throws ArrayIndexOutOfBoundsException {
        //String dizisi
        String[] city = new String[6];  // Eleman sayısı : 6
        city[0] = "g";
        city[1] = "u";
        city[2] = "r";
        city[3] = "k";
        city[4] = "a";
        city[5] = "n";
        // System.out.println(city);
        // System.out.println(city[3]);
        // System.out.println("Eleman sayısı: " + city.length);
        return city;

    }

    public static void arrayMethod3() {
        String[] city = arrayMethod2();
        // for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }

    }

    // İteratif for döngüsü
    public static void arrayMethod4() {
        String[] city = arrayMethod2();

        for (int i = 0; i < city.length; i++) {
            System.out.println(_15_4_SpecialColor.BLUE + city[i] + _15_4_SpecialColor.RESET);
        }
    }

    public static void arrayMethod5() {
        String[] city = arrayMethod2();
        // Dizilerde sıralama (Kücükten büyüge dogru sıralama)
        Arrays.sort(city);

        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.RESET + temp + _15_4_SpecialColor.RESET);
        }


    }

    public static void arrayMethod6() {
        String[] city = arrayMethod2();
        // Dizilerde sıralama (Büyükten kücüge dogru sıralama)
        Arrays.sort(city, Collections.reverseOrder());

        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.RESET + temp + _15_4_SpecialColor.RESET);
        }

    }

    public static void arrayMethod7() {
        String[] originalCity = arrayMethod2();

        //Clone
        String[] cloneCity = Arrays.copyOf(originalCity, originalCity.length);

        Arrays.sort(cloneCity);

        // Dizilerde sıralama (Büyükten kücüge dogru sıralama)
        // Arrays.sort(originalCity, Collections.reverseOrder());

        for (String temp : cloneCity) {
            System.out.println(_15_4_SpecialColor.RESET + temp + _15_4_SpecialColor.RESET);
        }
        //Binary Search
        String searchCity = _15_4_SpecialColor.YELLOW+"z";
        int index = Arrays.binarySearch(cloneCity, searchCity);

        if (index >=0){
            System.out.println(searchCity+_15_4_SpecialColor.BLUE + "harfi bulunmaktadır." + _15_4_SpecialColor.RESET);
        }
        else {
            System.out.println(searchCity+_15_4_SpecialColor.RED+ " harfi yoktur."+ _15_4_SpecialColor.RESET);
        }

    }

    public static int randomNumber() {
        Random random = new Random();
        int rndInt = random.nextInt(10); // 1<=Number<=10
        return rndInt;
    }


    //fill metodu tek bir değeri dizinin tüm elemanlarına atamak için tasarlanmıştır.
    public static void arrayMethod8() {
        int[] number = new int[5];
        Arrays.fill(number, randomNumber());
        //İteratif for
        for (int i = 0; i < number.length; i++) {
            number[i] = randomNumber();
            // System.out.println(number[i]);
            Arrays.setAll(number, data -> randomNumber());

        }
//for each
        for (int temp : number) {
            System.out.println(_15_4_SpecialColor.RESET + temp + _15_4_SpecialColor.RESET);
        }
    }

    public static void main(String[] args) {
        // arrayMethod1();
        // arrayMethod2();
        // arrayMethod3();
        // arrayMethod4();
        // arrayMethod5();
        // arrayMethod6();
        arrayMethod7();
        // arrayMethod8();
    }
}
