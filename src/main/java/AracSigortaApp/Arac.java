package AracSigortaApp;

import java.util.Scanner;

public class Arac {
    public String aracTipi;
    public int prim;
    public String donem;

    public void primHesapla(int donem) {
        switch (aracTipi) {
            case "Otomobil":
                this.prim = donem == 1 ? 2000 : 2500;
                break;
            case "Kamyon":
                this.prim = donem == 1 ? 3000 : 3500;
                break;
            case "Otobüs":
                primOtobusHesapla(donem);
                break;
            case "Motosiklet":
                this.prim = donem == 1 ? 1500 : 1750;
                break;
            default:
                System.out.println("Hatalı Giriş!");
                this.prim = 0;
                break;
        }
        yazdir();

    }

    private void yazdir() {
        System.out.printf("%-20s %-20s %-20s\n", "Araç Tipi", "Tarife Dönemi", "Sigorta Primi");
        System.out.println("-".repeat(60));
        System.out.printf("%-20s %-20s %-20s\n", this.aracTipi, this.donem, this.prim);
        System.out.println("-".repeat(60));
    }

    public void primOtobusHesapla(int donem) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Koltuk sayısı:");
        System.out.println("1. 18-30 koltuk");
        System.out.println("2. 31 ve üstü");
        int secim = scan.nextInt();
        scan.nextLine();
        if(secim==1 || secim==2) {
            if (donem == 1)
                this.prim = secim == 1 ? 4000 : 5000;
            else if (donem == 2)
                this.prim = secim == 1 ? 4500 : 5500;
            else
                System.out.println("Hatalı Giriş");
        }
        else
            System.out.println("Hatalı Giriş");
    }

}
