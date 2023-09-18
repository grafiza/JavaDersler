package Practice02.variables;

public class Soru5 {
    public static void main(String[] args) {
        /*
    Kişi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
    karakter sayısının toplamını yazdırınız.
     */
        String isim1=" A  h m e t ";
        String isim2=" A y t  e n ";
        String isim3=" E   b r u ";

        System.out.println(isim1.replaceAll("\\s","").length());
    }
}
