package Practice05Arrays;

import Practice03.Switch01;

import java.util.Scanner;

public class HesapMakinesi {
    public static void main(String[] args) {
         /*
        Basit 4 islem yapan bir hesap makinesi kodlayınız
        Kullanıcıcn yapacagi islemi islem sembolu ile( +  -  /  *  ) secmesini isteyiniz
        Kullanıcının 2 sayi girmesini isteyiniz
        Girilen islem ve sayilara gore dogru sonucu ekrana yazdırınız
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("Yapacağınız işlemi seçiniz : (+,-,*,/)");
        char islem=scan.next().charAt(0);
        System.out.print("1. sayı : ");
        int sayi1=scan.nextInt();
        System.out.println();
        System.out.print("2. sayı : ");
        int sayi2=scan.nextInt();
        System.out.println();
        double sonuc=0;
        if(islem=='+'||islem=='-'||islem=='*'||islem=='/')
            hesapla(islem,sayi1,sayi2);
        else
            System.out.println("Hatalı Giriş");


        }
        public static void hesapla(char islem,int a,int b){
        double sonuc=0;
        switch (islem) {
            case '+':
                sonuc = a + b;
                break;
            case '-':
                sonuc = a - b;
                break;
            case '*':
                sonuc = a * b;
                break;
            case '/':
                sonuc = a / b;
                break;
        }
            System.out.println(a+" "+islem+" "+b+" = "+sonuc);

        }
        }


