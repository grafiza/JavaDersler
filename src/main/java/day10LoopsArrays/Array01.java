package day10LoopsArrays;

import javax.naming.PartialResultException;
import java.util.Arrays;

public class Array01 {
    public static void main(String[] args) {
        String stdNames[] = new String[5];
        stdNames[0] = "zafer";
        stdNames[1] = "selo";
        stdNames[2] = "tevfik";
        stdNames[3] = "hasan";
        stdNames[4] = "basri";
        System.out.println(Arrays.toString(stdNames));
        System.out.println(stdNames[0]);

        //Example 1: String array olusturun, icine 5 tane eleman ekleyin, tum elemanlarin
        //           icerdigi karakter sayilari toplamini ekrana yazdirin.

int top=0;
//1. yol
//        for (int i = 0; i <stdNames.length ; i++) { //buradaki length variable
//            top+=stdNames[i].length();
//       }
//        System.out.println("toplam = " + top);
//  }
        // 2. yol
        int toplam = 0;
        for (String w : stdNames) {
            toplam =toplam+ w.length();
        }
        System.out.println("toplam = " + toplam);
    }
}
