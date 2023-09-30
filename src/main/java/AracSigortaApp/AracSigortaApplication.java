package AracSigortaApp;
/*
Proje: Araç Sigorta Prim Hesaplama
       Araç tipleri:otomobil, kamyon, otobüs, motosiklet
                    -otobüs: 18-30 koltuk veya 31 ve üstü koltuk

       Tarife dönemi:Aralık 2023,Haziran 2023
          1.dönem :Haziran 2023               2.dönem:Aralık 2023
          otomobil: 2000                       otomobil: 2500
          kamyon:   3000                       kamyon:   3500
          otobüs: tip1: 4000 tip2: 5000        otobüs: tip1: 4500 tip2: 5500
          motosiklet: 1500                     motosiklet: 1750

        1-Tekrar tekrar kullanılan bir seçim menüsü(form) gösterelim.
        2-Tarife dönemi bilgisi,araç tipi bilgilerini kullanıcıdan alalım.
        3-Hatalı girişte hesaplama başarısız uyarısı verip tekrar menü(form) gösterilsin.
        4-Menüde yeni işlem veya çıkış için seçenek sunulsun .
        5-tarife dönemi ve araç tipine göre sigorta primi hesaplansın.
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AracSigortaApplication {
    static Scanner inp = new Scanner(System.in);

    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Map<Integer, String> aracTipleri = new HashMap<>();

        aracTipleri.put(1, "Otomobil");
        aracTipleri.put(2, "Kamyon");
        aracTipleri.put(3, "Otobüs");
        aracTipleri.put(4, "Motosiklet");

        int donemSecimi = 0, secim = 0;
        boolean isAgain=true;
        do {
            System.out.println("Tarife Dönemi Seçiniz:");

            System.out.println("----------------------");
            System.out.println("1.dönem: Haziran 2023");
            System.out.println("2.dönem: Aralık 2023");
            donemSecimi = inp.nextInt();

            inp.nextLine();
            if (donemSecimi == 1 || donemSecimi == 2) {
                Arac arac = new Arac();
                arac.donem = donemSecimi == 1 ? "Haziran 2023" : "Aralık 2023";
                System.out.println("Araç Tipini Giriniz:\n");
                int i = 1;
                for (String w : aracTipleri.values()) {
                    System.out.println(i + "." + w);
                    i++;
                }
                secim = inp.nextInt();
                inp.nextLine();
                arac.aracTipi = aracTipleri.get(secim);
                arac.primHesapla(donemSecimi);
            }
            else
                System.out.println("Hatalı Giriş");

            System.out.println("\nDevam etmek için 1, Çıkış için 0'a basınız...");
            if(inp.nextInt()==0)
                isAgain=false;
        }while (isAgain);
    }
}
