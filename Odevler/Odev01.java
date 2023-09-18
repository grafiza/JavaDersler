package Odevler;

import Static_OOP.InstanceBlock;

import java.util.HashMap;
import java.util.Map;

public class Odev01 {
    public static void main(String[] args) {
        //Verilen bir String'de hangi harfin kac defa kullanildigini veren method olusturunuz.
        //"Hello Henry!" ==> H=2, e=2, l=2, o=1, n=1, r=1, y=1

        String s="Hello Henry!";
        String dizi[]=s.replaceAll("\\p{Punct}","").replace(" ","").split("");
        Map<String, Integer> mapList=new HashMap<>();
        for (String w:dizi             ) {
            Integer numOfWords=mapList.get(w);
            if(numOfWords==null)
                mapList.put(w,1);
            else
                mapList.put(w,numOfWords+1);
        }
        System.out.println(mapList);
    }
}
