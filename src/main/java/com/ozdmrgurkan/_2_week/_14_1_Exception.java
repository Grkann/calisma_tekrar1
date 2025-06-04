package com.ozdmrgurkan._2_week;

import java.io.IOException;
import java.util.Scanner;

public class _14_1_Exception {
    public static void main(String[] args) throws ArithmeticException, IOException,NullPointerException {
        Scanner scanner = new Scanner(System.in);
        int number1, number2;
        System.out.println("Number 1 giriniz:");
        number1 = scanner.nextInt();
        System.out.println("Number 2 giriniz:");
        number2 = scanner.nextInt();

        try {
            int result = number1 / number2;
            System.out.println(result);

        } catch (ArithmeticException ai) {
            ai.printStackTrace();
            // ai.getMessage();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("İstisna olsa da olmasa da mutlaka yapılacak iş");
            scanner.close();
        }


        /*
        Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at com.ozdmrgurkan._2_week._14_1_Exception.main(_14_1_Exception.java:7)
         */
        System.out.println("Son 10.000 satır");
    }
}
