package com.ozdmrgurkan._1_week;

public class _08_2_System {



    //Eğer System.exit(0) kullanırsam
    // 1- JVM durur.
    // 2- Çalışan tüm Threadler sonlanıyor.
    // 3- Programın işletim sistemindeki processlerden kapanır.

    public static void processCloseJvmStop(){
        System.out.println("Program başladı. System.exit(0)");
        System.exit(0);
        System.out.println("Bu satır çalışmayacaktır.");

    }

    public static void processContinueJvmContinue(){
        for (int i = 0; i <10 ; i++) {
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









    public static void main(String[] args) {

processContinueJvmContinue();
processCloseJvmStop();





    }
}
