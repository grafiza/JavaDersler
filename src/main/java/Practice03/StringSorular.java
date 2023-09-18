package Practice03;

public class StringSorular {
    public static void main(String[] args) {
        String str = "seyhan yavuz";
        System.out.println(str.replace("s", "S"));
        System.out.println(str.replace("y", "Y"));


        System.out.println(str.replaceAll("s", "S"));
        System.out.println(str.replaceAll("y", "Y"));



        String javv="Java kolaydır";

        System.out.println(javv.endsWith("r"));
        System.out.println(javv.endsWith("dır"));
        System.out.println(javv.endsWith(""));
        System.out.println(javv.endsWith("Java kolaydır"));



        String b="Ali 12 ?_";
        System.out.println(b.replaceAll("\\d","*"));
        System.out.println(b.replaceAll("\\D","*"));
        System.out.println(b.replaceAll("\\S","*"));
        System.out.println(b.replaceAll("\\w","*"));



        String str1 = "Java code yaz";
        System.out.println(str1.substring(5));
        System.out.println(str1.substring(12));
        System.out.println(str1.substring(5,9));
        System.out.println(str1.substring(8,8));
    }
}
