package Practice05Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        arr[3][2] luk bir mdarray olusturun
        Arrayın elemanlarını kullanıcıdan alın
        daha sonra bu mda 'yi, her bir elemanı iç array elemanlarının toplamına esıt olan tek boyutlu
        bir array haline getirin
        ör-->int [][] arr={{3,4},{1,2},{8,7}} ----> {7,3,15}
         */

        int [][] arr =new int[3][2];
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <3 ; i++) {
            for (int j = 0; j <2 ; j++) {
                System.out.println("Lütfen bir sayı giriniz");
                arr[i][j]=scan.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
        int [] newArr=new int[arr.length];
        System.out.println(arr.length);
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                newArr[i]+=arr[i][j];
            }
        }
        System.out.println(Arrays.toString(newArr));
    }
}
