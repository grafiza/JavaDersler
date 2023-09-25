package KitaptanSorular;

import java.util.*;

public class Set01 {
    public static void main(String[] args) {
        /*
        Bir listede kaç farklı öğe olduğunu gösteren kodu yazınız.
            Örnek: {10, 31, 15, 7, 15, 7, 7} ==> 4
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(10);
        myList.add(31);
        myList.add(15);
        myList.add(7);
        myList.add(15);
        myList.add(7);
        myList.add(7);
        Set<Integer> newSet=new HashSet<>(myList);
        System.out.println(newSet.size());

        //Set ve Liste arasındaki ortak öğeleri yazdırmak için kod yazınız.

        List<Integer> myList1 = new ArrayList<>();
        myList1.add(10);
        myList1.add(31);
        myList1.add(15);
        myList1.add(7);
        myList1.add(13);
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(7);
        mySet.add(35);
        mySet.add(13);

        mySet.retainAll(myList1);
        System.out.println("mySet = " + mySet);

        //Bir String’ de kullanılan farklı karakterleri yazdırmak için kod yazınız.

        String s = "Mississippi";
        String[] arr = s.split("");
        List<String> characters = Arrays.asList(arr);

        Set<String> myStringSet=new HashSet<>(characters);
        System.out.println("myStringSet = " + myStringSet);

        //Bir liste ve bir set oluşturunuz. Set içerisinde var olan listenin bütün elemanlarını kaldıran
        //bir kod yazınız.

        List<Integer> myList2 = new ArrayList<>();
        myList2.add(10);
        myList2.add(31);
        myList2.add(15);
        myList2.add(7);
        myList2.add(13);
        Set<Integer> mySet2 = new HashSet<>();
        mySet2.add(10);
        mySet2.add(7);
        mySet2.add(35);
        mySet2.add(13);
        mySet2.removeAll(myList2);
        System.out.println(mySet2);
        //Bir listede tekrarlanan öğeler olup olmadığını kontrol etmek için kodu yazınız.
        if(mySet.size()<myList1.size())
            System.out.println("Tekrarlanan öğeler var");
        else
            System.out.println("Tekrarlanan öğeler yok");

    }
}
