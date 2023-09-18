package Practice02;

import java.util.Scanner;

public class IfStatements03 {
    public static void main(String[] args) {
        //Kullanıcıdan gün isimlerinden birinin ilk harfini iste
        //o harfle başlayan günleri yazdır

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen haftanın günlerinden birinin ilk harfini giriniz");
        Character ch=scan.next().charAt(0);

        System.out.println("ch = " + Character.toUpperCase(ch));
        if (ch=='p' || ch=='P'){
            System.out.println("Pazartesi,Perşembe,Pazar");
        }
        else if(ch=='S' || ch=='s')
            System.out.println("Salı");
        else if(ch=='ç' || ch=='Ç')
            System.out.println("Çarşamba");
        else if(ch=='c' || ch=='C')
            System.out.println("Cuma,Cumartesi");
        else
            System.out.println("Hatalı Giriş");
    }
}
