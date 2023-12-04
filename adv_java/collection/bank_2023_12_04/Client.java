package adv_java.collection.bank_2023_12_04;

public abstract class Client extends Person{
    private float interestRate;
    private Account account;
    private static int counter=1;

    public Client(float interestRate, Account account){
        super();
        this.id=counter;
        this.name = "Client "+this.id;
        this.interestRate = interestRate;
        this.account=account;
    }

    public float getInterestRate() {
        return interestRate;
    }

    public Account getAccount() {
        return account;
    }

    @Override
    public String toString() {
        return super.toString() + "\n\tInterestRate: "+interestRate+ "\n\tAccount: "+account;
    }
}
