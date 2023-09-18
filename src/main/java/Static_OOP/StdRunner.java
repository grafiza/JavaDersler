package Static_OOP;

public class StdRunner {
    public static void main(String[] args) {
        System.out.println(Student.stdname);
        Student std=new Student();
        System.out.println(std.age);
        Student std1=new Student();
        std1.age=11;
        System.out.println(std1.age);
        Student.yaz();
        std1.instanceMetot();
    }
}
