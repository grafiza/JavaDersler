package practice_Loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru04 {
    public static void main(String[] args) {
        /*Ver!len herhang! b!r array!n Mounta!n Array olup olmadıgını kontrol etmek !ç!n b!r kod
yazınız.
Not:
Mounta!n Array ==> [0, 2, 5, 3, 1]
B!r array elemanları en büyük deger!ne kadar sürekl! artan, en büyük deger!nden sonra sürekl
! azalan deger alıyorsa Maunta!n Array' d!r.
Mounta!n Array Deg!l ==> [5, 2, 7, 1, 4]
B!r array elemanları en büyük deger!ne kadar sürekl! azalan, en büyük deger!nden sonra sürekl
! artan deger alıyorsa Maunta!n Array deg!ld!r.*/

        List<Integer> liste1=new ArrayList<>();
        List<Integer> liste2=new ArrayList<>();

        liste1.add(1);
        liste1.add(3);
        liste1.add(5);
        liste1.add(7);
        liste1.add(9);
        liste1.add(8);
        liste1.add(6);
        liste1.add(2);
        liste2.addAll(liste1);
        Collections.sort(liste1);
        int max=liste1.get(liste1.size()-1);
        int min=liste1.get(0);

        System.out.println(liste2);

    }
}
