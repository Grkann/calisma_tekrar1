package com.ozdmrgurkan.tutorials._1_week;

import java.util.Scanner;

public class _08_2_System {


    //Eğer System.exit(0) kullanırsam
    // 1- JVM durur.
    // 2- Çalışan tüm Threadler sonlanıyor.
    // 3- Programın işletim sistemindeki processlerden kapanır.

    public static void processCloseJvmStop() {
        System.out.println("Program başladı. System.exit(0)");
        System.exit(0);
        System.out.println("Bu satır çalışmayacaktır.");

    }

    public static void processContinueJvmContinue() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                System.out.println("Program başladı. break;");
                System.out.println("Sadece döngüden çıkılıyor.");
                break;
            }
            System.out.println(i + ".sıra");
        }
        System.out.println("Bu satır çalışacaktır.");
        System.out.println("************************");
    }

    public static void systemPropertiesExample() {
        {
            System.out.println("Java Versiyonu: " + System.getProperty("java.version"));
            System.out.println("OS Adı: " + System.getProperty("os.name"));
            System.out.println("Kullanıcı Adı: " + System.getProperty("user.name"));
            System.out.println("Çalışma Dizini: " + System.getProperty("user.dir"));
        }
    }

    public static void systemInputExample() {
        {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir şey yazınız: ");
            String input = scanner.nextLine();
            System.out.println("Girdiğiniz değer: " + input);
            scanner.close();
        }
    }

    public static void systemEnvExample() {
        System.out.println("PATH: " + System.getenv("PATH"));
        System.out.println("JAVA_HOME: " + System.getenv("JAVA_HOME"));
    }

    public static void GarbageCollectorExample() {
        System.out.println("Çöp toplama çağrısı yapılıyor...");
        System.gc();

    }
    public static void TimeExample() {

            long start = System.currentTimeMillis();

            // 1 milyon döngü çalıştır
            for (int i = 0; i < 1_000_000; i++) { }

            long end = System.currentTimeMillis();
            System.out.println("Geçen süre: " + (end - start) + " ms");
        }

        public static void NanoTimeExample(){

                long start = System.nanoTime();

                for (int i = 0; i < 1_000_000; i++) { }

                long end = System.nanoTime();
                System.out.println("Geçen süre: " + (end - start) + " ns");

        }


    public static void main(String[] args) {

        //processContinueJvmContinue();
        //processCloseJvmStop();
        //systemPropertiesExample();
        //systemInputExample();
        //systemEnvExample();
        //GarbageCollectorExample();
        //TimeExample();
        NanoTimeExample();
    }
}
