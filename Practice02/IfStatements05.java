package Practice02;

import java.util.Scanner;

public class IfStatements05 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Üçgenin 1. kenar uzunluğunu giriniz:");
        byte kenar1=scan.nextByte();
        System.out.println("Üçgenin 2. kenar uzunluğunu giriniz:");
        byte kenar2=scan.nextByte();
        System.out.println("Üçgenin 3. kenar uzunluğunu giriniz:");
        byte kenar3=scan.nextByte();
        if(kenar1==kenar2 && kenar2==kenar3)

        System.out.println("Eşkenar üçgen");
        else
            System.out.println("Eşkenar üçgen değil");
    }
}
