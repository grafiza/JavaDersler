package KitaptanSorular;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StringIslemleri {
    /*
    Kullanıcıdan bir String ve bir karakter alınız.
String'de verilen karakterin ilk oldugu index ile son tekrarlandıgı index arasındaki karakter
sayısını sayınız.
Bosluk karakterlerini saymayınız.
Kod, kullanıcının seçtigi karakter String ‘de sadece bir kez varsa konsolda -1,
Kod, kullanıcının seçtigi karakter String ‘de yoksa konsolda -1 döndürsün.
Örnegin; "Java is easy" - 'a' ==> 5
"Java is easy" - 'w' ==> -1
"Java is easy" - 'e' ==> -1
     */

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir cümle yazınız...");
        String cumle=scan.nextLine();
        System.out.println("Bir karakter giriniz:");
        char ch=scan.next().charAt(0);
        if(cumle.indexOf(ch)==cumle.lastIndexOf(ch))
            System.out.println("-1");
        else if(cumle.indexOf(ch)==-1)
            System.out.println("-1");
        else {
            int karakterSayisi = cumle.substring(cumle.indexOf(ch) + 1, cumle.lastIndexOf(ch)).replace(" ", "").length();
            System.out.println(cumle.substring(cumle.indexOf(ch) + 1, cumle.lastIndexOf(ch)));
            System.out.println(karakterSayisi);
        }
    }
}
