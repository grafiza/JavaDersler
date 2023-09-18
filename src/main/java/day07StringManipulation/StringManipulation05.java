package day07StringManipulation;

import java.util.Scanner;

public class StringManipulation05 {
    public static void main(String[] args) {
         /*  Örnek : Bir parolanın aşağıdaki koşullara sahip olup olmadığını kontrol edin
       i) Parola Boş olmamalıdır, en az bir karakter icermelidir.
       ii) Karakterler Sadece (space) boşluk karakterlerden ibaret olmamalı, space harici karakterlerde bulunmalidir
       iii) Başında ve sonunda boşluk olmamalıdır.
       */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen parola giriniz:");
        String password=scan.nextLine();

        boolean isEmpty=!password.isEmpty();// bir string tamamen boş ise yani hiç karakter içermiyor ise true verir
        boolean isSpace=!password.isBlank(); // sadece space içeren stringler için true verir. Space dışında bir karakter içerirse False verir

    }
}
