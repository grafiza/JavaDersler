package Sorular;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */
public class Kutuphane {
    public static void main(String[] args) {
        ArrayList<String> kitaplar=new ArrayList<>();
        Scanner scan=new Scanner(System.in);
        boolean isAgain;
        do {

            System.out.println("      KÜTÜPHANE PROGRAMI ");
            System.out.println("-".repeat(30));
            System.out.println("1. Kitapları Listele");
            System.out.println("2. Kitap ekle");
            System.out.println("3. Kitap sil");
            System.out.println("4. Verileri Sil");
            System.out.println("0. Çıkış");
            System.out.println("-".repeat(30));
            int select=scan.nextInt();
            switch (select){
                case 1:
                    listele(kitaplar);
                    isAgain=true;
                    break;
                case 2:
                    kitapEkle(kitaplar);
                    isAgain=true;
                    break;
                case 3:
                    kitapSil(kitaplar);
                    isAgain=true;
                    break;
                case 4:
                    kutuphaneSil(kitaplar);
                    isAgain=true;
                    break;
                case 0:
                    isAgain=false;
                    break;
                default:
                    System.out.println("Hatalı Giriş");
                    isAgain=false;

            }


        }
        while (isAgain);
    }

    private static void kutuphaneSil(ArrayList<String> books) {
        books.clear();
        System.out.println(books);
    }

    private static void kitapSil(ArrayList<String> books) {
        Scanner scan=new Scanner(System.in);


            int i=0;
            for (String w:books) {
                System.out.println(i+". "+w);
                i++;
            }
            System.out.print("SilincekKitap Adı : (Sayı Giriniz)");

            books.remove(scan.nextInt());

    }

    private static void kitapEkle(ArrayList<String>books) {

        Scanner scan=new Scanner(System.in);


            System.out.print("Kitap Adı : ");
            books.add(scan.nextLine());


    }

    private static void listele(ArrayList<String>books) {
        Collections.sort(books);
        System.out.println(books);
    }

}
