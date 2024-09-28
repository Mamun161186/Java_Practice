package p3.static01;

public class Student {
    String name;
    int id;
    static String universityName = "uiu";
    Student(String n, int i){
        name = n;
        id = i;
    }
    void displayInformation(){
        System.out.println("name : "+name);
        System.out.println("id : "+ id);
        System.out.println("University : "+universityName);
    }


}
