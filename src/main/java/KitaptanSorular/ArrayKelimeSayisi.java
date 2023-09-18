package KitaptanSorular;

import java.util.Scanner;

public class ArrayKelimeSayisi {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("bir cümle yazınız");
        String cumle=scan.nextLine();
        int kelimeSayi=cumle.split(" ").length;
        System.out.println(kelimeSayi);
    }
}
