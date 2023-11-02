package simple_jave.oop_constructor.targil2_hw_28_09;

public class Secratry extends Employee{
    protected int wordsInMinute;
    public Secratry(String name, int employee, double salary, int wordsInMinute) {
        super(name, employee, salary);
        this.wordsInMinute=wordsInMinute;
    }

//    @Override
//    protected double calcBouns() {
//        return this.salary+=500;
//    }

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
