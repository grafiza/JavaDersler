package Practice02.variables;

import java.util.Scanner;

public class Sorular {
    public static void main(String[] args) {
        //scanner 01
    /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
        Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?
        Örnek Ekran Çıktısı
         Bir işçi işi kaç günde bitirmektedir? 10
         Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
    */

        Scanner scan=new Scanner(System.in);
        System.out.println("Bir işçi işi kaç günde bitirmektedir?");
        int a=scan.nextInt();
        System.out.println("Toplam kaç işçi çalışacak?");
        int b=scan.nextInt();
        System.out.println("İşin bitme süresi "+a/b+" gündür.");

    }
}
