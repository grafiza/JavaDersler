package Practice03.Practice05;

import java.util.Scanner;

public class DoWhileLoop02 {
    public static void main(String[] args) {
        /*
          Kullanicidan toplanmak uzere pozitif tamsayilar isteyin
          Kullaniciya bitirmek istediginde 0'a basmasini soyleyin

          kullanici bitirmek istediginde
          toplam kac adet pozitif tam sayi girdigini
          ve bunlarin toplaminin kac oldugunu yazdirin

          Kullanici negatif sayi girerse
          "negatif sayi kullanamazsiniz " yazdirin
          bu negatif sayiyi sayi adedine ve toplama eklemeyin
         */


        Scanner scan = new Scanner(System.in);
        int sayi=0;
        int sayac=0;
        int toplam=0;
        do{
            System.out.println("Lütfen pozitif bir sayı giriniz\n Bitirmek için 0 girin");
            sayi=scan.nextInt();
            if(sayi>0) {
                toplam += sayi;
                sayac++;
            }
            else
                System.out.println("negatif sayi kullanamazsiniz");
        }while (sayi!=0);
        System.out.println("toplam = " + toplam);
        System.out.println("sayac = " + sayac);
    }
}
