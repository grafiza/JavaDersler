package Ssg2Eylül_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class ArrayList_OrtalamaUstu {
    // bir listede ortalamanın üstünde olan eleman sayısıı
    public static void main(String[] args) {
        ArrayList<Integer> sayiListesi=new ArrayList<>();
        Random  rnd=new Random();
        double ort=0;
        for (int i = 0; i < 10; i++) {
            sayiListesi.add(rnd.nextInt(100));
            ort+=sayiListesi.get(i);
        }
        ort/=sayiListesi.size();
        ArrayList<Integer>ortalamaUstu=new ArrayList<>();
        for (Integer w:sayiListesi             ) {
            if(w>ort)
                ortalamaUstu.add(w);
        }
        Collections.sort(sayiListesi);
        Collections.sort(ortalamaUstu);
        System.out.println("liste:"+sayiListesi);
        System.out.println("Ortalama:"+ort);
        System.out.println("Ortalama üstü ssayılar:"+ortalamaUstu+"\n"+ortalamaUstu.size()+" adet");
    }
}
