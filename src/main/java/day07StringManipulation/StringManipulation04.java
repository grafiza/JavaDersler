package day07StringManipulation;

public class StringManipulation04 {
    //Ornek : Bir string'in belirli bir karakterinden baslayarak belirli bir karaktere kadar tum
//karakterleri dynamic olarak aliniz
//abc@gmail.com ===> gmail

    public static void main(String[] args) {
        String mail="abc@gmail.com";
        String newMail=mail.substring(4,9);
        System.out.println(newMail);


        //Example: Bir String'deki tekrarsiz character'leri ekrana yan yana yazdiriniz.
        //           mehmet ==> ht
        //lastIndexOf() parantezi icine yazilan karakterin string deki son gorunumunun indexini verir
        //indexOf("m") m nin ilk gorunumunun indexini verir

        // indexOf("m")     ==>  0  farkli tekrarli
        // lastIndexOf("m") ==>  3

        // indexOf("e")     ==>  1
        // lastIndexOf("e") ==>  4

        // indexOf("h")     ==>  2  ayni  tekrarsiz
        // lastIndexOf("h") ==>  2
        String s = "mehmet";

        if (s.indexOf("m") == s.lastIndexOf("m")) {
            System.out.print("m");
        }

        if (s.indexOf("e") == s.lastIndexOf("e")) {
            System.out.print("e");
        }

        if (s.indexOf("h") == s.lastIndexOf("h")) {
            System.out.print("h");
        }

        if (s.indexOf("t") == s.lastIndexOf("t")) {
            System.out.print("t");
        }

        System.out.println();


        //Example : Bir banka kartının son 4 hanesi hariç tüm hanelerini '*' kullanarak görünmez yapın
        //           1234 6789 1234 6789 ==> **** **** **** 6789

        String cardNum = "1234 6789 1234 6789";
        String first = cardNum.substring(0, 15).replaceAll("[0-9]", "*");
        System.out.println(first);//**** **** ****

        String last = cardNum.substring(15);
        System.out.println(last);//6789

        String result1 = first + last;
        System.out.println(result1);//**** **** **** 6789

        String result2=first.concat(last);
        System.out.println(result2);//**** **** **** 6789
        //shift + f10
    }
}
