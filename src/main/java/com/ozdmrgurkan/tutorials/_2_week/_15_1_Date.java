package com.ozdmrgurkan.tutorials._2_week;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//Date (GET)
public class _15_1_Date {
    public static void dategetMethod() {
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



// 1.YÖNTEM
    public static String nowFormat1() throws NullPointerException {
        Date date = new Date();
        String specialFormat = "Şu anki Zaman:"
                .concat(String.valueOf(date.getHours())
                .concat(":")
                .concat(String.valueOf(date.getMinutes()))
                .concat(":")
                .concat(String.valueOf(date.getSeconds()))
                .toString());
        return specialFormat;
    }

    //2.YÖNTEM
    public static String nowFormat2() throws NullPointerException {
        Date now = new Date();
        // %s : String
        // %d : Decimal
        // %f : Float
        return String.format("Şimdi zaman : %02d:%02d:%02d",now.getHours(),now.getMinutes(),now.getSeconds());
    }
public static String newFormat3() throws  NullPointerException {
        Date now = new Date();
        Locale locale = new Locale("tr","TR");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MMMM/yyyy HH:mm:ss zzzz",locale);

        String formatDate = String.format("Şimdiki zaman: %s",sdf.format(now));
        String formatedDate =String.format("Şimdiki zaman: %s",sdf.format(now));
        return new Date().toString() + "-" + formatedDate;
}

    public static void main(String[] args) {
        // dategetMethod();
      /* String nowDate= nowFormat1();
        System.out.println(nowDate); */

        String nowDate2= nowFormat2();
        System.out.println(nowDate2);

        String nowDate3= newFormat3();
        System.out.println(nowDate3);
    }
}
