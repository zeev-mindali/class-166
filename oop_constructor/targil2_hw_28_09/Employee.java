package oop_constructor.targil2_hw_28_09;

public class Employee {
    protected String name;
    protected int employee;
    protected double salary;

    public Employee(String name, int employee, double salary) {
        this.name = name;
        this.employee = employee;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", employee=" + employee +
                ", salary=" + salary +
                '}';
    }

    protected void calcBouns(){
        //return 0.0;
        if (this instanceof Programmer){
            this.salary*=1.5;
        };
        if (this instanceof Secratry){
            this.salary+=500;
        }
    }

    protected void updateSalary(double salary){
        this.salary=salary;
    }
}
