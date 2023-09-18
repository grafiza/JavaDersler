package KitaptanSorular;

import java.util.ArrayList;
import java.util.List;

public class MdArraysAyniIndeksliElemanlarinToplami {
    public static void main(String[] args) {
        // aşağıdaki md array'in iç array lerinde aynı indekse sahip elemanların toplamını ekrana yazdıran programı yazınız
        // arr1={{1,2},{3,4,5},{6}}
        // arr2={{7,8,9},{10,11},{12}}
        
        int[][]arr1={{1,2},{3,4,5},{6}};
        int[][]arr2={{7,8,9},{10,11},{12}};
        System.out.println(arr1.length+" "+arr2.length);
        System.out.println(arr1.length+" "+arr2.length);
        List<Integer> toplamDizisi=new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            int min=Math.min(arr1[i].length,arr2[i].length);
            for (int j = 0; j <min ; j++) {
                toplamDizisi.add(arr1[i][j]+arr2[i][j]);
            }
            
        }
        System.out.println(toplamDizisi);
    }
}
