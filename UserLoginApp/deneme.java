package UserLoginApp;

import java.util.Scanner;

public class deneme {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        boolean isSpace;
        boolean isLength;
        boolean isLower;
        boolean isUpper;
        boolean isNumber;
        boolean isSymbol;
        boolean allTrue;
        do {
            System.out.println("şifre :");
            String password = scan.nextLine();
            isSpace=password.contains(" ");
            System.out.println("isSpace = " + isSpace);
            isLength=password.length()>=6;
            System.out.println("isLength = " + isLength);
            isLower=password.replaceAll("[^a-z]","").length()>0;
            System.out.println("isLower = " + isLower+" "+password.replaceAll("[a-z]",""));
            isUpper=password.replaceAll("[^A-Z]","").length()>0;
            System.out.println("isUpper = " + isUpper+" "+password.replaceAll("[^A-Z]",""));
            isNumber=password.replaceAll("[^0-9]","").length()>0;
            System.out.println("isNumber = " + isNumber+" "+password.replaceAll("[^0-9]",""));
            isSymbol=password.replaceAll("[a-zA-Z0-9]","").length()>0;

            System.out.println("isSymbol = " + isSymbol+" "+password.replaceAll("[a-zA-Z0-9]",""));


            if (!isSpace && isLength && isLower && isUpper && isNumber && isSymbol) {
                allTrue = true;
                System.out.println("burada...");
            }
            else {
                System.out.println("Hatalı giriş");
                allTrue = false;
            }
        }
        while (!allTrue);
        System.out.println("tamam");

    }
}
