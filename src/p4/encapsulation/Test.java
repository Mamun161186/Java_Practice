package p4.encapsulation;

public class Test {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.display();
        p1.setName("jashim");
        p1.setAge(80);
        System.out.println(p1.getName());
        System.out.println(p1.getAge());
        p1.display();

        Person p2 = new Person();
        p2.display();
        p2.setAge(40);
        p2.setName("babor");
        System.out.println(p2.getName());
        System.out.println(p2.getAge());
        p2.display();

        System.out.println(p1.getName());
    }
}
