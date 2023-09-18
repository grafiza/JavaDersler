package Practice02;

import java.util.Scanner;

public class IfStatements02 {
    public static void main(String[] args) {

        // Girilen bir karakterin harf mi sayı mı yoksa özel karakter mi olduğunu bul
        Scanner scan=new Scanner(System.in);
        System.out.print("Lütfen bir karakter giriniz:");
        char c=scan.next().charAt(0);
        if(c>='A' && c<='Z' )
            System.out.print("Büyük Harf" + " \" "+ c + " \" " + "Girdiniz!" );
        else if (c>='a' && c<='z')
            System.out.print("küçük harf" + " \" " + c + " \" " + "girdiniz!");
        else if (c>='0' && c<='9')
            System.out.print("sayı girdiniz="+ "\"" + c + "\"");
        else
            System.out.print("özel karakter girdiniz="+ "\""+ c +"\"" );
    }
}
