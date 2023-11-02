package simple_jave.oop_constructor.targil2_hw;
import simple_jave.oop_constructor.targil2_hw.cls.Square;

public class Tester {
    public static void main(String[] args) {

        //first case (without parameters)
//        Square square1 = new Square();
//        System.out.println("Area: "+square1.getArea());
//        System.out.println(square1.spr());
//        System.out.println("Perimeter: "+square1.getPerimeter());
//        System.out.println(square1.spr());
//        System.out.println(square1.print());
//        System.out.println(square1.spr());
//        System.out.println(square1.print('$'));

        Square square2 = new Square(8,4);
        System.out.println("Area: "+square2.getArea());
        System.out.println(square2.spr());
        System.out.println("Perimeter: "+square2.getPerimeter());
        System.out.println(square2.spr());
        System.out.println(square2.print());
        System.out.println(square2.spr());
        System.out.println(square2.print('$'));
    }
}
