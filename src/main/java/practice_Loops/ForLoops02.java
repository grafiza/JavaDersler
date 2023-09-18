package practice_Loops;

public class ForLoops02 {
    public static void main(String[] args) {
        //Example : verilen sayıda ondalık kısımdaki rakamların toplamını bulun
        //            28.587 ==> 5+8+7=20
        double num=28.587;
        String sayi=String.valueOf(num);
        String newNum=sayi.split("[.]")[1];
        int j=Integer.valueOf(newNum);
        int sum=0;

        System.out.println("j = " + j);
        System.out.println("sum = " + sum);
        for(int i=j;i>0;i=i/10){
            sum+=i%10;
        }
        System.out.println("sum = " + sum);








    }
}
