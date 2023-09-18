package KitaptanSorular;

public class Variables01 {
    public static void main(String[] args) {
        /*
        Herhangi bir 3 ögenin fiyatları için double data tipinde degiskenler olusturunuz. Fiyatların
toplamını konsola yazdırınız.
         */
        double a=12.99;
        double b=23.77;
        double c=12.44;
        System.out.println("Toplam :"+(a+b+c));
        System.out.println("---------------");
/*
Herhangi bir 3 öge için float, long ve integer data tipinde degiskenler olusturunuz. Bu
degiskenlerin degerlerinin çarpımını konsolda yazdırınız.
 */
        float f=12.4f;
        long l=34L;
        int i=12;
        System.out.println("Çarpım :"+f*l*i);
        System.out.println("---------------");
/*
Basit faizi bulmak için bir kod yazınız.
Not: Basit faiz formülü = anapara * oran * yılDegeri /100
 */
        int anapara=10000,oran=6, yilDegeri=3;
        System.out.println("Faiz : "+anapara*oran*yilDegeri/100);

        System.out.println("---------------");
/*
Bir String ve iki long data tipinde degisken olusturunuz. Konsolda bu long degiskenlerin
toplamını ve çarpımını String ile yazdırınız.
 */
        String deger="";
        long l1=133L;
        long l2=43433L;
        System.out.println(deger+(l1+l2));
        System.out.println(deger+(l1*l2));

        System.out.println("---------------");
        /*
        Degerleri farklı olan iki boolean data tipinde degisken olusturunuz ve bu degerleri iki
ardısık deger arasında bosluk bırakacak sekilde aynı satırda yazdırınız.
         */
        boolean b1=true;
        boolean b2=false;
        System.out.println("1 " + b2+" 2 "+b1);

        System.out.println("---------------");
/*
3 öge (kitap, defter ve laptop) fiyatı için long data tipinde degiskenler olusturunuz.
Konsolda 2 kitap, 4 defter ve 3 laptop için toplam fiyatını yazdırınız.
 */
        long kitap=100L,defter=75L,laptop=17000L;
        System.out.println("Toplam Fiyat :"+(2*kitap+4*defter+3*laptop));
        System.out.println("---------------");
/*
Iki tamsayıyı degistirmek için bir kod yazınız.
 */
int num1=129;
int num2=43;
num1=num1+num2;
num2=num1-num2;
num1=num1-num2;
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);


    }
}
