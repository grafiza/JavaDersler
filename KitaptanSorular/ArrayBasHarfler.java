package KitaptanSorular;

public class ArrayBasHarfler {
    /*
    String’ lerden olusan bir arrayde ögeler 'n' veya 'k' ile bitiyorsa, o ögelerin bas harflerini
alınız.
Örnek: { "Kemal", "Jonathan", "Mark", "Jackson", "Ali" } ==> Çıktı JJM
     */
    public static void main(String[] args) {
        String str[]={ "Kemal", "Jonathan", "Mark", "Jackson", "Ali" };
        for (String w:str             ) {
            if(w.endsWith("n") || w.endsWith("k"))
                System.out.print(w.charAt(0));
        }
    }
}
