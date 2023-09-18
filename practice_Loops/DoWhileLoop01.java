package practice_Loops;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        //ornek 1: 5(dahil) den 3(dahil) e kadar tamsayilari console'a yazdiriniz

        int a=5;
        do{
            System.out.println(a);
            a--;
        }while(a>=3);


        /*
            Kullanicidan bir tamsayi aliniz
            Tamsayi 100'den kucuk ise kullaniciya "Kaybettiniz!" mesaji vererek oyunu sonlandiriniz
            Tamsayi 100 ve 100'den buyuk ise "Kazandiniz!" mesaji vererek oyuna devam ettiriniz
         */

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Bir sayı giriniz");
            int sayi=input.nextInt();
            if(sayi>=100)
                System.out.println("Kazandınız");
            else {
                System.out.println("Kaybettiniz");
                break;
            }
        }while (true);
    }
}
