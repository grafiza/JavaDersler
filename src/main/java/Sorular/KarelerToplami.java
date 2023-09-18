package Sorular;

import java.util.Arrays;
import java.util.Random;

public class KarelerToplami {
    public static void main(String[] args) {
        int [] liste=new int[10];
        Random rnd=new Random();
        for (int i = 0; i < 10; i++) {
            liste[i]= rnd.nextInt(20);
        }
        int toplam=0;
        for (int w:liste             ) {
            toplam+=w*w;
        }
        System.out.println(Arrays.toString(liste));
        System.out.println(toplam);
    }
}
