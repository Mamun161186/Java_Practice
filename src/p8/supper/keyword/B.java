package p8.supper.keyword;

public class B extends A{

    int x = 10;
    @Override
    void display(){
        super.display();
        System.out.println("sub class");
        System.out.println(x);
        System.out.println(super.x);
    }

    B(){
        super();
        System.out.println("B constructor");
    }
}
