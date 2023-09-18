package Practice02.variables;

import java.util.Scanner;

public class Soru6 {
    public static void main(String[] args) {
            /*
            Soru 2) Kullanicidan email adresini girmesini isteyin,
              mail @gmail.com icermiyorsa "Lutfen gmail adresi giriniz",
              @gmail.com ile bitiyorsa "Email adresiniz kaydedildi "
              @gmail.com ile bitmiyorsa lutfen yazimi kontol edin yazdirin
              odev!! bosluk karakteri varsada hata mesaji verin
             */

            //Scanner scan=new Scanner(System.in);
            //System.out.println("Lütfen mail adresinizi giriniz :");
            //String mail=scan.nextLine();
            //if(!mail.contains("gmail"))
            //    System.out.println("Lütfen gmail adresi giriniz!");
            //else if(!mail.endsWith("@gmail.com"))
            //    System.out.println("Lütfen yazımı kontrol edin!");
            //else if(mail.contains(" "))
            //    System.out.println("Lütfen boşluk karakteri kullanmayın!");
            //else
            //    System.out.println("Email adresiniz kaydedildi...");
//

        //Bir String değişkeni oluşturunuz
        //ve String değişkenin konsolda boşluk olmayan son
        //karakteri yazdırınız.

        String str="  Fa  tih   ";
        str=str.trim();
        System.out.println(str);
    }
}
