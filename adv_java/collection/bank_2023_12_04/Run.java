package adv_java.collection.bank_2023_12_04;

public class Run {
    public static void main(String[] args) {
//        BankSystem bank = new BankSystem();
//        bank.startSystem();

//        BankSystem bank2 = new BankSystem();
//        bank2.startSystem();


        //SingleTon (Thread Safe)->Double Check
        BankSystem.getInstance().startSystem();

    }
}
