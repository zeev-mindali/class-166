package oop_abstract.targil2_hw_28_09;

import java.util.Date;

public class Programmer extends Employee {
    public Programmer(String name, int employee, double salary) {
        super(name, employee, salary);
    }



        @Override
    protected void calcBouns() {
        this.salary*=1.5;
    }
}
