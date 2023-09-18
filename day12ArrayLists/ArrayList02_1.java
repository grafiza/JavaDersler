package day12ArrayLists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayList02_1 {
    public static void main(String[] args) {
        List<Character> word=new ArrayList<>();
        word.add('J');
        word.add('a');
        word.add('v');
        word.add('a');
        word.add('v');

        List<Character> b=new ArrayList<>();
        for (Character w:word) {
            if(!b.contains(w))
                b.add(w);
        }
        System.out.println(b);

        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        List<String> x=new ArrayList<>();
        x.add("Ankara");
        x.add("Çorum");
        x.add("Rize");
        x.add("İstanbul");
        for (int i = 0; i <x.size() ; i++) {
            if(x.get(i).contains("a")){
                x.remove(i);
                i--;
            }
        }
        System.out.println(x);


        //Example : Bir tane Integer List olusturunuz
        //           Bu List'te birbirine en yakin iki tamsayiyi yaziniz
        //           [12, 23, 10, 19] ==> 12 and 10


        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(23);
        nums.add(15);
        nums.add(9);
        Collections.sort(nums);

        int fark=nums.get(1)-nums.get(0);
        for (int i = 1; i <nums.size() ; i++) {
            fark=Math.min(nums.get(i)-nums.get(i-1),fark);

        }
        System.out.println(fark);
        for (int i = 1; i <nums.size() ; i++) {
            if((nums.get(i)-nums.get(i-1))==fark){
                System.out.println(nums.get(i)+" "+nums.get(i-1));
            }
        }

    }
}
