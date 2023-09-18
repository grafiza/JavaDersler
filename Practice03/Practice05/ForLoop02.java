package Practice03.Practice05;

import java.util.Scanner;

public class ForLoop02 {
    public static void main(String[] args) {
        /*
         Kullanıcıdan sisteme 5 adet sayi girmesini isteyiniz
         Bu sayılardan birler basamagı 7 veya 9 olanlar hariç diğerlerinin toplamını bulunuz
        */
        int sayi=0, toplam=0;
        Scanner scan=new Scanner(System.in);
        for (int i = 0; i <5 ; i++) {
            System.out.println(i+1+". sayı");
            sayi=scan.nextInt();
            if(sayi%10==7 || sayi%10==9)
                continue;

                toplam+=sayi;


        }
        System.out.println("toplam = " + toplam);
    }
}
