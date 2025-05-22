package com.ozdmrgurkan._1_part_javatype;

public class _05_operators
{
    public static void main(String[] args) {
        //Operators
        // +,-,*,/,%,++,--

        int number1 = 20 , number2 = 10;

        int addition = number1 + number2;
        int subtraction = number1 - number2;
        int multiplication = number1 * number2;
        int division = number1 / number2;
        int modulus = number1 % number2;

        System.out.println("Toplam: " + addition);
        System.out.println("Çıkarma: " + subtraction );
        System.out.println("Çarpma: " + multiplication);
        System.out.println("Bölme: " + division);
        System.out.println("Kalan: " + modulus);

        // (post-increment): Önce değişken kullanılır, sonra 1 artırılır.
        int numberx=10;
        numberx++;
        System.out.println(numberx);

        // (pre-increment): Önce 1 artırılır, sonra değişken kullanılır.
        int numbery=10;
        ++numbery;
        System.out.println(numbery);

        //Mantıksal Operators : &&=VE   ||=VEYA   !=DEĞİL




    }
}
