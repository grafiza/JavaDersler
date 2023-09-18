package ssg01;

import java.util.Scanner;

public class Soru02 {
    public static void main(String[] args) {
        /*
        Soru 5) Kullanicidan 100'den kucuk bir tamsayi isteyin.
        1'den baslayarak girilen sayiya kadar(istenen sayi dahil) 3'un kati olan sayilari yazdirin.
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("100'den küçük bir sayı giriniz:");
        int num= scan.nextInt();
        for (int i = 0; i <=num ; i++) {
            if(i%3==0)
                System.out.println(i);
        }
/*
        soru 3) belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız.
        */

            for (int j = 1; j <=10 ; j++) {
                System.out.println(6+" x "+j+" = "+6*j);

            }

    }
}
