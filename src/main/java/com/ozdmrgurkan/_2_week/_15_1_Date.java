package com.ozdmrgurkan._2_week;

import java.util.Date;

public class _15_1_Date {
    public static void dateMethod() {
        Date now = new Date();
        // java.util.Date date = new Date();
        System.out.println("Şu andaki zaman:" + now);
        System.out.println("1 Ocak 1970 ten itibaren günümüze kadar geçen milisaniye değeri:" + now.getTime());
        System.out.println("Date:" + now.getDate());

        System.out.println("Day:" + now.getDay());
        System.out.println("Month:" + now.getMonth()); //Saymaya sıfırdan başlar. 0=Ocak
        System.out.println("Year:" + now.getYear()); // 1900 ekle veya çıkar(duruma göre)
        System.out.println("Year:" + (1900 + now.getYear()));
        System.out.println("Hour:" + now.getHours());
        System.out.println("Minute:" + now.getMinutes());
        System.out.println("Second:" + now.getSeconds());

    }

    public static String nowFormat1() {
        Date date = new Date();
        String specialFormat = "Şu anki Zaman:".concat(String.valueOf(date.getHours())
                .concat(":")
                .concat(String.valueOf(date.getMinutes()))
                .concat(":")
                .concat(String.valueOf(date.getSeconds()))
                .toString());
        return specialFormat;
    }


    public static void main(String[] args) {
        // dateMethod();
       String nowDate= nowFormat1();
        System.out.println(nowDate);
    }
}
