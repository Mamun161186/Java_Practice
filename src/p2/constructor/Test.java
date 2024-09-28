package p2.constructor;

public class Test {
    public static void main(String[] args) {

        Teacher t5 = new Teacher("sajib", "male", 23454356);
        t5.display();

        Teacher t6 = new Teacher("jakir","male",98484937);
        t6.display();

        Teacher t7 = new Teacher();

        String t = new Teacher().name;
        System.out.println(t);

    }
}
