package Static_OOP;

public class StaticBlock {
    static double pi;
    static {
        pi=3.14;
        System.out.println("Statik blog1");// bu satır main den önce çalışır. Çünkü static blog
    }

    public static void main(String[] args) {
        System.out.println("main blog");
    }
}
