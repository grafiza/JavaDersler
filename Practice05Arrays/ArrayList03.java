package Practice05Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        // Dizinin tüm elemanlarının çarpımı
        int[][] arr ={{1,2,3},{4,5,6}};
        int carpim=1;
        for (int i = 0; i < arr.length ; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                carpim*=arr[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr));
        System.out.println("Dizinin tüm elemanlarının çarpımı "+carpim);

        //---------------------
        System.out.println("--------------------\n");


        // Dizinin son elemanlarının çarpımı
        int[][] arr1 ={{1,2,3},{4,5},{6}};
        int carpim1=1;
        for (int i = 0; i < arr1.length ; i++) {
            for (int j = arr1[i].length-1; j < arr1[i].length; j++) {
                carpim1*=arr1[i][j];
            }
        }
        System.out.println(Arrays.deepToString(arr1));
        System.out.println("Dizinin son elemanlarının çarpımı :"+carpim1);

        //---------------------
        System.out.println("--------------------\n");

        // İç array'lerinde aynı indekse sahip olan elemanların toplamını ekrana yazdır.
        // arr2={{1,2},{3,4,5}} ve arr3={{7,8,9},{10,11},{12}}

        int[][] arr2={{1,2},{3,4,5}};
        int[][] arr3={{7,8,9},{10,11},{12}};
        int toplam=0;
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j <arr3.length; j++) {
                System.out.println(arr2[i][j]);
            }

        }
    }
}
