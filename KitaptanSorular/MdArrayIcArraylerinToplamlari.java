package KitaptanSorular;

import java.util.Arrays;

public class MdArrayIcArraylerinToplamlari {
    public static void main(String[] args) {
        int[][] arr1= {{1,2,3},{4,5},{6,7,8,9}};
        int[]arr2=new int[arr1.length];
        int a=0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                arr2[a]+=arr1[i][j];
            }
a++;
        }
        System.out.println(Arrays.toString(arr2));
    }
}
