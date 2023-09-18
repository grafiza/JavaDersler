package practice_Loops;

import java.util.ArrayList;
import java.util.List;

public class Soru03 {
    public static void main(String[] args) {
        /*
        Döngüler! kullanarak tamsayılardan olusan b!r l!sten!n tüm ögeler!n!n benzers!z (tekrarsız)
olup olmadıgını kontrol ed!n!z.*/
List<Integer> myList = new ArrayList<>();
myList.add(10);
myList.add(31);
myList.add(15);
myList.add(7);
myList.add(15);
myList.add(23);
         List<Integer> newList=new ArrayList<>();
        for (Integer w:myList             ) {
            if(!newList.contains(w))
                newList.add(w);
        }
        if(newList.size()>0)
            System.out.println("Tekrarlı öğeler var");
    }
}
