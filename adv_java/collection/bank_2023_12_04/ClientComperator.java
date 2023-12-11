package adv_java.collection.bank_2023_12_04;

import java.util.Comparator;

public class ClientComperator implements Comparator<Client> {

    @Override
    public int compare(Client c1, Client c2) {
        if ((int)(c2.getAccount().getBalance()-c1.getAccount().getBalance())>0){
            return 1;
        } else if (c2.getAccount().getBalance() == c1.getAccount().getBalance() && c2.getId() == c1.getId()){
            return 0;
        } else {
            return -1;
        }
    }
}
