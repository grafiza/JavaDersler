package Practice03.Practice05;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        // Kullanıcından sisteme bir sayi girmesini isteyiniz,
        // kullanıcının girdigi sayıdan baslayarak, 10'un katına gelene kadar ardısık yazdırınız
        // Not: While loop kullanınız
        // Örn: Sayı: 41
        //      Çıktı: 41, 42, 43, 44, 45, 46, 47, 48, 49

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();//baslangıc degeri
        do{
            System.out.println("sayi = " + sayi);
            sayi++;
        }while (sayi%10!=0);
    }
}
