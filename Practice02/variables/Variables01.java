package Practice02.variables;

public class Variables01 {
    public static void main(String[] args) {
        //variables 01
    /*
      \n (or \r): starts from a new line : metni bir alt satırdan itibaren yazdırır.
              \t:  horizontal tab : metni yatayda 1 tab miktarı kaydırır.
              \\: prints a back slash :\ (ters slash) yazdırır
              \': prints single quote :' tek tırnak yazdırır.
              \": prints double quote :"" Çift tırnak yazdırır.
     */
//variables 02
        /*
         * Primitive data type
         * boolean, char, byte, short, integer,long, double, float
         *
         */

        //byte, short, integer,long, double, float veri tiplerinin max ve min degerlerini yazdiriniz.

        System.out.println("byte :"+Byte.MIN_VALUE);
        System.out.println("byte :"+Byte.MAX_VALUE);
        System.out.println("short :"+Short.MAX_VALUE);
        System.out.println("short :"+Short.MAX_VALUE);
        System.out.println("integer :"+Integer.MAX_VALUE);
        System.out.println("integer :"+Integer.MAX_VALUE);
        System.out.println("long :"+Long.MAX_VALUE);
        System.out.println("long :"+Long.MAX_VALUE);
        System.out.println("double :"+Double.MAX_VALUE);
        System.out.println("double :"+Double.MAX_VALUE);
        System.out.println("float :"+Float.MAX_VALUE);
        System.out.println("float :"+Float.MAX_VALUE);


//variables 03
        // verilen 12345 sayısının rakamlarını yukarıdan aşağıya doğru yazdırınız
        // ex: input:
        //    output: 1
        //            2
        //            3
        //            4
        //            5

        System.out.println(1+"\n"+2+"\n"+3+"\n"+4+"\n"+5);

//variables 04
        System.out.println("-------------------Arttırma");
        int a = 1;
        System.out.println("a : "+(++a)); //2
        System.out.println("a : "+(a++)); //2
        System.out.println("a : "+a);  //3
        a=5;
        System.out.println("son hali :"+(a++ + ++a)) ;
        // 5 + 7 = 12
        System.out.println("-------------------Azaltma");
        int b = 5;
        System.out.println(--b);  //4
        System.out.println(b--);  //4
        System.out.println(b);  //3
        System.out.println("-------------SORU1-----------------");
        int x = 20;
        int y = 15;
        System.out.println(++x + --y);  //21 + 14 =35  x= 21   y=14
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----------------------------------");
        System.out.println(++x + y--);  // 22 + 14=36  x=22 y=13
        System.out.println(x);
        System.out.println(y);
        System.out.println("-------------SORU2-----------------");
        x = 20;
        y = 15;
        System.out.println(x++ + y--);  // 20+15=35   x=21 y=14
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----------------------------------");
        System.out.println(x++ + --y);  // 20+14 =34  x=21 y=14
        System.out.println(x);
        System.out.println(y);
        System.out.println("-----------------------------------");
        int k=5;
        int sonuc = ++k + k++ + k++ + --k + k-- + k;
        //  6  + 6 +  7   + 7 + 7 + 6 = 39   k=6
        System.out.println("sonuc = " + sonuc);
        System.out.println("k = " + k);
//variables 04

        //Write code here

        String b1 = "Java 1235 ?!@$_";
        System.out.println("b1 = " + b1);
        // \\d ifadesi tum rakamlari(digit) temsil eder.
        System.out.println(b1.replaceAll("\\d","*"));
        System.out.println(b1);
        // ===>  \\D rakamlardisindaki hersey
        System.out.println(b1.replaceAll("\\D","*"));

        //==> \\S space disindaki hersey
        System.out.println(b1.replaceAll("\\S","*"));

        //==> \\s space ifadesidir.
        System.out.println(b1.replaceAll("\\s","*"));
        // replace ile yapma
        System.out.println(b1.replace(" ","*"));

        //==>  \\w ifadesi (word->kelime ve harf) a-z A-Z 0-9 _  bunlari kapsar
        System.out.println(b1.replaceAll("\\w","*"));

        //==>  \\W ifadesi a-z A-Z 0-9 _ disindakileri kapsar

        System.out.println(b1.replaceAll("\\W","*"));

//variables 05
        // str.matches(pattern);
        // str'nin pattern'a uygun olup olmadigini kontrol eder. sonuc boolean döner
        // . (nokta) yalniz tek karakter demektir
        // ".s" toplam 2 karakter olmali, ilk karakter herhangi ikinci karakter s olmali
        System.out.println(". quantifier ....");
        System.out.println("as".matches(".s"));  // true, ilk karakter a ikincisi 2 toplam 2 karakter
        System.out.println("mst".matches(".s")); // false (mst 2 karakterden fazla)
        System.out.println("mas".matches("..s")); // true, 3 karakterli ve 3. karakter s
        // [abc]    yalniz bir karakter ve a, b veya  c olmali
        System.out.println("[abc] quantifier ....");
        System.out.println("a".matches("[a]")); // true, str yalniz bir adet a karakterinden olusmali
        System.out.println("ab".matches("[ab]")); // false, 1 karakter olmali a ya da b, 2 karakter var
        // [^abc]    a, b, c disinda herhangi bir karakter (negation)
        System.out.println("[^...] quantifier ....");
        System.out.println("a".matches("[^a]")); // false, bir karakter ancak a haric olmali
        System.out.println("c".matches("[^ab]")); // true, 1 karakter ve a ve b nin disinda
        System.out.println("abcd".matches("[abcd]")); // false, yalniz a, b, c veya d olmali
        System.out.println("c".matches("[abcd]")); // true, tek karakter ve a, b, c veya d
        System.out.println("baaaca".matches("[abc]")); // false,
        //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
        //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali
        System.out.println("[a-z] quantifier ....");
        System.out.println("c".matches("[a-z]")); // true, 1 karakter ve a-z arasinda
        System.out.println("Aa".matches("[a-zA-Z]")); // false, a dan 1 karakter ve a ve b nin disinda
        System.out.println("c".matches("[1-9]")); // false, 1 karakter ve 1-9 arasinda olmali
        // X?    X en fazla 1 defa kullanilabilir
        System.out.println("? quantifier ....***");
        System.out.println("a".matches("[abc]?")); // true a, b, c bir defa kullanilabilir
        System.out.println("aaa".matches("[abc]?")); // false, a 1 den fazla kullanilmis
        System.out.println("".matches("[abc]?")); // true, a, b veya c en fazla 1 defa
        System.out.println("b".matches("[abc]?")); // true, a, b veya c en fazla 1 defa
        // X+        X en az 1 defa kullanilabilir
        System.out.println("+ quantifier ....");
        System.out.println("a".matches("[abc]+")); // true, a, b veya c en az bir defa
        System.out.println("aaa".matches("[abc]+")); // true, a 3 defa kullanilmis
        System.out.println("aaddta".matches("[abc]+")); // false, d ve t olmamali
        System.out.println("aaabbcccc".matches("[abc]+")); // true, a, b, c en az 1 defa kullanilmis
        // X*   X sifir veya daha fazla olmali
        System.out.println("* quantifier ....");
        System.out.println("abbbna".matches("[abc]*")); // true, a, b, c,  0 veya fazla olmali
        System.out.println("-----" + "aaa".matches("[abc]*")); // true, a, b, c,  0 veya fazla olmali
        System.out.println("".matches("[abc]*"));   // true, a, b, c 0 defa kullanilmis
        // X{n}      X yalniz n adet kullanilabilir
        // [a-zA-Z0-9]{6}  a-z, A-Z ve 0-9 arasi toplam 6 karakter olmali
        System.out.println("{n} quantifier ....");
        System.out.println("arun32".matches("[a-zA-Z0-9]{6}")); // true
        System.out.println("kkvarun32".matches("[a-zA-Z0-9]{6}")); // false 6 karakterden fazla
        System.out.println("JA2Uk2".matches("[a-zA-Z0-9]{6}")); // true
        System.out.println("arun$2".matches("[a-zA-Z0-9]{6}")); // false, $ olmamali
        // X{n,}      X  n veya daha fazla adet kullanilabilir
        // [a-zA-Z0-9]{6,}  a-z, A-Z ve 0-9 arasi toplam en az 6 karakter olmali
        System.out.println("{n,} quantifier ....");
        System.out.println("kkv32".matches("[a-zA-Z0-9]{6,}")); // false 6 karakterden az
        System.out.println("kkvarun32".matches("[a-zA-Z0-9]{6,}")); // true en az 6 karakterden fazla olabilir
        // X{n,m}      X  en az en fazla m adet kullanilabilir
        // [a-zA-Z0-9]{6,7}  a-z, A-Z ve 0-9 arasi toplam 6 veya 7 karakter olmali
        System.out.println("{n,} quantifier ....");
        System.out.println("+++++" + "kkv32e".matches("[a-zA-Z0-9]{6,7}")); // true
        System.out.println("kkv32ez6".matches("[a-zA-Z0-9]{6,7}")); // false, 8 karakterz
        System.out.println("by character classes and quantifiers ...");
        // ilk karakter 789 ve kalan 9 karakter 0-9 arasi toplam 10 karakter olmali,
        // [789]{1}  == [789]
        System.out.println("9953038949".matches("[789]{1}[0-9]{9}"));   // true
        System.out.println("9953038949".matches("[789][0-9]{9}"));      //true
        System.out.println("6953038949".matches("[789][0-9]{9}")); // false, ilk karakter 6
        System.out.println("99530389490".matches("[789][0-9]{9}")); // false, 11 karakter
    }
}
