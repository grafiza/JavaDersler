package Sorular.BiletApp;
/*
   A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
   Bilet tarifesi:
   km birim fiyati : 0.10$
   yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
   12 ve 24 yas arasindaysa 10% indirim,
   65 yasindan buyukse 30% indirim,
   bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
*/
public class Bilet {



    private static double birimFiyat=0.1;
    public static int yas;
    public static byte biletTipi;
    public static void BiletHesapla(int yas,int mesafe){
        double biletFiyati=1;
        String yasIndirimi;
        String biletTuru;
        if(yas<12) {
            biletFiyati = birimFiyat * mesafe * 0.5;
            yasIndirimi="Çocuk İndirimli";
        }
        else if(yas>=12 && yas<24) {
            biletFiyati = birimFiyat * mesafe * 0.9;
            yasIndirimi="Öğrenci İndirimli";
        }
        else if(yas>65) {
            biletFiyati = birimFiyat * mesafe * 0.7;
            yasIndirimi="65 yaş üstü indirimli";
        }
        else {
            biletFiyati = birimFiyat * mesafe;
            yasIndirimi="İndirimsiz Tarife";
        }
        if (biletTipi==2)
            biletFiyati=biletFiyati*2*0.8;

        String yer="";
        if(mesafe==500)
            yer="Boston";
        else if (mesafe==700)
            yer="Chicago";
        else if(mesafe==900)
            yer="Denver";
        biletTuru=biletTipi==1?"Tek Yön":"Gidiş-Dönüş";

        System.out.println(yer+" için "+biletTuru+" "+yasIndirimi+" fiyatı\n"+biletFiyati);
    }
}
