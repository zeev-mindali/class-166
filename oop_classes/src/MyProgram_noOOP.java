package oop_classes.src;

public class MyProgram_noOOP {
    //name of the cake
    static String name;
    //cake width
    static int width;
    //cake height
    static int height;
    //array of addson
    static String[] addson=new String[5];
    //price
    static double price;

    public static void main(String[] args) {
        System.out.println("Hello world");
        name="choco";
        width=30;
        height=10;
        addson[1]="Choco";
        addson[2]="sprinklers";
        price=30.00;
    }

    public static void printChoco(){
        System.out.println("bla bla bla");
    }
}
