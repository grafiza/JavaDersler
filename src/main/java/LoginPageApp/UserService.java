package LoginPageApp;

import java.util.*;

public class UserService {

    Map<String, User> mapList = new HashMap<>();
    Scanner scan = new Scanner(System.in);

    void register() {

        String name, surname, email, password;
        boolean isValidEmail = false;
        boolean isExists = false;
        boolean isValidPass = false;
        System.out.println("Adınız:");
        name = scan.nextLine();
        System.out.println("Soyadınız:");
        surname = scan.nextLine();
        do {
            System.out.println("Email adresiniz:");
            email = scan.nextLine();
            if (this.mapList.keySet().contains(email)) {
                System.out.println("Bu email adresi kayıtlı");
                isValidEmail = false;
            } else
                isValidEmail = checkMail(email);
        } while (!isValidEmail);


        do {
            System.out.println("Şifreniz");
            password = scan.nextLine();
            isValidPass = checkPass(password);
        } while (!isValidPass);
        if (isValidEmail && isValidPass) {
            User user = new User(name, email, password);
            this.mapList.put(email, user);
        }
    }

    private boolean checkPass(String password) {
        boolean isBlank = false,
                isLenghtGreaterThan6 = false,
                isLowerCase = false,
                isUpperCase = false,
                isNumeric = false,
                isSymbol = false,
                isValid = false;

        isBlank = password.contains(" ");
        isLenghtGreaterThan6 = password.length() > 6;
        isLowerCase = password.replaceAll("[^a-z]", "").length() > 0;
        isUpperCase = password.replaceAll("[^A-Z]", "").length() > 0;
        isNumeric = password.replaceAll("[^0-9]", "").length() > 0;
        isSymbol = password.replaceAll("[\\P{Punct}]", "").length() > 0;


        if (isBlank) {
            System.out.println("Şifre boşluk içeremez.");
        } else if (!isLenghtGreaterThan6) {
            System.out.println("Şifre en az 6 karakter içermelidir!");
        } else if (!isUpperCase) {
            System.out.println("Şifre en az 1 tane büyük harf içermelidir!");
        } else if (!isLowerCase) {
            System.out.println("Şifre en az 1 tane küçük harf içermelidir!");
        } else if (!isNumeric) {
            System.out.println("Şifre en az 1 tane rakam içermelidir!");
        } else if (!isSymbol) {
            System.out.println("Şifre en az 1 tane sembol içermelidir!");
        }

        isValid = !isBlank && isLenghtGreaterThan6 && isLowerCase && isUpperCase && isNumeric && isSymbol;
        if (!isValid)
            System.out.println("Geçersiz Şifre. Lütfen tekrar deneyiniz");
        return isValid;
    }

    private boolean checkMail(String email) {
        boolean isValid = false;
        boolean isSpace = email.contains(" ");
        boolean isContainsAt = email.contains("@");
        if (isSpace)
            System.out.println("LÜtfen boşluk bırakmayınız");
        else if (!isContainsAt)
            System.out.println("Email @ sembolü içermelidir.");
        else {
            String first = email.split("@")[0];
            String second = email.split("@")[1];
            boolean isFirstValid = first.replaceAll("[^a-zA-Z_._]", "").length() == first.length();
            boolean isSecondValid = second.equals("yahoo.com") ||
                    second.equals("gmail.com") ||
                    second.equals("hotmail.com");
            if (!isFirstValid)
                System.out.println("Yalnızca harf,rakam ve -._ karakterleri kullanabilirsiniz");
            if (!isSecondValid)
                System.out.println("Sadece gmail.yahoo ve hotmail adresleri kullanabilirsiniz");
            isValid = isFirstValid && isSecondValid;

        }
        if (!isValid) {
            System.out.println("Geçersiz email, tekrar deneyiniz!");
        }
        return isValid;
    }

    void login() {
        String email,password;
        boolean isSuccess=false;
        do {
            System.out.println("E-mail:");
            email = scan.nextLine();
            System.out.println("Password:");
            password = scan.nextLine();
            User user = mapList.get(email);
            if (password.equals(user.getPassword())) {
                System.out.println("--------------");
                System.out.println("Giriş Başarılı");
                System.out.println("--------------");

                isSuccess=true;
            }
            else {
                System.out.println("Kullanıcı adı veya şifre hatalı");
                isSuccess=false;
            }
        }while (!isSuccess);
    }
}
