package market;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BakkalRunner {

    public static void main(String[] args) {
        Urunler urun = new Urunler();
        int isEnd;
        List<Double> ucret = urun.fiyatGetir();
        System.out.println(ucret);
        Double toplamFiyat = 0.0;
        Scanner scan = new Scanner(System.in);
        do {
            int kg;

            urun.urunYazdir();
            System.out.println("Listelenen ürünlerden istediğinizin nosunu giriniz\nÇıkmak içi 11 giriniz.");
            isEnd = scan.nextInt();
            Integer control = isEnd + 1;
            switch (control){
                case 1:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get(control-1));
                    break;
                case 2:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 3:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 4:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 5:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 6:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 7:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 8:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 9:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
                case 10:
                    System.out.println("Kaç kilo almak istiyorsunuz");
                    kg = scan.nextInt();
                    toplamFiyat+=(kg*ucret.get((control-1)));
                    break;
            }
            System.out.println("Toplam Fiyat: "+toplamFiyat);
        } while (isEnd!=11);

        System.out.println("Verilen parayı giriniz");
        double odeme = scan.nextDouble();
        System.out.printf("Para üstü: %.2f" , (odeme-toplamFiyat));
    }
}
