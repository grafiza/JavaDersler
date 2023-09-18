package KitaptanSorular;

public class ArraysEnKucukPozEnBuyukNegatifSayi {
    /*
    Tamsayılardan olusan bir arrayde en küçük pozitif elemanı ve en büyük negatif elemanı
bulunuz.
Örnek:(-12, 18, -5, 23, -2) ==> En küçük pozitif 18, en büyük negatif -2
     */
    public static void main(String[] args) {
        int[]sayilar={-12,18,-5,23,-2};
        int enBuyukNegatif=sayilar[0];
        int enKucukPozitif=sayilar[1];
        for (Integer w:sayilar             ) {
            if(w<0)
                enBuyukNegatif=Math.max(enBuyukNegatif,w);
            else
                enKucukPozitif=Math.min(enKucukPozitif,w);
        }
        System.out.println("En büyük negatif sayı: "+ enBuyukNegatif);
        System.out.println("En küçük pozitif sayı: "+ enKucukPozitif);
    }
}
