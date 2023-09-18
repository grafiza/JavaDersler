package DepoApp;

import java.sql.SQLOutput;
import java.util.*;

public class DepoSistemi {
    private HashMap<String, Urun> urunListesi = new HashMap<>();
    private Urun urun = new Urun();
    static Scanner scan = new Scanner(System.in);

    void urunTanimlama() {

        String urunID, urunAdi, uretici, birim;
        System.out.println("Ürün id:");
        urunID = scan.nextLine();
        System.out.println("Ürün Adı");
        urunAdi = scan.nextLine();
        System.out.println("Üretici Firma");
        uretici = scan.nextLine();

        System.out.println("Birim(Adet,Çuval,Kg");
        birim = scan.nextLine();
        urun = new Urun(urunID, urunAdi, uretici, 0, birim, "-");
        this.urunListesi.put(urunID, urun);
    }

    void urunListele() {

        System.out.printf("%-6s%-15s%-15s%-15s%-15s%-15s\n","|id","|isim","|uretici","|miktari","|birim","|raf");
        System.out.println("------------------------------------------------------------------------");

        for (Urun w : urunListesi.values()) {
            System.out.printf("%-6s%-15s%-15s%-15d%-15s%-15s\n",w.getId(),w.getUrunAdi(),w.getUretici(),w.getMiktar(),w.getBirim(),w.getRaf());
        }
    }

    ;

    void urunGirisi() {

        System.out.println("Ürün id'sini giriniz");
        String id = scan.nextLine();
        System.out.println("Miktarı giriniz:");
        int miktar = scan.nextInt();
        int mevcutAdet = 0;

        Urun urun = urunListesi.get(id);

        mevcutAdet = urun.getMiktar();

        miktar += mevcutAdet;
        urun.setMiktar(miktar);

        String dummy = scan.nextLine();
        this.urunListele();
    }

    ;

    void urunuRafaKoy() {
        System.out.println("Ürün id'sini giriniz");
        String id = scan.nextLine();
        System.out.println("Raf No giriniz:");
        String raf = scan.nextLine();

        Urun urun = urunListesi.get(id);

        urun.setRaf(raf);

        this.urunListele();
    }

    ;

    void urunCikisi() {
        System.out.println("Ürün id'sini giriniz");
        String id = scan.nextLine();
        System.out.println("Kaç adet çıkış yapılacak");
        int adet = scan.nextInt();
        int mevcutAdet = 0;

        Urun urun = urunListesi.get(id);

        mevcutAdet = urun.getMiktar();
        if (mevcutAdet < adet)
            System.out.println(mevcutAdet + " adet " + urun.getUrunAdi() + " var");
        else {
            System.out.println("mevcutAdet = " + mevcutAdet);
            System.out.println("adet = " + adet);
            adet = mevcutAdet - adet;
            urun.setMiktar(adet);
        }


        String dummy = scan.nextLine();
        this.urunListele();
    }

    ;

}
