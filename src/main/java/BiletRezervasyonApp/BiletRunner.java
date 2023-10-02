package BiletRezervasyonApp;

import javax.swing.plaf.synth.SynthLookAndFeel;
import java.util.Scanner;

public class BiletRunner {
    static Scanner scan = new Scanner(System.in);
    static Otobus otobus = new Otobus("34 ABC 123");

    public static void main(String[] args) {
        double mesafe;
        int yas, yolculukTipi, koltukNo, yeniBilet = 1;
        String adSoyad;
        do {

            System.out.println("Gidilecek mesafeyi km olarak giriniz:");
            mesafe = scan.nextDouble();
            scan.nextLine();
            System.out.println("Adınız ve soyadınız:");
            adSoyad = scan.nextLine();
            System.out.println("Yaşınızı giriniz:");
            yas = scan.nextInt();
            scan.nextLine();

            System.out.println("1. Tek Yön");
            System.out.println("2. Gidiş Dönüş");
            yolculukTipi = scan.nextInt();
            scan.nextLine();


            if (mesafe > 0 && yas > 0 && (yolculukTipi == 1 || yolculukTipi == 2)) {

                boolean isValid = false;
                do {
                    System.out.println(otobus.koltuklar);
                    System.out.println("Koltuk seçiniz");
                    koltukNo = scan.nextInt();
                    scan.nextLine();
                    if (otobus.koltuklar.get(koltukNo).contains("Boş")) {

                        isValid = true;
                        otobus.koltuklar.replace(koltukNo, adSoyad);
                    }else
                        System.out.println("Bu koltuk rezerve edilmiş");

                } while (!isValid);
                Ticket ticket = new Ticket(mesafe, yolculukTipi, koltukNo);
                ticket.fiyatHesapla(yas);
            }
            System.out.println("Yeni bilet için 1, Çıkış için 0");
            yeniBilet = scan.nextInt();
            scan.nextLine();
        } while (yeniBilet != 0);
    }
}
