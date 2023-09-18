package kutuphane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Kutuphane {

    private List<Book> books;

    public void setBooks(List<Book> books) {

        this.books = books;
    }

    public List<Book> getBooks() {

        return books;
    }

    public Kutuphane(){

    }



    public void printBooks(){
        for (Book b:this.books) {
            System.out.println(b.toString());
        }
    }
    public void deleteAllBooks(){
        this.books.clear();
        printBooks();
        System.out.println("Kayıtlı tüm kitaplar silindi");
    }
}
