package Practice03.Practice05;

import java.util.Scanner;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner scan=new Scanner(System.in);
        System.out.println("Kelime giriniz:");
        String word=scan.next();
        int t=0;
        for (int i = 0; i <word.length()-1 ; i++) {
            if(word.charAt(i)=='c')
                break;
           else if(word.charAt(i)=='a')
                t++;
        }
        System.out.println(t);
    }
}
