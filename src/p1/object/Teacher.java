package p1.object;

public class Teacher {
    String name, gneder;
    int phone;
    void set(String n, String g, int p){
        name = n;
        gneder = g;
        phone = p;

    }
    void display(){
        System.out.println("gender: "+gneder);
        System.out.println("name: "+name);
        System.out.println("phone: "+phone);
        System.out.println("\n");
    }

}
