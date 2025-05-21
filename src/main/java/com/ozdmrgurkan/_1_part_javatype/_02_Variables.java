package com.ozdmrgurkan._1_part_javatype;

public class _02_Variables {
    public static void main(String[] args) {

        //Veri değişken isimlerini yazarken;
        /*
1) isim sıfat veya zamir kullanmalıyız
2) sayı ile başlanmaz - sayı ile bitebilir.
3)_ veya $ ile başlayabiliriz.
4) _ veya $ dışında özel simgelerle baslanmaz.
         */
        int schoolNumber = 25;
        System.out.println(schoolNumber);
        int _schoolNumber = 25;
        System.out.println(_schoolNumber);
        _schoolNumber = 44;
        System.out.println(_schoolNumber);

    }
}
