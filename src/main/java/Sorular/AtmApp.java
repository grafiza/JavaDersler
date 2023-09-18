package Sorular;
/*
    Bakıye (başlangıç bakıyesi 1000 tl) öğrenme, para yatırma ve cekme,
    çıkış işlemlerinin yapıldıgı bie ATM app. code create ediniz
     */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AtmApp {
    static double bakiye=1000;
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner scan=new Scanner(System.in);
        boolean isAgain;
        do {

            System.out.println("      ATM UYGULAMASI     ");
            System.out.println("-".repeat(30));
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("0. Çıkış");
            System.out.println("-".repeat(30));
            int select=scan.nextInt();
            isAgain=true;
            switch (select){
                case 1:
                    bakiyeGoster();
                    break;
                case 2:
                    paraCekme();
                    break;
                case 3:
                    paraYatirma();
                    break;
                case 0:
                    isAgain=false;
                    break;
                default:
                    System.out.println("Hatalı Giriş");
                    isAgain=false;

            }


        }
        while (isAgain);
    }

    private static void paraYatirma() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Yatırmak istediğiniz tutarı giriniz:");
        bakiye+=scan.nextDouble();
        bakiyeGoster();

    }

    private static void paraCekme() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Çekmek istediğiniz tutarı giriniz:");
        bakiye-=scan.nextDouble();
        bakiyeGoster();

    }

    private static void bakiyeGoster() {
        System.out.println("*".repeat(25));
        System.out.println("Bakiyeniz :"+bakiye);
        System.out.println("*".repeat(25));
    }
}
