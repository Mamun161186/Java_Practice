package p5.inheritance;

public class Teacher extends Person {
    String qualification;
    void display2(){
        display();
        System.out.println(qualification);
    }
}
