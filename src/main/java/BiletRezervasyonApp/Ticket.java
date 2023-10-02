package BiletRezervasyonApp;

public class Ticket {
    double mesafe;
    double fiyat;
    int yolculukTipi;
    int koltukNo;

    public Ticket(double mesafe, int yolculukTipi, int koltukNo) {
        this.mesafe = mesafe;

        this.yolculukTipi = yolculukTipi;
        this.koltukNo = koltukNo;
    }

    void fiyatHesapla(int yas) {

        switch (yolculukTipi) {
            case 1:
                if (koltukNo % 3 == 0)
                    fiyat = mesafe * 1.2;
                else
                    fiyat = mesafe;
                break;
            case 2:
                if (koltukNo % 3 == 0)
                    fiyat = mesafe * 1.2 * 2 * 0.8;
                else
                    fiyat = mesafe * 2 * 0.8;
                break;
        }
        if (yas < 12)
            fiyat *= 0.5;
        else if (yas > 65)
            fiyat *= 0.7;
        biletYazdir();
    }
    void biletYazdir(){
        System.out.println("Gidilecek Mesafe: "+this.mesafe);
        System.out.println("Yolculuk Tipi: "+(this.yolculukTipi==1?"Tek Yön":"Gidiş Dönüş"));
        System.out.println("Koltuk No: "+this.koltukNo);
        System.out.println("Bilet Fiyatı: "+this.fiyat);
    }
}
