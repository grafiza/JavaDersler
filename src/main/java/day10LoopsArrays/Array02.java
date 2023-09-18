package day10LoopsArrays;

import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {
        int a[]={1,2,3,4};
        int b[]=new int[4];
        for (int i = a.length-1; i >=0 ; i--) {
            if(i==0)
                b[b.length-1]=a[i];
            else
                b[i-1]=a[i];

        }
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));

        int[]arr={1,22,3,5,-6};
        int y=Arrays.binarySearch(arr,3);
        System.out.println(y);
    }
}
