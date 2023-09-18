package day12ArrayLists;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists02 {
    public static void main(String[] args) {
        //Interview sorusu
        //Örnek : Tekrarli elemanlari olan bir listten sadece tekrarsiz elemanlari olan bir list elde edinn
        //           [J, a, v, a, v] ==> [J, a, v]
        List<Character> word=new ArrayList<>();
        word.add('J');
        word.add('a');
        word.add('v');
        word.add('a');
        word.add('v');

        List<Character> newWord=new ArrayList<>();

        for (Character w:word) {
            if(!newWord.contains(w))
                newWord.add(w);
        }
        System.out.println(newWord);

        // interview sorusu
        //Örnek : Bir String ArrayList oluşturun ve "a" içeren elemanlari silin.

        List<String> a=new ArrayList<>();
        a.add("Bartın");
        a.add("Sakarya");
        a.add("İzmir");
        a.add("Bursa");
        a.add("Rize");
        for (int i = 0; i < a.size(); i++) {
            if(a.get(i).contains("a"))
                a.remove(i);
            i--;
        }
        System.out.println(a);
    }
}
