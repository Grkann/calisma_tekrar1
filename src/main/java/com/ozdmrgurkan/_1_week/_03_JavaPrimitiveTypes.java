package com.ozdmrgurkan._1_week;

public class _03_JavaPrimitiveTypes {
    public static void main(String[] args) {
// Primitive types : 8 tanedir , null değer alamazsınız.
        // tam sayılar (4)
        byte b1=127;
        System.out.println("byte:" + b1);

        short s1=32767;
        System.out.println("short:" + s1);

        int i1=2147483647;
        System.out.println("int:" + i1);

        long l1=9223372036854775807L;
        System.out.println("long:" + l1);

        //virgüllü sayılar (floating point)
        float f2=3.14f;
        System.out.println("float:" + f2);
       // float totalSalary= 12412.1f; Anlamlı isimlendirmeler yapmalıyız.

        double d2=3.14;
        System.out.println("double:" + d2);

        //boolean
        boolean b3=true;
        System.out.println("boolean:" + b3);

        //char
        char c1='\u4125';
        System.out.println("char:" + c1);
    }
}
