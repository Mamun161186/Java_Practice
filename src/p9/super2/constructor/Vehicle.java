package p9.super2.constructor;

public class Vehicle {
    String colour;
    int gear;
    Vehicle(String colour, int gear){
        this.colour = colour;
        this.gear = gear;
    }
    void display(){
        System.out.println(colour);
        System.out.println(gear);
    }

}
