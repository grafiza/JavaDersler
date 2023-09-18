package day12ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InterViewSorusu {
    public static void main(String[] args) {
        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10
        List<Integer> a=new ArrayList<>();
        a.add(12);
        a.add(23);
        a.add(10);
        a.add(25);
        Collections.sort(a);
        int minDif=a.get(1)-a.get(0);
        for (int i = 1; i <a.size() ; i++) {
            minDif=Math.min(minDif,a.get(i)-a.get(i-1));

        }
        System.out.println(minDif);
        for (int i = 1; i <a.size() ; i++) {
            if((a.get(i)-a.get(i-1)==minDif))
            System.out.println(a.get(i) + " ve "+a.get(i-1));
        }




    }
}
