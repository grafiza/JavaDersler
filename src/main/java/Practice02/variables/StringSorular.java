package Practice02.variables;

public class StringSorular {
    public static void main(String[] args) {
        /*
        B!r Str!ng’ !n bel!rl! b!r tek karaktere sah!p olup olmadıgını üç farklı sek!lde kontrol etmek
!ç!n kod yazınız.
         */

        String ad="Zafer";

        System.out.println(ad.contains("a"));
        System.out.println(ad.indexOf("a")!=-1);
        System.out.println(ad.replaceAll("^a","").length()>0);




        /*
        Str!ng gomlekF!yat = ‘$12.99’;
Str!ng k!tapF!yat = ‘$35.99’;
Gömlek ve k!tap f!yatlarının toplamını bulmak !ç!n gereken kodu yazınız.
         */

        String gf="$12.99";
        String kf="$35.99";

        double dGf=Double.valueOf(gf.replace("$",""));
        double dKf=Double.valueOf(kf.replace("$",""));
        System.out.println(dGf+dKf);

/*
        Ver!len b!r !sm!n adının ve soyadının bas harfler!n! almak !ç!n kodu yazınız.
        Not: Ikinci isim kapsam dısındadır.
        Örnek: Tom Hanks ==> TH, Mary Star ==> MS
  */

        String name="Tom Hanks";
        System.out.println(name.charAt(0)+""+name.split(" ")[1].charAt(0));

    /*
        B!r Str!ng’ de kullanılan noktalama !saretler!n!n sayısını bulmak !ç!n b!r kod yazınız.
     */

        String noktalma="ali, veli bir gün; sormuşlar : nerde bu? diye!";

        String newNoktalama=noktalma.replaceAll("\\P{Punct}","");
        System.out.println(newNoktalama+"\n"+newNoktalama.length());



    }
}
