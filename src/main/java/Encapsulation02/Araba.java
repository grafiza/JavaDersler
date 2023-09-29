package Encapsulation02;

public class Araba {
    /*
 1- fieldları(encapsulated) model(String), renk(String), motor(int), yil (int)
   olan Araba  isimli bir class cretae ediniz.
 2- bütün fieldları parametre alan bir constructor tanımlayınız.
 3- ArabaMain isminde main için bir class oluşturunuz.
 4- İki adet parametreli const 1 adet parametresiz cons ile 3 adet araba creat ediniz
 5- aracların motor gücünü 100 beygir ve üstü olması ve yılını hatalı veri girisine karsi kontrol ediniz.
*/

    public Araba() {
    }

    private String model;
    private String renk;
    private int motor;
    private int yil;

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

    @Override
    public String toString() {
        return "Araba{" +
                "model='" + model + '\'' +
                ", renk='" + renk + '\'' +
                ", motor=" + motor +
                ", yil=" + yil +
                '}'+"\n";
    }
}
