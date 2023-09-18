package Practice02.variables;

public class StringSoru {
    public static void main(String[] args) {
        /*
        Sadece tek b!r kel!meden olusan seh!r !s!mler! !ç!n b!r Str!ng deg!sken! olusturun. Seh!r
!sm!n!, bas harf! büyük ve d!ger tüm karakterler! küçük harfler olacak sek!lde konsolda
yazdırınız.
         */
        String name="anKaRa";
        name=name.toUpperCase();
        System.out.println(name.charAt(0)+name.substring(1).toLowerCase());

        /*
        K!s! !s!mler! !ç!n 3 Str!ng deg!sken olusturunuz. Bosluk karakterler! har!ç 3 !s!mdek!
karakter sayısının toplamını yazdırınız.
Örnek: Isimler Ali Can, Merve Star, Mark Tom ise konsolda 22 görmelisiniz.
         */
        String ad1="Ali Can",ad2="Merve Star",ad3="Mark Tom";
        int toplam=0;
        toplam+=ad1.replace(" ","").length();
        toplam+=ad2.replace(" ","").length();
        toplam+=ad3.replace(" ","").length();
        System.out.println("toplam:"+toplam);

        /*
        B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! toplam alfabet!k ve sayısal karakter sayısını
konsolda yazdırınız.
Örnek: String : ' Miami 33018!!! ' ise konsolda 10 yazdırmanız gerekir.
         */
        String word1=" Miami 33018!!! ";
        int toplam1=word1.replaceAll("\\W","").length();
        System.out.println(toplam1);
        word1=word1.replaceAll("\\W","");
        System.out.println(word1);


        /*
        B!r Str!ng deg!sken! olusturunuz, Str!ng'dek! rakam olmayan karakterler!n sayısını
konsolda yazdırınız.
Örnek: String: '1a3Bcf4!...' ise konsolda 8 yazdırmanız gerekir.
         */
        String rakamOlmayan="1a3Bcf4!...";
        System.out.println(rakamOlmayan.replaceAll("\\d","").length());


        /*
        B!r Str!ng deg!sken! olusturunuz ve Str!ng deg!sken!n konsolda bosluk olmayan son
karakter! yazdırınız.
Örnek: 'Ali Can' için n yazdırmalısınız.
‘Miami’ için i yazdırmalısınız.
         */

        String karakter="Ali Can";
        System.out.println(karakter.trim().charAt(karakter.length()-1));


        /*
                B!r Str!ng deg!sken! olusturunuz ve Str!ng'!n !lk ve son karakterler!n!n ASCII degerler!n!n
toplamını bulunuz.
         */

        String var1="Albatros";
        int v1=(int)var1.charAt(0);
        int v2=(int)var1.charAt(var1.length()-1);
        System.out.println(v1+v2);

        /*
        B!r Str!ng deg!sken! olusturunuz ve !lk karakter! dısındak! tüm karakterler! konsolda
yazdırınız.
Örnek: String 'Java' ise konsola 'ava' yazdırmalısınız.
         */
        String jav="Java çok güzel";
        System.out.println(jav.substring(1));

        /*
        B!r Str!ng deg!sken! olusturunuz ve son karakter! dısındak! tüm karakterler!n! konsolda
büyük harfle yazdırınız.
Örnek: String 'Java' ise konsola 'JAV' yazdırmalısınız.
         */
        System.out.println(jav.substring(0,jav.length()-1));


        /*
        B!r Str!ng deg!sken! olusturunuz ve konsolda !lk karakter ve son karakter dısındak! tüm
karakterler! büyük harflerle yazdırınız.
Örnek: String 'Java' ise konsolda 'AV' yazdırmalısınız.
         */
        String newJava=jav.toUpperCase();
        newJava=newJava.substring(1,newJava.length()-1).toUpperCase();
        System.out.println(newJava);

        /*
        B!r Str!ng !n ortadak! herhang! b!r konumda yalnızca tek b!r bosluk karakter! olup
olmadıgını kontrol etmek !ç!n kod yazınız.
Örnek: ‘Ali    Can’ için konsolda false yazmalıdır.
‘  Ali Can ’ için konsolda false yazmalıdır.
‘  Ali Can ’ için konsolda false yazmalıdır.
‘Ali Can’ için konsolda true yazmalıdır.
         */
        String ali1="Ali Can";

        String ali2=ali1.trim();
        String ali3=ali1.replaceAll(" ","");
        System.out.println(ali2.length()==ali3.length()+1);

        /*
        B!r Str!ng’ !n basında ve sonunda bosluk karakter! olup olmadıgını kontrol etmek !ç!n kod
        yazınız.
        Örnek: ‘ Ali ’ için kodunuz konsolda false yazmalıdır
        ‘Ali’ için kodunuz konsolda true yazmalıdır
        */
        String ad="Liia ";
        String trimlenmis=ad.trim();
        System.out.println(ad.equals(trimlenmis));

        /*
        B!r Str!ng’ !n basında büyük harf ve sonunda nokta olup olmadıgını kontrol etmek !ç!n kod
yazınız.
Örnek: ‘Ali’ için kodunuz konsolda false yazdırmalıdır
‘ali.’ için kodunuz konsolda false yazdırmalıdır
‘ Ali. ’ için kodunuz konsolda false yazdırmalıdır
‘Ali.’ için kodunuz konsolda true yazdırmalıdır
‘ALI.’ için kodunuz konsolda true yazdırmalıdır
         */

        String str1="zafer.";
        char buyukHarf=str1.charAt(0);
        char nokta=str1.charAt(str1.length()-1);
        boolean kontrol1=buyukHarf>'A' && buyukHarf<'Z';
        boolean kontrol2=nokta=='.';
        System.out.println(kontrol1 && kontrol2);

/*
Asagıdak! kosullar !ç!n b!r parolanın geçerl! olup olmadıgını kontrol etmek !ç!n kod yazınız;
S!fre bosluk karakter!nden farklı olacak sek!lde en az 8 karakter !çermel!d!r. S!frede en az 1
sembol olmalıdır.
Örnek: 'A2b!' için kodunuz konsolda false yazdırmalıdır.
'A2b3cdef' için kodunuz konsolda false yazdırmalıdır
'!1a23b4' için kodunuz konsolda false yazdırmalıdır.
'!1a23b4?es' için kodunuz konsolda true yazdırılmalıdır.
'! a b 3 k' kodunuz konsolda false yazdırmalıdır.
 */

        String psw="aBCDz.E4R";

        boolean kontrol3=psw.length()==psw.replaceAll("\\p{Punct}","").length();
        boolean kontrol4=psw.replaceAll(" ","").length()>8;
        System.out.println(!kontrol3+" "+kontrol4);







}}
