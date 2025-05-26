package com.ozdmrgurkan._2_week;

public class _13_1_MethodIsNotReturn {
    //1-Metotlar Parametresiz
    public void methodnotReturnnotParamether() {
        System.out.println("Metot Parametresiz Returnsuz");
    }

    //Metot Overloading

    // 2-Parametreli
    public static void methodnotReturnIsParamether(String name) {
        System.out.println("İsim: " + name);

    }


    public static void methodnotReturnIsParamether(String name,String surname,int yas) {
        System.out.println("İsim: " + name);
        System.out.println("Soyisim: " + surname);
        System.out.println("Yas: " + yas);

    }

    // new
    // static
    public static void main(String[] args) {
        methodnotReturnIsParamether("Gürkan");
        methodnotReturnIsParamether("Gürkan","Özdemir",18);
        _13_1_MethodIsNotReturn data1 = new _13_1_MethodIsNotReturn();
        data1.methodnotReturnnotParamether();
    }
}
