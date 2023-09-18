package practice_Loops;

public class ForLoops01 {
    public static void main(String[] args) {
        /*
        Example 1: Asagidaki ciktiyi verecek kodu yaziniz
                    Week: 1
                      Day: 1
                      Day: 2
                      Day: 3
                      .....
                    Week: 2
                      Day: 1
                      Day: 2
                      Day: 3
                      ....    */

        for(int i=1;i<5;i++)
        {
            System.out.println("Week :"+i);
            for (int j=1;j<8;j++)
                System.out.println("  Day :"+j);
        }


        /*
          Asagida gordugunuz sekli console'a yazdiran kodu olusturunuz

                X X X X X
                X X X X X
                X X X X X    */
        System.out.println();
        System.out.println();
        for(int k=1;k<4;k++){
            for(int m=1;m<6;m++) {
                System.out.print("X ");
            }
            System.out.println();
        }
    }
}
