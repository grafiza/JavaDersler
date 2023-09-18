package Practice05ForLoops;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class soruSemii {
    public static void main(String[] args) {
        List<String> days = new ArrayList<>();
        days.add("Pazartesi");
        days.add("Salı");
        days.add("Çarşamba");
        days.add("Perşembe");
        days.add("Cuma");
        days.add("Cumartesi");
        days.add("Pazar");

        List<Double> money = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        int i = 0;
        while (i < days.size()) {
            System.out.println(days.get(i) + " gününün kazancını giriniz...");
            money.add(scan.nextDouble());
            i++;
        }

        double ort = getOrtalamaKazanc(money);
        System.out.println("Ortalama Kazanç: " + ort);
        List<String> ortalamaUstuGunler = getOrtalamaninUstundeKazancGunleri(ort, money, days);
        List<String> ortalamaAltiGunler = getOrtalamaninAltindaKazancGunleri(ort, money, days);
        System.out.println("Ortalama üstü kazanç elde edilen günler: " + ortalamaUstuGunler);
        System.out.println("Ortalama altı kazanç elde edilen günler: " + ortalamaAltiGunler);
    }

    public static Double getOrtalamaKazanc(List<Double> money) {
        Double toplam = 0.0;
        for (Double w : money) {
            toplam += w;
        }
        return toplam / money.size();
    }

    public static List<String> getOrtalamaninUstundeKazancGunleri(double avg, List<Double> money, List<String> days) {
        List<String> avgUstuGunler = new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            if (money.get(i) > avg) {
                avgUstuGunler.add(days.get(i));
            }
        }
        return avgUstuGunler;
    }

    public static List<String> getOrtalamaninAltindaKazancGunleri(double avg, List<Double> money, List<String> days) {
        List<String> avgAltiGunler = new ArrayList<>();
        for (int i = 0; i < days.size(); i++) {
            if (money.get(i) < avg) {
                avgAltiGunler.add(days.get(i));
            }
        }
        return avgAltiGunler;
    }
}
