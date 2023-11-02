package simple_jave.test_prep.cls;

public class Salary {
    protected double amount;
    protected int bonus;

    public Salary(double amount, int bonus) {
      setAmount(amount);
      setBonus(bonus);
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        if (amount<10_000){
            this.amount=10_000;
            return;
        }
        if (amount>80_000){
            this.amount=80_000;
            return;
        }
        this.amount = amount;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus<0){
            this.bonus=0;
            return;
        }
        if (bonus>100_000){
            this.bonus=100_000;
            return;
        }
        this.bonus = bonus;
    }
}
