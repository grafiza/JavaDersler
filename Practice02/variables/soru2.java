package Practice02.variables;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {
        /*
        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Adınız :");
        String ad=scan.nextLine();
        System.out.println("Soyadınız :");
        String soyad=scan.next();
        System.out.println("Yaşınız :");
        byte yas=scan.nextByte();
        System.out.println("Boy :");
        double boy=scan.nextDouble();
        System.out.println("Kilo :");
        double kilo=scan.nextDouble();
        System.out.println("Kaç ay devam edeceksiniz :");
        byte ay=scan.nextByte();
        System.out.println("---- TechProEd Spor Salonu Üyelik Bilgileri ----");
        System.out.println("Ad Soyad : "+ad+" "+soyad);
        System.out.println("Yaş : "+yas);
        System.out.println("Boy : "+boy);
        System.out.println("Kilo : "+kilo);
        System.out.println("Toplam Ücret : $"+ay*20);
    }
}
