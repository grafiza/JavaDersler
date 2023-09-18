package Static_OOP;

import java.time.LocalDate;

public class StaticBlog01 {
    public static int price;
    static {
        LocalDate tarih=LocalDate.now();
        if(tarih.getMonthValue()==7)
            price=1000;
        else
            price=900;
    }

    public static void main(String[] args) {
        System.out.println(price);
    }
}
