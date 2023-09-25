package KitaptanSorular;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        /*
            Bir tamsayı listesindeki tüm öğelerinin toplamını bulunuz.
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int sum = 0;
        for (Integer w : myList) {
            sum += w;
        }
        System.out.println("sum = " + sum);

        /*
        Bir tamsayı listesinde 13 öğesinden önceki tüm liste öğelerinin toplamını bulunuz.
         */
        int sum1 = 0;
        for (Integer w : myList) {
            if (w != 13)
                sum1 += w;
            else
                break;
        }
        System.out.println("sum = " + sum1);
    /*
    Bir tamsayı listesindeki tüm çift sayıların çarpımını bulunuz.
     */
        int m = 1;
        for (Integer w : myList) {
            if (w % 2 == 0)
                m *= w;
        }
        System.out.println("m = " + m);
        /*
        Bir listedeki öğelerin azalan sırada olup olmadığını kontrol ediniz.
Örnek: (Sarı, Mavi, Kırmızı, Yeşil) ==> Çıktı: Azalan sırada değil
(Sarı, Kırmızı, Yeşil, Mavi) ==> Çıktı: Azalan sıradadır
         */

        List<String> e = new ArrayList<>();
        e.add("Yellow");
        e.add("Red");
        e.add("Green");
        e.add("Blue");

        List<String> f = new ArrayList<>();
        f.addAll(e);
        Collections.sort(f);
        int size = e.size();
        int flag = 0;
        for (int i = 0; i < size; i++) {
            if (f.get(i).equals(e.get(size - 1 - i)))
                flag++;

        }
        if (size == flag)
            System.out.println(e + "Azalan sırada");
        else
            System.out.println(e + "Azalan değil");
/*
Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
Örnek: (12, 31, 15, 13, 54) ==> Çıktı 12 ve 13'tür
 */
        List<Integer> h = new ArrayList<>();
        h.add(12);
        h.add(31);
        h.add(15);
        h.add(13);
        h.add(54);
        Collections.sort(h);
        int minDif=h.get(2)-h.get(1);
        for (int i = 1; i < h.size(); i++) {
            minDif=Math.min(minDif,h.get(i)-h.get(i-1));
        }
        System.out.println(minDif);
        for (int i = 1; i < h.size(); i++) {
            if(minDif==(h.get(i)-h.get(i-1)))
                System.out.println(h.get(i)+","+h.get(i-1));

        }
    }
}
