package kutuphane;
public class Book {
    private String bookName;
    private String authorName;
    private String publisher;
    private int pageCount;
    private BookType type;

    public Book(){

    }
    public Book(String bookName, String authorName, String publisher, int pageCount, BookType type) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publisher = publisher;
        this.pageCount = pageCount;
        this.type = type;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public BookType getType() {
        return type;
    }

    public void setType(int i) {
        this.type = BookType.values()[i];
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookName='" + bookName + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publisher='" + publisher + '\'' +
                ", pageCount=" + pageCount +
                ", type='" + type + '\'' +
                '}';
    }
}
