package Practice02.variables;

public class variablesMetotlar {
    public static void main(String[] args) {
        String a="zafer";
        System.out.println(a.matches("..fer")); // 5 karakter olmalı, fer ile bitmeli

        // [abc]    yalniz bir karakter ve a, b veya  c olmali
        System.out.println("------------------");
        System.out.println("[abc]");
        System.out.println("a".matches("[abc]")); //true

        System.out.println("------------------");
        System.out.println("[^abc]");
        // [^abc]    a, b, c disinda herhangi bir karakter (negation)
        System.out.println("s".matches("[^abc]")); //true
        System.out.println("a".matches("[^a]"));  //false
        System.out.println("abcd".matches("[^abcd]")); //false
        System.out.println("c".matches("[^abcd]")); // false
        System.out.println("x".matches("[^abcd]")); // true

        //   [a-z]      a'dan z'ye kadar olan karakterlerden biri olmali a ve z dahil
        //   [a-zA-Z]   a'dan z'ye veya A'dan Z,'ye olan karakterlerden biri olmali

        System.out.println("------------------");
        System.out.println("[a-z] [a-zA-Z");

        System.out.println("1".matches("[a-z]")); //false
        System.out.println("ab".matches("[a-z]")); //false
        System.out.println("a".matches("[a-z]")); // true
        System.out.println("AB".matches("[a-zA-Z]")); // false
        System.out.println("A".matches("[a-zA-Z]")); // true

        System.out.println("------------------");
        System.out.println("X?");

        // X?    X en fazla 1 defa kullanilabilir

        System.out.println("arekj".matches("[abc]?")); //false
        System.out.println("a".matches("[abc]?")); // true

        System.out.println("------------------");
        // X+        X en az 1 defa kullanilabilir
        System.out.println("+ quantifier ....");
        System.out.println("a".matches("[abc]+")); // true, a, b veya c en az bir defa
        System.out.println("aaa".matches("[abc]+")); // true, a 3 defa kullanilmis
        System.out.println("aaddta".matches("[abc]+")); // false, d ve t olmamali
        System.out.println("aaabbcccc".matches("[abc]+")); // true, a, b, c en az 1 defa kullanilmis

    }
}
