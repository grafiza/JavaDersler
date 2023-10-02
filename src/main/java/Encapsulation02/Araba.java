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

    protected String model;
    protected String renk;
    protected int motor;
    protected int yil;

    public Araba(String model, String renk, int motor, int yil) {
        this.model = model;
        this.renk = renk;
        this.motor = motor;
        this.yil = yil;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getMotor() {
        return motor;
    }

    public void setMotor(int motor) {
        this.motor = motor;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
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
