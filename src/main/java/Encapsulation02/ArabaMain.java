package Encapsulation02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArabaMain {
    /*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- ArabaMain isminde main için bir class oluşturunuz.
 4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 5- aracların motor gücünü 100 beygir ve üstü olması ve yılını hatalı veri girisine karsi kontrol ediniz.
*/
    public static void main(String[] args) {
        List<Araba> arabalar=new ArrayList<>();
        Araba araba1 = new Araba("Mazda", "Kırmızı", 2000, 2023);
        Araba araba2 = new Araba("Mercedes", "Kırmızı", 2000, 2023);
        Araba araba3=new Araba();
        Scanner scan = new Scanner(System.in);
        String model, renk;
        int motor, yil;
        System.out.println("Model Giriniz");
        model = scan.nextLine();
        System.out.println("Renk Giriniz");
        renk = scan.nextLine();
        do {
            System.out.println("Motor gücü:");
            motor = scan.nextInt();
            scan.nextLine();
            motorKontrol(motor);
        } while (!motorKontrol(motor));
        do {
            System.out.println("Model Yılı:");
            yil = scan.nextInt();
            scan.nextLine();
            yilKontrol(yil);
        } while (!yilKontrol(yil));
        araba3.setModel(model);
        araba3.setRenk(renk);
        araba3.setYil(yil);
        araba3.setMotor(motor);
        arabalar.add(araba1);
        arabalar.add(araba2);
        arabalar.add(araba3);
        System.out.println(arabalar);
    }

    private static boolean yilKontrol(int yil) {
        return yil > 1900 && yil < 2024;
    }

    private static boolean motorKontrol(int motor) {
        return motor >= 100;
    }
}
