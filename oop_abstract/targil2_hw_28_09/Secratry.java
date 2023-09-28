package oop_abstract.targil2_hw_28_09;

import java.util.Date;

public class Secratry extends Employee {
    protected int wordsInMinute;
    public Secratry(String name, int employee, double salary, int wordsInMinute) {
        super(name, employee, salary);
        this.wordsInMinute=wordsInMinute;
    }

    @Override
    protected void calcBouns() {
         this.salary+=500;
    }

    @Override
    public String toString() {
        return "Secratry{" +
                "wordsInMinute=" + this.wordsInMinute +
                ", name='" + this.name + '\'' +
                ", employee=" + this.employee +
                ", salary=" + this.salary +
                '}';
    }


}
