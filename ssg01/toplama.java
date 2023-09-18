package ssg01;

import java.util.Random;
import java.util.Scanner;

public class toplama {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        //int toplam=0;
        //do{
        //System.out.println("Lütfen bir sayı giriniz: (Çıkmak için 0'a basınız) ");
        //toplam+=scan.nextInt();}
        //while(toplam!=0);
        //System.out.println(toplam);

        Random rnd=new Random();
        int sayi=rnd.nextInt(100);
        int tahminSayisi=0;
        int kullaniciSayisi=-1;
        while(kullaniciSayisi!=sayi){
            System.out.println("bir sayı:");
            kullaniciSayisi=scan.nextInt();
            if(kullaniciSayisi<sayi)
                System.out.println();

        }
    }
}
