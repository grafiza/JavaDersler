package Sorular;

import java.util.Scanner;

public class AtmApp2 {
    /*
       ATM
        Kullaniciya giriş için kart numarasi ve şifresini isteyin, eger herhangi birini yanlis girerse tekrar isteyin.
        Kart numarasi aralarda boşluk ile girerse de eger doğruysa kabul edin.
        Kart numarasi ve sifre dogrulanirsa kullanicinin yapabileceği işlemleri ekrana yazdirin,

        Bakiye sorgula, para yatirma, para çekme, para gönderme, sifre değiştirme ve cikis.

        Para çekme ve para gonderme işleminde mevcut bakiyeden buyuk para çekilemez,
        Para gönderme işleminde istenen iban TR ile baslamali ve toplam 26 karakterli olmali, eger değilse menü ekranina geri donsun.
        Sifre değiştirme işleminde mevcut şifreyi teyit ettikten sonra, sifre değişiklik işlemini yapmali,
     */
    static Scanner scan;
    static int cardNumber=9876;
    static int pass=6300;
    static double bakiye=0;
    public static void main(String[] args) {
        start();

    }

    private static void start() {
        scan=new Scanner(System.in);
        boolean isTrue=false;
        do{
            System.out.println("Lütfen kart numarasını giriniz :");
            if(scan.nextInt()==cardNumber)
                isTrue=true;
        }
        while (!isTrue);
        isTrue=false;
        do{
            System.out.println("Lütfen kart şifresini giriniz :");
            if(scan.nextInt()==pass)
                isTrue=true;
        }
        while (!isTrue);
        islemler();
    }

    private static void islemler() {
        scan=new Scanner(System.in);
        boolean isAgain=false;
        do {

            System.out.println("      ATM UYGULAMASI     ");
            System.out.println("1. Bakiye Görüntüle");
            System.out.println("2. Para Çekme");
            System.out.println("3. Para Yatırma");
            System.out.println("4. Para Gönderme");
            System.out.println("5. Şifre Değiştirme");
            System.out.println("0. Çıkış");
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
                case 4:
                    paraGonderme();
                    break;
                case 5:
                    sifreDegistir();
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

    private static void sifreDegistir() {
        scan=new Scanner(System.in);
        boolean sart=false;
        do {
            System.out.print("Mevcut şifreyi giriniz:");
            int oldPass = scan.nextInt();
            if(oldPass==pass)
            {
                System.out.println("Yeni Şifreyi giriniz:");
                int newPass=scan.nextInt();
                pass=newPass;
                System.out.println("Şifreniz Değiştirildi...");
                sart=true;
            }
            else
                System.out.println("Girdiğiniz şifre hatalı");
        }
        while(!sart);
    }

    private static void paraGonderme() {
        scan=new Scanner(System.in);
        boolean sart=false;
        do {
            System.out.print("Göndermek istediğiniz IBAN numarasını giriniz: (26 karakter)");
            String iban = scan.nextLine();
            if(iban.startsWith("TR") && iban.length()==26)
                sart=true;
            else
                System.out.println("hatalı IBAN");
        }
        while(!sart);
        System.out.print("Göndermek istediğiniz tutarı giriniz: ");
        double tutar=scan.nextDouble();


            if (tutar < bakiye){
                bakiye -= tutar;
                System.out.println("Para gönderme işlemi tamamlandı");

            }
            else
                System.out.println("Yetersiz Bakiye.");



        bakiyeGoster();
    }

    private static void paraYatirma() {
        scan=new Scanner(System.in);
        System.out.print("Yatırmak istediğiniz tutarı giriniz:");
        bakiye+=scan.nextDouble();
        bakiyeGoster();

    }

    private static void paraCekme() {
        scan=new Scanner(System.in);
        System.out.print("Çekmek istediğiniz tutarı giriniz:");
        double tutar=scan.nextDouble();

        if(tutar<=bakiye)
            bakiye -= tutar;
        else
            System.out.println("Yetersiz Bakiye.");
        bakiyeGoster();
    }

    private static void bakiyeGoster() {
        System.out.println("Bakiyeniz :"+bakiye);
    }
}
