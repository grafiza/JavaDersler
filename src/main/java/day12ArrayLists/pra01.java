package day12ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class pra01 {
    public static void main(String[] args) {
        //B!r tamsayı l!stes!ndek! tüm ögeler!n!n toplamını bulunuz.
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(31);
        myList.add(7);
        myList.add(13);
        myList.add(10);
        int toplam=0;
        for (Integer w:myList             ) {
            toplam+=w;
        }
        System.out.println("Toplam : "+toplam);



        //B!r tamsayı l!stes!nde 13 öges!nden öncek! tüm l!ste ögeler!n!n toplamını bulunuz.
        int toplam1=0;
        for (Integer w:myList             ) {
            if(w==13)
                break;
            else
                toplam1+=w;
        }
        System.out.println("Toplam 13'e kadar "+toplam1);


        //B!r tamsayı l!stes!ndek! tüm ç!ft sayıların çarpımını bulunuz.
        int mult=1;
        for (Integer w:myList             ) {
            if(w%2==0)
                mult*=w;
        }
        System.out.println("Çift sayıların çarpımı : "+mult);
    }
}
