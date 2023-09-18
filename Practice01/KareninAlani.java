package Practice01;

import java.util.Scanner;

public class KareninAlani {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kare'nin bir kenar uzunlugunu giriniz");
        double kenar = scan.nextDouble();
        double alan = kenar*kenar;
        System.out.println("Alan: " + alan);

        char harf = scan.next().charAt(0);
        System.out.println("harf = " + harf);


    }
}
