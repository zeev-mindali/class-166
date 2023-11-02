package simple_jave.test_prep.cls;

public class Manager extends Worker{
    private Salary salary;
    private String position;
    public Manager(String name, int expirance, Salary salary, String position) {
        super(name, expirance);
        setSalary(salary);
        setPosition(position);
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        if (salary.amount<35_000) {
            salary.amount = 35_000;
        }
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
