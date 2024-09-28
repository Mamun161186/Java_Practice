package p7.method.overriding;

public class Test {
    public static void main(String[] args) {
        Teacher t1 = new Teacher();
        Person p1 = new Person();
        t1.name ="sara";
        t1.age = 22;
        t1.qualification = "bscse";

        p1.name = "mamun";
        p1.age = 55;

        t1.displayInformation();
        p1.displayInformation();
    }
}
