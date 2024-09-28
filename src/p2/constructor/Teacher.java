package p2.constructor;

public class Teacher {
    String name, gender;
    int phone;
    
    Teacher(){
        System.out.println("default constructor");
    }

    Teacher(String n, String g, int p){
        name = n;
        gender = g;
        phone = p;

    }
    void display(){
        System.out.println("gender: "+gender);
        System.out.println("name: "+name);
        System.out.println("phone: "+phone);
        System.out.println("\n");
    }
}
