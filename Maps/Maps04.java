package Maps;

import java.util.HashMap;
import java.util.Map;

public class Maps04 {
    public static void main(String[] args) {
        /*
        B!r Str!ng’ dek! kel!meler!n kaç defa tekrarlandıgını !fade eden kod yazınız.
(Büyük/küçük harfe duyarlı deg!l)
         */

        String s = "Apex is easy. Type codes to learn apex. To earn money learn apex.";
        s=s.replaceAll("\\p{Punct}","").toLowerCase();
        Map<String,Integer> wordOccurence=new HashMap<>();
        String words[]=s.split(" ");
        for (String w:words             ) {
            Integer numOfWords=wordOccurence.get(w);
            if(numOfWords==null)
                wordOccurence.put(w,1);
            else
                wordOccurence.put(w,numOfWords+1);
        }
        System.out.println(wordOccurence);
    }
}
