package Constructors;

public class CarRunner {
    public static void main(String[] args) {
        Car car=new Car();
        car.fren();
        car.hareket();
        car.make="Mazda";
        System.out.println(car.make);
        Car c2=new Car("Mercedes","c200",2023,true);
        c2.hareket();
        System.out.println(c2.make);

        System.out.println(c2);
    }
}
