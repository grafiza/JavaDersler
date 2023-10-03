package BookStoreApp;

public class Book extends Product{
    private String author;
    private String publisher;
    private String isbn;
    public Book(){}



    public Book(String name, double price, int stock, String author, String publisher, String isbn) {
        super(name, price, stock);
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
