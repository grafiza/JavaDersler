package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps02 {
    public static void main(String[] args) {
        /*
        Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
bulunmaktadır. Ürünler arasında " Laptop " olup olmadıgını kontrol etmek !ç!n kodu
yazınız.
         */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);

        Collection<String> keyler=product.keySet();
        System.out.println("keyler = " + keyler);
        String aranan="Laptop";
        if(product.containsKey(aranan))
            System.out.println(aranan+" Vardır");
        else System.out.println(aranan+ " yoktur");
    }
}
