package day11;

import java.lang.reflect.Array;

public class Arrays01 {
    public static void main(String[] args) {
        String students [][] = { {"Ali","Ahmet"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Kayahan"} };
        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int sum=0;
        for (String[] w:students
             ) {
            sum+=w.length;
        }
        System.out.println("sum = " + sum);
    }
}
