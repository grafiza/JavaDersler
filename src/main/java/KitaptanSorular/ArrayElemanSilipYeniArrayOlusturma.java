package KitaptanSorular;

import java.util.Arrays;

public class ArrayElemanSilipYeniArrayOlusturma {
    // verilen array'den istenen değeri kaldırıp kalanları yeni array'e atama
    private static void main(String[] args) {


        String[] str = {"a", "b", "c", "d", "e", "a", "c", "r", "x", "w", "a"};
        int sayac=0;
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals("a"))
                sayac++;
        }

        String yeniDizi[]=new String[str.length-sayac];

        int j=0;
        for (int i = 0; i < str.length; i++) {

                if(!str[i].equals("a")) {
                    yeniDizi[j] = str[i];
                    j++;
                }

        }
        System.out.println(Arrays.toString(str));
        System.out.println(Arrays.toString(yeniDizi));

    }
}
