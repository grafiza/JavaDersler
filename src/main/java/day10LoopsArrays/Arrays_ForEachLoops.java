package day10LoopsArrays;

import java.util.Arrays;

public class Arrays_ForEachLoops {
    public static void main(String[] args) {
        //Example 2: Integer array olusturunuz, icine 6 tane eleman yerlestiriniz,
        //           bu elemanlarin en kucugu ile en buyugunun toplamini ekrana yazdiriniz

        int numbers[]=new int[6];
        numbers[0]=23;
        numbers[1]=13;
        numbers[2]=19;
        numbers[3]=34;
        numbers[4]=26;
        numbers[5]=25;

        Arrays.sort(numbers);
        System.out.println("En küçük : "+numbers[0]);
        System.out.println("En büyük : "+numbers[numbers.length-1]);

        // sort metodu sayısal data typp larını kucukten buyuğe sıralar
        // sort metodu string data larını alfabetik sıralar
        // (alfabetik sıralamaya )

        /* ---------------------- */

        // 2. yol



    }
}
