package Practice04;

import java.util.Scanner;

public class ForLoops02 {
    public static void main(String[] args) {
        /*
            Kullanıcıdan sisteme satır sayısını girmesini isteyiniz.
            ve ardından yıldız işaretini kullanarak bir dik üçgen çizin

            Satır sayısı = 4 ==>      *
                                      * *
                                      * * *
                                      * * * *
            */

        Scanner scan=new Scanner(System.in);
        System.out.println("Satır Sayısını Giriniz:");
        int line=scan.nextInt();
            for (int i = 1; i<=line ; i++) {
            for (int j = 0; j <i ; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
