package Practice03;

public class Ternary01 {
    public static void main(String[] args) {
        // Bir sayının mutlak değerini hesaplayan kodu yazınız
        // -4 ==> -1*4    4==>4  0==>0

        int c=-4;
        // condition ? true : false;
        int result=c<0?-1*c:c;
        System.out.println("result = " + result);

        int x=11;
        int y=11;
        int z=x<10?x++:y++;
        System.out.println(z+","+x+","+y);

        //Ornek: Iki sayinin isareti ayni ise bu sayilari carpan,
        //isaretleri farkli ise "Farkli isaretli sayilari carpamiyorum"
        // mesaji veren kodu yaziniz.
        int a=3;
        int b=13;
        Object sonuc=(a>0 && b>0) ||(a<0 && b<0)? a*b:"Farkli isaretli sayilari carpamiyorum";
        System.out.println(sonuc);
        //"Object" javada butun Non-primitive" Data type larinin (Class) ortak parent idir.
        //"Object" classin parenti yoktur
    }
}
