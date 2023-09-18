package GrupSorular;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Soru1 {
    /*  Problem Tanımı
       Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
       hesaplayan kodu yazınız.
       Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
       Buna göre 2 işçi aynı işi kaç günde yapar?
       Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
       İşin bitme süresi 5 gündür.
   */
//scanner 02
  /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */
//scanner 03
    /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */
//scanner 04
/*
    Kullanicidan kilosunu ve boyunu alip
    Vucut kitle indeksini hesaplayan bir program yaziniz.
            Ipucu : Vucut
    Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
    ORNEK:
    INPUT      : Kilo: 71
    Boy: 1,72
    OUTPUT  : Vucut Kitle Indeksiniz : 23
            */


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir işçi kaç günder bitirir ?");
        double birIsci=scan.nextDouble();
        System.out.print("Kaç işçi çalışacak ?");
        double isciSayisi=scan.nextDouble();
        double isGunu=birIsci/isciSayisi;
        System.out.println(isciSayisi+" işçi "+isGunu+" günde bitirir.");
    }
}
