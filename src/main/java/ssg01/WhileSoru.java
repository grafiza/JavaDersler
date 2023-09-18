package ssg01;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class WhileSoru {
    public static void main(String[] args) {

        String[]arr=new String[4];
        arr[1]="das";
        // bilgisayara 1 ile 100 arasinda bir sayi tutturun
        // kullanicidan bu sayiyi tahmin etmesini isteyin
        // girilen her tahminde sayiyi buyut veya kucult diye kullaniciya yol gosterin
        // kullanici sayiyi buldugunda kac tahminde sayiyi buldugunu kullaniciya yazdirin
        // Random rnd=new Random();
        // int sayi=rnd.nextInt(100);  // burasi 100'den kucuk rastgele bir sayi olusturur
        //kullaniciya 5 tahmin hakkı verin bulursa tebrik edin bulamazsa exit atip tekrar oynamasini isteyin

       Scanner scan=new Scanner(System.in);
       Random rnd=new Random();
       int rasgeleSayi= rnd.nextInt(100);

       int tahmin=-1;
       int tahminSayisi=0;
       while(tahminSayisi<5){
           System.out.println(tahminSayisi+1+". tahmin. Sayıyı tahmin edin:");
           tahmin=scan.nextInt();
           if(tahmin>100 || tahmin<0)
               System.out.println("1-100 arasında giriniz");
           else if(tahmin>rasgeleSayi)
               System.out.println("Aşağı");
           else if(tahmin<rasgeleSayi)
               System.out.println("Yukarı");
           else {
               tahminSayisi++;
               break;
           }
           tahminSayisi++;
       }
       if(tahminSayisi==5)
           System.out.println("bilemediniz, sayı:"+rasgeleSayi+". tekrar deneyin");
        else
           System.out.println("Tebrikler ! "+ tahminSayisi +". denemede bildiniz");

    }
}
