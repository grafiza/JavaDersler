package ssg01;

import java.util.Scanner;

public class faktoriyel {
    // kullanicidan 10'dan kucuk bir tam sayi isteyin ve girilen sayinin faktoryelini bulun.
    public static void main(String[] args) {
        int sayi=7;

        for (int i = 7; i >1 ; i--) {
                sayi*=i-1;
        }
        System.out.println(sayi);

        /*Soru 7) Interview Question Kullanicidan 100'den kucuk bir tamsayi isteyin.
         1'den baslayarak girilen sayiya kadar tum sayilari yazdirin. Ancak;
         - Sayi 3'un kati ise sayi yerine "Java" yazdirin.
         - Sayi 5'in kati ise sayi yerine "Guzeldir" yazdirin.
         - Sayi hem 3'un hem 5'in kati ise sayi yerine "Java Guzeldir"yazdirin.
     */
        Scanner scan=new Scanner(System.in);
        System.out.println("100'den küçük bir sayı giriniz:");
        int num= scan.nextInt();
        if(num<100){
            for (int i = 1; i <=num ; i++) {
                if(i%3==0 && i%5==0)
                System.out.println("Java Güzeldir");
                else if(i%5==0)
                    System.out.println("Guzeldir ");
                else if(i%3==0)
                    System.out.println("Java ");
                else
                    System.out.println(i+" ");
            }
        }
    }
}
