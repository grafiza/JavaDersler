package BookStoreApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NoteBookService implements ProductService {
    Scanner scan = new Scanner(System.in);
    List<NoteBook> noteBookList = new ArrayList<>();

    public NoteBookService() {
        NoteBook nb1 = new NoteBook("Kareli Defter", 45, 5, "Mopak", "100", "abc100");
        NoteBook nb2 = new NoteBook("Çizgili Defter", 40, 5, "Mopak", "80", "abc101");
        NoteBook nb3 = new NoteBook("Çizgisiz Defter", 35, 5, "Mopak", "40", "abc200");
        NoteBook nb4 = new NoteBook("Resim Defter1", 55, 5, "Mopak", "20", "abc300");
        noteBookList.add(nb1);
        noteBookList.add(nb2);
        noteBookList.add(nb3);
        noteBookList.add(nb4);
    }

    @Override
    public void processMenu() {

    }

    @Override
    public void listProducts() {
        System.out.printf("%-3s  %-20s %-20s %-20s %-15s %-10s %-10s\n", "id", "Defter Adı", "Markası", "Sayfa Sayısı", "Fiyat", "Stok", "Ürün Kodu");
        System.out.println("_".repeat(98));
        for (NoteBook nb : noteBookList) {

            System.out.printf("%-3s  %-20s %-20s %-20s %-15.0f %-10s %-10s\n", nb.getId(), nb.getName(), nb.getBrand(), nb.getSheet(), nb.getPrice(), nb.getStock(), nb.getCode());
        }
        System.out.println("_".repeat(98));
    }

    @Override
    public void addProduct() {

    }

    @Override
    public void deleteProduct() {

    }

    @Override
    public void filterProducts(String filter) {

    }
}
