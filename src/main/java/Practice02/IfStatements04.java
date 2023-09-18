package Practice02;

import java.util.Scanner;

public class IfStatements04 {
    public static void main(String[] args) {
        // Girilen gün bilgisine göre haftaiçi mi yoksa haftasonu mu olduğunu yazdır

        Scanner scan=new Scanner(System.in);
    String gun=scan.next();
    if (gun.equals("Pazar") || gun.equals("Cumartesi"))
    {
        System.out.println("Haftasonu");
    }
    else
        System.out.println("Haftaiçi");
    }
}
