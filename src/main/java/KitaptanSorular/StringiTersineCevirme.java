package KitaptanSorular;

public class StringiTersineCevirme {
    public static void main(String[] args) {
        String metin="Zafer Kanbur";
        String reversed="";
        for (int i = metin.length()-1; i >=0 ; i--) {
            reversed+=metin.charAt(i);

        }
        System.out.println(reversed);
    }
}
