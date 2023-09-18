package day12ArrayLists;

import java.util.ArrayList;

public class ArrayLists01 {
    public static void main(String[] args) {
        ArrayList < Integer > ages = new ArrayList<>();

        //ArrayListlere eleman nasil eklenir?
        ages.add(9);
        ages.add(12);
        ages.add(10);
        ages.add(1,656);
        ages.add(3,777);
        ages.add(888);

        //ArrayListlere coklu eleman nasil eklenir?
        ArrayList < Integer > newAges = new ArrayList<>();
        newAges.add(1);
        newAges.add(2);
        newAges.add(3);
        System.out.println(newAges);


        ages.addAll(newAges);
        ages.addAll(0,newAges);

        System.out.println(ages);//[1, 2, 3, 9, 656, 12, 777, 10, 888, 1, 2, 3]

        //Örnek 1: Bir Integer ArrayList oluşturun ve tek olanları 11 olarak değiştirin

        ArrayList <Integer> newArrayList=new ArrayList<>();
        newArrayList.add(3);
        newArrayList.add(6);
        newArrayList.add(9);
        newArrayList.add(12);
        newArrayList.add(15);
        newArrayList.add(18);
        newArrayList.add(21);
        newArrayList.add(24);
        System.out.println(newArrayList);

        for (Integer w:newArrayList) {
            if(w%2==1)
               newArrayList.set(newArrayList.indexOf(w),11);
        }
        System.out.println(newArrayList);
    }
}
