package com.ozdmrgurkan.tutorials._1_week;

public class _04_4_Autoboxing_Boxing {
    public static void main(String[] args) {
        //Autoboxing: Primitive ==> Wrapper type dönüsümü
        int primitiveValue = 100;
        Integer wrapperValue = primitiveValue; // Autoboxing
        // wrapperValue=null;
        System.out.println("primitive value is " + primitiveValue + " and wrapper value is " + wrapperValue);


        //Boxing: Wrapper ==> Primitive type dönüsümü
        Integer wrapperValue2 = 200;
        int primitiveValue2 = wrapperValue2; // Unboxing
        System.out.println("wrapper value is " + wrapperValue2 + " and wrapper value is " + primitiveValue2);

    }
}
