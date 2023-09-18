package Practice01;

public class Swap {
    public static void main(String[] args) {
        int a=20;
        int b=30;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
