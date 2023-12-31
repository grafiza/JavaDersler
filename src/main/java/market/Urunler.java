package market;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Urunler {
    /* Basarili Market alış-veriş programı.
         *
         * 1. Adım: Ürünler ve fiyatları içeren listeleri oluşturunuz.
         *          No     Ürün           Fiyat
                   ====  =======        =========
                    00   Domates         2.10 TL
                    01   Patates         3.20 TL
                    02   Biber           1.50 TL
                    03   Soğan           2.30 TL
                    04   Havuç           3.10 TL
                    05   Elma            1.20 TL
                    06   Muz             1.90 TL
                    07   Çilek           6.10 TL
                    08   Kavun           4.30 TL
                    09   Üzüm            2.70 TL
                    10   Limon           0.50 TL
         * 2. Adım: Kullanıcının ürün nosuna göre listeden ürün seçmesini isteyiniz.
         * 3. Adım: Kaç kg satın almak istediğini sorunuz.
         * 4. Adım: Alınacak bu ürünü sepete ekleyiniz ve Sepeti yazdırınız.
         * 5. Başka bir ürün alıp almak istemediğini sorunuz.
         * 6. Eğer devam etmek istiyorsa yeniden ürün seçme kısmına yönlendiriniz.
         * 7. Eğer bitirmek istiyorsa ödemeyi kontrol edip para ustu hesaplayarak  programı bitirinzi.
         */
    private String[][] urunler = {
            {"00","Domates","2.10 TL"},
            {"01","Patates","3.20 TL"},
            {"02","Biber","1.50 TL"},
            {"03","Soğan","2.30 TL"},
            {"04","Havuç","3.10 TL"},
            {"05","Elma","1.20 TL"},
            {"06","Muz  ","1.90 TL"},
            {"07","Çilek","6.10 TL"},
            {"08","Kavun","4.30 TL"},
            {"09","Üzüm","2.70 TL"},
            {"10","Limon","0.50 TL"},
    };

    public void urunYazdir(){
        for (String[] each:urunler) {
            for (int i = 1; i < each.length+1; i++) {
                if (i%3!=0) {
                    System.out.print(each[i-1]+"\t\t");
                }else {
                    System.out.println(each[i-1]);
                }
            }
        }
    }
    public List<Double> fiyatGetir(){
        List<Double> fiyatlar = new ArrayList<>();
        for (String[] each:urunler) {
            for (int i = 0; i < each.length; i++) {
                if(i==2){
                    fiyatlar.add(Double.valueOf(each[i].replaceAll("[A-Za-z]","")));
                }
            }
        }
        return fiyatlar;
    }
}
