package Ssg2Eylül_ArrayList;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayList01 {
    public static void main(String[] args) {
        ArrayList<String>cities=new ArrayList<>();
        cities.add("Manisa");
        cities.add("İzmir");
        cities.add("Sinop");
        cities.add("Zonguldak");
        cities.add("Rize");
        Collections.sort(cities);
        System.out.println(cities);

        ArrayList<Integer>sayiListesi=new ArrayList<>();
        sayiListesi.add(1);
        sayiListesi.add(52);
        sayiListesi.add(13);
        sayiListesi.add(12);
        sayiListesi.add(41);
        int toplam=0;
        for (Integer w:sayiListesi             ) {
            if(w%2==0)
            toplam+=w;
        }
        System.out.println(toplam);

    }
}
