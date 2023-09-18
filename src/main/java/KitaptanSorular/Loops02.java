package KitaptanSorular;

public class Loops02 {
    public static void main(String[] args) {
        /*
        Benzers!z (Tekrarsız) rakamları b!r tamsayı olarak yazdırmak !ç!n kod yazınız.
Örnek; 223878 ´ 37
         */

        int a=223878;
        String b=String.valueOf(a);
        String d="";
        for (int i=0;i<b.length();i++) {
            String c = b.substring(i, i + 1);
            if(b.indexOf(c)==b.lastIndexOf(c))
                d+=c;
        }
        System.out.println(d);
    }
}
