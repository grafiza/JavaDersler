package KitaptanSorular;

public class ArraysSesliHarfSayisi {
    public static void main(String[] args) {
        String s = "Apex is an object oriented programming language";
        int sayi = s.toLowerCase().replaceAll("[^aeiou]","").length();
        System.out.println(sayi);




    }
}
