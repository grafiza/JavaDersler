package Practice03;

public class forDonguleri {
    public static void main(String[] args) {
        for(int i=1; i<10; i=i+2){
            System.out.println(i);
        }
        for(int i=1; i<=9; i++){
            System.out.println(i);
            i++;
        }
        String str = "Java";
        System.out.println(str.replace("", "/"));



        String s = "Java is Java";
        System.out.println(s.indexOf("va", 2));
        System.out.println(s.indexOf('a', 4));
        System.out.println(s.indexOf("Java"));


        String s11 = "Java is Java";
        System.out.println(s11.toUpperCase().lastIndexOf("V"));
        System.out.println(s.toLowerCase().lastIndexOf("j"));
    }


}
