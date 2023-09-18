package Practice01;

public class TypeCasting {
    public static void main(String[] args) {
        byte a=123;
        short b=a;
        int c=a;
        float d=a;
        long e=a;
        double f=a;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);
        System.out.println("f = " + f);

        int x=2900;
        short y=(short)x;

        byte z=(byte)x;
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);

        System.out.println("---------------------\n\n");
        double sayi1=255.36;
        int sayi2=(int)sayi1;
        byte sayi3=(byte) sayi2;
        System.out.println("sayi1 = " + sayi1);
        System.out.println("sayi2 = " + sayi2);
        System.out.println("sayi3 = " + sayi3);
        System.out.println("---------------------\n\n");

        System.out.println("iki integer sayının bölümü");
        int a1=1999;
        int b1=288;
        System.out.println(a1/b1);
        System.out.println("---------------------\n\n");

        System.out.println("integer sayının double sayıya bölümü");
        int s=1988;
        double bolum=233;
        System.out.println(s/bolum);


    }
}
