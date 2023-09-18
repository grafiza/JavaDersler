package Static_OOP;

public class InstanceBlock {
    public int year;

    public InstanceBlock() {
    }

    public InstanceBlock(int year) {
        this.year = year;
    }


    // inctance block : burası constructor lar çalıştırıldığında otomatik çalışır.
    {
        System.out.println("Hello world");
    }
}
