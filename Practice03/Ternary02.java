package Practice03;

public class Ternary02 {
    public static void main(String[] args) {
        //Example : Size verilen sayinin 3 basamakli olup olmadigini kontrol eden kodu yaziniz
        int num1=1323;
        String numControl=(num1>99 &&num1<1000)?"3 Basamaklı":"3 basamaklı değil";
        System.out.println(numControl);
    }
}
