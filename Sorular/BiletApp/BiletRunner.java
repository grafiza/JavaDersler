package Sorular.BiletApp;

import java.util.Scanner;
/*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/
public class BiletRunner extends Mesafeler{
    public static void main(String[] args) {
        start();


    }

    private static void start() {
        Mesafeler m=new Mesafeler();
        Scanner scan=new Scanner(System.in);
        boolean isAgain=false;

        int mesafe = 0;
        do {
            System.out.println();
            System.out.println("Lütfen Gideceğiniz Şehri Seçiniz:");
            System.out.println("1. Boston \t\t500 km");
            System.out.println("2. Chicago\t\t700 km");
            System.out.println("3. Denver\t\t900 km");
            System.out.println();

            int select = scan.nextInt();

            switch (select) {
                case 1:
                    mesafe = m.b;
                    isAgain=false;
                    break;
                case 2:
                    mesafe = m.c;
                    isAgain=false;
                    break;
                case 3:
                    mesafe = m.d;
                    isAgain=false;
                    break;
                default:
                    System.out.println("Hatalı Giriş");
                    isAgain=true;
            }
        }while (isAgain);

        System.out.println();
        System.out.println("Lütfen Yaşınızı Giriniz:");
        yas=scan.nextInt();

        System.out.println();
        System.out.println("Lütfen Bilet Tipini Seçiniz:");
        System.out.println("1. Tek Yön");
        System.out.println("2. Gidiş Dönüş");

        System.out.println();
        biletTipi=scan.nextByte();
        BiletHesapla(yas,mesafe);

    }

}
