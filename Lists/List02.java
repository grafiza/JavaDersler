package Lists;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class List02 {
    public static void main(String[] args) {
        /*
        B!r l!ste ve b!r set olusturunuz. Set !çer!s!nde var olan l!sten!n bütün elemanlarını kaldıran
b!r kod yazınız.
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(13);
        myList.add(13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);
        mySet.removeAll(myList);
        System.out.println("mySet = " + mySet);

        /*
        B!r l!stede tekrarlanan ögeler olup olmadıgını kontrol etmek !ç!n kodu yazınız.
         */
        Set<Integer> mySet1 = new HashSet<>(myList);
        System.out.println("mySet1 = " + mySet1);
        if(myList.size()>mySet1.size())
            System.out.println("Tekrarlanan öğeler var");
        else
            System.out.println("Tekrarlanan öğeler yok");
    }
}
