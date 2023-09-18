package Practice03;

public class Ternary03 {
    public static void main(String[] args) {
        //interview question
        /*    Example 1: Verilen yilin "Artik Yil"(Leap Year) olup olmadigini kontrol eden kodu yaziniz.
                       1)Yil 100'e bolunurse 400'e de bolunmelidir. 1600==>Leap    1800==>Leap degil
                       2)Yil 100'e bolunmuyorsa 4'e bolunmelidir. 2004==>Leap    2005==>Leap degil
         */
        double year=2005;
        Object sonuc=(year%100==0)?(year%400==0?"Leap":"Leap Değil"):(year%4==0?"Leap":"Leap Değil");
        System.out.println(sonuc);
    }
}
