package day07StringManipulation;

public class StringManipulation02 {
    //Example 1: Asagida fiyatlari verilen urunlerin toplam fiyatini bulunuz.
    //           String tv = "$456.99";   String laptop = "$875.99"; ==> 456.99 + 875.99 = 1332.98
    public static void main(String[] args) {
        String tv="$456.99";
        String laptop="$875.99";

        String newTv=tv.replace("$","");
        String newLaptop=laptop.replace("$","");

        Double totalPrice=Double.valueOf(newTv)+ Double.valueOf(newLaptop);
        System.out.println("totalPrice = " + totalPrice);
    }
}
