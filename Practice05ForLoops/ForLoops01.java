package Practice05ForLoops;

public class ForLoops01 {
    public static void main(String[] args) {
        int bas=10;
        int bitis=30;
        for (int i = bas; i <=bitis ; i++) {
            if(i<bitis)
                System.out.print(i+",");
            else
                System.out.println(i);
        }
    }
}
