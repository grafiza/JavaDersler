package Practice05Arrays;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class VarArgs02 {
    public static void main(String[] args) {
         /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istediginiz kadar secin.
        Sectiginiz bu derslerin saatleri toplamı 12'yi gecerse "Limiti astiniz";
        12'yi gecmezse "Islem basariyla tamamlandi" mesajini veren bir method olusturunuz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat
​
         */
        int matematik =4;
        int geometri=2;
        int fizik=3;
        int kimya=3;
        int biyoloji=3;
        int edebiyat=2;
        int tarih=2;
        int cografya=2;

//        Scanner scan=new Scanner(System.in);
//        System.out.print("Lütfen Ders Seçiniz : ('0' Çıkış)\n" +
//               "1. Matematik   : 4\n" +
//               "2. Geometri    : 2\n" +
//               "3. Fizik       : 3\n" +
//               "4. Kimya       : 3\n" +
//               "5. Biyoloji    : 3\n" +
//               "6. Edebiyat    : 2\n" +
//               "7. Tarih       : 2\n" +
//               "8. Coğrafya    : 2\n"
//
//        );
//        int secim= 10;
//        List<Integer>dersler=new ArrayList<>();
//        while (secim!=0){
//            secim=scan.nextInt();
//            switch (secim){
//                case 1:dersler.add(4);break;
//                case 2:dersler.add(2);break;
//                case 3:dersler.add(3);break;
//                case 4:dersler.add(3);break;
//                case 5:dersler.add(3);break;
//                case 6:dersler.add(2);break;
//                case 7:dersler.add(2);break;
//                case 8:dersler.add(2);break;
//            }
//
//        }




        dersSecimi(biyoloji,kimya,geometri,matematik,tarih);
    }
    public static void dersSecimi(Integer...a){
        int toplam=0;
        for (Integer w:a             ) {
            toplam+=w;
        }
        if(toplam>12)
            System.out.println("Limiti aştınız...");
        else
            System.out.println("İşlem başarıyla tamamlandı...");
    }
}
