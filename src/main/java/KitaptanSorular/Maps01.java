package KitaptanSorular;

import java.util.*;

public class Maps01 {
    /*
    Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Toplam ürün sayısını bulmak için kodu yazınız.
     */
    public static void main(String[] args) {
        Map<String, Integer> product = new HashMap<>();
        product.put("Laptop", 12);
        product.put("TV", 53);
        product.put("Refrigerator", 12);
        product.put("Music System", 87);
        Collection<Integer> numOfValues=product.values();
        int toplam=0;
        for (Integer w: numOfValues             ) {
            toplam+=w;

        }
        System.out.println(toplam);

        /*
        Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürünler arasında " Laptop " olup olmadığını kontrol etmek için kodu
yazınız.
         */
        String expectedProduct="Laptop";
        if(product.containsKey(expectedProduct))
            System.out.println( expectedProduct + " vardır");
        else
            System.out.println( expectedProduct + " yoktur");

        /*
        Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürün sayılarını artan sırada yazdırınız.
         */
        product.put("Mobile Phone", 53);
        Object[] values=product.values().toArray();
        Arrays.sort(values);
        System.out.println("values = " + Arrays.toString(values));
        /*
        Aşağıda key olarak ürün adlarını ve value olarak ürün sayısını içeren bir map
bulunmaktadır. Ürün adlarını alfabetik sırayla yazdırınız.
         */
        Set<String> productNamesAsSet=product.keySet();
        List<String>productNamesAsList=new ArrayList<>(productNamesAsSet);
        Collections.sort(productNamesAsList);
        System.out.println("productNamesAsList = " + productNamesAsList);
/*
Bir String’ deki kelimelerin kaç defa tekrarlandığını ifade eden kod yazınız.
(Büyük/küçük harfe duyarlı değil)
 */
        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s=s.replaceAll("\\p{Punct}","");
        Map<String,Integer> wordOccurence=new HashMap<>();
        String []words=s.split(" ");
        for (String w:words             ) {
            Integer numOfOccurence=wordOccurence.get(w);
            if(numOfOccurence==null)
                wordOccurence.put(w,1);
            else
                wordOccurence.put(w,numOfOccurence+1);
        }
        System.out.println(wordOccurence);
        int num=wordOccurence.get("learn");
        System.out.println(num);

        /*
        Belirli bir listede tekrarlanan öğelerin sayısı nasıl kontrol edilir?
         */
        List<Integer> myList = new ArrayList<>();
        myList.add(12);
        myList.add(21);
        myList.add(12);
        myList.add(13);
        myList.add(12);
        myList.add(21);
        myList.add(35);
        Map<Integer, Integer> myMap = new HashMap<>();
        for (Integer w:myList             ) {
            Integer numOfOccurence=myMap.get(w);
            if(numOfOccurence==null)
                myMap.put(w,1);
            else
                myMap.put(w,numOfOccurence+1);
        }
        Collection<Integer> myValues = myMap.values();
        Integer counter = 0;
        for(Integer w : myValues){
            if(w>1){
                counter++;
            }
        }
        System.out.println("Tekrarlanan oge sayisi " + counter + " adettir");
    }
}
