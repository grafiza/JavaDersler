package Practice03;

public class StringManipulations02 {
    public static void main(String[] args) {
        //Örnek 1: s string indeki  money 'i dolar kelimesine çeviriniz

        String s="Learn Java earn 15000 money";
        s=s.replace("money","dollar");
        System.out.println(s);

        // tüm e harflerini siliniz

        s=s.replace("e","");
        System.out.println(s);
//örnek 3: s stringindeki tüm rakamları (0,1,2,3,4,5,6,7,8,9)*' a çevirin
        // regular expression => RegEx
        String newString=s.replaceAll("[0-9]","*");
        System.out.println(newString);

        int num=s.replaceAll("[^0-9]","").length();
        System.out.println(num);
    }
}
