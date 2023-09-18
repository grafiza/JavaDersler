package Sorular;

import java.util.Scanner;

public class KahveMakinesi {
    static String hangiKahve;
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner scan=new Scanner(System.in);

        System.out.println("*".repeat(30));
        System.out.println("*** Hangi Kahveyi İstersiniz? ***");
        System.out.println();
        System.out.println("\t\t 1. Türk Kahvesi");
        System.out.println("\t\t 2. Filtre Kahve");
        System.out.println("\t\t 3. Espresso");
        hangiKahve= scan.nextLine();
        if(hangiKahve.compareToIgnoreCase("Türk Kahvesi")==0)
            kahveHazirla(hangiKahve);
        else if(hangiKahve.compareToIgnoreCase("Filtre Kahve")==0)
            kahveHazirla(hangiKahve);
        else if(hangiKahve.compareToIgnoreCase("Espresso")==0)
            kahveHazirla(hangiKahve);
            

        else{
            System.out.println("Hatalı tuşlama yaptınız");
            start();
        }

        

    }

    private static void kahveHazirla(String hangiKahve) {
        System.out.println(hangiKahve+" hazırlanıyor...");
        System.out.println("Süt eklememizi ister misiniz? (Evet veya Hayır olarak cevaplayınız");
        String sut;
        Scanner scan=new Scanner(System.in);
        sut=scan.nextLine();
        if(sut.compareToIgnoreCase("Evet")==0)
            System.out.println("Süt ekleniyor...");
        else
            System.out.println("Süt eklenmiyor");
        System.out.println("SŞeker ister misiniz? (Evet veya Hayır olarak cevaplayınız");
        String seker;
        seker= scan.nextLine();
        if(seker.compareToIgnoreCase("Evet")==0)
        {
            System.out.println("Kaç şeker olsun?");
            int kacSeker;
            kacSeker= scan.nextInt();
            System.out.println(kacSeker+" şeker ekleniyor");
            
        }
        else
            System.out.println("Şeker Eklenmiyor");
        String bosKod=scan.nextLine();
        System.out.println("Hangi boyutta olsun? (Büyük boy - orta boy - küçük boy)");
        String hangiBoy=scan.nextLine();
        if(hangiBoy.compareToIgnoreCase("Büyük Boy")==1)
            System.out.println("Kahveniz " + hangiBoy+" hazırlanıyor.");
        else if(hangiBoy.compareToIgnoreCase("küçük Boy")==1)
            System.out.println("Kahveniz " + hangiBoy+" hazırlanıyor.");
        else if(hangiBoy.compareToIgnoreCase("orta Boy")==1)
            System.out.println("Kahveniz " + hangiBoy+" hazırlanıyor.");

        System.out.println(hangiKahve+" "+hangiBoy+" hazırdır. Afiyet olsun !!!");
    }


}
