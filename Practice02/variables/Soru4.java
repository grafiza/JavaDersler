package Practice02.variables;

import java.util.Scanner;

public class Soru4 {
    public static void main(String[] args) {
        /*
         Kullanicidan kilosunu ve boyunu alip
         Vucut kitle indeksini hesaplayan bir program yaziniz.
         Ipucu : Vucut
         Kitle Indeksi (VKI) = Vucut Agirligi(kg.) / Boy uzunlugunun karesi (m.)
         ORNEK:
         INPUT      : Kilo: 71
                           Boy: 1,72
         OUTPUT  : Vucut Kitle Indeksiniz : 23
             */

        Scanner scan=new Scanner(System.in);
        System.out.println("Boy :");
        double boy=scan.nextDouble();
        System.out.println("Kilo :");
        double kilo=scan.nextDouble();
        System.out.println("Vücut Kitle Endeksiniz :"+(int)(kilo/(boy*boy)));

       //System.out.println("x");
       //double x=scan.nextDouble();
       //System.out.println("y");
       //double y=scan.nextDouble();
       //int xy=(int)(x/y);
       //System.out.println(xy);
       //System.out.println((int)x);
       //System.out.println((int)y);

    }
}
