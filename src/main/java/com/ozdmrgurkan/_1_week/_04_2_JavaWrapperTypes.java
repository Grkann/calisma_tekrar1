package com.ozdmrgurkan._1_week;

public class _04_2_JavaWrapperTypes {
    public static void main(String[] args) {
        //WRAPPER TYPE (new varsa)

        Byte wrapperTypeByte = new Byte((byte)127);
        Short wrapperTypeShort = new Short((short)32767);
        Integer wrapperTypeInt = new Integer((int)2147483647);
        Long wrapperTypeLong = new Long((long)9223372036854775807L);

        Float wrapperTypeFloat = new Float((float) 9223372036854775807.0F);
        Double wrapperTypeDouble = new Double(9223372036854775807.0);

        Boolean wrapperTypeBoolean = new Boolean(true);
        Character wrapperTypeChar = new Character((char)'A');
    }
}
