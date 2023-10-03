package BookStoreApp;

import java.util.Scanner;

public class MiniBookStore {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {
start();
    }
    public static void start(){
        ProductService bookService=new BookService();
        ProductService noteBookService=new NoteBookService();
        int select;
        do {
            System.out.println("1. Kitaplar");
            System.out.println("2. Defterler");
            System.out.println("0. Çıkış");
            System.out.println("Seçiminiz");
            select = scan.nextInt();
            scan.nextLine();
            ProductService service = select == 1 ? bookService : noteBookService;

            switch (select) {
                case 1:
                case 2:
                    service.processMenu();
                    break;
                case 0:
                    System.out.println("İyi günler");
                    break;
                default:
                    System.out.println("Hatalı Giriş");
                    break;
            }
        }while(select!=0);
    }
}
