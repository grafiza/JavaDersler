package KitaptanSorular;

public class Arrays_EnKisaKelime {
    public static void main(String[] args) {
        /*
        String’ lerden olusan bir arrayde uzunlugu en küçük olan elemanları bulunuz.
Örnek: ( Kemal, Jonathan, Mark, Angie, Veli ) ==> Output is Mark, Veli
         */
        String[] b = new String[]{"Kemal", "Jonathan", "Mark", "Angie", "Veli"};
        String kisa=b[0];
        for (String w:b             ) {
            if(w.length()<kisa.length())
                System.out.print(w+" ");
        }

    }
}
