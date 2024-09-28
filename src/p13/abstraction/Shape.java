package p13.abstraction;

public interface Shape {
    default void msg(){
        System.out.println("this is default shape");
    }
    void msg2();
    static void msg3(){
        System.out.println("this is static shape");
    }

}
