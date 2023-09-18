package Practice04;

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
        int[]sayilar=new int[5];
        for (int i = 0; i <sayilar.length ; i++) {
            System.out.println(i+". sayı : ");
            sayilar[i]=scan.nextInt();

        }
        System.out.println(Arrays.toString(sayilar));
        int toplam=0;
        for (int w:sayilar) {
            toplam+=w;
        }
        double ort=toplam/5;
        System.out.println("ort = " + ort);
        System.out.println();
        System.out.println("toplam "+toplam);
        for (int w:sayilar) {
            if(w>ort)
                System.out.print(w+" ");
        }
        System.out.println();
        int i=0;
        for (int w:sayilar) {
            sayilar[i]=w*-1;
            i++;
        }
        System.out.println(Arrays.toString(sayilar));
    }
}
