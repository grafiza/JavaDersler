package day11;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //Example 1: [0, 2, 3, 0, 12, 0] sifirlari en sona koyunuz  [2, 3, 12, 0, 0, 0]
        int dizi[]={0, 2, 3, 0, 12, 0};

        int dizi2[]=new int[dizi.length];
        int i=0;
        for (int w:dizi
             ) {
            if(w!=0){
                dizi2[i]=w;
                i++;
            }
        }
        System.out.println(Arrays.toString(dizi2));

        /*----------------------------------*/

        int a [][] = new int[3][2];//[[0,0],[0,0],[0,0]]

        //Multidimensional Array lere nasil eleman eklenir?
        a[0][0]=5;
        a[1][1]=45;
        a[2][0]=123;
        a[0][1]=12;
        a[1][0]=81;
        System.out.println(Arrays.deepToString(a));

        String students [][] = { {"Ali","Kemal"},{"Cemal"},{"Ayhan","Beyhan","Seyhan"},{"Ceyhan","Burhan"} };

        //Example 1: Yukaridaki students array'inde toplam kac isim oldugunu bulunuz.
        int toplam=0;
        for (String[]w:students) {
            toplam+=w.length;
        }
        System.out.println(toplam);

        //Example 2: Yukaridaki students array'inde icinde "m" olan isimleri console'a yazdiriniz
        for (String[] w:students) {
            for(String k:w){
                if(k.contains("m"))
                {
                    System.out.println(k);
                }
            }
        }

    }
}
