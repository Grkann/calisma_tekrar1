package com.ozdmrgurkan._1_part_javatype;

public class _04_1_JavaWrapperType {
    public static void main(String[] args) {

        //PRIMITIVE TYPE

        byte primitiveTypeByte = 127;
        // primitiveTypeByte = null; // primitive type null değeri alamaz.
        System.out.println(primitiveTypeByte);
        short primitiveTypeShort = 32767;
        int primitiveTypeInt = 2147483647;
        long primitiveTypeLong = 9223372036854775807L;

        float primitiveTypeFloat = 3.14159265f;
        double primitiveTypeDouble = 3.14159265;

        boolean primitiveTypeBoolean = true;
        char primitiveTypeChar = 'A';


        //WRAPPER TYPE

        Byte wrapperTypeByte = 127;
        wrapperTypeByte=null; // wrapper classa null verebiliriz.
        System.out.println(wrapperTypeByte);
        Short wrapperTypeShort = 32767;
        Integer wrapperTypeInt = 2147483647;
        Long wrapperTypeLong = 9223372036854775807L;

        Float wrapperTypeFloat = 3.14159265f;
        Double wrapperTypeDouble = 3.14159265;

        Boolean wrapperTypeBoolean = true;
        Character wrapperTypeChar = 'A';
    }
}
