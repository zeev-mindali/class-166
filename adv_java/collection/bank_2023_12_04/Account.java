package adv_java.collection.bank_2023_12_04;

import java.util.Random;

public class Account {
    private double balance;

    public Account(){
        //this.balance=(Math.random()*8001)-4000;
        Random r = new Random();
        this.balance = r.nextInt(4000,8000);
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addToBalance(double amount){
        setBalance(this.balance+amount);
    }

    public void removeFromBalance(double amount){
        setBalance(this.balance-amount);
    }

    @Override
    public String toString() {
        return "Account{" +
                "balance=" + balance +
                '}';
    }
}
