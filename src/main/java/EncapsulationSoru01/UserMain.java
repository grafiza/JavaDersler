package EncapsulationSoru01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {
    static Scanner scan=new Scanner(System.in);
static int id=100;
    public static void main(String[] args) {

        String username,password;
        List<User> myList=new ArrayList<>();
        User user=new User();
        for (int i = 0; i <2; i++) {
            System.out.println(i+1+". Kullanıcı adı:");
            username=scan.nextLine();
            do {
                System.out.println(i+1+". Şifre:");
                password = scan.nextLine();
                sifreKontrol(password);
            }while (!sifreKontrol(password));

            user.setActive(true);
            user.setSignedIn(true);
            user.setUserName(username);
            user.setPassword(password);

            myList.add(user);
            id++;
        }
        System.out.println(myList);
    }

    private static boolean sifreKontrol(String sifre) {
        return sifre.length()>5;
    }
}
