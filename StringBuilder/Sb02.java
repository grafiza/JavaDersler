package StringBuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Java is easy");
        System.out.println(sb1);
        sb1.reverse();
        System.out.println(sb1);//ysae si avaJ

        sb1.deleteCharAt(1); // 1. indeksteki karakteri siler
        sb1.delete(0,3);
        System.out.println(sb1);// si avaJ
        sb1.replace(0,3,"x");
        System.out.println(sb1);//x avaJ

        sb1.insert(1,"h");
        System.out.println(sb1);
        StringBuilder sb2=new StringBuilder("Javx");
        StringBuilder sb3=new StringBuilder("Java");
        int r1=sb2.compareTo(sb3);
        System.out.println(r1);

       String str= sb1.toString().toUpperCase();
        StringBuilder newSb1=new StringBuilder(str);// Stringi StringBuilder a dönüştürdük
    }
}
