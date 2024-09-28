package p9.super2.constructor;

public class Car extends  Vehicle{
    int weight;

    Car(int g, String c, int w){
        super(c,g);
        weight = w;
    }
    @Override
    void display(){
        System.out.println(colour);
        System.out.println(gear);
        System.out.println(weight);
    }
}
