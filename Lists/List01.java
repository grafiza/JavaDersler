package Lists;

import java.util.*;

public class List01 {
    /* B!r l!stede kaç farklı öge oldugunu gösteren kodu yazınız.
     Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4*/
    public static void main(String[] args) {


        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);

        Set<Integer> mySet = new HashSet<>(myList);
        System.out.println("mySet.size() = " + mySet.size());

        /*
        Set ve L!ste arasındak! ortak ögeler! yazdırmak !ç!n kod yazınız.*/
        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);
        Set<Integer> mySet1 = new HashSet<>();
        mySet1.add(10);
        mySet1.add(7);
        mySet1.add(35);
        mySet1.add(13);
        mySet1.retainAll(myList1);
        System.out.println("mySet1 = " + mySet1);


        /*
        B!r Str!ng’ de kullanılan farklı karakterler! yazdırmak !ç!n kod yazınız.
Örnek: ‘M!ss!ss!pp!’ ´ M!sp
         */
        String s = "Mississippi";
        String arr[] = s.split("");
        List<String> characters = Arrays.asList(arr);
        Set<String> mySet11 = new HashSet<>(characters);
        System.out.println(mySet11);

    }
}
