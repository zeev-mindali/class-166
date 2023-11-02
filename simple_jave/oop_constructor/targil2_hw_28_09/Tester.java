package simple_jave.oop_constructor.targil2_hw_28_09;

public class Tester {
    public static void main(String[] args) {
        Programmer programmer = new Programmer("Avi",1001,18_000);
        Secratry secratry = new Secratry("Hadas",1002,22_000,1000);
        //Employee employee = new Employee("zeev",1003,82_000);

        System.out.println(programmer);
        System.out.println(secratry);
        System.out.println("=======================================");
        programmer.calcBouns();
        secratry.calcBouns();
        System.out.println(programmer);
        System.out.println(secratry);
    }
}
