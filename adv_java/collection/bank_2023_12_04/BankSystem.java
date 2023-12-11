package adv_java.collection.bank_2023_12_04;

import java.util.*;

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
        clients = new TreeSet<>(new ClientComperator());
        task =  new InterestTask(clients);
        //convert runnable to thread....
        Thread thread = new Thread(task);
        thread.start();
    }

    public void startSystem(){
        System.out.println("Welcome to the Bank system!\n");
        scanner = new Scanner(System.in);
        showMenu();
        int action = scanner.nextInt();
        int id;
        List<Client> list = null;
        double amount;
        while(action != 10){
            switch (action){
                case 1:
                    boolean result = new Random().nextBoolean(); //true/false
                    if (result){
                        addClient(new VipClient());
                    } else {
                        addClient(new RegularClient());
                    }
                    break;
                case 2:
                    System.out.println("In your mother in law, please insert client id to delete:");
                    id = scanner.nextInt();
                    try {
                        deleteClient(id);
                    } catch (DeleteException e) {
                        System.err.println(e.getMessage());
                    }
                    break;
                case 3:
                    System.out.println("Please insert client id you want to withdraw from:");
                    id = scanner.nextInt();
                    System.out.println("Please insert the amount to withdraw:");
                    amount = scanner.nextDouble();
                    try {
                        withdraw(id,amount);
                    } catch (NoFundsException e) {
                        System.out.println(e.getMessage());
                    } catch (ClientNotFoundException e) {
                        System.out.println(e.getMessage());
                    }
            }
            showMenu();
            action = scanner.nextInt();
        }
    }

    private void withdraw(int id, double amount) throws NoFundsException, ClientNotFoundException {
        Client clientToUpdate = null;
        for (Client client:clients){
            if (client.getId()==id){
                clientToUpdate = client;
                if (client.getAccount().getBalance()<amount){
                    throw new NoFundsException("withdraw exception: the client's does not have enough money");
                }
                client.getAccount().setBalance(client.getAccount().getBalance()-amount);
            }
        }
        if (clientToUpdate==null){
            throw new ClientNotFoundException("did not found the client, check the id and stop smoking");
        }
    }

    private void deleteClient(int id) throws DeleteException{
        for (Client singleClient:clients){
            if (singleClient.getAccount().getBalance()<0){
                throw new DeleteException("Delete Exception: the client have debt!\n");
            }
            if (singleClient.getId()==id){
                clients.remove(singleClient);
                return;
            }
        }
    }

    private void addClient(Client newClient) {
        clients.add(newClient);
    }

    private void showMenu() {
        System.out.println("Enter number to select an action:");
        System.out.println("1 - add new client");
        System.out.println("2 - remove client by id");
        System.out.println("3 - Withdraw money");
        System.out.println("4 - deposit money");
        System.out.println("5 - print all bank clients sorted by balance");
        System.out.println("6 - print Richest client");
        System.out.println("7 - print poorest client");
        System.out.println("8 - print bank balance");
        System.out.println(("10 - exit system"));
    }


}
