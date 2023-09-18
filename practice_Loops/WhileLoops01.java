package practice_Loops;

public class WhileLoops01 {
    public static void main(String[] args) {
        //Example 1: 3'den 6'ya kadar tamsayilari console'a yazdiriniz
        int a=3;
        while(a<7){
            System.out.println(a);
            a++;
        }

        //Example 2: 23'den 12'ye kadar cift tamsayilari console'a yazdiriniz

        int b=23;
        while(b>11){
            if(b%2==0)
                System.out.println(b);
            b--;
        }

        //Example 1: Kullanicinin verdigi sayi icin carpim tablosunu olusturup console'a yazdiran kodu yaziniz
        /*            3 ==> 3x1=3
                            3x2=6
                            3x3=9
                            3x4=12 ...
                            3x10=30*/

        int c=4;
        int d=1;
        while(d<11){
            System.out.println(c+" x "+d+" = "+c*d);
            d++;
        }


        //Example 2: Belirli bir tamsayının palindrom olup olmadığını kontrol eden kodu yazın
        //           Palindrome: 121 <==> 121        123321 <==> 123321

        int e=1321;
        String textNumber=String.valueOf(e);
        String reversed="";
        int numLenghth=textNumber.length()-1;
        while (numLenghth>=0){
            reversed+=textNumber.charAt(numLenghth);
            numLenghth--;
        }
        System.out.println("reversed = " + reversed);
        if (reversed.equals(textNumber))
            System.out.println("Polindrom");
            else
            System.out.println("Polindrom değil");

    }
}
