package LoginPageApp;

import java.util.Scanner;

public class LoginPage {
    public static void main(String[] args) {
        start();
    }

    private static void start() {
        Scanner inp=new Scanner(System.in);

        UserService service=new UserService();

        int select;
        do {
            System.out.println("   User Login Panel");
            System.out.println("1. üye ol");
            System.out.println("2. Giriş yap");
            System.out.println("0. ÇIKIŞ");
            System.out.println("Seçiminiz : ");
            select=inp.nextInt();// \n
            inp.nextLine();

            switch (select){
                case 1:
                    service.register();

                    break;
                case 2:
                    service.login();
                    break;
                case 0:
                    System.out.println("İyi günler dileriz...");
                    break;
                default:
                    System.out.println("Hatalı giriş, tekrar deneyiniz!!!");
                    break;
            }

        }while (select!=0);

    }

}
