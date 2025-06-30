package com.ozdmrgurkan._2_week;
import java.util.Formatter;

public class _12_2_StringFormat {


    public static void formatter1(){
        Formatter formatter= new Formatter();
        formatter.format(" Merhabalar,Adınız : %s , Numaranız : %d, Bütçe: %f ","Gürkan",152,44.2);
        System.out.println(formatter);
        formatter.close(); //Belleği serbest bırakma
    }

    public static void main(String[] args) {
formatter1();
    }
}
