package p1.object;

public class Test {
    public static void main(String[] args) {
        Teacher  t1 = new Teacher();
        t1.name = "mamun";
        t1.gneder = "male";
        t1.phone = 1859444664;
        System.out.println(t1.gneder);
        System.out.println(t1.name);
        System.out.println(t1.phone);
        Teacher  t2 = new Teacher();
        t1.name = "sara";
        t1.gneder = "female";
        t1.phone = 12345678;
        System.out.println(t1.gneder);
        System.out.println(t1.name);
        System.out.println(t1.phone);
    }
}
