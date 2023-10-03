package LoginPageApp;

public class deneme {
    public static void main(String[] args) {
        String a=".,+4aB/*)(";
        System.out.println(a.replaceAll("\\P{Punct}", ""));
        System.out.println(a.replaceAll("[^0-9]", ""));
        System.out.println(a.replaceAll("\\D", ""));
        String b="zanvvc";
        System.out.println(b.replaceAll("[^a-zA-Z_._]", "").length()>0);
    }
}
