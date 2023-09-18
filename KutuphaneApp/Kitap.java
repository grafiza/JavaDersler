package KutuphaneApp;

import java.util.List;

public class Kitap {
    public String bookName;
    public String authorName;
    public String bookType;
    public Kitap(){};

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

    public String getBookType() {
        return bookType;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public Kitap(String bookName, String authorName, String bookType) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.bookType = bookType;
    }

    @Override
    public String toString() {
        return "Kitap Adı \t\t: " + bookName +
               "\nYazar Adı \t\t: " + authorName +
               "\nKitap Türü \t\t: " + bookType ;
    }
}
