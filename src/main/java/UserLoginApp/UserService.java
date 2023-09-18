package UserLoginApp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {
    List<String> emails=new ArrayList<>();
    List<String> passwords=new ArrayList<>();
    //List<User> users=new ArrayList<>();-->practice


   //2-ad-soyad,email,şifre alıp->listeye kaydedelim
   public void register() {
       Scanner inp=new Scanner(System.in);
       System.out.println("Ad-Soyad giriniz: ");
       String name=inp.nextLine();

        //email geçersizse tekrar girilmeli
        String email;
        boolean isValid;
        boolean isExistEmail;
        do {
            System.out.println("Email giriniz :");
            email=inp.nextLine();
            isValid=validateEmail(email);
            isExistEmail=this.emails.contains(email);
            if (isExistEmail){
                System.out.println("Bu email ile kayıtlı kullanıcı zaten var");
                isValid=false;
            }
        }while (!isValid);

       //passsword oluşturma...


   }

   //ÖDEVV:validateEmail ve validatePassword
   private boolean validateEmail(String email){



       boolean isSpace;
       boolean isSign;
       boolean isMail;
       boolean isValid;
       boolean allTrue;
       do {

           isSpace = email.contains(" ");

           isMail = email.contains("@");

           String mail = email.split("@")[1];
           String name = email.split("@")[0];
           isValid = name.replaceAll("[^a-zA-Z0-9-._]", "").length() == name.length();


           isSign = mail.equals("hotmail.com") || mail.equals("yahoo.com") || mail.equals("gmail.com");
           System.out.println(isSign);
           if (!isSpace && isSign && isMail && isValid)
               allTrue = true;

           else {
               System.out.println("Geçersiz email adresi. Lütfen tekrar giriniz.");
               allTrue = false;
           }
       }
       while (!allTrue);

       return true;

   }

   private boolean validatePassword(String password){
       boolean isSpace;
       boolean isLength;
       boolean isLower;
       boolean isUpper;
       boolean isNumber;
       boolean isSymbol;
       boolean allTrue;
       do {

           isSpace=password.contains(" ");
           isLength=password.length()>=6;
           isLower=password.replaceAll("[^a-z]","").length()>0;
           isUpper=password.replaceAll("[^A-Z]","").length()>0;
           isNumber=password.replaceAll("[^0-9]","").length()>0;
           isSymbol=password.replaceAll("[a-zA-Z0-9]","").length()>0;



           if (!isSpace && isLength && isLower && isUpper && isNumber && isSymbol) {
               allTrue = true;
           }
           else {
               System.out.println("Geçersiz Şifre");
               allTrue = false;
           }
       }
       while (!allTrue);

       return true;

    }
}
