package ssg01;

public class nestedfor02 {
    public static void main(String[] args) {
        int sayi=7;
        for (int i = 1; i <=sayi ; i++) {
            for (int j = sayi; j >=i ; j--) {
                System.out.print(j);

            }
            System.out.println();
        }

        // for döngüsünde char kullanımı
        for (char i = 'a'; i <'y' ; i++) {
            for (char j = 'a'; j <i; j++) {
                System.out.print(j+" ");
            }
            System.out.println(i);

        }
    }
}
