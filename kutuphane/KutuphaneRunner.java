package kutuphane;

import com.sun.jdi.BooleanValue;

import java.sql.SQLOutput;
import java.sql.Savepoint;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class KutuphaneRunner {
    public static void main(String[] args) {
        /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */

        Kutuphane lib = new Kutuphane();
        List<Book> books = new ArrayList<>();
        String sayac = "H";
        do {
            Book book = new Book();
            Scanner scan = new Scanner(System.in);
            System.out.println();
            System.out.println("Kitap adını giriniz");
            book.setBookName(scan.nextLine());
            System.out.println("Yazar adını giriniz");
            book.setAuthorName(scan.nextLine());
            System.out.println("Yayıncı adını giriniz");
            book.setPublisher(scan.nextLine());
            System.out.println("Sayfa sayısını giriniz");
            book.setPageCount(scan.nextInt());
            System.out.println("Kitap tipini seçiniz. İstediğiniz tipin numarasını giriniz" +
                    "\n1. Roman\n2. Hikaye\n3. Öykü\n4. Deneme" +
                    "\n5. Distopik/" +
                    "\n6. Eğitim\n7. Tanımsız");
            book.setType((scan.nextInt() - 1));
            books.add(book);
            System.out.println("Yeni kitabınız eklendi.");
            System.out.println("Çıkmak için (E) yeni kitap tanımlamak için (H) giriniz");
            sayac = scan.next().toUpperCase();
        } while (!sayac.equals("E"));
        lib.setBooks(books);
        lib.printBooks();
        Scanner in = new Scanner(System.in);
        System.out.println("Kitapları Silmek istermisiniz evet(E) / hayır(H)");
        if(in.next().equalsIgnoreCase("e")){
            lib.deleteAllBooks();
            System.out.println("Kütüphanedeki kitap sayısı = " + lib.getBooks().size());
        }else{
            System.out.println("Kitapları listelemek istermisiniz evet(E) / hayır(H)");
            if(in.next().equalsIgnoreCase("e")){
                lib.printBooks();
            }
        }


    }
}
