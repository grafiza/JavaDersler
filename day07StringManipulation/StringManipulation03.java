package day07StringManipulation;

public class StringManipulation03 {
    //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
    //           "Ali Can" ==> AC
    public static void main(String[] args) {
        //Example 2: Verilen ismin ilk isiminin ilk harfini ve soy isminin ilk harfini ekrana yazdiriniz.
        //           "   ali cAN   " ==> AC
        String name = "   ali cAN   ";

        //trim()methodu bir Stringin bas ve sonundaki space leri siler, ortadakilere karismaz

        char first = name.trim().toUpperCase().charAt(0);
        char last = name.trim().toUpperCase().split(" ")[1].charAt(0);

        System.out.println("" + first + last);
    }
}
