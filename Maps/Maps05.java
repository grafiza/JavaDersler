package Maps;

import java.util.*;

public class Maps05 {
    public static void main(String[] args) {
        /*
        Bir listede tekrarlanan elemanların kontrol edilmesi
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);

        Map<Integer, Integer> myMapList = new HashMap<>();

        for (Integer w : myList) {
            Integer numOfNumbers = myMapList.get(w);
            if (numOfNumbers == null)
                myMapList.put(w, 1);
            else
                myMapList.put(w, numOfNumbers + 1);
        }
        System.out.println("myMapList = " + myMapList);
        Collection<Integer> myValues=myMapList.values();
        int sum=0;
        for (Integer w:myValues             ) {
            if(w>1)
                sum++;
        }
        System.out.println("Tekrarlanan öğe sayısı "+sum+" adettir.");
    }
}
