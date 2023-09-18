package Practice02.variables;

import java.util.Scanner;

public class Soru7 {
    public static void main(String[] args) {
         /*Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
       "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        iki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor"
        iki kelimeyi de iceriyorsa karar ver buyuk mu yazdirayim, kucuk mu? yazdirin.
        en sinirlayici durum hangisi : iki kelimeyi icermesi
        en sinirlayici olmayan durum : ikisini icermemesi
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("metin :");
        String metin=scan.nextLine();
        if(metin.contains("büyük")&& metin.contains("küçük"))
            System.out.println("Karar ver");
        else if(metin.contains("büyük"))
            System.out.println(metin.toUpperCase());
        else if(metin.contains("küçük"))
            System.out.println(metin.toLowerCase());
        else
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");

    }
}
