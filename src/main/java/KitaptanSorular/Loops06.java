package KitaptanSorular;

public class Loops06 {
    public static void main(String[] args) {
        /*
  20'den 3'e kadar olan tek tamsayıları aynı satırda ardısık olacak sek!lde aralarında bosluk
bırakarak yazdırmak !ç!n gereken kodu yazınız.
         */
String s="";
        for (int i = 21; i >2 ; i--) {
            if(i%2!=0)
            s+=i+" ";

        }
        System.out.print(s);
}}
