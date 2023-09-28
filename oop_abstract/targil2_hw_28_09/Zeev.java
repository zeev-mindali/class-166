package oop_abstract.targil2_hw_28_09;

public class Zeev {
    private String name;
    private double salary;

    public Zeev(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Zeev{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
