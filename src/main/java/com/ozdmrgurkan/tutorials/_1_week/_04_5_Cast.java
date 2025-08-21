package com.ozdmrgurkan.tutorials._1_week;

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
        char cast4Char= (char) ascii3;
        System.out.println(cast4Char);

       // 4) String to Int

        String castString5 = "10";
        int cast4Int= Integer.valueOf(castString5);
        int cast4Int2= Integer.parseInt(castString5);
        System.out.println(castString5+20);
        System.out.println(cast4Int+20);
        System.out.println(cast4Int2+20);

        // 5)  Int => String
        int cast5Int=55;
        String cast5String1= String.valueOf(cast5Int);
        String cast5String2= Integer.toString(cast5Int);
        System.out.println(cast5String1);
        System.out.println(cast5String2);


    }
}
