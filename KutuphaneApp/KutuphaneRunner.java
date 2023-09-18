package KutuphaneApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KutuphaneRunner {



    public static void main(String[] args) {

        start();



    }

    private static void start() {
        Scanner scan=new Scanner(System.in);
        Kutuphane ktp=new Kutuphane();
        List<Kitap> kitaplar=new ArrayList<>();

        String select="e";
        do{
        Kitap kitap=new Kitap();
        System.out.println("Kitap Adı:");
        kitap.setBookName(scan.nextLine());
        System.out.println("Yazar Adı:");
        kitap.setAuthorName(scan.nextLine());
        System.out.println("Kitap Türü:");
        kitap.setBookType(scan.nextLine());
        kitaplar.add(kitap);
        ktp.setKitap(kitaplar);
        System.out.println("Devam mı?");
        select=scan.nextLine();
        }
        while (select.equals("e"));
        ktp.printBooks();
    }

}
