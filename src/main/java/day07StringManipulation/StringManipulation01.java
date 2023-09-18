package day07StringManipulation;

import java.util.Scanner;

public class StringManipulation01 {
    public static void main(String[] args) {
        /*
            Example : Asagidaki kurallara gore kullanicinin girdigi password'u kontrol ediniz.
                        i)En az 8 character olsun
                        ii)Space characteri password'de olmasin
                        iii)En az bir tane buyuk harf olsun
                        iv)En az bir tane kucuk harf olsun
                        v)En az bir tane rakam olsun
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen şifrenizi giriniz");
        String password=scan.nextLine();
        boolean lengthControl=password.length()>7;
        boolean spaceControl=!password.contains(" ");
        boolean upperCaseCount=password.replaceAll("[^A-Z]","").length()>0;
        boolean lowerCaseCount=password.replaceAll("[^a-z]","").length()>0;
        boolean numberCount=password.replaceAll("[^0-9]","").length()>0;

        System.out.println("lengthControl = " + lengthControl);
        System.out.println("spaceControl = " + spaceControl);
        System.out.println("upperCaseCount = " + upperCaseCount);
        System.out.println("lowerCaseCount = " + lowerCaseCount);
        System.out.println("numberCount = " + numberCount);

        boolean isValid=lengthControl && upperCaseCount && lowerCaseCount && numberCount;
        String yaz=isValid?"Geçerli Şifre":"Geçersiz şifre";
        System.out.println(yaz);

        }
}
