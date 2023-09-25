import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class GuessMovie {
    static List<String> film = new ArrayList<>(Arrays.asList("JOKER", "INCEPTION", "PIYANIST", "GREENMILE", "LEON", "GODFATHER", "JURASSICPARK", "TITANIC"));
    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        /*
static List<String> film = new ArrayList<>(Arrays.asList("JOKER","INCEPTION","PIYANIST","GREENMILE","LEON","GODFATHER","JURASSICPARK","TITANIC"));


 TASK :
  yukarıdaki film listinde bulunan filmlerden herhangi birisini kullanıcının filim ismini  görmeden
  filmin index nosuna göre sectiriniz
  seçilen filmin  ismini filmin harf saysının 2 katı kadar hak tanıyarak tahmin etmesini
  sağlayan method create ediniz...
  Ahanda TRICK...
  kullanıcının sectiği filmin harf sayısını  console yazdırınız.
  kullanıcının sectiği film için tahmin hakkını  console yazdırınız.
  kullanıcının her tahmininde kalan hak sayısını console yazdırınız.
  kullanıcının her tahmininde doğru ve yanlış tahmin  sayısını console yazdırınız.
  kullanıcının kaybedip veya kazandığını ve tahmin etmesi gereken filmin ismini  console yazdırınız.

 */
        int index = -1;
        int movieNameLength = 0, guessTrueCount = 0, guessFalseCount = 0, guessCount;
        String movieName = "";
        String guess;
        System.out.println("0-7 arasında bir sayı giriniz...");
        index = scan.nextInt();
        String dummy = scan.nextLine();

        if (index > -1 && index < 8) {
            movieName = film.get(index);
            movieNameLength = movieName.length();
            guessCount = 2 * movieNameLength;
            System.out.println("* ".repeat(movieNameLength) + " " + movieNameLength + " karakter");
            do {
                System.out.println("Kalan Tahmin Hakkınız: " + guessCount);
                System.out.println("Tahmininizi Giriniz:");
                guess = scan.nextLine();

                boolean control=guessMovie(guess.toUpperCase(), movieName);
                if (control) {
                    guessTrueCount++;
                    System.out.println("Doğru Tahmin Sayısı: " + guessTrueCount);
                    System.out.println("Yanlış Tahmin Sayısı: " + guessFalseCount);
                    System.out.println("Tebrikler. " + (guessFalseCount+1) + " denemede bildiniz");
                    break;
                } else {
                    System.out.println("Maalesef yanlış.");
                    guessFalseCount++;
                    System.out.println("Yanlış Tahmin Sayısı: " + guessFalseCount);
                    System.out.println("Doğru Tahmin Sayısı: " + 0);
                }
                guessCount--;
                if(guessCount==0){
                    System.out.println("Kaybettiniz!");
                    System.out.println("Filmin Adı : "+ movieName);
                }
            } while (guessCount != 0);
        }else{
            System.out.println("Hatalı Giriş");
        }


    }

    private static boolean guessMovie(String guess, String movieName) {
        if (guess.equals(movieName))
            return true;
        else
            return false;
    }
}
