package KitaptanSorular;

public class Loops09 {
    public static void main(String[] args) {
        /*
        Asagıdak! görüntüyü b!r for döngüsü kullanarak elde eden kodu yazınız.
A A A A A A A A
A X X X X X X A
A X X X X X X A
A X X X X X X A
         */
        int rows=4,columns=8,i=1;

        while (i<=rows)
        {String s="";
            if(i==1 || i==rows){
                for (int j = 1; j <=columns ; j++) {
                    s+="A ";
                } System.out.println(s);
            }
            else{
                s+="A ";
                for (int j = 2; j <columns ; j++) {
                    s+="X ";
                }
                s+="A ";
                System.out.println(s);
            }

i++;
        }


    }
}
