package KitaptanSorular;

import java.util.Arrays;

public class Arrays_Ortadaki_Eleman {

    public static void main(String[] args) {
        int a[]={2,101,51,43,65,12};
        Arrays.sort(a);
        int orta=0;
        if(a.length%2!=0) {
            orta = (a.length / 2);
            System.out.println("Arrays.toString(a) = " + Arrays.toString(a));
            System.out.println("a[orta] = " + a[orta]);
        }
        else {
           orta=(a.length / 2);
            System.out.println(orta);
            System.out.println("Arrays.toString(a) = " + Arrays.toString(a));

            System.out.println("a[orta] = " + (a[orta]+a[orta-1])/2);
        }
    }
}
