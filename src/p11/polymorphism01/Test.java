package p11.polymorphism01;

public class Test {
    public static void main(String[] args) {
        Person t = new Teacher();

        Person p = new Person();
        p.display();
        p = new Teacher();
        p.display();
        System.out.println(p.a);
        p = new Student();
        p.display();


        t.display();


    }
}
