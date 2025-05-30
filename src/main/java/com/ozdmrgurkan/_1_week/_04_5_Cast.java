package com.ozdmrgurkan._1_week;

public class _04_5_Cast {
    public static void main(String[] args) {
            // 1) Widening Cast = Implicit Cast
        int cast1Byte=100; // Kücük olan veriyi
        double cast1Int=cast1Byte; // Büyük olan veriye ekledik. Veri kaybı olmaz.
        System.out.println(cast1Int);

        // 2) Narrowing Cast -Explicit Cast

        int cast2Int= 999999999;
        byte cast2Byte= (byte) cast2Int;
        System.out.println(cast2Byte);

        // 3) char => Int
        char cast3Char= '!';
        int ascii1=cast3Char;
        System.out.println(ascii1);

        int ascii3=33;
        char cast5Char= (char) ascii3;
        System.out.println(cast5Char);






    }
}
