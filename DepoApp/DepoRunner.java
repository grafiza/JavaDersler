package DepoApp;

import java.util.Scanner;

public class DepoRunner {
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        DepoSistemi depo = new DepoSistemi();
        Urun urun = new Urun();
        byte select;
        do {
            System.out.println("Depo Sistemi Uygulaması v1.0");
            System.out.println("----------------------------");
            System.out.println("1. Ürün Tanımlama");
            System.out.println("2. Ürün Listeleme");
            System.out.println("3. Ürün Girişi");
            System.out.println("4. Ürün Çıkışı");
            System.out.println("5. Rafa Koy");
            System.out.println("6. Çıkış");
            select = scan.nextByte();
            String dummy = scan.nextLine();
            switch (select) {
                case 1:
                    depo.urunTanimlama();
                    break;
                case 2:
                    depo.urunListele();
                    break;
                case 3:
                    depo.urunGirisi();
                    break;
                case 4:
                    depo.urunCikisi();
                    break;
                case 5:
                    depo.urunuRafaKoy();
                default:
                    break;
            }
        }while (select!=6);

    }
}
