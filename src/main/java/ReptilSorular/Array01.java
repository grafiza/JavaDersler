package ReptilSorular;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array01 {
    //Karışık verilen sayıları  ve kelimeleri  sıralayan   Java kodunun yazınız.
    public static void main(String[] args) {
        int[] dizi={1232, 1134,2345,1022};
        int [] list1=new int [dizi.length];

        int gecici=0;
        for(int i = 0; i < dizi.length-1; i++) {
            for (int j = i + 1; j < dizi.length; j++) {
                if (dizi[j] < dizi[i]) {
                    gecici = dizi[i];
                    dizi[i] = dizi[j];
                    dizi[j] = gecici;
                }
            }
        }
        System.out.println(Arrays.toString(dizi));

        String [] s={"Java", "Python", "PHP", "C#","C Programming", "C++"};
        String gecisiString;
        for (int i=0;i<s.length-1;i++) {
            for (int j = i + 1; j < s.length; j++) {
                if (s[j].charAt(0) < s[i].charAt(0)) {
                    gecisiString = s[j];
                    s[j] = s[i];
                    s[i] = gecisiString;
                }
            }
        }
        System.out.println(Arrays.toString(s));


        List<String> myList=new ArrayList<>();
        myList.add("Siyah");
        myList.add("mavi");
        myList.add("kırmızı");
        myList.add("beyaz");
        for (String w:myList             ) {
            System.out.println(w);
        }
        myList.add(0,"pembe");
        myList.add(3,"yesil");
        System.out.println(myList);
        //myList.set(4,"")

    }
}
