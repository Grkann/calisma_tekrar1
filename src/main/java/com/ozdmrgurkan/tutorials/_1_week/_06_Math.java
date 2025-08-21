package com.ozdmrgurkan.tutorials._1_week;

public class _06_Math {
    public static void main(String[] args) {
        // NaN : Not a Number uyarısıdır.
        System.out.println("En küçük:" + Math.min(3,10));
        System.out.println("En büyük:" + Math.max(3,10));

        System.out.println("Mutlak:" + Math.abs(-150));

        System.out.println("Karekök:" + Math.sqrt(27));
        System.out.println("Karekök:" + Math.sqrt(-7)); //NaN değeri
        System.out.println("Karekök:" + Math.sqrt(Math.abs(-9)));

        System.out.println("Üslü sayi:" + Math.pow(2,11));

        System.out.println("Alta yuvarla:" + Math.floor(2.99));
        System.out.println("Üste yuvarla:" + Math.ceil(2.99));
        System.out.println("Ortalama Yuvarla:" + Math.round(3.4)); // x=<4 aşağı yuvarla
        System.out.println("Ortalama yuvarla:" +Math.round(3.5)); //  x=>5 ise yukarı yuvarla

        System.out.println("Trigonometrik Sinüs: " + Math.sin(1));
        System.out.println("Trigonometrik ters sin:" +Math.asin(0.8));
        System.out.println("Trigonometrik Cos:" +  Math.cos(1));
        System.out.println("Trigonometrik Tan:" + Math.tan(1));

        System.out.println("Pi sayisi:" + Math.PI);
        System.out.println("e sayisi:" + Math.E);




    }
}
