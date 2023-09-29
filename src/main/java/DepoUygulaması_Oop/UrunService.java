package DepoUygulaması_Oop;

import java.util.HashMap;
import java.util.Scanner;

public class UrunService {
    private Urun urun = new Urun();
    private HashMap<Integer, Urun> urunListesi = new HashMap<>();
    static Scanner inp = new Scanner(System.in);
    static Urunler urunler[] = Urunler.values();
    static int id = 1000;

    void urunOlustur() {
        int secim = 0;
        System.out.println("-".repeat(30) + "Depo Sistemi Uygulaması" + "-".repeat(30));
        System.out.println("Lütfen Ürün Seçiniz");
        urunListele();
        secim = inp.nextInt();
        inp.nextLine();
        this.urun = new Urun(id, this.urunler[secim - 1].getUrunAdi(), this.urunler[secim - 1].getUretici(), this.urunler[secim - 1].getBirim());
        this.urunListesi.put(id, this.urun);
        depoListele();
        id++;
    }

    void stokEkle() {
        int secim = -1;
        int miktar = 0;
        depoListele();
        System.out.println("Ürün id giriniz");
        secim = inp.nextInt();
        inp.nextLine();
        Urun urun = urunListesi.get(secim);
        System.out.println("Eklenecek stok miktarını giriniz");
        miktar = inp.nextInt();
        inp.nextLine();
        urun.setMiktar(miktar + urun.getMiktar());
        depoListele();
    }

    void stokSil() {
        int secim = -1;
        int miktar = 0;
        depoListele();
        System.out.println("Ürün id giriniz");
        secim = inp.nextInt();
        inp.nextLine();
        Urun urun = urunListesi.get(secim);
        System.out.println("Çıkarılacak stok miktarını giriniz");
        miktar = inp.nextInt();
        inp.nextLine();
        if (urun.getMiktar() < miktar) {
            urun.setMiktar(0);
            System.out.println("Girdiğiniz sayıda stok bulunmadığından, stok bilgisi 0 olarak belirlendi.");
        }
        else
            urun.setMiktar(urun.getMiktar() - miktar);
        depoListele();
    }
void rafaKoy(){
    int secim = -1;
    String raf ;
    depoListele();
    System.out.println("Ürün id giriniz");
    secim = inp.nextInt();
    inp.nextLine();
    Urun urun = urunListesi.get(secim);
    System.out.println("Raf bilgisi giriniz");
    raf = inp.nextLine();
    urun.setRaf(raf);
    depoListele();
}
    void depoListele() {
        System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n", "Ürün Id", "Ürün Adı", "Üretici", "Birim", "Miktar", "Raf");
        for (Urun u : this.urunListesi.values()) {

            System.out.printf("%-10s %-15s %-15s %-15s %-15s %-15s\n", u.getUrunId(), u.getUrunAdi(), u.getUretici(), u.getBirim(), u.getMiktar(), u.getRaf());
        }

    }

    private static void urunListele() {

        System.out.printf("%-10s %-15s %-15s %-15s\n", "ürün Kodu", "ürün Adı", "üretici", "Birim");
        for (Urunler u : urunler) {
            System.out.printf("%-10s %-15s %-15s %-15s\n", u.getUrunKodu(), u.getUrunAdi(), u.getUretici(), u.getBirim());
        }

    }
}
