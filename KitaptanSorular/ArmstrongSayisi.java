package KitaptanSorular;

public class ArmstrongSayisi {
    public static void main(String[] args) {
        /*
        B!r sayı, her basamagının küpünün toplamına es!tse Armstrong sayısı olarak adlandırılır.
Örneg!n, 153, her basamagın küpüne es!t olan 153= 1 + 125 + 27 oldugundan b!r
Armstrong sayısıdır. Ver!len numaranın Armstrong sayısı olup olmadıgını kontrol etmek
!ç!n b!r kod yazınız.
         */

        int sayi=153;
        int toplam=0;
        int basamak=1;
        while(sayi>0){
            basamak=sayi%10;
            toplam+=basamak*basamak*basamak;
            sayi/=10;
        }
        System.out.println(toplam);
    }
}
