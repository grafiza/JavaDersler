package KitaptanSorular;

public class ArraysToplamKarakterSayisi {
    /*
    String’ lerden olusan bir arrayde kullanılan ögelerin toplam karakter sayısını bulunuz.
Örnek: { "Kemal", "Jonathan", "Mark", "Angie", "Veli" } ==> Çıktı 26
     */
    public static void main(String[] args) {
        String str[]={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        int toplam=0;
        for (String w:str) {
            toplam+=w.length();
        }
        System.out.println(toplam);
    }
}
