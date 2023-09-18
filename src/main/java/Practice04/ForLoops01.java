package Practice04;

import java.util.Scanner;

public class ForLoops01 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz

      */
        Scanner scan=new Scanner(System.in);
      int toplam=0;

        for (int i = 0; i <5 ; i++) {
            System.out.println("Lütfen "+(i+1)+". sayıyı giriniz:");
            int sayi=scan.nextInt();
            if (sayi%10==7 || sayi%10==9) {}
            else{
                toplam += sayi;
            }
        }
        System.out.println("toplam : "+toplam);
    }
}
