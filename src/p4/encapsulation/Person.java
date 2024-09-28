package p4.encapsulation;

public class Person {
    private String name;
    private int age;

    void display(){
        System.out.println("name : "+name);
        System.out.println("age : "+age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
