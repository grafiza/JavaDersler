package Practice05Arrays;

import java.util.ArrayList;

public class Varargs {
    public static void main(String[] args) {
        // kac tane kelime verilirse verilsin
        // iclerinden en uzun olanı yazdıran bir method olusturun
        // bu methodun access modifier'ını public yapıp aynı packagagedeki faklı bir classdan calıstırınız

        String str1="Ali";
        String str2="Veli";
        String str3="Hakan";
        String str4="Abdullah";
        String str5="Melike";
        String str6="Gulistan";
        enUzunKelime(str1,str2,str3,str4,str5,str6);


    }
    public static void enUzunKelime(String...a){
        int max=a[0].length();
        for (String w:a             ) {
            max=Math.max(max,w.length());
        }
        String name="";
        for (String w:a             ) {
            if(max==w.length())
                name+=w+" ";
        }
        System.out.println(name);
    }
}
