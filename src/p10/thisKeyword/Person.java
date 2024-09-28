package p10.thisKeyword;

public class Person {
    String name;
    int age;
    String hairColor;

    Person(String name, int age){
        this.age = age;
        this.name = name;

    }
    Person(int a, String n, String hairColor){
        this(n,a);
        this.hairColor = hairColor;
    }
    void display(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(hairColor);
    }
}
