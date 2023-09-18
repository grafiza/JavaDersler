package day11;

import java.util.Arrays;

public class Md01 {
    public static void main(String[] args) {
        //Example : Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = {{5, 4}, {2, 3, 2}}; // ==> { 5, 4, 2, 3, 2 }
        int uzunluk=0;
        for (int[]w:numbers){
            uzunluk+=w.length;
        }
        int newArray[]=new int[uzunluk];
        int i=0;
        for (int[]w:numbers) {
            for (int k : w) {
                newArray[i] = k;
                i++;
            }
        }
        System.out.println(Arrays.toString(newArray));



        //Example : Bir integer multidimensional array'deki en
        // kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = {{15, 4}, {12, 43, 21}}; // ==> 4 + 43 = 47
        int minimum=ages[0][0];
        int maximum=ages[0][0];
        for (int[]w:ages){
            for(int k:w){
                minimum=Math.min(minimum,k);
                maximum=Math.max(maximum,k);
            }
        }
        System.out.println("minimum = " + minimum);
        System.out.println("maximum = " + maximum);
        System.out.println("Toplam :"+(minimum+maximum));
    }
}
