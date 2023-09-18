package KitaptanSorular;

import java.sql.SQLOutput;

public class ForLoopSoru30 {
    public static void main(String[] args) {
        /*
        Her girdi satırı, tek bosluklarla ayrılmıs bir veya birkaç sözcük içerir. Sözcükler degismeden,
her giris satırındaki sözcüklerin sırasını tersine çevirmek için kod yazınız.
Çıktınızın satırlarında sonunda veya basında bosluk olmamalıdır.
Örnek; Kemal Can Kuzu, Kuzu Can Kemal'e dönüsecektir.
         */


        String str="Kemal Can Kuzu";
        String [] arr=str.split(" ");
        for (int i = arr.length-1; i >=0 ; i--) {
            if(i==0)
                System.out.print(arr[i]);
            else
                System.out.print(arr[i]+" ");
        }
/*
Her girdi satırı, tek bosluklarla ayrılmıs bir veya birkaç sözcük içerir. Her giris satırındaki ilk
ve son sözcükler dısındaki sözcüklerin sırasını tersine çevirip sözcükleri degistirmeden
kodu yazınız.
Çıktınızın satırlarında sonunda veya basında bosluk olmamalıdır.
Örnek; Kemal Can Tan Han Kuzu, Kemal Han Tan Can Kuzu'ya dönüsecektir.
    */
        System.out.println();
        String str1="Kemal Can Tan Han Kuzu";
        String [] arr1=str1.split(" ");
        System.out.print(arr1[0]+" ");
        for (int i = arr1.length-2; i >=1 ; i--) {
            System.out.print(arr1[i]+" ");
        }
        System.out.print(arr1[arr1.length-1]);
        
    }
 
}
