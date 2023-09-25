package day27Lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) throws IOException {
    //     verilen text file içindeki text'i console'a yazdıran code'u yazınız
    Files.lines(Paths.get("src/main/java/day27Lambda/LambdaTextFile.txt")).
            forEach(System.out::println);
//Example 2: Verilen text file icindeki text'i buyuk harflerle console'a yazdiran code'u yaziniz.
        Files.lines(Paths.get("src/main/java/day27Lambda/LambdaTextFile.txt")).
                map(t->t.toUpperCase()).
                forEach(System.out::println);

        //Example 3: Verilen text file icindeki text'lerde "map"
        // kelimesinin olup olmadigini kontrol eden kodu yaziniz.
String path="src/main/java/day27Lambda/LambdaTextFile.txt";

System.out.println(Files.lines(Paths.get(path)).
                anyMatch(t -> t.contains("map")));
        //Example 4: Verilen text file icindeki text'lerde kullanilan
        // farkli kelimeleri bir list icinde return ediniz.

List<String> myList=Files.lines(Paths.get(path)).
        map(t->t.replaceAll("\\p{Punct}","").split(" ")).
        flatMap(Arrays::stream).
        distinct().
        collect(Collectors.toList());
        System.out.println(myList);
        //Example 5: Verilen text file icindeki text'de toplam kac
        // harf kullanildigini gosteren kodu yaziniz.
        System.out.println(Files.lines(Paths.get(path)).
                map(t -> t.replaceAll("[^a-zA-Z]", "").split("")).
                flatMap(Arrays::stream).
                count());

//Example 6: Verilen text file icindeki text'de kullanilan tum harfleri
        // natural order da bir listin icinde return eden kodu yaziniz.


        System.out.println(Files.lines(Paths.get(path)).
                map(t -> t.replaceAll("[^a-zA-Z]", "").split("")).
                flatMap(Arrays::stream).
                        sorted().
                        collect(Collectors.toList())
                );
    }
}
