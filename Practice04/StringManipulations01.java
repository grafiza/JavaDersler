package Practice04;

import java.util.Scanner;

public class StringManipulations01 {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir kelime sisteme girmesini isteyiniz.
            kelimede ilk c harfi rastlanılana kadar a harflerinin sayısını yazdırınız.
           */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir kelime yazınız:");
        String word=scan.next().toLowerCase();
        String newWord="";
        int sayac=0;
        for (int i = 0; i <word.length()-1 ; i++) {
            if(word.charAt(i)=='a'){
                sayac++;
            }
            else if(word.charAt(i)=='c'){
                break;
            }
        }
        System.out.println("Toplam a sayısı : "+sayac);
    }
}
