package adv_java.collection.bank_2023_12_04;

import java.util.Set;

public class InterestTask implements Runnable{
    private final int sleepingTime = 1000*60*60*24;
    private Set<Client> clients;

    public InterestTask(Set<Client> clients){
        this.clients=clients;
    }

    public void addClient(Client client){
        this.clients.add(client);
    }

    public void removeClient(Client client){
        this.clients.remove(client);
        System.out.println("The client "+client.getName()+" has been erased!!!");
    }

    public void setClients(Set<Client> clients){
        this.clients=clients;
    }


    @Override
    public void run() {
        while(true){
            try {
                Thread.sleep(sleepingTime);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(clients);
            for (Client client:clients){
                System.out.println("id: "+client.getId()+" name: "+client.getName()+ " BEFORE update:"
                +" balance: "+client.getAccount().getBalance());
                //we updating the balance by getting the current balance and adding interestRate...
                //Yontan (vip) balance : 4000 -> setBalance(current balance(4000)*1.1);
                //yontan 4000->4100
                client.getAccount().setBalance(client.getAccount().getBalance() * client.getInterestRate());
                System.out.println("id: "+client.getId()+" name: "+client.getName()+ " AFTER update:"
                        +" balance: "+client.getAccount().getBalance());
            }

        }
    }
}
