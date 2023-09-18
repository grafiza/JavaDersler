package Maps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Maps01 {
    public static void main(String[] args) {
        /*
        Asagıda key olarak ürün adlarını ve value olarak ürün sayısını !çeren b!r map
bulunmaktadır. Toplam ürün sayısını bulmak !ç!n kodu yazınız.*/


        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        System.out.println(product);
        System.out.println(product.get("Laptop"));
        Collection<Integer> numOfProducts = product.values();
        int sum=0;
        for (Integer w:numOfProducts             ) {
            sum+=w;
        }
        System.out.println("sum = " + sum);

    }
}
