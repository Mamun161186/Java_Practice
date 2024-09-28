package p3.static01;

public class StaticBlock {
    static int id;
    static String name;

    static {
       id= 101;
       name= "anis";
        System.out.println("hi");
    }
    static void display(){

        System.out.println(id);
        System.out.println(name);
    }
    void add(int a, int b){

    }
    int add( char b,int c){
    return c;
    }


    public static void main(String[] args) {
        //StaticBlock.display();
        int sum = 0;
        for(int i = 0; i<=100; i++){
            sum = sum + i ;
            System.out.println(sum);
        }
    }


}
