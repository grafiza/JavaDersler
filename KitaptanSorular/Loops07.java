package KitaptanSorular;

public class Loops07 {
    public static void main(String[] args) {
        /*
        Str!ng !ç!ndek! tüm küçük harfler! yıldız !saret!yle yazdırmak !ç!n gereken kodu yazınız.
Örneg!n; 'Al! Can?' ==> l*!*a*n*
         */
        String metin="Ali Can?";
        metin=metin.replaceAll("[^a-z]","");
        String c="";
        for (int i = 0; i <metin.length() ; i++) {
            String d=metin.substring(i,i+1);
            c=c+d+'*';

        }
        System.out.println(c);


        String s = "Ali Can?";
        s = s.replaceAll("[^a-z]", "");
        String t = "";
        for(Integer i=0; i<s.length(); i++){
            String r = s.substring(i,i+1);
            t = t + r + '*';
        }
        System.out.println(t);



    }
}
