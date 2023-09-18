package Sorular;

import java.util.Scanner;

/* Iki kisinin oynayacagi bir kelime oyunu uretelim
 * Kurallar
 * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
 *
 * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
 *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
 *        ve 3.adima gecin
 *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
 *        kazandigini yazip oyunu bitirin
 *
 * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
 *      * devam etmek isterse kelimeye eklemek istedigi string'i ve
 *          basa mi sona mi ekleyecegini sorun
 *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
 *
 *      *   Devam etmek istemezse
 *          "Oyun bitti" yazin
 *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
 */
public class KelimeOyunu {
    static int player1;
    static int player2;
    static String word;
    public static void main(String[] args) {
     start();
    }

    private static void start() {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir kelime giriniz : ");
        String tempWord=scan.next();
        System.out.println("Girilen Kelime : "+tempWord);
        isAccept(tempWord);

    }

    private static void isAccept(String tempWord) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Kabul ediyor musunuz? (E/H)");
        String select=scan.next();
        if(select.equals("E") || select.equals("e")){
            player1+=tempWord.length();
            isAgain();
        }else{
            player2+=tempWord.length();
            System.out.println("Geçersiz Kelime");
            System.out.println("Kazanan 2. Oyuncu !\n"+player2+" puan");
        }
    }

    private static void isAgain() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Devam etmek istiyor musunuz ?(E/H)");
        String select=scan.next();
        if(select.equals("E") || select.equals("e")){
            System.out.println("Yeni Kelime : ");
            String newWord=scan.next();
            System.out.println("Başa mı eklensin, sona mı? (1/2)");
            int secim=scan.nextInt();
            word=secim==1?(newWord+","+word):(word+","+newWord);
            isAccept(newWord);
        }
        else{
            System.out.println("Oyun bitti.");
            System.out.println("player1 = " + player1);
            System.out.println("player2 = " + player2);
            String kazanan=(player1>player2)?"1. Oyuncu":"2. Oyuncu";
            System.out.println("Kazanan :"+kazanan);
        }
    }

}
