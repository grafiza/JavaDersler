package Constructors;

public class Car {
    // pasif özellikler
    public String make="Honda";
    public String model="Civic";
    public int year=2022;
    boolean hybrd=true;

    public Car() {
    }

    public Car(String make, String model, int year, boolean hybrd) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrd = hybrd;
    }

    // aktif özellikler
    public void hareket(){
        System.out.println("Hareket metodu çalıştı");
    }
    public void fren(){
        System.out.println("Fren çalıştı");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrd=" + hybrd +
                '}';
    }
}
