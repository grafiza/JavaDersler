package Maps;

import java.util.*;

public class Maps03 {
    public static void main(String[] args) {
        /*
        Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.
         */
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 82);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        product.put("Mobile Phone", 53);

        Set<String> productNameAsSet=product.keySet();
        ArrayList<String> productNameAsList=new ArrayList<>(productNameAsSet);
        Collections.sort(productNameAsList);
        System.out.println("productNameAsList = " + productNameAsList);
    }
}
