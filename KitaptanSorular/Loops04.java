package KitaptanSorular;

public class Loops04 {
    public static void main(String[] args) {
        /*
        Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
A
A A
A A A
A A A A
         */
        for (int i = 1; i <5 ; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("A ");
            }
            System.out.println();

        }
    }
}
