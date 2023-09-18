package day10LoopsArrays;

import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {

        String s1 = "Java is easy. Learn Java earn money.";
        int sayi=s1.split(" ").length;
        System.out.println("sayi = " + sayi);
        //Example : Bir integer array olusturun ve 5 ten kucuk olan elemanlari yazdirin
        //           [12, 3, -3, 5, 23] ==> 3, -3

        //Array leri kisa yoldan nasil olusturabiliriz?

        int numbers[] = {12, 3, -3, 5, 23};

        for (int w : numbers) {

            if (w < 5) {
                System.out.print(w + " ");
            }
        }

        System.out.println();

        //Example Specific bir elemanin array'de olup olmadigini anlamak icin gereken kodu yaziniz
        String names[] = {"K", "C", "R", "A", "S"};

        //binarySearch() methodunu sort() kullanmadan kullanmayiiniz
        //binarySearch() methodu var olan elemanlar icin size o elemanin indexini verir
        //binarySearch() methodu olmayan elemanlar icin size negatif tamsayi verir
        // "-" ==> isaretinin anlami eleman yok demektir
        // - nin yanindaki sayi ==> olsaydi kacinci eleman olurdu.

        Arrays.sort(names);
        int result = Arrays.binarySearch(names, "U");
        System.out.println("--->"+result);

        //ornek :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.

        String s = "Java is easy. Learn Java earn money.";
        System.out.println(s);
        String words[] = s.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println(words.length);
    }
}
