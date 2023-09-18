package Practice02.variables;

import java.util.Scanner;

public class Soru3 {
    public static void main(String[] args) {
        /*  Problem Tanımı
        Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
        a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz
        Örnek Ekran Çıktısı
        a sayısını giriniz: 5
        b sayısını giriniz: 3
        c sayısını giriniz: 1
        sonuç : 5.333333333333333
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("a :");
        double a=scan.nextInt();
        System.out.println("b :");
        double b=scan.nextInt();
        System.out.println("c :");
        double c=scan.nextInt();
        double sonuc=((a*a)-(b*b))/(3*c);
        System.out.println(sonuc);


    }
}
