package Practice01;

public class Static03 {
    static int counter = 0;

    int age = 0;



    public Static03() {

        counter++;

        age++;

    }



    public static void main(String[] args) {

        Static03 obj1 = new Static03();

        Static03 obj2 = new Static03();

        Static03 obj3 = new Static03();



        System.out.println(obj1.counter);

        System.out.println(obj2.counter);

        System.out.println(obj3.counter);



        System.out.print(" - ");



        System.out.println(obj1.age);

        System.out.println(obj2.age);

        System.out.println(obj3.age);

    }
}
