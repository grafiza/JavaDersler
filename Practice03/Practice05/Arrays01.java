package Practice03.Practice05;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays01 {
    public static void main(String[] args) {
        /*
        5 elemanlı bir array olusturunuz(int)
        Arrayin elemanlarını sıra ile kullanıcıdan alınız, arrayi yazdırınız
        Arrayın elemanlarının ortalamasını bulunuz, ortalamayı yazdırınız
        Ortalamadan daha buyuk olan array elemanlarını yazdırınız
        Arrayin elemanlarının işaretlerini degistiren bir kod yazzınız
         */
        Scanner scan=new Scanner(System.in);
        int dizi[]=new int[5];
        int toplam=0;
        double ortalama=0;
        for (int i = 0; i <5 ; i++) {
            System.out.println("Dizinin "+(i+1)+". elemanı:");
            dizi[i]=scan.nextInt();

        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
        for (int i = 0; i < dizi.length; i++) {
            toplam+=dizi[i];
        }
        ortalama=toplam/dizi.length;
        System.out.println("ortalama = " + ortalama);
        for (int i = 0; i <dizi.length ; i++) {
            if(dizi[i]>ortalama)
                System.out.println(dizi[i]);
        }
        for (int i = 0; i <dizi.length ; i++) {
            dizi[i]=dizi[i]*-1;
        }
        System.out.println("Arrays.toString(dizi) = " + Arrays.toString(dizi));
    }
}
