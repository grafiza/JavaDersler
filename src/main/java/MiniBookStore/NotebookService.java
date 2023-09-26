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
        System.out.println("Ürün Kodu : ");
        String code = inp.nextLine();

        boolean isExists = false;
        for (Notebook noteBook : this.noteBookList) {
            if (noteBook.getCode().equals(code)) {
                System.out.println("Bu defter sistemde kayıtlı, lütfen ürün güncelleme yapınız.");//stok güncelleme:ÖDEV
                isExists = true;
                break;
            }
        }
        if (!isExists) {
            System.out.println("Defter Adı :");
            String name = inp.nextLine();
            System.out.println("Defter Markası :");
            String brand = inp.nextLine();
            System.out.println("Fiyatı:");
            String price = inp.nextLine();
            System.out.println("Sayfa Sayısı :");
            String sheet = inp.nextLine();
            System.out.println("Stok : ");
            int stock = inp.nextInt();
            inp.nextLine();

            Notebook newNotebook=new Notebook(name,price,stock,brand,sheet,code);
            this.noteBookList.add(newNotebook);
        }
        listProducts();
    }

    @Override
    public void deleteProduct() {
        boolean isFound = false;
        System.out.println("Defter id : ");
        int id = inp.nextInt();
        for (Notebook noteBook : this.noteBookList) {
            if (noteBook.getId() == id) {
                this.noteBookList.remove(noteBook);
                System.out.println("Ürün silindi.");
                isFound = true;
                break;
            } else {
                isFound = false;
            }
        }
        if (!isFound) {
            System.out.println("Ürün bulunamadı!");
        }
    }

    @Override
    public void filterProducts(String filter) {
        int counter = 0;
        for (Notebook notebook : this.noteBookList) {
            if (notebook.getName().equalsIgnoreCase(filter)) {

                System.out.printf("%-3s | %-20s | %-15s | %-15s | %-15s | %-15s | %-10s | \n"
                        ,notebook.getId(),notebook.getName(),notebook.getBrand(),notebook.getPrice(),notebook.getSheet(),notebook.getStock(),notebook.getCode()
                );
                counter++;
            } else if (notebook.getBrand().equalsIgnoreCase(filter)) {
                System.out.printf("%-3s | %-20s | %-15s | %-15s | %-15s | %-15s | %-10s | \n"
                        ,notebook.getId(),notebook.getName(),notebook.getBrand(),notebook.getPrice(),notebook.getSheet(),notebook.getStock(),notebook.getCode()
                );
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Eşleşen ürün bulunamadı!");
        }
    }

    @Override
    public void updateProducts() {
        int id;
        System.out.println("1. Adet Güncelleme");
        System.out.println("2. Fiyat Güncelleme");
        int secim = inp.nextInt();
        inp.nextLine();
        switch (secim) {
            case 1:
                System.out.println("Defter id : ");
                id = inp.nextInt();
                inp.nextLine();
                stokGuncelle(id);
                break;

            case 2:
                System.out.println("Defter id : ");
                id = inp.nextInt();
                inp.nextLine();
                fiyatGuncelle(id);
            default:
                System.out.println("Hatalı Giriş");
        }
    }

    private void fiyatGuncelle(int id) {
        boolean control = false;
        for (Notebook notebook : this.noteBookList) {
            if (notebook.getId() == id) {
                System.out.println("Yeni Fiyat:");
                String yeniFiyat = inp.nextLine();
                notebook.setPrice(yeniFiyat);
                System.out.println("Fiyat bilgisi güncellendi.");
                control = true;
                break;
            }
        }
        if (!control)
            System.out.println("Ürün Bulunamadı.");
    }

    private void stokGuncelle(int id) {
        boolean control = false;
        for (Notebook notebook : this.noteBookList) {
            if (notebook.getId() == id) {
                System.out.println("Yeni Stok:");
                int yeniStok = inp.nextInt();
                inp.nextLine();
                notebook.setStock(yeniStok);
                System.out.println("Stok bilgisi güncellendi.");
                control = true;
                break;
            }
        }
        if (!control)
            System.out.println("Ürün Bulunamadı.");
    }


}
