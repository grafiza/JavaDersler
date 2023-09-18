package ssg01;

public class nestedforloop {
    public static void main(String[] args) {
        int satir=5;
        for (int i = 1; i <=satir ; i++) {
            for (int j = 1; j <=satir-i ; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j <=i ; j++) {
                System.out.print(". ");
            }
            System.out.println();
        }
    }
}
