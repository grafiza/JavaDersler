package day10LoopsArrays;

import java.util.Scanner;

public class DoWhileLoop01 {
    public static void main(String[] args) {
        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        String userName="";
        String pwd="";
        Scanner scan=new Scanner(System.in);
        int sayac=0;
        do{
            if(sayac==4){
                System.out.println("Hesabınız bloke olmuştur");
                break;
            }
            System.out.println("Kullanıcı Adını Giriniz:");
            userName=scan.next();
            System.out.println("Şifreyi Giriniz");
            pwd=scan.next();
            if (userName.equals("admin") && pwd.equals("pwd123")){
                System.out.println("Hesabınıza Hoşgeldiniz");
                break;
            }


                sayac++;
        }while (true);
    }
}
