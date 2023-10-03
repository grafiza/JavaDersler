package BookStoreApp;

public class Product {
    private static int counter=1;
    private int id;
    private String name;
    private double price;
    private int stock;

    public Product() {
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Product.counter = counter;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Product(String name, double price, int stock) {
        this.id = counter++;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }
}
