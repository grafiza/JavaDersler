package BookStoreApp;

public interface ProductService {
    void processMenu();
    void listProducts();
    void addProduct();
    void deleteProduct();
    void filterProducts(String filter);
}
