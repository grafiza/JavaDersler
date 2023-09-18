package Practice04;

import java.util.Scanner;

public class DoWhile {

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
        Scanner scan=new Scanner(System.in);

        int toplamPoz=0;
        int poz=0;
        int neg=0;
        do{
            System.out.println("Lütfen bir sayı giriniz:( Bitirmek için 0'a basınız");
            int sayi=scan.nextInt();

            if(sayi>0) {
                toplamPoz+=sayi;
                poz++;
            }
                else if(sayi<0) {
                System.out.println("negatif sayi kullanamazsiniz.");

            }
                else
                    break;


        }while(true);
        System.out.println(toplamPoz);
        System.out.println(poz);
    }
}
