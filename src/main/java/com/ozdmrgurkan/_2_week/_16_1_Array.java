package com.ozdmrgurkan._2_week;

public class _16_1_Array {
    public static String[] arrayMethod1() throws ArrayIndexOutOfBoundsException {
        //String dizisi
        String[] city = {"g", "u", "r", "k", null, "n"};  // Eleman sayısı : 6

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
        city[5] = "n";
        // System.out.println(city);
        // System.out.println(city[3]);
        // System.out.println("Eleman sayısı: " + city.length);
        System.out.println("Son eleman:" + city[city.length - 1]);
        return city;

    }

    public static void arrayMethod3() {
        String[] city = arrayMethod2();

        //for each
        for (String temp : city) {
            System.out.println(_15_4_SpecialColor.YELLOW + temp + _15_4_SpecialColor.RESET);
        }

    }

    public static void main(String[] args){
    // arrayMethod1();
    // arrayMethod2();
    arrayMethod3();
    }
}
