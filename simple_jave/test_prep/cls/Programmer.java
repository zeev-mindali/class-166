package simple_jave.test_prep.cls;

public class Programmer extends Worker{
    private Salary salary;

    public Programmer(String name, int expirance, Salary salary) {
        super(name, expirance);
        setSalary(salary);
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }
}
