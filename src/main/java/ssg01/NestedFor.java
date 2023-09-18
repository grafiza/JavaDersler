package ssg01;

public class NestedFor {
    public static void main(String[] args) {
        for (int i = 0; i <4 ; i++) {
            for (int j = 0; j <6; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }




        for (int i = 1 ;i <=4 ; i++) {
            for (int j = 1; j <=6; j++) {
                if(i==2 && j==4)
                    System.out.print("! ");
                else if (i==3 && j==3)
                    System.out.print("! ");
                else
                System.out.print("* ");
            }
            System.out.println();
        }

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <i ; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
