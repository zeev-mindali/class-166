package simple_jave.targil2_hw_28_09;

public class Tester {
    public static void main(String[] args) {
        Employee programmer = new Programmer("Avi",1001,18_000);
        Employee secratry = new Secratry("Hadas",1002,22_000,1000);
        Zeev zeev = new Zeev("Zeev",1000);
        //Employee employee = new Employee("zeev",1003,82_000);

//        System.out.println(programmer);
//        System.out.println(secratry);
//        System.out.println("=======================================");
        //programmer.calcBouns();
        //secratry.calcBouns();
        //System.out.println(programmer);
        //System.out.println(secratry);

        Employee[] employees = {programmer,secratry};
        for (int index=0;index<employees.length;index++){
            System.out.println(employees[index]);
            employees[index].calcBouns();
            System.out.println(employees[index]);
        }
    }
}
