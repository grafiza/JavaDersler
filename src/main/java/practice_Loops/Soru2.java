package practice_Loops;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Soru2 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("$12.99");
        myList.add("$23.60");
        myList.add("$8.25");
        myList.add("$54.45");
        List<Double> newList=new ArrayList<>();
        for (String w:myList             ) {
            w=w.replace("$","");
            newList.add(Double.valueOf(w));
        }
        Collections.sort(newList);
        double min=newList.get(0);
        double max=newList.get(newList.size()-1);
        System.out.println(min+max);
    }
}
