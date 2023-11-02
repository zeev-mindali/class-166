package simple_jave.test_prep.cls;

public class TeamLeader extends Worker{
    private Salary salary;

    public TeamLeader(String name, int expirance, Salary salary) {
        super(name, expirance);
        setSalary(salary);
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        if (salary.amount<20_000){
            salary.amount=20_000;
        }
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "TeamLeader{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", expirance=" + expirance +
                '}';
    }
}
