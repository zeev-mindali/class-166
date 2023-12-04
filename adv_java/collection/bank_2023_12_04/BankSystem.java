package adv_java.collection.bank_2023_12_04;

import java.util.Scanner;
import java.util.Set;

public class BankSystem {
    private static Scanner scanner = new Scanner(System.in);

    private InterestTask task;
    private Set<Client> clients;

    private static BankSystem instance = null;

    public static BankSystem getInstance(){
        if (instance == null){
            synchronized (BankSystem.class){
                if (instance==null) { //double check
                    instance = new BankSystem();  //critical code....
                }
            }
        }
        return instance; //memory address
    }
    private BankSystem(){
        //we have started the bank

    }

    public void startSystem(){

    }
}
