package adv_java.collection.bank_2023_12_04;

public class MyThread implements Runnable{

    @Override
    public void run() {
        BankSystem.getInstance().startSystem();
    }
}
