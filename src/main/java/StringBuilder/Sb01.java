package StringBuilder;

public class Sb01 {
    public static void main(String[] args) {
/*
        1) "StringBuilder" classi da String ureten bir classtir.
        2) String class kullanarak String üretiriz, java nicin StringBuilder classi da olusturdu?
            String class "immutable" (degistirilemez) string uretir, StringBuilder Class "mutable"(degistirilebilir) string üretir.
        3) "immutable" olmak demek orjinal degerin korunmasi, değistirilemez olmasi demektir
            "mutable" olmak demek orjinal degerin değistirilebilir olmasi demektir
         */

        //Immutable
        String s = "Java";
        String t = s + "!";
        String w = t + "?";

        /*
        String i degistirdikten sonra ayni stringe assign ederseniz java yine yeni bir container olusturur
        degismis degeri bu yeni containerin icine koyar ve eski container i gosteren pointer yeni container a yonlendirilir
        dolayisiyla eski container adressiz kalir ve "Garbage Collector" adressiz olan containerlari siler
         */
        String a = "Money";
        a = a + "  More";


        //Mutable
        StringBuilder sb1 = new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1);//Python


        sb1.append("1234567890");
        System.out.println(sb1.length());//17
        System.out.println(sb1.capacity()); //22

        //Mutable
        StringBuilder sb3 = new StringBuilder("Python");
        sb1.append("!");
        System.out.println(sb1);//Python

        //StringBuilder olusturmanin ikinci yolu
        StringBuilder sb2 = new StringBuilder();

        System.out.println(sb2.length());//0
        System.out.println(sb2.capacity());//16

        sb2.append("Java");
        sb2.append("xxxxxxxxxxxxxxx");

        System.out.println(sb2.length());//19
        System.out.println(sb2.capacity());//34

        //capacity ve length arasindaki fark nedir?
        /*
        capacity java nin size verdigi data depolama yer sayisidir, length ise size verilen data depolama yerinin kullanilan kismidir
        ==>Java  baslangic olarak size capacity 16 olarak verir,
        Siz eger verilen bu capacity i asarsaniz java yeni capacityi varolanin 2 katinin 2 fazlasi olacak sekilde ayarlar
        16=> 16*2+2  ==> 34   ===> 34*2+2  .....
         */

        //StringBuilder olusturmanin 3. yolu
        StringBuilder sb5 = new StringBuilder(3);
        sb5.append("ali");

    }
}
