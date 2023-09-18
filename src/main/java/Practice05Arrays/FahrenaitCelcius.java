package Practice05Arrays;

import java.util.Scanner;

public class FahrenaitCelcius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8

        //Not: fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli

        Scanner scan=new Scanner(System.in);
        System.out.println("Sıcaklık giriniz (F): ");
        double sicaklik=scan.nextInt();
        double derece=Fahr(sicaklik);
        System.out.println("sicaklik = " + derece+ " °C");
    }
    public static double Fahr(double f){
        double celcius=(f-32)/1.8;
        return celcius;
    }
}
