package Practice02;

import java.util.Scanner;

public class IfStatements {
    public static void main(String[] args) {
        // Kullanıcının girdiği kenar uzunluklarına göre kare olup olmadığının kontrolu

        Scanner scan=new Scanner(System.in);
        System.out.print("Kenar uzunluğunu giriniz:");
        byte kenar1=scan.nextByte();
        System.out.print("Kenar uzunluğunu giriniz:");
        byte kenar2=scan.nextByte();
        if(kenar2==kenar1){
            System.out.println("Bu bir karedir.");
        }
        else{
            System.out.println("Bu bir dikdörgendir");
        }
    }
}
