package BookStoreApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ProductService {
    Scanner scan = new Scanner(System.in);
    List<Book> bookList = new ArrayList<>();

    public BookService() {
        Book book1 = new Book("Fareler ve İnsanlar", 150, 15, "J.Steinbeck", "Penguin", "A111");
        Book book2 = new Book("Suç ve Ceza", 250, 25, "Dostoyevski", "Penguin", "A222");
        Book book3 = new Book("Sefiller", 170, 15, "V.Hugo", "Dream", "A333");
        this.bookList.add(book1);
        this.bookList.add(book2);
        this.bookList.add(book3);
    }

    @Override
    public void processMenu() {
        int secim;
        do {
            System.out.println("1. Kitapları Listele");
            System.out.println("2. Kitap Ekle");
            System.out.println("3. Kitap Sil");
            System.out.println("4. Yayınevine Göre Listele");
            System.out.println("0. Geri Dön");
            System.out.println("Seçiminiz:");
            secim = scan.nextInt();
            scan.nextLine();
        } while (secim != 0);
    }

    @Override
    public void listProducts() {
        System.out.printf("%-3s  %-20s %-20s %-20s %-15s %-10s\n", "id", "Kitap Adı", "Yazar", "Yayınevi", "Fiyat", "ISBN");
        System.out.println("_".repeat(88));
        for (Book book : bookList) {

            System.out.printf("%-3s  %-20s %-20s %-20s %-15.0f %-10s\n", book.getId(), book.getName(), book.getAuthor(), book.getPublisher(), book.getPrice(), book.getIsbn());
        }
        System.out.println("_".repeat(88));
    }

    @Override
    public void addProduct() {

        System.out.println("ISBN:");
        String isbn = scan.nextLine();
        boolean isExists = false;
        for (Book books : bookList) {
            if (books.getIsbn().contains(isbn)) {
                System.out.println("Bu kitap sisteme kayıtlı, lütfen güncelleme yapınız");
                isExists = true;
                break;
            }
        }
        if (!isExists) {
            Book newBook = new Book();
            System.out.println("Kitap Adı:");
            newBook.setName(scan.nextLine());
            System.out.println("Yazar Adı:");
            newBook.setPublisher(scan.nextLine());
            System.out.println("Yayınevi:");
            newBook.setPublisher(scan.nextLine());
            System.out.println("Fiyatı");
            newBook.setPrice(scan.nextDouble());
            scan.nextLine();
            this.bookList.add(newBook);
        }
        listProducts();
    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProducts(String filter) {

    }
}
