package MiniBookStore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//2-b:Defterlerle yapılabilecek işlemler
public class NotebookService implements ProductService{
    public Scanner inp = new Scanner(System.in);

    //3-kitapları saklamak için list oluşturalım
    public List<Notebook> noteBookList = new ArrayList<>();

    //4-sistemde başlangıçta mevcut olan kitaplar olsun:test için
    public NotebookService() {
        Notebook noteBook1 = new Notebook("Kareli","50",20,"Mopak","120","nb001");
        Notebook noteBook2 = new Notebook("Çizgili","50",10,"Mopak","120","nb002");
        Notebook noteBook3 = new Notebook("Çizgisiz","30",15,"Mopak","80","nb003");
        Notebook noteBook4 = new Notebook("Resim","60",10,"Mopak","40","nb004");
        this.noteBookList.add(noteBook1);
        this.noteBookList.add(noteBook2);
        this.noteBookList.add(noteBook3);
        this.noteBookList.add(noteBook4);
    }
    @Override
    public void processMenu() {
        int choice;
        do {
            System.out.println("-".repeat(113));

            System.out.println("1-Defterleri listele");
            System.out.println("2-Defter ekle");
            System.out.println("3-Defteri sil");
            System.out.println("4-Güncelle");
            System.out.println("5-Türüne göre filtrele");
            System.out.println("Seçiminiz: ");
            System.out.println("-".repeat(113));

            choice = inp.nextInt();
            inp.nextLine();
            switch (choice) {
                case 1:
                    listProducts();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    deleteProduct();
                    break;
                case 4:
                    updateProducts();
                    break;
                case 5:
                    System.out.println("Yayınevi :");
                    String publisher = inp.nextLine();
                    filterProducts(publisher);
                    break;
                case 0:
                    System.out.println("Ana menüye yönlendiriliyorsunuz.");
                    break;
                default:
                    System.out.println("Hatalı giriş!");
                    break;
            }
        } while (choice != 0);
    }

    @Override
    public void listProducts() {
        System.out.println("-".repeat(113));
        System.out.printf("%-3s | %-20s | %-15s | %-15s | %-15s | %-15s | %-10s | \n", "ID", "Defter Türü", "Markası",
                "Fiyatı", "Sayfa Sayısı","Stok", "Ürün kodu");
        System.out.println("-".repeat(113));

        this.noteBookList.forEach(notebook -> System.out.printf("%-3s | %-20s | %-15s | %-15s | %-15s | %-15s | %-10s | \n"
                ,notebook.getId(),notebook.getName(),notebook.getBrand(),notebook.getPrice(),notebook.getSheet(),notebook.getStock(),notebook.getCode()
        ));
        System.out.println("-".repeat(113));

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

    @Override
    public void updateProducts() {

    }
}
