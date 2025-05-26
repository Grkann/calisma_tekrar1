package com.ozdmrgurkan._2_week;

public class _13_2_MethodIsReturn {

        //Returnlu parametresiz
    public String methodIsReturnnotParamether(){
        return "Method is not Parameter.";

    }
    public Integer methodIsReturnIsParamether(int sayi){
        return sayi;
    }

    public static void main(String[] args) {
        _13_2_MethodIsReturn isReturn1 = new _13_2_MethodIsReturn();

        String result1= isReturn1.methodIsReturnnotParamether();
        System.out.println(result1);
        Integer result2 = isReturn1.methodIsReturnIsParamether(13);
        System.out.println(result2);
    }
}
