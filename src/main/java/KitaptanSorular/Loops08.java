package KitaptanSorular;

public class Loops08 {
    public static void main(String[] args) {
        /*
        Ver!len ondalık sayının sadece ondalık kısmındak! rakamlarını, kend!s!nden önce b!r yıldız
!saret!yle yazdırmak !ç!n gereken kodu yazınız.
Örneg!n; 75.4238 ´ *4*2*3*8
         */

        double a=75.4238;
        String b=String.valueOf(a);
        String c=b.split("\\.")[1];
        String d="";
        for (int i = 0; i <c.length() ; i++) {

            String e="*"+c.charAt(i);
d=d+e;
        }
        System.out.println(d);
    }
}
