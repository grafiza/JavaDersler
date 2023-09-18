package KitaptanSorular;

public class Loops01 {
    public static void main(String[] args) {
        /*120'den 11'e kadar 4 !le bölüneb!len ve 6 !le bölüneb!len tüm tam sayıları aynı satırda !k!
                ardısık tam sayı arasında bosluk bırakarak yazınız.

         */
        String s="";
        for(int i=120;i>10;i--)
        {
            if(i%4==0 && i%6==0)
                s+=i+" ";
        }
        System.out.print(s);


    }
}
