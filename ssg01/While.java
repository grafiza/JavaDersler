package ssg01;

import java.util.Scanner;

public class While {
    public static void main(String[] args) {
        //Soru 1) 5 ile 10 arasindaki(5 ve  10 dahil) sayilari  ayni satirda yazdirin

        int sayi=5;
        while(sayi<11)
        {
            System.out.print(sayi);
            sayi++;
        }

        //  kullanicidan pozitif bir tamsayi alip
        //  while loop ile sayidan kucuk pozitif tamsayilari yazdiralim
        System.out.println();
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi1=scan.nextInt();
        while(sayi1>0){
            System.out.print(sayi1+" ");
            sayi1--;
        }
// kullanicidan istedigi kadar pozitif sayi girmesini isteyin
        // kullanicinin girdigi sayilarin toplami 500'u gecerse
        // artik yeter cok sayi girdin, toplam.... oldu yazsin


        int sayi2=0;
        int toplam=0;
        while(toplam<501){
            System.out.println("Lütfen pozitif bir sayı giriniz");
            sayi2=scan.nextInt();

            if(sayi2<0)
                System.out.println("pozitif girin");
            else
                toplam += sayi2;


        }
        System.out.println("Artık yeter. Toplam " + toplam + " oldu");


        // kullanicidan toplamak istedigi sayilari alin
        // ve kullanici 0'a basincaya kadar devam edin
        // kullanici 0'a bastiginda
        // girdigi tum sayilarin toplamini yazdirin
        System.out.println("Toplamak için sayı girin");
        int toplam2=0;
        int num= scan.nextInt();
        while(num>0){
            toplam2+=num;
            System.out.println("Toplamak için sayı girin");
            num= scan.nextInt();;

        }
        System.out.println(toplam2);
    }
}
