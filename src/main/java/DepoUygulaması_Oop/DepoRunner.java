package DepoUygulaması_Oop;

import java.util.Arrays;
import java.util.Scanner;

public class DepoRunner {
    static UrunService us = new UrunService();

    public static void main(String[] args) {
        start();
    }

    static void start() {
        Scanner inp = new Scanner(System.in);
        int secim = -1;
        Menu menu[] = Menu.values();
        do {
            System.out.println("-".repeat(30) + "Depo Sistemi Uygulaması" + "-".repeat(30));
            System.out.println("Lütfen Seçim Yapınız");
            for (Menu m : menu) {
                System.out.printf("%-1s- %-15s \n", m.getMenuId(), m.getMenuAdi());
            }
            secim = inp.nextInt();
            inp.nextLine();
            if (secim > -1 && secim < 6) {
                switch (secim) {
                    case 1:
                        us.urunOlustur();
                        break;
                    case 2:
                        us.depoListele();
                        break;
                    case 3:
                        us.stokEkle();
                        break;
                    case 4:
                        us.stokSil();
                        break;
                    case 5:
                        us.rafaKoy();
                        break;
                    default:
                        break;
                }
            } else System.out.println("Geçersiz Giriş");
        } while (secim != 0);
    }

}
